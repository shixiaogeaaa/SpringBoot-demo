package com.repair.exception;

/**
 * Created by SuperJJ on 2020/6/2 22:11
 */
public class BuildingIdIsNullException extends RuntimeException {

    public BuildingIdIsNullException() {super();}

    public BuildingIdIsNullException(String message) {
        super(message);
    }

    public BuildingIdIsNullException(String message, Throwable cause) {
        super(message, cause);
    }

    public  BuildingIdIsNullException(Throwable cause) {
        super(cause);
    }

    protected BuildingIdIsNullException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
