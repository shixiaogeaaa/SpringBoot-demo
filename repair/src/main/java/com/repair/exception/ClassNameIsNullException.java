package com.repair.exception;

/**
 * Created by SuperJJ on 2020/6/4 17:28
 */
public class ClassNameIsNullException extends  RuntimeException {

    public ClassNameIsNullException() {
        super();
    }

    public ClassNameIsNullException(String message) {
        super(message);
    }

    public ClassNameIsNullException(String message, Throwable cause) {
        super(message, cause);
    }

    public ClassNameIsNullException(Throwable cause) {
        super(cause);
    }

    protected ClassNameIsNullException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
