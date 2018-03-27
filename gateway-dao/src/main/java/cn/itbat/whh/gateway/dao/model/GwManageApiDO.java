package cn.itbat.whh.gateway.dao.model;

import java.util.Date;

public class GwManageApiDO {
    private Long apiUkid;

    private String apiName;

    private String apiDesc;

    private Byte apiStatus;

    private Byte apiType;

    private String apiVersion;

    private Long apiServiceUkid;

    private Date addTime;

    private Date updateTime;

    public Long getApiUkid() {
        return apiUkid;
    }

    public void setApiUkid(Long apiUkid) {
        this.apiUkid = apiUkid;
    }

    public String getApiName() {
        return apiName;
    }

    public void setApiName(String apiName) {
        this.apiName = apiName == null ? null : apiName.trim();
    }

    public String getApiDesc() {
        return apiDesc;
    }

    public void setApiDesc(String apiDesc) {
        this.apiDesc = apiDesc == null ? null : apiDesc.trim();
    }

    public Byte getApiStatus() {
        return apiStatus;
    }

    public void setApiStatus(Byte apiStatus) {
        this.apiStatus = apiStatus;
    }

    public Byte getApiType() {
        return apiType;
    }

    public void setApiType(Byte apiType) {
        this.apiType = apiType;
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion == null ? null : apiVersion.trim();
    }

    public Long getApiServiceUkid() {
        return apiServiceUkid;
    }

    public void setApiServiceUkid(Long apiServiceUkid) {
        this.apiServiceUkid = apiServiceUkid;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}