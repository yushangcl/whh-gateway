package cn.itbat.whh.gateway.model;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.io.Serializable;

/**
 * @author huahui.wu.
 * Created on 2018/3/19.
 */
public class HttpGWRequestBody implements Serializable {
    private static final long serialVersionUID = 3953731580803157519L;
    private Object data;
    private String notify_url;
    private String format;


    public String getNotify_url() {
        return notify_url;
    }

    public void setNotify_url(String notify_url) {
        this.notify_url = notify_url;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        if (data instanceof JSONObject || data instanceof JSONArray) {
            this.data = data;
        } else {
            this.data = null;
        }
        //将前端传递的json字符串中,value值为"" 的 替换成 "null"
        /*if (data instanceof JSONObject) {
            String jsonStr = JSON.toJSONString(data);
            jsonStr = jsonStr.replaceAll(":\"\"", ":null");
            this.data = JSONObject.toJSON(JSON.toJavaObject(JSON.parseObject(jsonStr),Map.class));
        } else if (data instanceof JSONArray) {
            String jsonStr = JSONArray.toJSONString(data);
            jsonStr = jsonStr.replaceAll(":\"\"", ":null");
            this.data = JSONArray.parseArray(jsonStr);
        } else {
            this.data = null;
        }*/
    }
}
