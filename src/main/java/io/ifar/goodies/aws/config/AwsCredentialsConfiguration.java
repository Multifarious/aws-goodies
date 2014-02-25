package io.ifar.goodies.aws.config;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;

public class AwsCredentialsConfiguration implements AWSCredentialsProvider, AWSCredentials {
    public String accessKey;
    public String secretKey;

    public AWSCredentials getCredentials() {
        return this;
    }


    @Override
    public void refresh() {
        // noop
    }

    @Override
    public String getAWSAccessKeyId() {
        return accessKey;
    }

    @Override
    public String getAWSSecretKey() {
        return secretKey;
    }
}
