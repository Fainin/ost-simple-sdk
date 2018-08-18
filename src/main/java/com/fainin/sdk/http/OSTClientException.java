package com.fainin.sdk.http;

/**
 * Created by hishamaborob on 23-Mar-18.
 */
public class OSTClientException extends RuntimeException {

    public OSTClientException() {
        super();
    }

    /**
     *
     * @param message
     */
    public OSTClientException(String message) {
        super(message);
    }

    /**
     *
     * @param message
     * @param throwable
     */
    public OSTClientException(String message, Throwable throwable) {
        super(message, throwable);
    }
}
