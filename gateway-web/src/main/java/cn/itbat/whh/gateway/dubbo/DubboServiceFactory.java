package cn.itbat.whh.gateway.dubbo;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ReferenceConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.utils.ReferenceConfigCache;
import com.alibaba.dubbo.rpc.service.GenericService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * @author huahui.wu.
 *         Created on 2018/3/19.
 */
public class DubboServiceFactory {
    private static final Logger _log = LoggerFactory.getLogger(DubboServiceFactory.class);

    private ApplicationConfig application;
    private RegistryConfig registry;

    private static class SingletonHolder {
        private static DubboServiceFactory INSTANCE = new DubboServiceFactory();
    }

    private DubboServiceFactory() {
        Properties prop = new Properties();
        ClassLoader loader = DubboServiceFactory.class.getClassLoader();

        try {
            prop.load(loader.getResourceAsStream("service-config.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName(prop.getProperty("dubbo.application.name"));
        applicationConfig.setVersion(prop.getProperty("dubbo.version.surfix"));

        //这里配置了dubbo的application信息*(demo只配置了name)*，因此demo没有额外的dubbo.xml配置文件
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setAddress(prop.getProperty("dubbo.registry.address"));
        registryConfig.setGroup("impl");

        //这里配置dubbo的注册中心信息，因此demo没有额外的dubbo.xml配置文件
        this.application = applicationConfig;
        this.registry = registryConfig;

    }

    public static DubboServiceFactory getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public Object genericInvoke(String interfaceClass, String methodName, Map<String, List> parameters, RequestParam requestParam) {
        ReferenceConfig<GenericService> reference = new ReferenceConfig<GenericService>();
        //应用名
        reference.setApplication(application);
        //zk 注册地址
        reference.setRegistry(registry);
        // 接口名
        reference.setInterface(interfaceClass);
        // 声明为泛化接口
        reference.setGeneric(true);

        /**
         *
         * ReferenceConfig实例很重，封装了与注册中心的连接以及与提供者的连接，
         * 需要缓存，否则重复生成ReferenceConfig可能造成性能问题并且会有内存和连接泄漏。
         * API方式编程时，容易忽略此问题。
         * 这里使用dubbo内置的简单缓存工具类进行缓存
         */
        ReferenceConfigCache cache = ReferenceConfigCache.getCache();
        GenericService genericService = cache.get(reference);
        // 用com.alibaba.dubbo.rpc.service.GenericService可以替代所有接口引用

        List<String> paramTypeList = parameters == null ? null : (List<String>) parameters.get("paramType");

        List<Object> paramValue = parameters == null ? null : (List<Object>) parameters.get("paramValue");

        String[] invokeParamTyeps = paramTypeList == null ? new String[0] : paramTypeList.toArray(new String[0]);

        Object[] invokeParams = paramValue == null ? new Object[0] : paramValue.toArray(new Object[0]);

        // 如果数据库中的参数列表为空,就认为是无参方法
        if (invokeParamTyeps.length == 0) {
            return genericService.$invoke(methodName, new String[0], new Object[0]);
        }
        return genericService.$invoke(methodName, invokeParamTyeps, invokeParams);
    }

}
