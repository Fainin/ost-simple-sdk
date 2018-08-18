package com.fainin.sdk.client.v1_1;

import com.fainin.sdk.auth.AuthenticationProvider;
import com.fainin.sdk.auth.AuthenticationProviderDefault;
import com.fainin.sdk.http.OSTHttpClientDefault;
import com.fainin.sdk.config.ClasspathPropertiesFileConfigurationProvider;
import com.fainin.sdk.config.OSTConfiguration;
import org.apache.http.impl.client.CloseableHttpClient;

/**
 * Created by hishamaborob on 23-Mar-18.
 */
public class OSTClientBuilder {

    public static OST defaultClient() {

        OSTConfiguration ostConfiguration = new ClasspathPropertiesFileConfigurationProvider().getConfiguration();
        return new OSTClient(new OSTHttpClientDefault(ostConfiguration.getOSTApiHost()),
                new AuthenticationProviderDefault(ostConfiguration.getOSTApiCredentials()), ostConfiguration);
    }

    public static OST customClient(OSTConfiguration ostConfiguration) {

        return new OSTClient(new OSTHttpClientDefault(ostConfiguration.getOSTApiHost()),
                new AuthenticationProviderDefault(ostConfiguration.getOSTApiCredentials()), ostConfiguration);
    }

    public static OST customClient(OSTConfiguration ostConfiguration, CloseableHttpClient httpClient) {

        return new OSTClient(new OSTHttpClientDefault(ostConfiguration.getOSTApiHost(), httpClient),
                new AuthenticationProviderDefault(ostConfiguration.getOSTApiCredentials()), ostConfiguration);
    }

    public static OST customClient(OSTConfiguration ostConfiguration, AuthenticationProvider authenticationProvider) {

        return new OSTClient(new OSTHttpClientDefault(ostConfiguration.getOSTApiHost()),
                authenticationProvider, ostConfiguration);
    }

    public static OST customClient(
            OSTConfiguration ostConfiguration, CloseableHttpClient httpClient,
            AuthenticationProvider authenticationProvider) {

        return new OSTClient(new OSTHttpClientDefault(ostConfiguration.getOSTApiHost(), httpClient),
                authenticationProvider, ostConfiguration);
    }
}
