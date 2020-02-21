package com.azure.ai.anomalydetector;

import com.azure.ai.anomalydetector.models.ChangePointDetectRequest;
import com.azure.ai.anomalydetector.models.ChangePointDetectResponse;
import com.azure.ai.anomalydetector.models.EntireDetectResponse;
import com.azure.ai.anomalydetector.models.LastDetectResponse;
import com.azure.ai.anomalydetector.models.Request;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClientBuilder;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.CookiePolicy;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.http.rest.SimpleResponse;
import reactor.core.publisher.Mono;

/**
 * A builder for creating a new instance of the AnomalyDetectorClient type.
 */
@ServiceClientBuilder(serviceClients = AnomalyDetectorClient.class)
public final class AnomalyDetectorClientBuilder {
    /*
     * Supported Cognitive Services endpoints (protocol and hostname, for example: https://westus2.api.cognitive.microsoft.com).
     */
    private String endpoint;

    /**
     * Sets Supported Cognitive Services endpoints (protocol and hostname, for example: https://westus2.api.cognitive.microsoft.com).
     * 
     * @param endpoint the endpoint value.
     * @return the AnomalyDetectorClientBuilder.
     */
    public AnomalyDetectorClientBuilder endpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /*
     * The HTTP pipeline to send requests through
     */
    private HttpPipeline pipeline;

    /**
     * Sets The HTTP pipeline to send requests through.
     * 
     * @param pipeline the pipeline value.
     * @return the AnomalyDetectorClientBuilder.
     */
    public AnomalyDetectorClientBuilder pipeline(HttpPipeline pipeline) {
        this.pipeline = pipeline;
        return this;
    }

    /**
     * Builds an instance of AnomalyDetectorClient with the provided parameters.
     * 
     * @return an instance of AnomalyDetectorClient.
     */
    public AnomalyDetectorClient build() {
        if (pipeline == null) {
            this.pipeline = new HttpPipelineBuilder().policies(new UserAgentPolicy(), new RetryPolicy(), new CookiePolicy()).build();
        }
        AnomalyDetectorClient client = new AnomalyDetectorClient(pipeline);
        client.setEndpoint(this.endpoint);
        return client;
    }
}
