package cn.itbat.whh.gateway.controller;

import cn.itbat.whh.gateway.dubbo.DubboServiceFactory;
import cn.itbat.whh.gateway.model.RequestDto;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author huahui.wu.
 *         Created on 2018/3/19.
 */
@RestController
public class DemoController {
    @RequestMapping(value = "/router/", method = RequestMethod.POST)
    public Object getUser(@ModelAttribute RequestDto dto) {
        Map map = new HashMap<>();
        map.put("ParamType", "java.lang.String");  //后端接口参数类型
        map.put("Object", dto.getMethodParams()[0].get("id"));  //用以调用后端接口的实参

        List<Map<String, Object>> paramInfos = new ArrayList<>();
        paramInfos.add(map);

        DubboServiceFactory dubbo = DubboServiceFactory.getInstance();

        return dubbo.genericInvoke(dto.getInterfaceName(), dto.getMethodName(), paramInfos);
    }
}
