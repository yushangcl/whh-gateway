package cn.itbat.whh.gateway.manage;


import cn.itbat.whh.gateway.model.RequestParam;

/**
 * @author log.r
 * @date 2018-03-27 下午10:44
 **/
public interface ManageApiManage {

    /**
     * 网关项目,根据gw_manage_api 的 api_name,version 查询相关数据
     *
     * @param gateWayKey
     *            对应 gw_manage_api表中的 的 API_NAME字段
     * @param version
     *            对应 gw_manage_api表中的 的 API_VERSION字段
     * @return
     * @throws Exception
     */
    RequestParam getPlatformApiParam(String gateWayKey, String version) throws Exception;
}
