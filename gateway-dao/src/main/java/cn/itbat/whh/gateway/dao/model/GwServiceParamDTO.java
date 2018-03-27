package cn.itbat.whh.gateway.dao.model;

import java.util.List;

public class GwServiceParamDTO extends GwServiceParamDO {
    //用于分装对象中的成员变量
    List<GwServiceParamDO> fields;

    public List<GwServiceParamDO> getFields() {
        return fields;
    }

    public void setFields(List<GwServiceParamDO> fields) {
        this.fields = fields;
    }
}
