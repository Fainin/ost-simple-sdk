package com.fainin.sdk.auth;

/**
 * Created by hishamaborob on 23-Mar-18.
 */
public class AuthenticationProviderException extends RuntimeException {

    public AuthenticationProviderException() {
        super();
    }

    public AuthenticationProviderException(String s) {
        super(s);
    }

    public AuthenticationProviderException(String s, Throwable throwable) {
        super(s, throwable);
    }
}
