package cn.itbat.whh.gateway.exception;

import cn.itbat.whh.gateway.constant.GatewayResultConstant;
import com.alibaba.dubbo.rpc.RpcContext;
import com.whh.common.spring.SpringContextUtil;
import org.springframework.context.MessageSource;

import java.text.MessageFormat;
import java.util.Locale;

/**
 * 网关异常
 *
 * @author huahui.wu.
 * Created on 2018/3/27.
 */
public class GatewayException extends ServiceException {
    private static final long serialVersionUID = -7706613370221196543L;

    public GatewayException() {
        super();
    }

    public GatewayException(GatewayResultConstant result) {
        this(result.getCode(), result.getMessage());
    }

    public GatewayException(GatewayResultConstant result, Throwable cause) {
        this(result.getCode(), result.getMessage(), cause);
    }

    public GatewayException(GatewayResultConstant result, Object... params) {
        this(result.getCode(), MessageFormat.format(result.getMessage(), params));
        this.params = params;
    }

    public GatewayException(GatewayResultConstant result, Throwable cause, Object... params) {
        this(result.getCode(), MessageFormat.format(result.getMessage(), params), cause);
        this.params = params;
    }

    public GatewayException(int code, String message) {
        super(code, message);
    }

    public GatewayException(int code, String message, Throwable cause) {
        super(code, message, cause);
    }

    private Object[] params;

    @Override
    public String getMessage() {
        MessageSource ms = (MessageSource) SpringContextUtil.getBean("messageSource");
        String lan = RpcContext.getContext().getAttachment("lan");
        Locale locale = null;
        if (lan != null) {
            locale = new Locale(lan);
        } else {
            locale = Locale.getDefault();
        }
        String message = ms.getMessage(String.valueOf(getCode()), params, super.getMessage(), locale);
        return message;
    }

}
