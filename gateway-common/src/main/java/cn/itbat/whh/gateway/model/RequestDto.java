package cn.itbat.whh.gateway.model;

import java.util.Map;

/**
 * 网关参数
 *
 * @author huahui.wu.
 *         Created on 2018/3/19.
 */
public class RequestDto {

    /**
     * 方法名，如：findPerson，如果有重载方法，需带上参数列表，如：findPerson(java.lang.String)
     */
    private String interfaceName;

    /**
     * 参数类型
     */
    private String methodName;

    /**
     * 参数列表
     */
    private Map[] methodParams;

    public String getInterfaceName() {
        return interfaceName;
    }

    public void setInterfaceName(String interfaceName) {
        this.interfaceName = interfaceName;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public Map[] getMethodParams() {
        return methodParams;
    }

    public void setMethodParam(Map[] methodParams) {
        this.methodParams = methodParams;
    }
}
