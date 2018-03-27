package cn.itbat.whh.gateway.service;

import cn.itbat.whh.gateway.model.BaseResult;
import cn.itbat.whh.gateway.model.HttpGWRequest;
import cn.itbat.whh.gateway.model.HttpGWRequestBody;

/**
 * @author huahui.wu.
 * Created on 2018/3/27.
 */
public interface RouterService {

    /**
     * 接口调用
     *
     * @param requestBody
     *            客户端输入的业务参数对象
     * @param request
     *            客户端输入的网关统一封装对象
     * @return
     * @throws Exception
     */
    public BaseResult requestDispatch(HttpGWRequestBody requestBody, HttpGWRequest request) throws Exception;
}
