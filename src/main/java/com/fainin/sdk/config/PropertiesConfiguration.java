package com.fainin.sdk.config;

import com.fainin.sdk.auth.ApiCredentials;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by hishamaborob on 23-Mar-18.
 */
public class PropertiesConfiguration implements OSTConfiguration {

    private static final Log log = LogFactory.getLog(PropertiesConfiguration.class);

    private final String apiHost;

    private final String uuid;

    private final ApiCredentials apiCredentials;

    public PropertiesConfiguration(File file) throws FileNotFoundException, IOException, IllegalArgumentException {

        if (!file.exists()) {
            throw new FileNotFoundException("File doesn't exist:  " + file.getAbsolutePath());
        }

        FileInputStream stream = new FileInputStream(file);
        try {

            Properties accountProperties = new Properties();
            accountProperties.load(stream);

            if (accountProperties.getProperty("apiKey") == null ||
                    accountProperties.getProperty("apiSecretKey") == null ||
                    accountProperties.getProperty("apiHost") == null ||
                    accountProperties.getProperty("uuid") == null) {
                throw new IllegalArgumentException(
                        "The specified file (" + file.getAbsolutePath()
                                + ") doesn't contain the expected properties 'apiKey' "
                                + ", 'apiSecretKey' , 'uuid' and 'apiHost'."
                );
            }

            apiHost = accountProperties.getProperty("apiHost");
            uuid = accountProperties.getProperty("uuid");
            apiCredentials = new ApiCredentials(accountProperties.getProperty("apiKey"),
                    accountProperties.getProperty("apiSecretKey"));

        } finally {
            try {
                stream.close();
            } catch (IOException e) {
                log.info(e);
            }
        }
    }

    public PropertiesConfiguration(InputStream inputStream) throws IOException {
        Properties accountProperties = new Properties();
        try {
            accountProperties.load(inputStream);
        } finally {
            try {
                inputStream.close();
            } catch (Exception e) {
                log.error(e);
            }
        }

        if (accountProperties.getProperty("apiKey") == null ||
                accountProperties.getProperty("apiSecretKey") == null ||
                accountProperties.getProperty("apiHost") == null ||
                accountProperties.getProperty("uuid") == null) {
            throw new IllegalArgumentException("The specified properties data doesn't contain the " +
                    "expected properties 'apiKey', 'apiSecretKey' , 'uuid' and 'apiHost'.");
        }

        apiHost = accountProperties.getProperty("apiHost");
        uuid = accountProperties.getProperty("uuid");
        apiCredentials = new ApiCredentials(accountProperties.getProperty("apiKey"),
                accountProperties.getProperty("apiSecretKey"));
    }

    public String getOSTApiHost() {
        return apiHost;
    }

    public String getUuid() {
        return uuid;
    }

    public ApiCredentials getOSTApiCredentials() {
        return apiCredentials;
    }

}
