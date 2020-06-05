package com.repair.exception;

/**
 * Created by SuperJJ on 2020/6/3 16:26
 */
public class CompleteOrderIdIsNullException extends RuntimeException {

    public CompleteOrderIdIsNullException() {
        super();
    }

    public CompleteOrderIdIsNullException(String message) {
        super(message);
    }

    public CompleteOrderIdIsNullException(String message, Throwable cause) {
        super(message, cause);
    }

    public CompleteOrderIdIsNullException(Throwable cause) {
        super(cause);
    }

    protected CompleteOrderIdIsNullException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
