package cn.itbat.whh.gateway.utils;

import cn.itbat.whh.gateway.config.WebConfig;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author huahui.wu.
 * Created on 2018/3/27.
 */
public class WebConfigUtils implements InitializingBean {

    private WebConfig configWeb;
    public static WebConfig webConfig;

    public WebConfig getConfigWeb() {
        return configWeb;
    }

    public void setConfigWeb(WebConfig configWeb) {
        this.configWeb = configWeb;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        setWebConfig(configWeb);
    }

    public static void setWebConfig(WebConfig webConfig) {
        WebConfigUtils.webConfig = webConfig;
    }

}
