package cn.itbat.whh.gateway.controller;

import cn.itbat.whh.gateway.constant.GatewayResultConstant;
import cn.itbat.whh.gateway.model.BaseResult;
import cn.itbat.whh.gateway.model.HttpGWRequest;
import cn.itbat.whh.gateway.model.HttpGWRequestBody;
import cn.itbat.whh.gateway.service.RouterService;
import cn.itbat.whh.gateway.utils.HttpRequestUtils;
import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.text.MessageFormat;

/**
 * 网关对外api
 *
 * @author huahui.wu.
 * Created on 2018/3/27.
 */
@RestController
public class RouterController {

    private static Logger logger = LoggerFactory.getLogger(RouterController.class);

    @Resource
    private RouterService routerService;

    @RequestMapping(value = "/router/api", method = RequestMethod.POST)
    public Object routerPost(@RequestBody HttpGWRequestBody reqBody, HttpServletRequest request) {
        String clientIp = HttpRequestUtils.getIp(request);
        logger.info("Request Begin");
        logger.info("Request Method>>> " + request.getParameter("method"));
        logger.info("Request Data>>> " + JSON.toJSONString(reqBody));

        HttpGWRequest gwRequest = new HttpGWRequest();
        if (null == request.getParameter("method")
                || request.getParameter("method").length() == 0) {
            return new BaseResult(GatewayResultConstant.API_ERROR.getCode(),
                    GatewayResultConstant.API_ERROR.getMessage(), null);
        }
        if (null == request.getParameter("version")
                || request.getParameter("version").length() == 0) {
            return new BaseResult(GatewayResultConstant.VERION_EMPTY.getCode(),
                    GatewayResultConstant.VERION_EMPTY.getMessage(), null);
        }
        gwRequest.setMethod(request.getParameter("method"));
        gwRequest.setVersion(request.getParameter("version"));
        gwRequest.setClientIP(clientIp);
        gwRequest.setAuthToken(request.getHeader("auth_token"));

        if (reqBody.getData() == null) {
            return new BaseResult(GatewayResultConstant.REQUEST_FORAMT_ERROR.getCode()
                    , GatewayResultConstant.REQUEST_FORAMT_ERROR.getMessage(), null);
        }

        if (reqBody.getFormat() == null || reqBody.getFormat().length() == 0) {
            reqBody.setFormat("json");
        }
        if (!("json").equalsIgnoreCase(reqBody.getFormat())) {
            return new BaseResult(GatewayResultConstant.FORMAT.getCode(),
                    MessageFormat.format(GatewayResultConstant.FORMAT.getMessage(), reqBody.getFormat()),
                    null);
        }


        // 调用RouteService
        return null;
    }
}
