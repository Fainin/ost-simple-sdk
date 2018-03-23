package com.fainin.sdk;

/**
 * Created by hishamaborob on 23-Mar-18.
 */
public class SdkClientException extends RuntimeException {

    public SdkClientException(String message, Throwable t) {
        super(message, t);
    }

    public SdkClientException(String message) {
        super(message);
    }

    public SdkClientException(Throwable t) {
        super(t);
    }
}
