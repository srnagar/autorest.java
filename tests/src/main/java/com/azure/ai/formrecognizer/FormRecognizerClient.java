package com.azure.ai.formrecognizer;

import com.azure.ai.formrecognizer.models.AnalyzeLayoutAsyncResponse;
import com.azure.ai.formrecognizer.models.AnalyzeOperationResult;
import com.azure.ai.formrecognizer.models.AnalyzeReceiptAsyncResponse;
import com.azure.ai.formrecognizer.models.AnalyzeWithCustomModelResponse;
import com.azure.ai.formrecognizer.models.Enum0;
import com.azure.ai.formrecognizer.models.ErrorResponseException;
import com.azure.ai.formrecognizer.models.Model;
import com.azure.ai.formrecognizer.models.ModelInfo;
import com.azure.ai.formrecognizer.models.Models;
import com.azure.ai.formrecognizer.models.SourcePath;
import com.azure.ai.formrecognizer.models.TrainCustomModelAsyncResponse;
import com.azure.ai.formrecognizer.models.TrainRequest;
import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.Delete;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
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
import com.azure.core.http.rest.RestProxy;
import com.azure.core.http.rest.SimpleResponse;
import java.util.UUID;
import reactor.core.publisher.Mono;

/**
 * Initializes a new instance of the FormRecognizerClient type.
 */
public final class FormRecognizerClient {
    /**
     * The proxy service used to perform REST calls.
     */
    private FormRecognizerClientService service;

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
    FormRecognizerClient setEndpoint(String endpoint) {
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
     * Initializes an instance of FormRecognizerClient client.
     */
    public FormRecognizerClient() {
        new HttpPipelineBuilder().policies(new UserAgentPolicy(), new RetryPolicy(), new CookiePolicy()).build();
    }

    /**
     * Initializes an instance of FormRecognizerClient client.
     * 
     * @param httpPipeline The HTTP pipeline to send requests through.
     */
    public FormRecognizerClient(HttpPipeline httpPipeline) {
        this.httpPipeline = httpPipeline;
        this.service = RestProxy.create(FormRecognizerClientService.class, this.httpPipeline);
    }

    /**
     * The interface defining all the services for FormRecognizerClient to be
     * used by the proxy service to perform REST calls.
     */
    @Host("{endpoint}/formrecognizer/v2.0-preview")
    @ServiceInterface(name = "FormRecognizerClient")
    private interface FormRecognizerClientService {
        @Post("/custom/models")
        @ExpectedResponses({201})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<TrainCustomModelAsyncResponse> trainCustomModelAsync(@HostParam("endpoint") String endpoint, @BodyParam("application/json") TrainRequest trainRequest);

        @Get("/custom/models")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<SimpleResponse<Models>> getCustomModels(@HostParam("endpoint") String endpoint, @QueryParam("op") Enum0 op);

        @Get("/custom/models/{modelId}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<SimpleResponse<Model>> getCustomModel(@HostParam("endpoint") String endpoint, @PathParam("modelId") UUID modelId, @QueryParam("includeKeys") Boolean includeKeys);

        @Delete("/custom/models/{modelId}")
        @ExpectedResponses({204})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<Response<Void>> deleteCustomModel(@HostParam("endpoint") String endpoint, @PathParam("modelId") UUID modelId);

        @Post("/custom/models/{modelId}/analyze")
        @ExpectedResponses({202})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<AnalyzeWithCustomModelResponse> analyzeWithCustomModel(@HostParam("endpoint") String endpoint, @PathParam("modelId") UUID modelId, @QueryParam("includeTextDetails") Boolean includeTextDetails, @BodyParam("application/json") SourcePath fileStream);

        @Get("/custom/models/{modelId}/analyzeResults/{resultId}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<SimpleResponse<AnalyzeOperationResult>> getAnalyzeFormResult(@HostParam("endpoint") String endpoint, @PathParam("modelId") UUID modelId, @PathParam("resultId") UUID resultId);

        @Post("/prebuilt/receipt/analyze")
        @ExpectedResponses({202})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<AnalyzeReceiptAsyncResponse> analyzeReceiptAsync(@HostParam("endpoint") String endpoint, @QueryParam("includeTextDetails") Boolean includeTextDetails, @BodyParam("application/json") SourcePath fileStream);

        @Get("/prebuilt/receipt/analyzeResults/{resultId}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<SimpleResponse<AnalyzeOperationResult>> getAnalyzeReceiptResult(@HostParam("endpoint") String endpoint, @PathParam("resultId") UUID resultId);

        @Post("/layout/analyze")
        @ExpectedResponses({202})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<AnalyzeLayoutAsyncResponse> analyzeLayoutAsync(@HostParam("endpoint") String endpoint, @BodyParam("application/json") SourcePath fileStream);

        @Get("/layout/analyzeResults/{resultId}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<SimpleResponse<AnalyzeOperationResult>> getAnalyzeLayoutResult(@HostParam("endpoint") String endpoint, @PathParam("resultId") UUID resultId);

        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<SimpleResponse<Models>> getCustomModelsNext(@PathParam(value = "nextLink", encoded = true) String nextLink);
    }

    /**
     * Create and train a custom model. The request must include a source parameter that is either an externally accessible Azure storage blob container Uri (preferably a Shared Access Signature Uri) or valid path to a data folder in a locally mounted drive. When local paths are specified, they must follow the Linux/Unix path format and be an absolute path rooted to the input mount configuration setting value e.g., if '{Mounts:Input}' configuration setting value is '/input' then a valid source path would be '/input/contosodataset'. All data to be trained is expected to be under the source folder or sub folders under it. Models are trained using documents that are of the following content type - 'application/pdf', 'image/jpeg', 'image/png', 'image/tiff'. Other type of content is ignored.
     * 
     * @param trainRequest Request parameter to train a new custom model.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<TrainCustomModelAsyncResponse> trainCustomModelAsyncWithResponseAsync(TrainRequest trainRequest) {
        if (this.getEndpoint() == null) {
            throw new IllegalArgumentException("Parameter this.getEndpoint() is required and cannot be null.");
        }
        if (trainRequest == null) {
            throw new IllegalArgumentException("Parameter trainRequest is required and cannot be null.");
        } else {
            trainRequest.validate();
        }
        return service.trainCustomModelAsync(this.getEndpoint(), trainRequest);
    }

    /**
     * Create and train a custom model. The request must include a source parameter that is either an externally accessible Azure storage blob container Uri (preferably a Shared Access Signature Uri) or valid path to a data folder in a locally mounted drive. When local paths are specified, they must follow the Linux/Unix path format and be an absolute path rooted to the input mount configuration setting value e.g., if '{Mounts:Input}' configuration setting value is '/input' then a valid source path would be '/input/contosodataset'. All data to be trained is expected to be under the source folder or sub folders under it. Models are trained using documents that are of the following content type - 'application/pdf', 'image/jpeg', 'image/png', 'image/tiff'. Other type of content is ignored.
     * 
     * @param trainRequest Request parameter to train a new custom model.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> trainCustomModelAsyncAsync(TrainRequest trainRequest) {
        return trainCustomModelAsyncWithResponseAsync(trainRequest)
            .flatMap((TrainCustomModelAsyncResponse res) -> Mono.empty());
    }

    /**
     * Create and train a custom model. The request must include a source parameter that is either an externally accessible Azure storage blob container Uri (preferably a Shared Access Signature Uri) or valid path to a data folder in a locally mounted drive. When local paths are specified, they must follow the Linux/Unix path format and be an absolute path rooted to the input mount configuration setting value e.g., if '{Mounts:Input}' configuration setting value is '/input' then a valid source path would be '/input/contosodataset'. All data to be trained is expected to be under the source folder or sub folders under it. Models are trained using documents that are of the following content type - 'application/pdf', 'image/jpeg', 'image/png', 'image/tiff'. Other type of content is ignored.
     * 
     * @param trainRequest Request parameter to train a new custom model.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void trainCustomModelAsync(TrainRequest trainRequest) {
        trainCustomModelAsyncAsync(trainRequest).block();
    }

    /**
     * Get information about all custom models.
     * 
     * @param op 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<ModelInfo>> getCustomModelsSinglePageAsync(Enum0 op) {
        return service.getCustomModels(this.getEndpoint(), op).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().getModelList(),
            res.getValue().getNextLink(),
            null));
    }

    /**
     * Get information about all custom models.
     * 
     * @param op 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<ModelInfo> getCustomModelsAsync(Enum0 op) {
        return new PagedFlux<>(
            () -> getCustomModelsSinglePageAsync(op),
            nextLink -> getCustomModelsNextSinglePageAsync(nextLink));
    }

    /**
     * Get information about all custom models.
     * 
     * @param op 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ModelInfo> getCustomModels(Enum0 op) {
        return new PagedIterable<>(getCustomModelsAsync(op));
    }

    /**
     * Get detailed information about a custom model.
     * 
     * @param modelId 
     * @param includeKeys 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Model>> getCustomModelWithResponseAsync(UUID modelId, Boolean includeKeys) {
        if (this.getEndpoint() == null) {
            throw new IllegalArgumentException("Parameter this.getEndpoint() is required and cannot be null.");
        }
        if (modelId == null) {
            throw new IllegalArgumentException("Parameter modelId is required and cannot be null.");
        }
        return service.getCustomModel(this.getEndpoint(), modelId, includeKeys);
    }

    /**
     * Get detailed information about a custom model.
     * 
     * @param modelId 
     * @param includeKeys 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Model> getCustomModelAsync(UUID modelId, Boolean includeKeys) {
        return getCustomModelWithResponseAsync(modelId, includeKeys)
            .flatMap((SimpleResponse<Model> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Get detailed information about a custom model.
     * 
     * @param modelId 
     * @param includeKeys 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Model getCustomModel(UUID modelId, Boolean includeKeys) {
        return getCustomModelAsync(modelId, includeKeys).block();
    }

    /**
     * Mark model for deletion. Model artifacts will be permanently removed within a predetermined period.
     * 
     * @param modelId 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteCustomModelWithResponseAsync(UUID modelId) {
        if (this.getEndpoint() == null) {
            throw new IllegalArgumentException("Parameter this.getEndpoint() is required and cannot be null.");
        }
        if (modelId == null) {
            throw new IllegalArgumentException("Parameter modelId is required and cannot be null.");
        }
        return service.deleteCustomModel(this.getEndpoint(), modelId);
    }

    /**
     * Mark model for deletion. Model artifacts will be permanently removed within a predetermined period.
     * 
     * @param modelId 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteCustomModelAsync(UUID modelId) {
        return deleteCustomModelWithResponseAsync(modelId)
            .flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Mark model for deletion. Model artifacts will be permanently removed within a predetermined period.
     * 
     * @param modelId 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void deleteCustomModel(UUID modelId) {
        deleteCustomModelAsync(modelId).block();
    }

    /**
     * Extract key-value pairs, tables, and semantic values from a given document. The input document must be of one of the supported content types - 'application/pdf', 'image/jpeg', 'image/png' or 'image/tiff'. Alternatively, use 'application/json' type to specify the location (Uri or local path) of the document to be analyzed.
     * 
     * @param modelId 
     * @param includeTextDetails 
     * @param fileStream Uri or local path to source data.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<AnalyzeWithCustomModelResponse> analyzeWithCustomModelWithResponseAsync(UUID modelId, Boolean includeTextDetails, SourcePath fileStream) {
        if (this.getEndpoint() == null) {
            throw new IllegalArgumentException("Parameter this.getEndpoint() is required and cannot be null.");
        }
        if (modelId == null) {
            throw new IllegalArgumentException("Parameter modelId is required and cannot be null.");
        }
        if (fileStream != null) {
            fileStream.validate();
        }
        return service.analyzeWithCustomModel(this.getEndpoint(), modelId, includeTextDetails, fileStream);
    }

    /**
     * Extract key-value pairs, tables, and semantic values from a given document. The input document must be of one of the supported content types - 'application/pdf', 'image/jpeg', 'image/png' or 'image/tiff'. Alternatively, use 'application/json' type to specify the location (Uri or local path) of the document to be analyzed.
     * 
     * @param modelId 
     * @param includeTextDetails 
     * @param fileStream Uri or local path to source data.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> analyzeWithCustomModelAsync(UUID modelId, Boolean includeTextDetails, SourcePath fileStream) {
        return analyzeWithCustomModelWithResponseAsync(modelId, includeTextDetails, fileStream)
            .flatMap((AnalyzeWithCustomModelResponse res) -> Mono.empty());
    }

    /**
     * Extract key-value pairs, tables, and semantic values from a given document. The input document must be of one of the supported content types - 'application/pdf', 'image/jpeg', 'image/png' or 'image/tiff'. Alternatively, use 'application/json' type to specify the location (Uri or local path) of the document to be analyzed.
     * 
     * @param modelId 
     * @param includeTextDetails 
     * @param fileStream Uri or local path to source data.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void analyzeWithCustomModel(UUID modelId, Boolean includeTextDetails, SourcePath fileStream) {
        analyzeWithCustomModelAsync(modelId, includeTextDetails, fileStream).block();
    }

    /**
     * Obtain current status and the result of the analyze form operation.
     * 
     * @param modelId 
     * @param resultId 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<AnalyzeOperationResult>> getAnalyzeFormResultWithResponseAsync(UUID modelId, UUID resultId) {
        if (this.getEndpoint() == null) {
            throw new IllegalArgumentException("Parameter this.getEndpoint() is required and cannot be null.");
        }
        if (modelId == null) {
            throw new IllegalArgumentException("Parameter modelId is required and cannot be null.");
        }
        if (resultId == null) {
            throw new IllegalArgumentException("Parameter resultId is required and cannot be null.");
        }
        return service.getAnalyzeFormResult(this.getEndpoint(), modelId, resultId);
    }

    /**
     * Obtain current status and the result of the analyze form operation.
     * 
     * @param modelId 
     * @param resultId 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<AnalyzeOperationResult> getAnalyzeFormResultAsync(UUID modelId, UUID resultId) {
        return getAnalyzeFormResultWithResponseAsync(modelId, resultId)
            .flatMap((SimpleResponse<AnalyzeOperationResult> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Obtain current status and the result of the analyze form operation.
     * 
     * @param modelId 
     * @param resultId 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public AnalyzeOperationResult getAnalyzeFormResult(UUID modelId, UUID resultId) {
        return getAnalyzeFormResultAsync(modelId, resultId).block();
    }

    /**
     * Extract field text and semantic values from a given receipt document. The input document must be of one of the supported content types - 'application/pdf', 'image/jpeg', 'image/png' or 'image/tiff'. Alternatively, use 'application/json' type to specify the location (Uri or local path) of the document to be analyzed.
     * 
     * @param includeTextDetails 
     * @param fileStream Uri or local path to source data.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<AnalyzeReceiptAsyncResponse> analyzeReceiptAsyncWithResponseAsync(Boolean includeTextDetails, SourcePath fileStream) {
        if (this.getEndpoint() == null) {
            throw new IllegalArgumentException("Parameter this.getEndpoint() is required and cannot be null.");
        }
        if (fileStream != null) {
            fileStream.validate();
        }
        return service.analyzeReceiptAsync(this.getEndpoint(), includeTextDetails, fileStream);
    }

    /**
     * Extract field text and semantic values from a given receipt document. The input document must be of one of the supported content types - 'application/pdf', 'image/jpeg', 'image/png' or 'image/tiff'. Alternatively, use 'application/json' type to specify the location (Uri or local path) of the document to be analyzed.
     * 
     * @param includeTextDetails 
     * @param fileStream Uri or local path to source data.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> analyzeReceiptAsyncAsync(Boolean includeTextDetails, SourcePath fileStream) {
        return analyzeReceiptAsyncWithResponseAsync(includeTextDetails, fileStream)
            .flatMap((AnalyzeReceiptAsyncResponse res) -> Mono.empty());
    }

    /**
     * Extract field text and semantic values from a given receipt document. The input document must be of one of the supported content types - 'application/pdf', 'image/jpeg', 'image/png' or 'image/tiff'. Alternatively, use 'application/json' type to specify the location (Uri or local path) of the document to be analyzed.
     * 
     * @param includeTextDetails 
     * @param fileStream Uri or local path to source data.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void analyzeReceiptAsync(Boolean includeTextDetails, SourcePath fileStream) {
        analyzeReceiptAsyncAsync(includeTextDetails, fileStream).block();
    }

    /**
     * Track the progress and obtain the result of the analyze receipt operation.
     * 
     * @param resultId 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<AnalyzeOperationResult>> getAnalyzeReceiptResultWithResponseAsync(UUID resultId) {
        if (this.getEndpoint() == null) {
            throw new IllegalArgumentException("Parameter this.getEndpoint() is required and cannot be null.");
        }
        if (resultId == null) {
            throw new IllegalArgumentException("Parameter resultId is required and cannot be null.");
        }
        return service.getAnalyzeReceiptResult(this.getEndpoint(), resultId);
    }

    /**
     * Track the progress and obtain the result of the analyze receipt operation.
     * 
     * @param resultId 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<AnalyzeOperationResult> getAnalyzeReceiptResultAsync(UUID resultId) {
        return getAnalyzeReceiptResultWithResponseAsync(resultId)
            .flatMap((SimpleResponse<AnalyzeOperationResult> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Track the progress and obtain the result of the analyze receipt operation.
     * 
     * @param resultId 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public AnalyzeOperationResult getAnalyzeReceiptResult(UUID resultId) {
        return getAnalyzeReceiptResultAsync(resultId).block();
    }

    /**
     * Extract text and layout information from a given document. The input document must be of one of the supported content types - 'application/pdf', 'image/jpeg', 'image/png' or 'image/tiff'. Alternatively, use 'application/json' type to specify the location (Uri or local path) of the document to be analyzed.
     * 
     * @param fileStream Uri or local path to source data.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<AnalyzeLayoutAsyncResponse> analyzeLayoutAsyncWithResponseAsync(SourcePath fileStream) {
        if (this.getEndpoint() == null) {
            throw new IllegalArgumentException("Parameter this.getEndpoint() is required and cannot be null.");
        }
        if (fileStream != null) {
            fileStream.validate();
        }
        return service.analyzeLayoutAsync(this.getEndpoint(), fileStream);
    }

    /**
     * Extract text and layout information from a given document. The input document must be of one of the supported content types - 'application/pdf', 'image/jpeg', 'image/png' or 'image/tiff'. Alternatively, use 'application/json' type to specify the location (Uri or local path) of the document to be analyzed.
     * 
     * @param fileStream Uri or local path to source data.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> analyzeLayoutAsyncAsync(SourcePath fileStream) {
        return analyzeLayoutAsyncWithResponseAsync(fileStream)
            .flatMap((AnalyzeLayoutAsyncResponse res) -> Mono.empty());
    }

    /**
     * Extract text and layout information from a given document. The input document must be of one of the supported content types - 'application/pdf', 'image/jpeg', 'image/png' or 'image/tiff'. Alternatively, use 'application/json' type to specify the location (Uri or local path) of the document to be analyzed.
     * 
     * @param fileStream Uri or local path to source data.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void analyzeLayoutAsync(SourcePath fileStream) {
        analyzeLayoutAsyncAsync(fileStream).block();
    }

    /**
     * Track the progress and obtain the result of the analyze layout operation.
     * 
     * @param resultId 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<AnalyzeOperationResult>> getAnalyzeLayoutResultWithResponseAsync(UUID resultId) {
        if (this.getEndpoint() == null) {
            throw new IllegalArgumentException("Parameter this.getEndpoint() is required and cannot be null.");
        }
        if (resultId == null) {
            throw new IllegalArgumentException("Parameter resultId is required and cannot be null.");
        }
        return service.getAnalyzeLayoutResult(this.getEndpoint(), resultId);
    }

    /**
     * Track the progress and obtain the result of the analyze layout operation.
     * 
     * @param resultId 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<AnalyzeOperationResult> getAnalyzeLayoutResultAsync(UUID resultId) {
        return getAnalyzeLayoutResultWithResponseAsync(resultId)
            .flatMap((SimpleResponse<AnalyzeOperationResult> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Track the progress and obtain the result of the analyze layout operation.
     * 
     * @param resultId 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public AnalyzeOperationResult getAnalyzeLayoutResult(UUID resultId) {
        return getAnalyzeLayoutResultAsync(resultId).block();
    }

    /**
     * Get the next page of items.
     * 
     * @param nextLink null
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<ModelInfo>> getCustomModelsNextSinglePageAsync(String nextLink) {
        return service.getCustomModelsNext(nextLink).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().getModelList(),
            res.getValue().getNextLink(),
            null));
    }
}
