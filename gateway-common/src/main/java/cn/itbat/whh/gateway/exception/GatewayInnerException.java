package cn.itbat.whh.gateway.exception;


import cn.itbat.whh.gateway.constant.GatewayInnerConstant;

import java.text.MessageFormat;

/**
 * 网关内部异常
 *
 * @author huahui.wu.
 * Created on 2018/3/27.
 */
public class GatewayInnerException extends ServiceException {
    private static final long serialVersionUID = -5761174182629115225L;


    public GatewayInnerException() {
        super();
    }

    public GatewayInnerException(GatewayInnerConstant result) {
        this(result.getCode(), result.getMessage());
    }

    public GatewayInnerException(GatewayInnerConstant result, Throwable cause) {
        this(result.getCode(), result.getMessage(), cause);
    }

    public GatewayInnerException(GatewayInnerConstant result, Object... params) {
        this(result.getCode(), MessageFormat.format(result.getMessage(), params));
    }

    public GatewayInnerException(GatewayInnerConstant result, Throwable cause, Object... params) {
        this(result.getCode(), MessageFormat.format(result.getMessage(), params), cause);
    }

    public GatewayInnerException(int code, String message) {
        super(code, message);
    }

    public GatewayInnerException(int code, String message, Throwable cause) {
        super(code, message, cause);
    }
}
