package com.azure.storage.blob;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.Put;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.RestProxy;
import com.azure.storage.blob.models.KeyInfo;
import com.azure.storage.blob.models.ServicesGetAccountInfoResponse;
import com.azure.storage.blob.models.ServicesGetPropertiesResponse;
import com.azure.storage.blob.models.ServicesGetStatisticsResponse;
import com.azure.storage.blob.models.ServicesGetUserDelegationKeyResponse;
import com.azure.storage.blob.models.ServicesListContainersSegmentNextResponse;
import com.azure.storage.blob.models.ServicesListContainersSegmentResponse;
import com.azure.storage.blob.models.ServicesSetPropertiesResponse;
import com.azure.storage.blob.models.ServicesSubmitBatchResponse;
import com.azure.storage.blob.models.StorageErrorException;
import com.azure.storage.blob.models.StorageServiceProperties;
import com.azure.storage.blob.models.StorageServiceStats;
import com.azure.storage.blob.models.UserDelegationKey;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * Services.
 */
public final class Services {
    /**
     * The proxy service used to perform REST calls.
     */
    private ServicesService service;

    /**
     * The service client containing this operation class.
     */
    private AzureBlobStorage client;

    /**
     * Initializes an instance of Services.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    public Services(AzureBlobStorage client) {
        this.service = RestProxy.create(ServicesService.class, client.getHttpPipeline());
        this.client = client;
    }

    /**
     * The interface defining all the services for AzureBlobStorageServices to
     * be used by the proxy service to perform REST calls.
     */
    @Host("{url}")
    @ServiceInterface(name = "AzureBlobStorageServices")
    private interface ServicesService {
        @Put("/")
        @ExpectedResponses({202})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<ServicesSetPropertiesResponse> setProperties(@HostParam("url") String url, @QueryParam("restype") String restype, @QueryParam("comp") String comp, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId, @BodyParam("application/xml") StorageServiceProperties storageServiceProperties);

        @Get("/")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<ServicesGetPropertiesResponse> getProperties(@HostParam("url") String url, @QueryParam("restype") String restype, @QueryParam("comp") String comp, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId);

        @Get("/")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<ServicesGetStatisticsResponse> getStatistics(@HostParam("url") String url, @QueryParam("restype") String restype, @QueryParam("comp") String comp, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId);

        @Get("/")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<ServicesListContainersSegmentResponse> listContainersSegment(@HostParam("url") String url, @QueryParam("comp") String comp, @QueryParam("prefix") String prefix, @QueryParam("marker") String marker, @QueryParam("maxresults") Integer maxresults, @QueryParam("include") String include, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId);

        @Post("/")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<ServicesGetUserDelegationKeyResponse> getUserDelegationKey(@HostParam("url") String url, @QueryParam("restype") String restype, @QueryParam("comp") String comp, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId, @BodyParam("application/xml") KeyInfo keyInfo);

        @Get("/")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<ServicesGetAccountInfoResponse> getAccountInfo(@HostParam("url") String url, @QueryParam("restype") String restype, @QueryParam("comp") String comp, @HeaderParam("x-ms-version") String version);

        @Post("/")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<ServicesSubmitBatchResponse> submitBatch(@HostParam("url") String url, @QueryParam("comp") String comp, @HeaderParam("Content-Length") long contentLength, @HeaderParam("Content-Type") String multipartContentType, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId);

        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<ServicesListContainersSegmentNextResponse> listContainersSegmentNext(@PathParam(value = "nextLink", encoded = true) String nextLink);
    }

    /**
     * Sets properties for a storage account's Blob service endpoint, including properties for Storage Analytics and CORS (Cross-Origin Resource Sharing) rules.
     * 
     * @param storageServiceProperties Storage Service Properties.
     * @param timeout 
     * @param requestId 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ServicesSetPropertiesResponse> setPropertiesWithResponseAsync(StorageServiceProperties storageServiceProperties, Integer timeout, String requestId) {
        if (this.client.getUrl() == null) {
            throw new IllegalArgumentException("Parameter this.client.getUrl() is required and cannot be null.");
        }
        if (storageServiceProperties == null) {
            throw new IllegalArgumentException("Parameter storageServiceProperties is required and cannot be null.");
        } else {
            storageServiceProperties.validate();
        }
        final String restype = "service";
        final String comp = "properties";
        return service.setProperties(this.client.getUrl(), restype, comp, timeout, this.client.getVersion(), requestId, storageServiceProperties);
    }

    /**
     * Sets properties for a storage account's Blob service endpoint, including properties for Storage Analytics and CORS (Cross-Origin Resource Sharing) rules.
     * 
     * @param storageServiceProperties Storage Service Properties.
     * @param timeout 
     * @param requestId 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> setPropertiesAsync(StorageServiceProperties storageServiceProperties, Integer timeout, String requestId) {
        return setPropertiesWithResponseAsync(storageServiceProperties, timeout, requestId)
            .flatMap((ServicesSetPropertiesResponse res) -> Mono.empty());
    }

    /**
     * Sets properties for a storage account's Blob service endpoint, including properties for Storage Analytics and CORS (Cross-Origin Resource Sharing) rules.
     * 
     * @param storageServiceProperties Storage Service Properties.
     * @param timeout 
     * @param requestId 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void setProperties(StorageServiceProperties storageServiceProperties, Integer timeout, String requestId) {
        setPropertiesAsync(storageServiceProperties, timeout, requestId).block();
    }

    /**
     * gets the properties of a storage account's Blob service, including properties for Storage Analytics and CORS (Cross-Origin Resource Sharing) rules.
     * 
     * @param timeout 
     * @param requestId 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ServicesGetPropertiesResponse> getPropertiesWithResponseAsync(Integer timeout, String requestId) {
        if (this.client.getUrl() == null) {
            throw new IllegalArgumentException("Parameter this.client.getUrl() is required and cannot be null.");
        }
        final String restype = "service";
        final String comp = "properties";
        return service.getProperties(this.client.getUrl(), restype, comp, timeout, this.client.getVersion(), requestId);
    }

    /**
     * gets the properties of a storage account's Blob service, including properties for Storage Analytics and CORS (Cross-Origin Resource Sharing) rules.
     * 
     * @param timeout 
     * @param requestId 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<StorageServiceProperties> getPropertiesAsync(Integer timeout, String requestId) {
        return getPropertiesWithResponseAsync(timeout, requestId)
            .flatMap((ServicesGetPropertiesResponse res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * gets the properties of a storage account's Blob service, including properties for Storage Analytics and CORS (Cross-Origin Resource Sharing) rules.
     * 
     * @param timeout 
     * @param requestId 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public StorageServiceProperties getProperties(Integer timeout, String requestId) {
        return getPropertiesAsync(timeout, requestId).block();
    }

    /**
     * Retrieves statistics related to replication for the Blob service. It is only available on the secondary location endpoint when read-access geo-redundant replication is enabled for the storage account.
     * 
     * @param timeout 
     * @param requestId 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ServicesGetStatisticsResponse> getStatisticsWithResponseAsync(Integer timeout, String requestId) {
        if (this.client.getUrl() == null) {
            throw new IllegalArgumentException("Parameter this.client.getUrl() is required and cannot be null.");
        }
        final String restype = "service";
        final String comp = "stats";
        return service.getStatistics(this.client.getUrl(), restype, comp, timeout, this.client.getVersion(), requestId);
    }

    /**
     * Retrieves statistics related to replication for the Blob service. It is only available on the secondary location endpoint when read-access geo-redundant replication is enabled for the storage account.
     * 
     * @param timeout 
     * @param requestId 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<StorageServiceStats> getStatisticsAsync(Integer timeout, String requestId) {
        return getStatisticsWithResponseAsync(timeout, requestId)
            .flatMap((ServicesGetStatisticsResponse res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Retrieves statistics related to replication for the Blob service. It is only available on the secondary location endpoint when read-access geo-redundant replication is enabled for the storage account.
     * 
     * @param timeout 
     * @param requestId 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public StorageServiceStats getStatistics(Integer timeout, String requestId) {
        return getStatisticsAsync(timeout, requestId).block();
    }

    /**
     * The List Containers Segment operation returns a list of the containers under the specified account.
     * 
     * @param prefix 
     * @param marker 
     * @param maxresults 
     * @param timeout 
     * @param requestId 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<Long>> listContainersSegmentSinglePageAsync(String prefix, String marker, Integer maxresults, Integer timeout, String requestId) {
        final String comp = "list";
        final String include = "metadata";
        return service.listContainersSegment(this.client.getUrl(), comp, prefix, marker, maxresults, include, timeout, this.client.getVersion(), requestId).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().getValue(),
            res.getValue().getNextMarker(),
            res.getDeserializedHeaders()));
    }

    /**
     * The List Containers Segment operation returns a list of the containers under the specified account.
     * 
     * @param prefix 
     * @param marker 
     * @param maxresults 
     * @param timeout 
     * @param requestId 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<Long> listContainersSegmentAsync(String prefix, String marker, Integer maxresults, Integer timeout, String requestId) {
        return new PagedFlux<>(
            () -> listContainersSegmentSinglePageAsync(prefix, marker, maxresults, timeout, requestId),
            nextLink -> listContainersSegmentNextSinglePageAsync(nextLink));
    }

    /**
     * The List Containers Segment operation returns a list of the containers under the specified account.
     * 
     * @param prefix 
     * @param marker 
     * @param maxresults 
     * @param timeout 
     * @param requestId 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<Long> listContainersSegment(String prefix, String marker, Integer maxresults, Integer timeout, String requestId) {
        return new PagedIterable<>(listContainersSegmentAsync(prefix, marker, maxresults, timeout, requestId));
    }

    /**
     * Retrieves a user delegation key for the Blob service. This is only a valid operation when using bearer token authentication.
     * 
     * @param keyInfo Key information.
     * @param timeout 
     * @param requestId 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ServicesGetUserDelegationKeyResponse> getUserDelegationKeyWithResponseAsync(KeyInfo keyInfo, Integer timeout, String requestId) {
        if (this.client.getUrl() == null) {
            throw new IllegalArgumentException("Parameter this.client.getUrl() is required and cannot be null.");
        }
        if (keyInfo == null) {
            throw new IllegalArgumentException("Parameter keyInfo is required and cannot be null.");
        } else {
            keyInfo.validate();
        }
        final String restype = "service";
        final String comp = "userdelegationkey";
        return service.getUserDelegationKey(this.client.getUrl(), restype, comp, timeout, this.client.getVersion(), requestId, keyInfo);
    }

    /**
     * Retrieves a user delegation key for the Blob service. This is only a valid operation when using bearer token authentication.
     * 
     * @param keyInfo Key information.
     * @param timeout 
     * @param requestId 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<UserDelegationKey> getUserDelegationKeyAsync(KeyInfo keyInfo, Integer timeout, String requestId) {
        return getUserDelegationKeyWithResponseAsync(keyInfo, timeout, requestId)
            .flatMap((ServicesGetUserDelegationKeyResponse res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Retrieves a user delegation key for the Blob service. This is only a valid operation when using bearer token authentication.
     * 
     * @param keyInfo Key information.
     * @param timeout 
     * @param requestId 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public UserDelegationKey getUserDelegationKey(KeyInfo keyInfo, Integer timeout, String requestId) {
        return getUserDelegationKeyAsync(keyInfo, timeout, requestId).block();
    }

    /**
     * Returns the sku name and account kind.
     * 
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ServicesGetAccountInfoResponse> getAccountInfoWithResponseAsync() {
        if (this.client.getUrl() == null) {
            throw new IllegalArgumentException("Parameter this.client.getUrl() is required and cannot be null.");
        }
        final String restype = "account";
        final String comp = "properties";
        return service.getAccountInfo(this.client.getUrl(), restype, comp, this.client.getVersion());
    }

    /**
     * Returns the sku name and account kind.
     * 
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> getAccountInfoAsync() {
        return getAccountInfoWithResponseAsync()
            .flatMap((ServicesGetAccountInfoResponse res) -> Mono.empty());
    }

    /**
     * Returns the sku name and account kind.
     * 
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void getAccountInfo() {
        getAccountInfoAsync().block();
    }

    /**
     * The Batch operation allows multiple API calls to be embedded into a single HTTP request.
     * 
     * @param contentLength 
     * @param multipartContentType 
     * @param timeout 
     * @param requestId 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ServicesSubmitBatchResponse> submitBatchWithResponseAsync(long contentLength, String multipartContentType, Integer timeout, String requestId) {
        if (this.client.getUrl() == null) {
            throw new IllegalArgumentException("Parameter this.client.getUrl() is required and cannot be null.");
        }
        if (multipartContentType == null) {
            throw new IllegalArgumentException("Parameter multipartContentType is required and cannot be null.");
        }
        final String comp = "batch";
        return service.submitBatch(this.client.getUrl(), comp, contentLength, multipartContentType, timeout, this.client.getVersion(), requestId);
    }

    /**
     * The Batch operation allows multiple API calls to be embedded into a single HTTP request.
     * 
     * @param contentLength 
     * @param multipartContentType 
     * @param timeout 
     * @param requestId 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> submitBatchAsync(long contentLength, String multipartContentType, Integer timeout, String requestId) {
        return submitBatchWithResponseAsync(contentLength, multipartContentType, timeout, requestId)
            .flatMap((ServicesSubmitBatchResponse res) -> Mono.empty());
    }

    /**
     * The Batch operation allows multiple API calls to be embedded into a single HTTP request.
     * 
     * @param contentLength 
     * @param multipartContentType 
     * @param timeout 
     * @param requestId 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void submitBatch(long contentLength, String multipartContentType, Integer timeout, String requestId) {
        submitBatchAsync(contentLength, multipartContentType, timeout, requestId).block();
    }

    /**
     * Get the next page of items.
     * 
     * @param nextLink null
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<Long>> listContainersSegmentNextSinglePageAsync(String nextLink) {
        return service.listContainersSegmentNext(nextLink).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().getValue(),
            res.getValue().getNextMarker(),
            res.getDeserializedHeaders()));
    }
}
