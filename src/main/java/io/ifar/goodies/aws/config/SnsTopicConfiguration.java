package io.ifar.goodies.aws.config;

import io.ifar.goodies.aws.SnsTopic;

public class SnsTopicConfiguration {
    public String topicName;
    public AwsCredentialsConfiguration credentials;

    public SnsTopic createTopic() {
        return new SnsTopic(topicName, credentials);
    }
}
