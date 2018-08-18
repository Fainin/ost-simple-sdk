package com.fainin.sdk.config;

/**
 * Created by hishamaborob on 23-Mar-18.
 */
public class SdkClientException extends RuntimeException {

    /**
     *
     * @param message
     * @param throwable
     */
    public SdkClientException(String message, Throwable throwable) {
        super(message, throwable);
    }

    /**
     *
     * @param message
     */
    public SdkClientException(String message) {
        super(message);
    }

    /**
     *
     * @param throwable
     */
    public SdkClientException(Throwable throwable) {
        super(throwable);
    }
}
