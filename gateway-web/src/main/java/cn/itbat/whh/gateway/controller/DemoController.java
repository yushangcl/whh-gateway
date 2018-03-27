package cn.itbat.whh.gateway.controller;

import cn.itbat.whh.gateway.dubbo.DubboServiceFactory;
import cn.itbat.whh.gateway.model.HttpGWRequestBody;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author huahui.wu.
 * Created on 2018/3/19.
 */
@RestController
public class DemoController {
    @RequestMapping(value = "/router/test", method = RequestMethod.POST)
    public Object getUser(@RequestBody HttpGWRequestBody dto, HttpServletRequest request) {
        List list = new ArrayList<>();
        list.add("java.lang.String");
        Map<String, List> paramInfos = new HashMap<>();
        paramInfos.put("paramType", list);  //后端接口参数类型
        list = new ArrayList();
        list.add("张三");
        paramInfos.put("paramValue", list);  //用以调用后端接口的实参

        DubboServiceFactory dubbo = DubboServiceFactory.getInstance();

        return dubbo.genericInvoke("com.whh.spring.boot.service.CmUserService", "getUserByName", paramInfos, null);
    }


    public static void main(String[] args) {

    }
}
