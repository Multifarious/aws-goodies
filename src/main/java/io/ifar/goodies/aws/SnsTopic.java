package io.ifar.goodies.aws;

import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.services.sns.AmazonSNS;
import com.amazonaws.services.sns.AmazonSNSClient;
import com.amazonaws.services.sns.model.PublishRequest;
import com.amazonaws.services.sns.model.PublishResult;
import com.yammer.dropwizard.lifecycle.Managed;

public class SnsTopic implements Managed {
    private final AmazonSNS snsClient;
    private final String topicName;
    private volatile String topicArn;

    public SnsTopic(String topicName, AWSCredentialsProvider awsCredentials) {
        this.topicName = topicName;
        snsClient = new AmazonSNSClient(awsCredentials);
    }

    public PublishResult publish(String message) {
        return snsClient.publish(new PublishRequest(topicArn, message));
    }

    public PublishResult publish(String message, String subject) {
        return snsClient.publish(new PublishRequest(topicArn, message, subject));
    }

    @Override
    public void start() throws Exception {
        topicArn = snsClient.createTopic(topicName).getTopicArn();
    }

    @Override
    public void stop() throws Exception {
    }
}
