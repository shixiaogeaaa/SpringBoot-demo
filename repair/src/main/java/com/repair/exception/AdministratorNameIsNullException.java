package com.repair.exception;


public class AdministratorNameIsNullException extends RuntimeException {

    public AdministratorNameIsNullException() {
        super();
    }

    public AdministratorNameIsNullException(String message) {
        super(message);
    }

    public AdministratorNameIsNullException(String message, Throwable cause) {
        super(message, cause);
    }

    public AdministratorNameIsNullException(Throwable cause) {
        super(cause);
    }

    protected AdministratorNameIsNullException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

