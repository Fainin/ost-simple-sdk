package com.fainin.sdk.auth;

/**
 * Created by hishamaborob on 23-Mar-18.
 */
public class ApiCredentials {

    private final String apiKey;
    private final String apiSecretKey;

    public ApiCredentials(String apiKey, String apiSecretKey) {

        this.apiKey = apiKey;
        this.apiSecretKey = apiSecretKey;
    }

    public String getApiKey() {
        return apiKey;
    }

    public String getApiSecretKey() {
        return apiSecretKey;
    }
}
