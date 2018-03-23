package com.fainin.sdk.config;

import com.fainin.sdk.SdkClientException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by hishamaborob on 23-Mar-18.
 */
public class ClasspathPropertiesFileConfigurationProvider implements OSTConfigurationProvider {

    private static final Log log = LogFactory.getLog(ClasspathPropertiesFileConfigurationProvider.class);

    private static String DEFAULT_PROPERTIES_FILE = "OST.properties";

    private final String configurationFilePath;

    public ClasspathPropertiesFileConfigurationProvider() {

        this(DEFAULT_PROPERTIES_FILE);
    }

    public ClasspathPropertiesFileConfigurationProvider(String configurationFilePath) {

        if (configurationFilePath == null) {
            throw new IllegalArgumentException("Configuration file path cannot be null");
        }
        if (!configurationFilePath.startsWith("/")) {
            this.configurationFilePath = "/" + configurationFilePath;
        } else {
            this.configurationFilePath = configurationFilePath;
        }
    }

    public OSTConfiguration getConfiguration() throws SdkClientException {

        InputStream inputStream = getClass().getResourceAsStream(configurationFilePath);
        if (inputStream == null) {
            throw new SdkClientException("Unable to load OST configuration from the " +
                    configurationFilePath + " file on the classpath");
        }

        try {
            return new PropertiesConfiguration(inputStream);
        } catch (IOException e) {
            log.error(e.getMessage(), e);
            throw new SdkClientException("Unable to load OST configuration from the " +
                    configurationFilePath + " file on the classpath", e);
        }
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" + configurationFilePath + ")";
    }
}
