package cn.itbat.whh.gateway.dao.model;

import java.io.Serializable;
import java.util.Date;

public class GwServiceDO implements Serializable {
    /**
     * 
     */
    private Long serviceUkid;

    /**
     * 服务描述
     */
    private String serviceDesc;

    /**
     * 服务类型（hsf，http，dubbo）
     */
    private String serviceType;

    /**
     * 服务属性
     */
    private String serviceProperties;

    /**
     * 服务的方法名
     */
    private String serviceKey;

    /**
     * 
     */
    private String serviceVersion;

    /**
     * 服务的接口名
     */
    private String serviceName;

    /**
     * 属于哪个应用
     */
    private String applicationGroup;

    /**
     * 是否是测试接口(0-否,1-是)
     */
    private Integer isTest;

    /**
     * 服务测试ip
     */
    private String testIp;

    /**
     * 服务端口
     */
    private String testPort;

    /**
     * 是否异步调用(0-否,1-是)
     */
    private Integer isAsync;

    /**
     * 请求重试次数
     */
    private Integer serviceRetry;

    /**
     * 服务分组
     */
    private String serviceGroup;

    /**
     * 异步通知url
     */
    private String asyncNotifyUrl;

    /**
     * 超时时间
     */
    private Integer timeOut;

    /**
     * 添加时间
     */
    private Date addTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    private static final long serialVersionUID = 1L;

    /**
     * 
     * @return service_ukid 
     */
    public Long getServiceUkid() {
        return serviceUkid;
    }

    /**
     * 
     * @param serviceUkid 
     */
    public void setServiceUkid(Long serviceUkid) {
        this.serviceUkid = serviceUkid;
    }

    /**
     * 服务描述
     * @return service_desc 服务描述
     */
    public String getServiceDesc() {
        return serviceDesc;
    }

    /**
     * 服务描述
     * @param serviceDesc 服务描述
     */
    public void setServiceDesc(String serviceDesc) {
        this.serviceDesc = serviceDesc;
    }

    /**
     * 服务类型（hsf，http，dubbo）
     * @return service_type 服务类型（hsf，http，dubbo）
     */
    public String getServiceType() {
        return serviceType;
    }

    /**
     * 服务类型（hsf，http，dubbo）
     * @param serviceType 服务类型（hsf，http，dubbo）
     */
    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    /**
     * 服务属性
     * @return service_properties 服务属性
     */
    public String getServiceProperties() {
        return serviceProperties;
    }

    /**
     * 服务属性
     * @param serviceProperties 服务属性
     */
    public void setServiceProperties(String serviceProperties) {
        this.serviceProperties = serviceProperties;
    }

    /**
     * 服务的方法名
     * @return service_key 服务的方法名
     */
    public String getServiceKey() {
        return serviceKey;
    }

    /**
     * 服务的方法名
     * @param serviceKey 服务的方法名
     */
    public void setServiceKey(String serviceKey) {
        this.serviceKey = serviceKey;
    }

    /**
     * 
     * @return service_version 
     */
    public String getServiceVersion() {
        return serviceVersion;
    }

    /**
     * 
     * @param serviceVersion 
     */
    public void setServiceVersion(String serviceVersion) {
        this.serviceVersion = serviceVersion;
    }

    /**
     * 服务的接口名
     * @return service_name 服务的接口名
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * 服务的接口名
     * @param serviceName 服务的接口名
     */
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * 属于哪个应用
     * @return application_group 属于哪个应用
     */
    public String getApplicationGroup() {
        return applicationGroup;
    }

    /**
     * 属于哪个应用
     * @param applicationGroup 属于哪个应用
     */
    public void setApplicationGroup(String applicationGroup) {
        this.applicationGroup = applicationGroup;
    }

    /**
     * 是否是测试接口(0-否,1-是)
     * @return is_test 是否是测试接口(0-否,1-是)
     */
    public Integer getIsTest() {
        return isTest;
    }

    /**
     * 是否是测试接口(0-否,1-是)
     * @param isTest 是否是测试接口(0-否,1-是)
     */
    public void setIsTest(Integer isTest) {
        this.isTest = isTest;
    }

    /**
     * 服务测试ip
     * @return test_ip 服务测试ip
     */
    public String getTestIp() {
        return testIp;
    }

    /**
     * 服务测试ip
     * @param testIp 服务测试ip
     */
    public void setTestIp(String testIp) {
        this.testIp = testIp;
    }

    /**
     * 服务端口
     * @return test_port 服务端口
     */
    public String getTestPort() {
        return testPort;
    }

    /**
     * 服务端口
     * @param testPort 服务端口
     */
    public void setTestPort(String testPort) {
        this.testPort = testPort;
    }

    /**
     * 是否异步调用(0-否,1-是)
     * @return is_async 是否异步调用(0-否,1-是)
     */
    public Integer getIsAsync() {
        return isAsync;
    }

    /**
     * 是否异步调用(0-否,1-是)
     * @param isAsync 是否异步调用(0-否,1-是)
     */
    public void setIsAsync(Integer isAsync) {
        this.isAsync = isAsync;
    }

    /**
     * 请求重试次数
     * @return service_retry 请求重试次数
     */
    public Integer getServiceRetry() {
        return serviceRetry;
    }

    /**
     * 请求重试次数
     * @param serviceRetry 请求重试次数
     */
    public void setServiceRetry(Integer serviceRetry) {
        this.serviceRetry = serviceRetry;
    }

    /**
     * 服务分组
     * @return service_group 服务分组
     */
    public String getServiceGroup() {
        return serviceGroup;
    }

    /**
     * 服务分组
     * @param serviceGroup 服务分组
     */
    public void setServiceGroup(String serviceGroup) {
        this.serviceGroup = serviceGroup;
    }

    /**
     * 异步通知url
     * @return async_notify_url 异步通知url
     */
    public String getAsyncNotifyUrl() {
        return asyncNotifyUrl;
    }

    /**
     * 异步通知url
     * @param asyncNotifyUrl 异步通知url
     */
    public void setAsyncNotifyUrl(String asyncNotifyUrl) {
        this.asyncNotifyUrl = asyncNotifyUrl;
    }

    /**
     * 超时时间
     * @return time_out 超时时间
     */
    public Integer getTimeOut() {
        return timeOut;
    }

    /**
     * 超时时间
     * @param timeOut 超时时间
     */
    public void setTimeOut(Integer timeOut) {
        this.timeOut = timeOut;
    }

    /**
     * 添加时间
     * @return add_time 添加时间
     */
    public Date getAddTime() {
        return addTime;
    }

    /**
     * 添加时间
     * @param addTime 添加时间
     */
    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    /**
     * 更新时间
     * @return update_time 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 更新时间
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", serviceUkid=").append(serviceUkid);
        sb.append(", serviceDesc=").append(serviceDesc);
        sb.append(", serviceType=").append(serviceType);
        sb.append(", serviceProperties=").append(serviceProperties);
        sb.append(", serviceKey=").append(serviceKey);
        sb.append(", serviceVersion=").append(serviceVersion);
        sb.append(", serviceName=").append(serviceName);
        sb.append(", applicationGroup=").append(applicationGroup);
        sb.append(", isTest=").append(isTest);
        sb.append(", testIp=").append(testIp);
        sb.append(", testPort=").append(testPort);
        sb.append(", isAsync=").append(isAsync);
        sb.append(", serviceRetry=").append(serviceRetry);
        sb.append(", serviceGroup=").append(serviceGroup);
        sb.append(", asyncNotifyUrl=").append(asyncNotifyUrl);
        sb.append(", timeOut=").append(timeOut);
        sb.append(", addTime=").append(addTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        GwServiceDO other = (GwServiceDO) that;
        return (this.getServiceUkid() == null ? other.getServiceUkid() == null : this.getServiceUkid().equals(other.getServiceUkid()))
            && (this.getServiceDesc() == null ? other.getServiceDesc() == null : this.getServiceDesc().equals(other.getServiceDesc()))
            && (this.getServiceType() == null ? other.getServiceType() == null : this.getServiceType().equals(other.getServiceType()))
            && (this.getServiceProperties() == null ? other.getServiceProperties() == null : this.getServiceProperties().equals(other.getServiceProperties()))
            && (this.getServiceKey() == null ? other.getServiceKey() == null : this.getServiceKey().equals(other.getServiceKey()))
            && (this.getServiceVersion() == null ? other.getServiceVersion() == null : this.getServiceVersion().equals(other.getServiceVersion()))
            && (this.getServiceName() == null ? other.getServiceName() == null : this.getServiceName().equals(other.getServiceName()))
            && (this.getApplicationGroup() == null ? other.getApplicationGroup() == null : this.getApplicationGroup().equals(other.getApplicationGroup()))
            && (this.getIsTest() == null ? other.getIsTest() == null : this.getIsTest().equals(other.getIsTest()))
            && (this.getTestIp() == null ? other.getTestIp() == null : this.getTestIp().equals(other.getTestIp()))
            && (this.getTestPort() == null ? other.getTestPort() == null : this.getTestPort().equals(other.getTestPort()))
            && (this.getIsAsync() == null ? other.getIsAsync() == null : this.getIsAsync().equals(other.getIsAsync()))
            && (this.getServiceRetry() == null ? other.getServiceRetry() == null : this.getServiceRetry().equals(other.getServiceRetry()))
            && (this.getServiceGroup() == null ? other.getServiceGroup() == null : this.getServiceGroup().equals(other.getServiceGroup()))
            && (this.getAsyncNotifyUrl() == null ? other.getAsyncNotifyUrl() == null : this.getAsyncNotifyUrl().equals(other.getAsyncNotifyUrl()))
            && (this.getTimeOut() == null ? other.getTimeOut() == null : this.getTimeOut().equals(other.getTimeOut()))
            && (this.getAddTime() == null ? other.getAddTime() == null : this.getAddTime().equals(other.getAddTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getServiceUkid() == null) ? 0 : getServiceUkid().hashCode());
        result = prime * result + ((getServiceDesc() == null) ? 0 : getServiceDesc().hashCode());
        result = prime * result + ((getServiceType() == null) ? 0 : getServiceType().hashCode());
        result = prime * result + ((getServiceProperties() == null) ? 0 : getServiceProperties().hashCode());
        result = prime * result + ((getServiceKey() == null) ? 0 : getServiceKey().hashCode());
        result = prime * result + ((getServiceVersion() == null) ? 0 : getServiceVersion().hashCode());
        result = prime * result + ((getServiceName() == null) ? 0 : getServiceName().hashCode());
        result = prime * result + ((getApplicationGroup() == null) ? 0 : getApplicationGroup().hashCode());
        result = prime * result + ((getIsTest() == null) ? 0 : getIsTest().hashCode());
        result = prime * result + ((getTestIp() == null) ? 0 : getTestIp().hashCode());
        result = prime * result + ((getTestPort() == null) ? 0 : getTestPort().hashCode());
        result = prime * result + ((getIsAsync() == null) ? 0 : getIsAsync().hashCode());
        result = prime * result + ((getServiceRetry() == null) ? 0 : getServiceRetry().hashCode());
        result = prime * result + ((getServiceGroup() == null) ? 0 : getServiceGroup().hashCode());
        result = prime * result + ((getAsyncNotifyUrl() == null) ? 0 : getAsyncNotifyUrl().hashCode());
        result = prime * result + ((getTimeOut() == null) ? 0 : getTimeOut().hashCode());
        result = prime * result + ((getAddTime() == null) ? 0 : getAddTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}