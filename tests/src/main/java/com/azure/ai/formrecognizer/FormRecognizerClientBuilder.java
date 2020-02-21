package com.azure.ai.formrecognizer;

import com.azure.ai.formrecognizer.models.AnalyzeLayoutAsyncResponse;
import com.azure.ai.formrecognizer.models.AnalyzeOperationResult;
import com.azure.ai.formrecognizer.models.AnalyzeReceiptAsyncResponse;
import com.azure.ai.formrecognizer.models.AnalyzeWithCustomModelResponse;
import com.azure.ai.formrecognizer.models.Enum0;
import com.azure.ai.formrecognizer.models.Model;
import com.azure.ai.formrecognizer.models.ModelInfo;
import com.azure.ai.formrecognizer.models.SourcePath;
import com.azure.ai.formrecognizer.models.TrainCustomModelAsyncResponse;
import com.azure.ai.formrecognizer.models.TrainRequest;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClientBuilder;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.CookiePolicy;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import java.util.UUID;
import reactor.core.publisher.Mono;

/**
 * A builder for creating a new instance of the FormRecognizerClient type.
 */
@ServiceClientBuilder(serviceClients = FormRecognizerClient.class)
public final class FormRecognizerClientBuilder {
    /*
     * Supported Cognitive Services endpoints (protocol and hostname, for example: https://westus2.api.cognitive.microsoft.com).
     */
    private String endpoint;

    /**
     * Sets Supported Cognitive Services endpoints (protocol and hostname, for example: https://westus2.api.cognitive.microsoft.com).
     * 
     * @param endpoint the endpoint value.
     * @return the FormRecognizerClientBuilder.
     */
    public FormRecognizerClientBuilder endpoint(String endpoint) {
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
     * @return the FormRecognizerClientBuilder.
     */
    public FormRecognizerClientBuilder pipeline(HttpPipeline pipeline) {
        this.pipeline = pipeline;
        return this;
    }

    /**
     * Builds an instance of FormRecognizerClient with the provided parameters.
     * 
     * @return an instance of FormRecognizerClient.
     */
    public FormRecognizerClient build() {
        if (pipeline == null) {
            this.pipeline = new HttpPipelineBuilder().policies(new UserAgentPolicy(), new RetryPolicy(), new CookiePolicy()).build();
        }
        FormRecognizerClient client = new FormRecognizerClient(pipeline);
        client.setEndpoint(this.endpoint);
        return client;
    }
}
