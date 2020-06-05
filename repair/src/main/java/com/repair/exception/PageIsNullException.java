package com.repair.exception;

/**
 * Created by SuperJJ on 2020/6/2 22:26
 */
public class PageIsNullException extends RuntimeException{
    public PageIsNullException() {
        super();
    }

    public PageIsNullException(String message) {
        super(message);
    }

    public PageIsNullException(String message, Throwable cause) {
        super(message, cause);
    }

    public PageIsNullException(Throwable cause) {
        super(cause);
    }

    protected PageIsNullException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
