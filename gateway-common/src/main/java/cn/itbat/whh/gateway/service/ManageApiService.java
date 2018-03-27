package cn.itbat.whh.gateway.service;

/**
 * @author huahui.wu.
 *         Created on 2018/3/20.
 */
public interface ManageApiService {


    /**
     * 根据网关key和版本查询发布的服务数据
     *
     * @param gateWayKey 网关开放接口
     * @param version    服务版本号
     * @return
     * @throws Exception
     */
    cn.itbat.whh.gateway.model.RequestParam getPlatformApiParam(String gateWayKey, String version) throws Exception;
}
