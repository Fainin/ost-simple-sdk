package com.fainin.sdk.client;

import com.fainin.sdk.response.OSTApiResponse;

import java.util.TreeMap;

/**
 * Created by hishamaborob on 23-Mar-18.
 */
public interface OSTHttpClient {

    public <T extends OSTApiResponse> T doGet(
            final String endpoint, final TreeMap<String, String> queryParameters, final Class<T> tClass);

    public <T extends OSTApiResponse> T doPost(
            final String endpoint, final TreeMap<String, String> queryParameters, final Class<T> tClass);
}
