package com.fainin.sdk.auth;

import org.apache.commons.codec.binary.Hex;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.time.Clock;
import java.time.Instant;
import java.util.Optional;
import java.util.TreeMap;

/**
 * Created by hishamaborob on 23-Mar-18.
 */
public class AuthenticationProviderDefault implements AuthenticationProvider {

    private static final Log log = LogFactory.getLog(AuthenticationProviderDefault.class);

    private static final String REQUEST_TIMESTAMP = "request_timestamp";
    private static final String API_KEY = "api_key";
    private static final String SIGNATURE = "signature";

    private ApiCredentials apiCredentials;

    /**
     *
     * @param apiCredentials
     */
    public AuthenticationProviderDefault(ApiCredentials apiCredentials) {

        this.apiCredentials = apiCredentials;
    }

    /**
     *
     * @param endpoint
     * @param queryParameters
     * @return
     * @throws AuthenticationProviderException
     */
    @Override
    public TreeMap<String, String> signRequest(final String endpoint, final TreeMap<String, String> queryParameters)
            throws AuthenticationProviderException {

        queryParameters.put(API_KEY, apiCredentials.getApiKey());
        queryParameters.put(REQUEST_TIMESTAMP, Long.toString(Instant.now(Clock.systemUTC()).getEpochSecond()));

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(endpoint);
        stringBuilder.append("?");

        final int currentLength = stringBuilder.length();
        queryParameters.forEach((name, value) -> {
            if (stringBuilder.length() > currentLength) {
                stringBuilder.append("&");
            }
            try {
                stringBuilder.append(URLEncoder.encode(name.toLowerCase(), "UTF-8"));
                stringBuilder.append("=");
                stringBuilder.append(URLEncoder.encode(value, "UTF-8").replaceAll("\\s+", "+"));
            } catch (UnsupportedEncodingException e) {
                log.error(e.getMessage(), e);
                throw new AuthenticationProviderException("Error while encoding query string values");
            }
        });

        final Optional<String> signature = sign(stringBuilder.toString());
        if (signature.isPresent()) {
            queryParameters.put(SIGNATURE, signature.get());
        } else {
            throw new AuthenticationProviderException("Could not generate a signature");
        }

        return queryParameters;
    }

    private Optional<String> sign(final String data) {

        String signature = null;
        try {
            Mac sha256_HMAC = Mac.getInstance("HmacSHA256");
            SecretKeySpec secret_key = new SecretKeySpec(
                    apiCredentials.getApiSecretKey().getBytes("UTF-8"), "HmacSHA256");
            sha256_HMAC.init(secret_key);
            signature = new String(Hex.encodeHex(sha256_HMAC.doFinal(data.getBytes("UTF-8"))));

        } catch (NoSuchAlgorithmException e) {
            log.error(e.getMessage(), e);
        } catch (InvalidKeyException e) {
            log.error(e.getMessage(), e);
        } catch (UnsupportedEncodingException e) {
            log.error(e.getMessage(), e);
        }

        return Optional.ofNullable(signature);
    }
}
