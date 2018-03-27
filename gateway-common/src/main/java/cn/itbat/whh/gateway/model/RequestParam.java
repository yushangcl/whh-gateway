package cn.itbat.whh.gateway.model;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * 网关接口对应的服务接口描述
 *
 * @author log.r
 * @date 2018-03-27 下午10:41
 */
public class RequestParam implements Serializable {

    private static final long serialVersionUID = 1106212084205492550L;
    private String gateWayKey;//网关对外发布的Key
    private String methodName;//方法名
    private String className;//接口名
    private Boolean isAsync;
    private Boolean enable;
    private Boolean isTest;
    private String testIp;
    private String testPort;
    private String protocols;
    private String group;
    private String version;
    private Integer retries;
    private Integer timeOut;

    private Map<String, List<RequestField>> paramsMap;//key 为参数列表中的顺序,value为 这个序号可以存的参数类型

    public String getGateWayKey() {
        return gateWayKey;
    }

    public void setGateWayKey(String gateWayKey) {
        this.gateWayKey = gateWayKey;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Boolean getAsync() {
        return isAsync;
    }

    public void setAsync(Boolean async) {
        isAsync = async;
    }

    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public Boolean getTest() {
        return isTest;
    }

    public void setTest(Boolean test) {
        isTest = test;
    }

    public String getTestIp() {
        return testIp;
    }

    public void setTestIp(String testIp) {
        this.testIp = testIp;
    }

    public String getTestPort() {
        return testPort;
    }

    public void setTestPort(String testPort) {
        this.testPort = testPort;
    }

    public String getProtocols() {
        return protocols;
    }

    public void setProtocols(String protocols) {
        this.protocols = protocols;
    }

    public Map<String, List<RequestField>> getParamsMap() {
        return paramsMap;
    }

    public void setParamsMap(Map<String, List<RequestField>> paramsMap) {
        this.paramsMap = paramsMap;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Integer getRetries() {
        return retries;
    }

    public void setRetries(Integer retries) {
        this.retries = retries;
    }

    public Integer getTimeOut() {
        return timeOut;
    }

    public void setTimeOut(Integer timeOut) {
        this.timeOut = timeOut;
    }
}
