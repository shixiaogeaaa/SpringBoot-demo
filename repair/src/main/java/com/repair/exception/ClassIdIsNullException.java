package com.repair.exception;

/**
 * Created by SuperJJ on 2020/6/3 17:03
 */
public class ClassIdIsNullException extends RuntimeException {

    public ClassIdIsNullException() {
        super();
    }

    public ClassIdIsNullException(String message) {
        super(message);
    }

    public ClassIdIsNullException(String message, Throwable cause) {
        super(message, cause);
    }

    public ClassIdIsNullException(Throwable cause) {
        super(cause);
    }

    protected ClassIdIsNullException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
