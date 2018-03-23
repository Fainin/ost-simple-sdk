package com.fainin.sdk;

import com.fainin.sdk.auth.AuthenticationProviderDefault;
import com.fainin.sdk.client.OSTHttpClientDefault;
import com.fainin.sdk.config.ClasspathPropertiesFileConfigurationProvider;
import com.fainin.sdk.config.OSTConfiguration;

/**
 * Created by hishamaborob on 23-Mar-18.
 */
public class OSTClientBuilder {

    public static OST defaultClient() {

        OSTConfiguration ostConfiguration = new ClasspathPropertiesFileConfigurationProvider().getConfiguration();
        return new OSTClient(new OSTHttpClientDefault(ostConfiguration.getOSTApiHost()),
                new AuthenticationProviderDefault(ostConfiguration.getOSTApiCredentials()), ostConfiguration);
    }
}
