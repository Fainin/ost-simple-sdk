package com.fainin.sdk.auth;

import java.util.TreeMap;

/**
 * Created by hishamaborob on 23-Mar-18.
 */
public interface AuthenticationProvider {

    /**
     *
     * @param endpoint
     * @param queryParameters
     * @return
     * @throws AuthenticationProviderException
     */
    public TreeMap<String, String> signRequest(final String endpoint, final TreeMap<String, String> queryParameters)
            throws AuthenticationProviderException;
}
