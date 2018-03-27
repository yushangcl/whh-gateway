package cn.itbat.whh.gateway.exception;

import java.text.MessageFormat;

/**
 * @author huahui.wu.
 * Created on 2018/3/27.
 */
public class ServiceException extends Exception{
    private int code;

    public ServiceException() {
    }

    public ServiceException(int code, String message) {
        super(message);
        this.code = code;
    }

    public ServiceException(int code, String message, Throwable cause) {
        super(message, cause);
        this.code = code;
    }

    public ServiceException(int code, String message, Object... params) {
        super(MessageFormat.format(message, params));
        this.code = code;
    }

    public ServiceException(int code, String message, Throwable cause, Object... params) {
        super(MessageFormat.format(message, params), cause);
        this.code = code;
    }

    public int getCode() {
        return this.code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
