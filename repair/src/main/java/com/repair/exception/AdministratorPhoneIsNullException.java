package com.repair.exception;

/**
 * Created by SuperJJ on 2020/5/30 21:48
 * 手机号为空异常
 */
public class AdministratorPhoneIsNullException extends RuntimeException {

    public AdministratorPhoneIsNullException() {
        super();
    }

    public AdministratorPhoneIsNullException(String message) {
        super(message);
    }

    public AdministratorPhoneIsNullException(String message, Throwable cause) {
        super(message, cause);
    }

    public AdministratorPhoneIsNullException(Throwable cause) {
        super(cause);
    }

    protected AdministratorPhoneIsNullException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}


