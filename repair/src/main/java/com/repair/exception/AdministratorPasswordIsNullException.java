package com.repair.exception;

/**
 * Created by SuperJJ on 2020/5/30 21:41
 * 密码为空异常
 */
public class AdministratorPasswordIsNullException extends RuntimeException{

    public AdministratorPasswordIsNullException() {
        super();
    }

    public AdministratorPasswordIsNullException(String message) {
        super(message);
    }

    public AdministratorPasswordIsNullException(String message, Throwable cause) {
        super(message,cause);
    }

    public AdministratorPasswordIsNullException(Throwable cause) {
        super(cause);
    }

    protected AdministratorPasswordIsNullException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
