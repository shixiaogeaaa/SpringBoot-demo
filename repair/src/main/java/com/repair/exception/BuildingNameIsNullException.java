package com.repair.exception;

/**
 * Created by SuperJJ on 2020/6/2 22:15
 */
public class BuildingNameIsNullException extends RuntimeException {

    public BuildingNameIsNullException() {
        super();
    }

    public BuildingNameIsNullException(String message) {
        super(message);
    }

    public BuildingNameIsNullException(String message, Throwable caues) {
        super(message,caues);
    }

    public BuildingNameIsNullException(Throwable cause) {
        super(cause);
    }

    protected BuildingNameIsNullException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
