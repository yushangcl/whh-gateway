package cn.itbat.whh.gateway.dubbo;

import com.alibaba.dubbo.config.utils.ReferenceConfigCache;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author huahui.wu.
 * Created on 2018/3/27.
 */
class ReferenceKeyGenerator {

    private static Logger logger = LoggerFactory.getLogger(ReferenceKeyGenerator.class);

    private ReferenceKeyGenerator() {
    }


    protected static ReferenceConfigCache.KeyGenerator keyGenerator = referenceConfig -> {

        String iName = referenceConfig.getInterface();
        if (com.alibaba.dubbo.common.utils.StringUtils.isBlank(iName)) {
            Class<?> clazz = referenceConfig.getInterfaceClass();
            iName = clazz.getName();
        }
        if (com.alibaba.dubbo.common.utils.StringUtils.isBlank(iName)) {
            logger.info("No interface info in ReferenceConfig");
            throw new IllegalArgumentException("No interface info in ReferenceConfig" + referenceConfig);
        } else {
            StringBuilder ret = new StringBuilder();
            if (!com.alibaba.dubbo.common.utils.StringUtils.isBlank(referenceConfig.getGroup())) {
                ret.append(referenceConfig.getGroup()).append("/");
            }
            ret.append(iName);
            if (!com.alibaba.dubbo.common.utils.StringUtils.isBlank(referenceConfig.getVersion())) {
                ret.append(":").append(referenceConfig.getVersion()).append("/");
            }
            if (com.alibaba.dubbo.common.utils.StringUtils.isNotEmpty(referenceConfig.getProtocol())) {
                ret.append(referenceConfig.getProtocol()).append("/");
            }
            if (com.alibaba.dubbo.common.utils.StringUtils.isNotEmpty(referenceConfig.getUrl())) {
                ret.append(referenceConfig.getUrl()).append("/");
            }
            if (com.alibaba.dubbo.common.utils.StringUtils.isNotEmpty(
                    String.valueOf(referenceConfig.getTimeout()))) {
                ret.append(String.valueOf(referenceConfig.getTimeout())).append("/");
            }

            logger.debug("远程调用dubbo服务配置信息 >>> " + ret);
            return ret.toString();
        }
    };

}
