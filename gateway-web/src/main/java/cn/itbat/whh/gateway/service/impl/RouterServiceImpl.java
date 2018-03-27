package cn.itbat.whh.gateway.service.impl;

import cn.itbat.whh.gateway.constant.GatewayResultConstant;
import cn.itbat.whh.gateway.dubbo.DubboServiceFactory;
import cn.itbat.whh.gateway.exception.GatewayInnerException;
import cn.itbat.whh.gateway.manage.ManageApiManage;
import cn.itbat.whh.gateway.model.BaseResult;
import cn.itbat.whh.gateway.model.HttpGWRequest;
import cn.itbat.whh.gateway.model.HttpGWRequestBody;
import cn.itbat.whh.gateway.model.RequestParam;
import cn.itbat.whh.gateway.service.RouterService;
import com.alibaba.dubbo.rpc.RpcException;
import com.alibaba.dubbo.rpc.service.GenericException;
import com.alibaba.fastjson.JSON;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;
import java.util.*;

/**
 * @author huahui.wu.
 * Created on 2018/3/27.
 */
public class RouterServiceImpl implements RouterService {

    private static final Logger logger = LoggerFactory.getLogger(RouterServiceImpl.class);

    @Resource
    private ManageApiManage manageApiManage;

    @SuppressWarnings("unchecked")
    @Override
    public BaseResult requestDispatch(HttpGWRequestBody requestBody, HttpGWRequest request) throws Exception {
        BaseResult result;
        try {
            // 方法名
            String key = request.getMethod();
            if (null == key || key.length() <= 0 || key.length() > 64) {
                return new BaseResult(GatewayResultConstant.INTERFACE_ERROR.getCode(),
                        GatewayResultConstant.INTERFACE_ERROR.getMessage());
            }
            // 版本号
            String version = request.getVersion();
            if (StringUtils.isEmpty(version)) {
                return new BaseResult(GatewayResultConstant.INTERFACE_VERSION_ERROR.getCode(),
                        GatewayResultConstant.INTERFACE_VERSION_ERROR.getMessage());
            }

            //从数据库中查询参数定义
            RequestParam requestParam = manageApiManage.getPlatformApiParam(key, version);

            logger.info("【RequestParam】数据库方法信息 >>> "
                    + JSON.toJSONString(requestParam));

//            Map<String, List> paramMap = extracted(requestBody.getData(), requestParam, request);

            logger.info("【ParamMap】参数解析结果 >>> " + JSON.toJSONString(null));

            DubboServiceFactory dubbo = DubboServiceFactory.getInstance();
            String interfaceName = requestParam.getClassName();

            logger.info("【InterfaceName】接口全路径 >>> " + interfaceName+ "|【MethodName】方法名 >>> "
                            + requestParam.getMethodName());
            Object response = dubbo
                    .genericInvoke(interfaceName, requestParam.getMethodName(), null, requestParam);


            if (response instanceof HashMap) {
                HashMap<String, Object> hashMap = (HashMap<String, Object>) response;
                if (hashMap.get("class") != null) {
                    String str = hashMap.get("class").toString();
//                    if (str.equals("com.whh.commons.utils.AbsResponse")) {
//                        removeClass(hashMap.get("data"));
//                        // 符合条件就认为返回的是AbsResponse
//                        result = new BaseResult((Integer) hashMap.get("code"),
//                                null == hashMap.get("msg") ? "" : hashMap.get("msg").toString(),
//                                hashMap.get("data"));
//                        return result;
//                    }
                }
            }

            removeClass(response);
            result = new BaseResult(GatewayResultConstant.SUCCESS.getCode(),
                    GatewayResultConstant.SUCCESS.getMessage(),
                    response);

        } catch (Exception e) {
            result = processException(e, request);
        }
        return result;
    }

    /**
     * 所有异常处理
     *
     * @param e
     * @return
     */
    private BaseResult processException(Exception e, HttpGWRequest request) {
        if (e instanceof GatewayInnerException) {
            GatewayInnerException gatewayException = (GatewayInnerException) e;
            logger.info("GatewayException:" + "网关内部错误", e);
            return new BaseResult(gatewayException.getCode(),
                    "网关内部错误：" + gatewayException.getCode() + "-" + gatewayException.getMessage(), null);
        } else if (e instanceof RpcException) {
            return processRpcException(e, request);
        } else if (e instanceof GenericException) {
            GenericException gatewayException = (GenericException) e;
            logger.info("GenericException:" + "泛化类错误", gatewayException);
            return new BaseResult(GatewayResultConstant.GENERIC_ERROR.getCode(), GatewayResultConstant.GENERIC_ERROR.getMessage(), null);
        } else {
            logger.info("UnKnowException:" + "调用失败", e);
            return new BaseResult(GatewayResultConstant.ERROR.getCode(), GatewayResultConstant.ERROR.getMessage(), null);
        }
    }

    /**
     * PRC异常处理
     *
     * @param e
     * @return
     */
    private BaseResult processRpcException(Exception e, HttpGWRequest request) {
        RpcException rpcException = (RpcException) e;
        if (rpcException.getMessage() != null) {
            if (rpcException.getMessage().contains("Fail to create remoting client for service")) {
                logger.info("RPCException: code: "
                        + GatewayResultConstant.REMOTESERVICE_CANNOT_INVOKE.getCode() + " message: "
                        + GatewayResultConstant.REMOTESERVICE_CANNOT_INVOKE.getMessage(), e);
                return new BaseResult(GatewayResultConstant.REMOTESERVICE_CANNOT_INVOKE.getCode(),
                        GatewayResultConstant.REMOTESERVICE_CANNOT_INVOKE.getMessage(), null);
            } else if (rpcException.isTimeout()) {
                logger.info("RPCException: code: "
                        + GatewayResultConstant.INVOKE_TIMEOUT.getCode() + " message: "
                        + GatewayResultConstant.INVOKE_TIMEOUT.getMessage(), e);
                return new BaseResult(GatewayResultConstant.INVOKE_TIMEOUT.getCode(),
                        GatewayResultConstant.INVOKE_TIMEOUT.getMessage(), null);
            } else if (rpcException.isNetwork()) {
                logger.info("RPCException: code: "
                        + GatewayResultConstant.CHANNEL_CLOSE.getCode() + " message: "
                        + GatewayResultConstant.CHANNEL_CLOSE.getMessage(), e);
                return new BaseResult(GatewayResultConstant.CHANNEL_CLOSE.getCode(),
                        GatewayResultConstant.CHANNEL_CLOSE.getMessage(), null);
            } else if (rpcException.isForbidded()) {
                logger.info("RPCException: code: "
                        + GatewayResultConstant.INVOKE_MOTHOD_ERROR.getCode() + " message: "
                        + GatewayResultConstant.INVOKE_MOTHOD_ERROR.getMessage(), e);
                return new BaseResult(GatewayResultConstant.INVOKE_MOTHOD_ERROR.getCode(),
                        GatewayResultConstant.INVOKE_MOTHOD_ERROR.getMessage(), null);
            } else {
                logger.info(
                        "RPCException: code: " + ((RpcException) e)
                                .getCode()
                                + " message: " + e.getMessage(), e);
                return new BaseResult(rpcException.getCode(), rpcException.getMessage(), null);
            }
        } else {
            logger.info(
                    "RPCException:" + rpcException.getMessage(), e);
            return new BaseResult(rpcException.getCode(), rpcException.getMessage(), null);
        }

    }

    @SuppressWarnings("unchecked")
    private void removeClass(Object object) {
        if (object instanceof HashMap) {
            HashMap<String, Object> map = (HashMap<String, Object>) object;
            if (map.get("class") != null) {
                map.remove("class");
            }

            Set<Map.Entry<String, Object>> entries = map.entrySet();
            for (Map.Entry<String, Object> entry : entries) {
                Object object2 = entry.getValue();
                if (object2 instanceof HashMap) {
                    removeClass(object2);
                } else if (object2 instanceof List) {
                    List list = (List) object2;
                    for (Object object3 : list) {
                        removeClass(object3);
                    }
                }
            }

        } else if (object instanceof List) {
            List list = (List) object;
            for (Object object2 : list) {
                removeClass(object2);
            }
        }
    }
}