package com.azure.ai.anomalydetector;

import com.azure.ai.anomalydetector.models.APIErrorException;
import com.azure.ai.anomalydetector.models.ChangePointDetectRequest;
import com.azure.ai.anomalydetector.models.ChangePointDetectResponse;
import com.azure.ai.anomalydetector.models.EntireDetectResponse;
import com.azure.ai.anomalydetector.models.LastDetectResponse;
import com.azure.ai.anomalydetector.models.Request;
import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.CookiePolicy;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.http.rest.SimpleResponse;
import reactor.core.publisher.Mono;

/**
 * Initializes a new instance of the AnomalyDetectorClient type.
 */
public final class AnomalyDetectorClient {
    /**
     * The proxy service used to perform REST calls.
     */
    private AnomalyDetectorClientService service;

    /**
     * Supported Cognitive Services endpoints (protocol and hostname, for example: https://westus2.api.cognitive.microsoft.com).
     */
    private String endpoint;

    /**
     * Gets Supported Cognitive Services endpoints (protocol and hostname, for example: https://westus2.api.cognitive.microsoft.com).
     * 
     * @return the endpoint value.
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * Sets Supported Cognitive Services endpoints (protocol and hostname, for example: https://westus2.api.cognitive.microsoft.com).
     * 
     * @param endpoint the endpoint value.
     * @return the service client itself.
     */
    AnomalyDetectorClient setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /**
     * The HTTP pipeline to send requests through.
     */
    private HttpPipeline httpPipeline;

    /**
     * Gets The HTTP pipeline to send requests through.
     * 
     * @return the httpPipeline value.
     */
    public HttpPipeline getHttpPipeline() {
        return this.httpPipeline;
    }

    /**
     * Initializes an instance of AnomalyDetectorClient client.
     */
    public AnomalyDetectorClient() {
        new HttpPipelineBuilder().policies(new UserAgentPolicy(), new RetryPolicy(), new CookiePolicy()).build();
    }

    /**
     * Initializes an instance of AnomalyDetectorClient client.
     * 
     * @param httpPipeline The HTTP pipeline to send requests through.
     */
    public AnomalyDetectorClient(HttpPipeline httpPipeline) {
        this.httpPipeline = httpPipeline;
        this.service = RestProxy.create(AnomalyDetectorClientService.class, this.httpPipeline);
    }

    /**
     * The interface defining all the services for AnomalyDetectorClient to be
     * used by the proxy service to perform REST calls.
     */
    @Host("{Endpoint}/anomalydetector/v1.0")
    @ServiceInterface(name = "AnomalyDetectorClient")
    private interface AnomalyDetectorClientService {
        @Post("/timeseries/entire/detect")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(APIErrorException.class)
        Mono<SimpleResponse<EntireDetectResponse>> entireDetect(@HostParam("Endpoint") String endpoint, @BodyParam("application/json") Request body);

        @Post("/timeseries/last/detect")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(APIErrorException.class)
        Mono<SimpleResponse<LastDetectResponse>> lastDetect(@HostParam("Endpoint") String endpoint, @BodyParam("application/json") Request body);

        @Post("/timeseries/changePoint/detect")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(APIErrorException.class)
        Mono<SimpleResponse<ChangePointDetectResponse>> changePointDetect(@HostParam("Endpoint") String endpoint, @BodyParam("application/json") ChangePointDetectRequest body);
    }

    /**
     * This operation generates a model using an entire series, each point is detected with the same model. With this method, points before and after a certain point are used to determine whether it is an anomaly. The entire detection can give user an overall status of the time series.
     * 
     * @param body 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws APIErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<EntireDetectResponse>> entireDetectWithResponseAsync(Request body) {
        if (this.getEndpoint() == null) {
            throw new IllegalArgumentException("Parameter this.getEndpoint() is required and cannot be null.");
        }
        if (body == null) {
            throw new IllegalArgumentException("Parameter body is required and cannot be null.");
        } else {
            body.validate();
        }
        return service.entireDetect(this.getEndpoint(), body);
    }

    /**
     * This operation generates a model using an entire series, each point is detected with the same model. With this method, points before and after a certain point are used to determine whether it is an anomaly. The entire detection can give user an overall status of the time series.
     * 
     * @param body 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws APIErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<EntireDetectResponse> entireDetectAsync(Request body) {
        return entireDetectWithResponseAsync(body)
            .flatMap((SimpleResponse<EntireDetectResponse> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * This operation generates a model using an entire series, each point is detected with the same model. With this method, points before and after a certain point are used to determine whether it is an anomaly. The entire detection can give user an overall status of the time series.
     * 
     * @param body 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws APIErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public EntireDetectResponse entireDetect(Request body) {
        return entireDetectAsync(body).block();
    }

    /**
     * This operation generates a model using points before the latest one. With this method, only historical points are used to determine whether the target point is an anomaly. The latest point detecting operation matches the scenario of real-time monitoring of business metrics.
     * 
     * @param body 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws APIErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<LastDetectResponse>> lastDetectWithResponseAsync(Request body) {
        if (this.getEndpoint() == null) {
            throw new IllegalArgumentException("Parameter this.getEndpoint() is required and cannot be null.");
        }
        if (body == null) {
            throw new IllegalArgumentException("Parameter body is required and cannot be null.");
        } else {
            body.validate();
        }
        return service.lastDetect(this.getEndpoint(), body);
    }

    /**
     * This operation generates a model using points before the latest one. With this method, only historical points are used to determine whether the target point is an anomaly. The latest point detecting operation matches the scenario of real-time monitoring of business metrics.
     * 
     * @param body 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws APIErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<LastDetectResponse> lastDetectAsync(Request body) {
        return lastDetectWithResponseAsync(body)
            .flatMap((SimpleResponse<LastDetectResponse> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * This operation generates a model using points before the latest one. With this method, only historical points are used to determine whether the target point is an anomaly. The latest point detecting operation matches the scenario of real-time monitoring of business metrics.
     * 
     * @param body 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws APIErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public LastDetectResponse lastDetect(Request body) {
        return lastDetectAsync(body).block();
    }

    /**
     * Evaluate change point score of every series point.
     * 
     * @param body 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws APIErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<ChangePointDetectResponse>> changePointDetectWithResponseAsync(ChangePointDetectRequest body) {
        if (this.getEndpoint() == null) {
            throw new IllegalArgumentException("Parameter this.getEndpoint() is required and cannot be null.");
        }
        if (body == null) {
            throw new IllegalArgumentException("Parameter body is required and cannot be null.");
        } else {
            body.validate();
        }
        return service.changePointDetect(this.getEndpoint(), body);
    }

    /**
     * Evaluate change point score of every series point.
     * 
     * @param body 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws APIErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ChangePointDetectResponse> changePointDetectAsync(ChangePointDetectRequest body) {
        return changePointDetectWithResponseAsync(body)
            .flatMap((SimpleResponse<ChangePointDetectResponse> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Evaluate change point score of every series point.
     * 
     * @param body 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws APIErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ChangePointDetectResponse changePointDetect(ChangePointDetectRequest body) {
        return changePointDetectAsync(body).block();
    }
}
