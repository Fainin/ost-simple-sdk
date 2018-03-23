package com.fainin.sdk.config;

import com.fainin.sdk.auth.ApiCredentials;

/**
 * Created by hishamaborob on 23-Mar-18.
 */
public interface OSTConfiguration {

    public String getOSTApiHost();

    public String getUuid();

    public ApiCredentials getOSTApiCredentials();
}
