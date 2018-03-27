package cn.itbat.whh.gateway.manage.impl;

import cn.itbat.whh.gateway.constant.GatewayInnerConstant;
import cn.itbat.whh.gateway.dao.mapper.GwManageApiDOMapper;
import cn.itbat.whh.gateway.dao.mapper.GwServiceDOMapper;
import cn.itbat.whh.gateway.dao.mapper.GwServiceParamDOMapper;
import cn.itbat.whh.gateway.dao.model.GwManageApiDO;
import cn.itbat.whh.gateway.dao.model.GwServiceDO;
import cn.itbat.whh.gateway.dao.model.GwServiceParamDO;
import cn.itbat.whh.gateway.dao.model.GwServiceParamDTO;
import cn.itbat.whh.gateway.exception.GatewayInnerException;
import cn.itbat.whh.gateway.manage.ManageApiManage;
import cn.itbat.whh.gateway.model.RequestField;
import cn.itbat.whh.gateway.model.RequestParam;
import cn.itbat.whh.gateway.utils.EnvironmentUtils;
import com.alibaba.fastjson.JSON;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

/**
 * @author log.r
 * @date 2018-03-27 下午10:45
 **/
public class ManageApiManageImpl implements ManageApiManage {

    private static org.slf4j.Logger logger = LoggerFactory.getLogger(ManageApiManageImpl.class);
    private static final byte IN_PARAM_TYPE = 0;

    @Autowired
    private GwManageApiDOMapper gWManageApiDOMapper;
    @Autowired
    private GwServiceDOMapper gWServiceDOMapper;
    @Autowired
    private GwServiceParamDOMapper gWServiceParamDOMapper;

    @Autowired
    private RedisTemplate<String, RequestParam> redisTemplate;

    @Override
    public RequestParam getPlatformApiParam(String gateWayKey, String version) throws Exception {
        // gw_manage_api表
        Map<String, Object> paramMap = new HashMap<>(16);
        paramMap.put("apiName", gateWayKey);
        paramMap.put("apiVersion", version);
        paramMap.put("apiStatus", Byte.parseByte("1"));
        paramMap.put("apiType", Byte.parseByte("0"));

        String gwManageApiKey = gateWayKey + "_" + version + "_"
                + EnvironmentUtils.getEnvironment();
        RequestParam result;
        try {
            logger.debug("网关 缓存 api key>>> " + gwManageApiKey);
            result = redisTemplate.opsForValue().get(gwManageApiKey);
            if (result != null) {
                logger.debug("网关 缓存 api >>> " + JSON.toJSONString(result));
                return result;
            }
        } catch (Exception e) {
            logger.error("网关 获取api缓存 异常 >>> ", e);
        }

        List<GwManageApiDO> gwManageApiDOList = gWManageApiDOMapper
                .getGwManageApiWithCondition(paramMap);
        if (gwManageApiDOList == null || gwManageApiDOList.size() == 0) {
            throw new GatewayInnerException(GatewayInnerConstant.UNKNOW_AUTHROR);
        }
        if (gwManageApiDOList.size() > 1) {
            throw new GatewayInnerException(GatewayInnerConstant.INTERFACE_ERROR);
        }
        GwManageApiDO gwManageApiDO = gwManageApiDOList.get(0);
        Long serviceUKID = gwManageApiDOList.get(0).getApiServiceUkid();

        // gw_service表
        paramMap.clear();
        paramMap.put("serviceUkid", serviceUKID);
        List<GwServiceDO> gwServiceDoList = gWServiceDOMapper.getGwServiceWithCondition(paramMap);
        if (gwServiceDoList == null || gwServiceDoList.size() == 0) {
            throw new GatewayInnerException(GatewayInnerConstant.SERVICE_NULL);
        }
        if (gwServiceDoList.size() > 1) {
            throw new GatewayInnerException(GatewayInnerConstant.SERVICE_SIZE_ERROR);
        }
        GwServiceDO gwServiceDo = gwServiceDoList.get(0);

        // gw_service_param表
        List<GwServiceParamDTO> gwServiceParamDTOList = gWServiceParamDOMapper
                .getGwServiceParamDTOWithCondition(paramMap);

        // 返回数据
        RequestParam requestParam = new RequestParam();
        // 网关对外发布名
        requestParam.setGateWayKey(gwManageApiDO.getApiName());
        // 方法名
        requestParam.setMethodName(gwServiceDo.getServiceKey());
        // 接口名
        requestParam.setClassName(gwServiceDo.getServiceName());
        // 是否异步调用
        requestParam.setAsync(gwServiceDo.getIsAsync() == 1);
        // 是否测试
        requestParam.setTest(gwServiceDo.getIsTest() == 1);
        // gw_service 中的api_version
        requestParam.setVersion(gwServiceDo.getServiceVersion());
        // 分组
        requestParam.setGroup(gwServiceDo.getServiceGroup());
        // 重试次数
        requestParam.setRetries(gwServiceDo.getServiceRetry());
        // 服务协议
        requestParam.setProtocols(gwServiceDo.getServiceType());
        // 超时时间
        requestParam.setTimeOut(gwServiceDo.getTimeOut());
        if (gwServiceDo.getIsTest() == 1) {
            // 测试ip
            requestParam.setTestIp(gwServiceDo.getTestIp());
            // 测试port
            requestParam.setTestPort(gwServiceDo.getTestPort());
        }
        if (gwServiceParamDTOList == null || gwServiceParamDTOList.size() == 0) {
            // 表示无参,无返回
            requestParam.setParamsMap(new HashMap<>(16));
        } else {
            List<GwServiceParamDTO> iNParamList = gwServiceParamDTOList.stream()
                    .filter(a -> a.getParamInoutype() == IN_PARAM_TYPE).collect(Collectors.toList());
            if (iNParamList == null || iNParamList.size() == 0) {
                // 表示无参
                requestParam.setParamsMap(new HashMap<>(16));
            } else {
                // 表示有参
                for (GwServiceParamDTO gwServiceParamDTO : iNParamList) {
                    // 如果入参是自定义对象,查询该自定义对象中的所有成员变量
                    List<GwServiceParamDO> fields = gWServiceParamDOMapper
                            .getGwServiceParamDTOAndFieldsWithCondition(gwServiceParamDTO);
                    if (fields != null && fields.size() != 0) {
                        gwServiceParamDTO.setFields(fields);
                    }
                }
                Set<Integer> indexSet = new HashSet<>();
                // indexSet.size() 表示参数列表个数
                gwServiceParamDTOList.forEach(a -> indexSet.add(a.getParamOrder()));

                Map<String, List<RequestField>> map = new HashMap<>(16);

                // 获取每个位置上可以存的参数对象数据
                for (Integer paramIndex : indexSet) {
                    // 根据paramParentUkid来判断是否是子类参数,并且按照父类在前,子类在后顺序排序
                    List<RequestField> requestFields = new ArrayList<>();
                    List<GwServiceParamDTO> indexParamList = gwServiceParamDTOList.stream()
                            .filter(a -> a.getParamOrder().intValue() == paramIndex.intValue())
                            .sorted((param1, param2) -> {
                                return param1.getParamParentUkid() == null ? -1
                                        : param2.getParamParentUkid() == null ? 1 : 0;
                            }).collect(Collectors.toList());

                    for (GwServiceParamDTO gwServiceParamDTO : indexParamList) {
                        RequestField requestField = new RequestField();
                        BeanUtils.copyProperties(gwServiceParamDTO, requestField);

                        if (gwServiceParamDTO.getFields() != null
                                && gwServiceParamDTO.getFields().size() != 0) {
                            List<RequestField> fields = new ArrayList<>();
                            List<GwServiceParamDO> paramDoFields = gwServiceParamDTO.getFields();
                            for (GwServiceParamDO paramDoField : paramDoFields) {
                                RequestField requestFieldField = new RequestField();
                                BeanUtils.copyProperties(paramDoField, requestFieldField);
                                fields.add(requestFieldField);
                            }
                            requestField.setFields(fields);
                        }
                        requestFields.add(requestField);
                    }
                    map.put(paramIndex.toString(), requestFields);
                }
                requestParam.setParamsMap(map);
            }
        }
        try {
            redisTemplate.opsForValue().set(gwManageApiKey, requestParam);
            redisTemplate.expire(gwManageApiKey, 12, TimeUnit.HOURS);
        } catch (Exception e) {
            logger.error("网关 设置api缓存 异常 >>> ", e);
        }
        return requestParam;
    }
}
