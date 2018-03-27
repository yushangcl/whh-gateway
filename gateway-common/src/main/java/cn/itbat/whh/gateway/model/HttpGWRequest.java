package cn.itbat.whh.gateway.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author huahui.wu.
 * Created on 2018/3/27.
 */
public class HttpGWRequest implements Serializable {

    private static final long serialVersionUID = -8320476587563203108L;
    private String method;
    private String version;
    private String authToken;
    private String sign;
    private String charset;
    private String wAppid;
    private Date date;
    private String clientIP;


    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getAuthToken() {
        return authToken;
    }

    public void setAuthToken(String authToken) {
        this.authToken = authToken;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getCharset() {
        return charset;
    }

    public void setCharset(String charset) {
        this.charset = charset;
    }

    public String getwAppid() {
        return wAppid;
    }

    public void setwAppid(String wAppid) {
        this.wAppid = wAppid;
    }

    public Date getDate() {
        return (Date) this.date.clone();
    }

    public void setDate(Date date) {
        this.date = (Date) date.clone();
    }

    public String getClientIP() {
        return clientIP;
    }

    public void setClientIP(String clientIP) {
        this.clientIP = clientIP;
    }
}
