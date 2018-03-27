package cn.itbat.whh.gateway.model;

import java.io.Serializable;
import java.util.List;

/**
 * 平台服务入参描述
 *
 * @author log.r
 * @date 2018-03-27 下午10:41
 */
public class RequestField implements Serializable {

    private static final long serialVersionUID = -5851474636944260936L;

    private String paramName;//参数名

    private String paramClass;//参数类全路径名

    private String paramType;//用于指定 paramClass

    private Byte paramInoutype;//0-入参 1-出参 2-表示某个类中的字段

    private Integer paramOrder;//参数顺序

    private List<RequestField> fields;//用来封装对象中的成员变量

    public String getParamName() {
        return paramName;
    }

    public void setParamName(String paramName) {
        this.paramName = paramName;
    }

    public String getParamClass() {
        return paramClass;
    }

    public void setParamClass(String paramClass) {
        this.paramClass = paramClass;
    }

    public Integer getParamOrder() {
        return paramOrder;
    }

    public void setParamOrder(Integer paramOrder) {
        this.paramOrder = paramOrder;
    }

    public String getParamType() {
        return paramType;
    }

    public void setParamType(String paramType) {
        this.paramType = paramType;
    }

    public Byte getParamInoutype() {
        return paramInoutype;
    }

    public void setParamInoutype(Byte paramInoutype) {
        this.paramInoutype = paramInoutype;
    }

    public List<RequestField> getFields() {
        return fields;
    }

    public void setFields(List<RequestField> fields) {
        this.fields = fields;
    }
}
