package cn.itbat.whh.gateway.service.impl;

import cn.itbat.whh.gateway.manage.ManageApiManage;
import cn.itbat.whh.gateway.model.RequestParam;
import cn.itbat.whh.gateway.service.ManageApiService;

import javax.annotation.Resource;

/**
 * @author log.r
 * @date 2018-03-27 下午10:41
 **/
public class ManageApiServiceImpl implements ManageApiService {

    @Resource
    private ManageApiManage manageApiManage;

    @Override
    public RequestParam getPlatformApiParam(String gateWayKey, String version) throws Exception {
        return manageApiManage.getPlatformApiParam(gateWayKey,version);
    }
}
