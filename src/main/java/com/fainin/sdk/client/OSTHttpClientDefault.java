package com.fainin.sdk.client;

import com.fainin.sdk.response.OSTApiResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.TreeMap;

/**
 * Created by hishamaborob on 23-Mar-18.
 */
public class OSTHttpClientDefault implements OSTHttpClient {

    private static final Log log = LogFactory.getLog(OSTHttpClientDefault.class);

    private CloseableHttpClient httpClient;
    private ObjectMapper objectMapper;
    private String host;

    public OSTHttpClientDefault(final String host) {

        PoolingHttpClientConnectionManager cm = new PoolingHttpClientConnectionManager();
        httpClient = HttpClients.custom().setConnectionManager(cm).build();
        objectMapper = new ObjectMapper();
        objectMapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        this.host = host;
    }

    public <T extends OSTApiResponse> T doGet(
            final String endpoint, final TreeMap<String, String> queryParameters, final Class<T> tClass)
            throws OSTClientException {

        HttpGet httpGet = new HttpGet();
        try {
            httpGet.setURI(buildURI(endpoint, queryParameters));
        } catch (URISyntaxException e) {
            log.error(e.getMessage(), e);
            throw new OSTClientException("Error while generating GET uri");
        }
        return executeRequest(httpGet, tClass);

    }

    public <T extends OSTApiResponse> T doPost(
            final String endpoint, final TreeMap<String, String> queryParameters, final Class<T> tClass)
            throws OSTClientException {

        HttpPost httpPost = new HttpPost();
        try {
            httpPost.setURI(buildURI(endpoint, queryParameters));
            httpPost.setEntity(new StringEntity(objectMapper.writeValueAsString(queryParameters),
                    ContentType.APPLICATION_JSON));
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw new OSTClientException("Error while generating POST body and uri");
        }
        return executeRequest(httpPost, tClass);

    }

    private <T extends OSTApiResponse> T executeRequest(
            final HttpUriRequest httpUriRequest, final Class<T> tClass) throws OSTClientException {

        try {
            CloseableHttpResponse response = httpClient.execute(httpUriRequest);
            try {
                return objectMapper.readValue(response.getEntity().getContent(), tClass);
            } finally {
                response.close();
            }
        } catch (IOException e) {
            log.error(e.getMessage(), e);
            throw new OSTClientException("Could not execute the request");
        }
    }

    private URI buildURI(
            final String endpoint, final TreeMap<String, String> queryParameters) throws URISyntaxException {

        final URIBuilder uriBuilder = new URIBuilder(host + endpoint);
        queryParameters.forEach((name, value) -> {
            uriBuilder.setParameter(name, value);
        });
        return uriBuilder.build();
    }
}
