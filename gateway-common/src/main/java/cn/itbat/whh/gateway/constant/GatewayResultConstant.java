package cn.itbat.whh.gateway.constant;

/**
 * @author huahui.wu.
 * Created on 2018/3/27.
 */
public enum GatewayResultConstant {

    SUCCESS(0, "调用成功"),
    ERROR(1, "调用失败"),
    APP_UNLOGIN(2, "用户未登录"),
    APP_UNAUTHORIZED(3, "该应用未开通授权"),
    SERVICE_NOT_EXIST(4, "检查调用服务是否存在"),
    INTERFACE_VERSION_ERROR(5, "请确认您请求的接口版本号是否正确"),
    PROTOCOL_MISSING(6, "网关服务出错,缺少协议数据"),
    IMAGEVALIDATE_ERROR(7, "无法获取图片验证随机码"),
    REMOTESERVICE_CANNOT_INVOKE(8, "无法调用远程服务"),
    INVOKE_TIMEOUT(9, "请求服务超时"),
    INVOKE_MOTHOD_ERROR(10, "请求服务方法失败"),
    TYPE_NOT_FIND(11, "没有找到指定的封装类型"),
    STRAGE_NOT_FIND(12, "找不到参数解析策略"),
    API_ERROR(13, "请检查传入的api方法名是否正确"),
    VERION_EMPTY(14, "请检查传入的版本号是否为空"),
    INTERFACE_ERROR(15, "请确认您请求的接口是否正确"),
    CHANNEL_CLOSE(16, "内部错误，通信通道关闭"),
    FORMAT(17, "请求的格式:{0}暂不支持"),

    TIMEOUT(18, "请求已过期"),
    UNSUPPORTURL(19, "不支持的请求链接"),
    INVAILDURL(20, "重复请求失效链接"),

    SERVERBUSY(21, "系统繁忙，请稍后再试"),

    REQUEST_FORAMT_ERROR(22, "请求格式有误"),

    ONLINE(23, "用户在线"),
    OFFLINE(24, "用户不在线"),

    GENERIC_ERROR(98, "未处理的返回错误"),
    UNKOWN_ERROR(99, "未知错误"),
    UPLOAD_TYPE_UNSUPPORT(101, "不支持上传类型"),
    FILE_TYPE_UNSUPPORT(102, "不支持上传文件类型"),
    UPLOAD_PARAM_ERRPR(103, "参数有误");

    private int code;

    private String message;

    GatewayResultConstant(int code, String message) {
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
