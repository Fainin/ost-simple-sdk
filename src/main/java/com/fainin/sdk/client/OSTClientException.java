package com.fainin.sdk.client;

/**
 * Created by hishamaborob on 23-Mar-18.
 */
public class OSTClientException extends RuntimeException {

    public OSTClientException() {
        super();
    }

    public OSTClientException(String s) {
        super(s);
    }

    public OSTClientException(String s, Throwable throwable) {
        super(s, throwable);
    }
}
