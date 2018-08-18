package com.fainin.sdk.auth;

/**
 * Created by hishamaborob on 23-Mar-18.
 */
public class AuthenticationProviderException extends RuntimeException {

    public AuthenticationProviderException() {
        super();
    }

    /**
     *
     * @param message
     */
    public AuthenticationProviderException(String message) {
        super(message);
    }

    /**
     *
     * @param message
     * @param throwable
     */
    public AuthenticationProviderException(String message, Throwable throwable) {
        super(message, throwable);
    }
}
