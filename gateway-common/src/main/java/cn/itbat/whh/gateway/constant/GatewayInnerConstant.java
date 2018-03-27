package cn.itbat.whh.gateway.constant;

/**
 * @author huahui.wu.
 * Created on 2018/3/27.
 */
public enum GatewayInnerConstant {
    // 其他错误
    UNKNOW_ERROR(80001, "unknow error!"),
    //AN_ERROR(80002, "some erorr, info{0}"); // {0}表示ServiceException构造方法带参数
    UNKNOW_AUTHROR(80002, "该网关接口为暂未开通"),
    INTERFACE_ERROR(80003, "该网关接口存在多个"),
    NOT_EXIST(80004, "检查调用服务是否存在"),
    VERSION(80005, "请确认您请求的接口版本号是否正确"),
    UNKNOW_PROTOCOL(80006, "网关服务出错,缺少协议数据"),
    SERVICE_NULL(80007, "网关对应的内部服务未对接完成,或版本号不统一"),
    SERVICE_SIZE_ERROR(80008, "网关对应的内部服务存在多个"),
    OBJECT_CONVERT_ERROR(80009, "对象转换异常"),
    PARAM_MISSING(80010, "缺少参数"),
    PARAM_ILLEGAL(80011, "不合法的参数");

    private int code;
    private String message;

    GatewayInnerConstant(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
