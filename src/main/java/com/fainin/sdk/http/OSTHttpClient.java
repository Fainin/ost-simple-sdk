package com.fainin.sdk.http;

import com.fainin.sdk.client.OSTApiResponse;

import java.util.TreeMap;

/**
 * Created by hishamaborob on 23-Mar-18.
 */
public interface OSTHttpClient {

    /**
     *
     * @param endpoint
     * @param queryParameters
     * @param tClass
     * @param <T>
     * @return
     */
    public <T extends OSTApiResponse> T doGet(
            final String endpoint, final TreeMap<String, String> queryParameters, final Class<T> tClass);

    /**
     *
     * @param endpoint
     * @param queryParameters
     * @param tClass
     * @param <T>
     * @return
     */
    public <T extends OSTApiResponse> T doPost(
            final String endpoint, final TreeMap<String, String> queryParameters, final Class<T> tClass);
}
