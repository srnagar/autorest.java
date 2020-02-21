package com.azure.storage.blob;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.Delete;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
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
import com.azure.core.util.DateTimeRfc1123;
import com.azure.core.util.serializer.CollectionFormat;
import com.azure.core.util.serializer.JacksonAdapter;
import com.azure.storage.blob.models.ContainersAcquireLeaseResponse;
import com.azure.storage.blob.models.ContainersBreakLeaseResponse;
import com.azure.storage.blob.models.ContainersChangeLeaseResponse;
import com.azure.storage.blob.models.ContainersCreateResponse;
import com.azure.storage.blob.models.ContainersDeleteResponse;
import com.azure.storage.blob.models.ContainersGetAccessPolicyResponse;
import com.azure.storage.blob.models.ContainersGetAccountInfoResponse;
import com.azure.storage.blob.models.ContainersGetPropertiesResponse;
import com.azure.storage.blob.models.ContainersListBlobFlatSegmentNextResponse;
import com.azure.storage.blob.models.ContainersListBlobFlatSegmentResponse;
import com.azure.storage.blob.models.ContainersListBlobHierarchySegmentNextResponse;
import com.azure.storage.blob.models.ContainersListBlobHierarchySegmentResponse;
import com.azure.storage.blob.models.ContainersReleaseLeaseResponse;
import com.azure.storage.blob.models.ContainersRenewLeaseResponse;
import com.azure.storage.blob.models.ContainersSetAccessPolicyResponse;
import com.azure.storage.blob.models.ContainersSetMetadataResponse;
import com.azure.storage.blob.models.ListBlobsIncludeItem;
import com.azure.storage.blob.models.PublicAccessType;
import com.azure.storage.blob.models.SignedIdentifier;
import com.azure.storage.blob.models.StorageErrorException;
import java.time.OffsetDateTime;
import java.util.List;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * Containers.
 */
public final class Containers {
    /**
     * The proxy service used to perform REST calls.
     */
    private ContainersService service;

    /**
     * The service client containing this operation class.
     */
    private AzureBlobStorage client;

    /**
     * Initializes an instance of Containers.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    public Containers(AzureBlobStorage client) {
        this.service = RestProxy.create(ContainersService.class, client.getHttpPipeline());
        this.client = client;
    }

    /**
     * The interface defining all the services for AzureBlobStorageContainers
     * to be used by the proxy service to perform REST calls.
     */
    @Host("{url}")
    @ServiceInterface(name = "AzureBlobStorageContainers")
    private interface ContainersService {
        @Put("/{containerName}")
        @ExpectedResponses({201})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<ContainersCreateResponse> create(@HostParam("url") String url, @QueryParam("restype") String restype, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-meta") String metadata, @HeaderParam("x-ms-blob-public-access") PublicAccessType access, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId, @HeaderParam("x-ms-default-encryption-scope") String defaultEncryptionScope, @HeaderParam("x-ms-deny-encryption-scope-override") Boolean preventEncryptionScopeOverride);

        @Get("/{containerName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<ContainersGetPropertiesResponse> getProperties(@HostParam("url") String url, @QueryParam("restype") String restype, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-lease-id") String leaseId, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId);

        @Delete("/{containerName}")
        @ExpectedResponses({202})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<ContainersDeleteResponse> delete(@HostParam("url") String url, @QueryParam("restype") String restype, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-lease-id") String leaseId, @HeaderParam("If-Modified-Since") DateTimeRfc1123 ifModifiedSince, @HeaderParam("If-Unmodified-Since") DateTimeRfc1123 ifUnmodifiedSince, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId);

        @Put("/{containerName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<ContainersSetMetadataResponse> setMetadata(@HostParam("url") String url, @QueryParam("restype") String restype, @QueryParam("comp") String comp, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-lease-id") String leaseId, @HeaderParam("x-ms-meta") String metadata, @HeaderParam("If-Modified-Since") DateTimeRfc1123 ifModifiedSince, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId);

        @Get("/{containerName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<ContainersGetAccessPolicyResponse> getAccessPolicy(@HostParam("url") String url, @QueryParam("restype") String restype, @QueryParam("comp") String comp, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-lease-id") String leaseId, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId);

        @Put("/{containerName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<ContainersSetAccessPolicyResponse> setAccessPolicy(@HostParam("url") String url, @QueryParam("restype") String restype, @QueryParam("comp") String comp, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-lease-id") String leaseId, @HeaderParam("x-ms-blob-public-access") PublicAccessType access, @HeaderParam("If-Modified-Since") DateTimeRfc1123 ifModifiedSince, @HeaderParam("If-Unmodified-Since") DateTimeRfc1123 ifUnmodifiedSince, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId, @BodyParam("application/xml") List<SignedIdentifier> containerAcl);

        @Put("/{containerName}")
        @ExpectedResponses({201})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<ContainersAcquireLeaseResponse> acquireLease(@HostParam("url") String url, @QueryParam("comp") String comp, @QueryParam("restype") String restype, @HeaderParam("x-ms-lease-action") String action, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-lease-duration") Integer duration, @HeaderParam("x-ms-proposed-lease-id") String proposedLeaseId, @HeaderParam("If-Modified-Since") DateTimeRfc1123 ifModifiedSince, @HeaderParam("If-Unmodified-Since") DateTimeRfc1123 ifUnmodifiedSince, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId);

        @Put("/{containerName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<ContainersReleaseLeaseResponse> releaseLease(@HostParam("url") String url, @QueryParam("comp") String comp, @QueryParam("restype") String restype, @HeaderParam("x-ms-lease-action") String action, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-lease-id") String leaseId, @HeaderParam("If-Modified-Since") DateTimeRfc1123 ifModifiedSince, @HeaderParam("If-Unmodified-Since") DateTimeRfc1123 ifUnmodifiedSince, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId);

        @Put("/{containerName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<ContainersRenewLeaseResponse> renewLease(@HostParam("url") String url, @QueryParam("comp") String comp, @QueryParam("restype") String restype, @HeaderParam("x-ms-lease-action") String action, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-lease-id") String leaseId, @HeaderParam("If-Modified-Since") DateTimeRfc1123 ifModifiedSince, @HeaderParam("If-Unmodified-Since") DateTimeRfc1123 ifUnmodifiedSince, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId);

        @Put("/{containerName}")
        @ExpectedResponses({202})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<ContainersBreakLeaseResponse> breakLease(@HostParam("url") String url, @QueryParam("comp") String comp, @QueryParam("restype") String restype, @HeaderParam("x-ms-lease-action") String action, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-lease-break-period") Integer breakPeriod, @HeaderParam("If-Modified-Since") DateTimeRfc1123 ifModifiedSince, @HeaderParam("If-Unmodified-Since") DateTimeRfc1123 ifUnmodifiedSince, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId);

        @Put("/{containerName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<ContainersChangeLeaseResponse> changeLease(@HostParam("url") String url, @QueryParam("comp") String comp, @QueryParam("restype") String restype, @HeaderParam("x-ms-lease-action") String action, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-lease-id") String leaseId, @HeaderParam("x-ms-proposed-lease-id") String proposedLeaseId, @HeaderParam("If-Modified-Since") DateTimeRfc1123 ifModifiedSince, @HeaderParam("If-Unmodified-Since") DateTimeRfc1123 ifUnmodifiedSince, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId);

        @Get("/{containerName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<ContainersListBlobFlatSegmentResponse> listBlobFlatSegment(@HostParam("url") String url, @QueryParam("restype") String restype, @QueryParam("comp") String comp, @QueryParam("prefix") String prefix, @QueryParam("marker") String marker, @QueryParam("maxresults") Integer maxresults, @QueryParam("include") String include, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId);

        @Get("/{containerName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<ContainersListBlobHierarchySegmentResponse> listBlobHierarchySegment(@HostParam("url") String url, @QueryParam("restype") String restype, @QueryParam("comp") String comp, @QueryParam("prefix") String prefix, @QueryParam("delimiter") String delimiter, @QueryParam("marker") String marker, @QueryParam("maxresults") Integer maxresults, @QueryParam("include") String include, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId);

        @Get("/{containerName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<ContainersGetAccountInfoResponse> getAccountInfo(@HostParam("url") String url, @QueryParam("restype") String restype, @QueryParam("comp") String comp, @HeaderParam("x-ms-version") String version);

        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<ContainersListBlobFlatSegmentNextResponse> listBlobFlatSegmentNext(@PathParam(value = "nextLink", encoded = true) String nextLink);

        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<ContainersListBlobHierarchySegmentNextResponse> listBlobHierarchySegmentNext(@PathParam(value = "nextLink", encoded = true) String nextLink);
    }

    /**
     * creates a new container under the specified account. If the container with the same name already exists, the operation fails.
     * 
     * @param timeout 
     * @param metadata 
     * @param access 
     * @param requestId 
     * @param defaultEncryptionScope 
     * @param preventEncryptionScopeOverride 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ContainersCreateResponse> createWithResponseAsync(Integer timeout, String metadata, PublicAccessType access, String requestId, String defaultEncryptionScope, Boolean preventEncryptionScopeOverride) {
        if (this.client.getUrl() == null) {
            throw new IllegalArgumentException("Parameter this.client.getUrl() is required and cannot be null.");
        }
        final String restype = "container";
        return service.create(this.client.getUrl(), restype, timeout, metadata, access, this.client.getVersion(), requestId, defaultEncryptionScope, preventEncryptionScopeOverride);
    }

    /**
     * creates a new container under the specified account. If the container with the same name already exists, the operation fails.
     * 
     * @param timeout 
     * @param metadata 
     * @param access 
     * @param requestId 
     * @param defaultEncryptionScope 
     * @param preventEncryptionScopeOverride 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> createAsync(Integer timeout, String metadata, PublicAccessType access, String requestId, String defaultEncryptionScope, Boolean preventEncryptionScopeOverride) {
        return createWithResponseAsync(timeout, metadata, access, requestId, defaultEncryptionScope, preventEncryptionScopeOverride)
            .flatMap((ContainersCreateResponse res) -> Mono.empty());
    }

    /**
     * creates a new container under the specified account. If the container with the same name already exists, the operation fails.
     * 
     * @param timeout 
     * @param metadata 
     * @param access 
     * @param requestId 
     * @param defaultEncryptionScope 
     * @param preventEncryptionScopeOverride 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void create(Integer timeout, String metadata, PublicAccessType access, String requestId, String defaultEncryptionScope, Boolean preventEncryptionScopeOverride) {
        createAsync(timeout, metadata, access, requestId, defaultEncryptionScope, preventEncryptionScopeOverride).block();
    }

    /**
     * returns all user-defined metadata and system properties for the specified container. The data returned does not include the container's list of blobs.
     * 
     * @param timeout 
     * @param leaseId 
     * @param requestId 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ContainersGetPropertiesResponse> getPropertiesWithResponseAsync(Integer timeout, String leaseId, String requestId) {
        if (this.client.getUrl() == null) {
            throw new IllegalArgumentException("Parameter this.client.getUrl() is required and cannot be null.");
        }
        final String restype = "container";
        return service.getProperties(this.client.getUrl(), restype, timeout, leaseId, this.client.getVersion(), requestId);
    }

    /**
     * returns all user-defined metadata and system properties for the specified container. The data returned does not include the container's list of blobs.
     * 
     * @param timeout 
     * @param leaseId 
     * @param requestId 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> getPropertiesAsync(Integer timeout, String leaseId, String requestId) {
        return getPropertiesWithResponseAsync(timeout, leaseId, requestId)
            .flatMap((ContainersGetPropertiesResponse res) -> Mono.empty());
    }

    /**
     * returns all user-defined metadata and system properties for the specified container. The data returned does not include the container's list of blobs.
     * 
     * @param timeout 
     * @param leaseId 
     * @param requestId 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void getProperties(Integer timeout, String leaseId, String requestId) {
        getPropertiesAsync(timeout, leaseId, requestId).block();
    }

    /**
     * operation marks the specified container for deletion. The container and any blobs contained within it are later deleted during garbage collection.
     * 
     * @param timeout 
     * @param leaseId 
     * @param ifModifiedSince 
     * @param ifUnmodifiedSince 
     * @param requestId 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ContainersDeleteResponse> deleteWithResponseAsync(Integer timeout, String leaseId, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String requestId) {
        if (this.client.getUrl() == null) {
            throw new IllegalArgumentException("Parameter this.client.getUrl() is required and cannot be null.");
        }
        final String restype = "container";
        DateTimeRfc1123 ifModifiedSinceConverted = ifModifiedSince == null ? null : new DateTimeRfc1123(ifModifiedSince);
        DateTimeRfc1123 ifUnmodifiedSinceConverted = ifUnmodifiedSince == null ? null : new DateTimeRfc1123(ifUnmodifiedSince);
        return service.delete(this.client.getUrl(), restype, timeout, leaseId, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, this.client.getVersion(), requestId);
    }

    /**
     * operation marks the specified container for deletion. The container and any blobs contained within it are later deleted during garbage collection.
     * 
     * @param timeout 
     * @param leaseId 
     * @param ifModifiedSince 
     * @param ifUnmodifiedSince 
     * @param requestId 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteAsync(Integer timeout, String leaseId, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String requestId) {
        return deleteWithResponseAsync(timeout, leaseId, ifModifiedSince, ifUnmodifiedSince, requestId)
            .flatMap((ContainersDeleteResponse res) -> Mono.empty());
    }

    /**
     * operation marks the specified container for deletion. The container and any blobs contained within it are later deleted during garbage collection.
     * 
     * @param timeout 
     * @param leaseId 
     * @param ifModifiedSince 
     * @param ifUnmodifiedSince 
     * @param requestId 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(Integer timeout, String leaseId, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String requestId) {
        deleteAsync(timeout, leaseId, ifModifiedSince, ifUnmodifiedSince, requestId).block();
    }

    /**
     * operation sets one or more user-defined name-value pairs for the specified container.
     * 
     * @param timeout 
     * @param leaseId 
     * @param metadata 
     * @param ifModifiedSince 
     * @param requestId 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ContainersSetMetadataResponse> setMetadataWithResponseAsync(Integer timeout, String leaseId, String metadata, OffsetDateTime ifModifiedSince, String requestId) {
        if (this.client.getUrl() == null) {
            throw new IllegalArgumentException("Parameter this.client.getUrl() is required and cannot be null.");
        }
        final String restype = "container";
        final String comp = "metadata";
        DateTimeRfc1123 ifModifiedSinceConverted = ifModifiedSince == null ? null : new DateTimeRfc1123(ifModifiedSince);
        return service.setMetadata(this.client.getUrl(), restype, comp, timeout, leaseId, metadata, ifModifiedSinceConverted, this.client.getVersion(), requestId);
    }

    /**
     * operation sets one or more user-defined name-value pairs for the specified container.
     * 
     * @param timeout 
     * @param leaseId 
     * @param metadata 
     * @param ifModifiedSince 
     * @param requestId 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> setMetadataAsync(Integer timeout, String leaseId, String metadata, OffsetDateTime ifModifiedSince, String requestId) {
        return setMetadataWithResponseAsync(timeout, leaseId, metadata, ifModifiedSince, requestId)
            .flatMap((ContainersSetMetadataResponse res) -> Mono.empty());
    }

    /**
     * operation sets one or more user-defined name-value pairs for the specified container.
     * 
     * @param timeout 
     * @param leaseId 
     * @param metadata 
     * @param ifModifiedSince 
     * @param requestId 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void setMetadata(Integer timeout, String leaseId, String metadata, OffsetDateTime ifModifiedSince, String requestId) {
        setMetadataAsync(timeout, leaseId, metadata, ifModifiedSince, requestId).block();
    }

    /**
     * gets the permissions for the specified container. The permissions indicate whether container data may be accessed publicly.
     * 
     * @param timeout 
     * @param leaseId 
     * @param requestId 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ContainersGetAccessPolicyResponse> getAccessPolicyWithResponseAsync(Integer timeout, String leaseId, String requestId) {
        if (this.client.getUrl() == null) {
            throw new IllegalArgumentException("Parameter this.client.getUrl() is required and cannot be null.");
        }
        final String restype = "container";
        final String comp = "acl";
        return service.getAccessPolicy(this.client.getUrl(), restype, comp, timeout, leaseId, this.client.getVersion(), requestId);
    }

    /**
     * gets the permissions for the specified container. The permissions indicate whether container data may be accessed publicly.
     * 
     * @param timeout 
     * @param leaseId 
     * @param requestId 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<List<SignedIdentifier>> getAccessPolicyAsync(Integer timeout, String leaseId, String requestId) {
        return getAccessPolicyWithResponseAsync(timeout, leaseId, requestId)
            .flatMap((ContainersGetAccessPolicyResponse res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * gets the permissions for the specified container. The permissions indicate whether container data may be accessed publicly.
     * 
     * @param timeout 
     * @param leaseId 
     * @param requestId 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public List<SignedIdentifier> getAccessPolicy(Integer timeout, String leaseId, String requestId) {
        return getAccessPolicyAsync(timeout, leaseId, requestId).block();
    }

    /**
     * sets the permissions for the specified container. The permissions indicate whether blobs in a container may be accessed publicly.
     * 
     * @param timeout 
     * @param leaseId 
     * @param access 
     * @param ifModifiedSince 
     * @param ifUnmodifiedSince 
     * @param requestId 
     * @param containerAcl a collection of signed identifiers.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ContainersSetAccessPolicyResponse> setAccessPolicyWithResponseAsync(Integer timeout, String leaseId, PublicAccessType access, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String requestId, List<SignedIdentifier> containerAcl) {
        if (this.client.getUrl() == null) {
            throw new IllegalArgumentException("Parameter this.client.getUrl() is required and cannot be null.");
        }
        if (containerAcl != null) {
            containerAcl.forEach(e -> e.validate());
        }
        final String restype = "container";
        final String comp = "acl";
        DateTimeRfc1123 ifModifiedSinceConverted = ifModifiedSince == null ? null : new DateTimeRfc1123(ifModifiedSince);
        DateTimeRfc1123 ifUnmodifiedSinceConverted = ifUnmodifiedSince == null ? null : new DateTimeRfc1123(ifUnmodifiedSince);
        return service.setAccessPolicy(this.client.getUrl(), restype, comp, timeout, leaseId, access, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, this.client.getVersion(), requestId, containerAcl);
    }

    /**
     * sets the permissions for the specified container. The permissions indicate whether blobs in a container may be accessed publicly.
     * 
     * @param timeout 
     * @param leaseId 
     * @param access 
     * @param ifModifiedSince 
     * @param ifUnmodifiedSince 
     * @param requestId 
     * @param containerAcl a collection of signed identifiers.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> setAccessPolicyAsync(Integer timeout, String leaseId, PublicAccessType access, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String requestId, List<SignedIdentifier> containerAcl) {
        return setAccessPolicyWithResponseAsync(timeout, leaseId, access, ifModifiedSince, ifUnmodifiedSince, requestId, containerAcl)
            .flatMap((ContainersSetAccessPolicyResponse res) -> Mono.empty());
    }

    /**
     * sets the permissions for the specified container. The permissions indicate whether blobs in a container may be accessed publicly.
     * 
     * @param timeout 
     * @param leaseId 
     * @param access 
     * @param ifModifiedSince 
     * @param ifUnmodifiedSince 
     * @param requestId 
     * @param containerAcl a collection of signed identifiers.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void setAccessPolicy(Integer timeout, String leaseId, PublicAccessType access, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String requestId, List<SignedIdentifier> containerAcl) {
        setAccessPolicyAsync(timeout, leaseId, access, ifModifiedSince, ifUnmodifiedSince, requestId, containerAcl).block();
    }

    /**
     * [Update] establishes and manages a lock on a container for delete operations. The lock duration can be 15 to 60 seconds, or can be infinite.
     * 
     * @param timeout 
     * @param duration 
     * @param proposedLeaseId 
     * @param ifModifiedSince 
     * @param ifUnmodifiedSince 
     * @param requestId 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ContainersAcquireLeaseResponse> acquireLeaseWithResponseAsync(Integer timeout, Integer duration, String proposedLeaseId, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String requestId) {
        if (this.client.getUrl() == null) {
            throw new IllegalArgumentException("Parameter this.client.getUrl() is required and cannot be null.");
        }
        final String comp = "lease";
        final String restype = "container";
        final String action = "acquire";
        DateTimeRfc1123 ifModifiedSinceConverted = ifModifiedSince == null ? null : new DateTimeRfc1123(ifModifiedSince);
        DateTimeRfc1123 ifUnmodifiedSinceConverted = ifUnmodifiedSince == null ? null : new DateTimeRfc1123(ifUnmodifiedSince);
        return service.acquireLease(this.client.getUrl(), comp, restype, action, timeout, duration, proposedLeaseId, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, this.client.getVersion(), requestId);
    }

    /**
     * [Update] establishes and manages a lock on a container for delete operations. The lock duration can be 15 to 60 seconds, or can be infinite.
     * 
     * @param timeout 
     * @param duration 
     * @param proposedLeaseId 
     * @param ifModifiedSince 
     * @param ifUnmodifiedSince 
     * @param requestId 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> acquireLeaseAsync(Integer timeout, Integer duration, String proposedLeaseId, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String requestId) {
        return acquireLeaseWithResponseAsync(timeout, duration, proposedLeaseId, ifModifiedSince, ifUnmodifiedSince, requestId)
            .flatMap((ContainersAcquireLeaseResponse res) -> Mono.empty());
    }

    /**
     * [Update] establishes and manages a lock on a container for delete operations. The lock duration can be 15 to 60 seconds, or can be infinite.
     * 
     * @param timeout 
     * @param duration 
     * @param proposedLeaseId 
     * @param ifModifiedSince 
     * @param ifUnmodifiedSince 
     * @param requestId 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void acquireLease(Integer timeout, Integer duration, String proposedLeaseId, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String requestId) {
        acquireLeaseAsync(timeout, duration, proposedLeaseId, ifModifiedSince, ifUnmodifiedSince, requestId).block();
    }

    /**
     * [Update] establishes and manages a lock on a container for delete operations. The lock duration can be 15 to 60 seconds, or can be infinite.
     * 
     * @param leaseId 
     * @param timeout 
     * @param ifModifiedSince 
     * @param ifUnmodifiedSince 
     * @param requestId 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ContainersReleaseLeaseResponse> releaseLeaseWithResponseAsync(String leaseId, Integer timeout, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String requestId) {
        if (this.client.getUrl() == null) {
            throw new IllegalArgumentException("Parameter this.client.getUrl() is required and cannot be null.");
        }
        if (leaseId == null) {
            throw new IllegalArgumentException("Parameter leaseId is required and cannot be null.");
        }
        final String comp = "lease";
        final String restype = "container";
        final String action = "release";
        DateTimeRfc1123 ifModifiedSinceConverted = ifModifiedSince == null ? null : new DateTimeRfc1123(ifModifiedSince);
        DateTimeRfc1123 ifUnmodifiedSinceConverted = ifUnmodifiedSince == null ? null : new DateTimeRfc1123(ifUnmodifiedSince);
        return service.releaseLease(this.client.getUrl(), comp, restype, action, timeout, leaseId, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, this.client.getVersion(), requestId);
    }

    /**
     * [Update] establishes and manages a lock on a container for delete operations. The lock duration can be 15 to 60 seconds, or can be infinite.
     * 
     * @param leaseId 
     * @param timeout 
     * @param ifModifiedSince 
     * @param ifUnmodifiedSince 
     * @param requestId 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> releaseLeaseAsync(String leaseId, Integer timeout, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String requestId) {
        return releaseLeaseWithResponseAsync(leaseId, timeout, ifModifiedSince, ifUnmodifiedSince, requestId)
            .flatMap((ContainersReleaseLeaseResponse res) -> Mono.empty());
    }

    /**
     * [Update] establishes and manages a lock on a container for delete operations. The lock duration can be 15 to 60 seconds, or can be infinite.
     * 
     * @param leaseId 
     * @param timeout 
     * @param ifModifiedSince 
     * @param ifUnmodifiedSince 
     * @param requestId 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void releaseLease(String leaseId, Integer timeout, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String requestId) {
        releaseLeaseAsync(leaseId, timeout, ifModifiedSince, ifUnmodifiedSince, requestId).block();
    }

    /**
     * [Update] establishes and manages a lock on a container for delete operations. The lock duration can be 15 to 60 seconds, or can be infinite.
     * 
     * @param leaseId 
     * @param timeout 
     * @param ifModifiedSince 
     * @param ifUnmodifiedSince 
     * @param requestId 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ContainersRenewLeaseResponse> renewLeaseWithResponseAsync(String leaseId, Integer timeout, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String requestId) {
        if (this.client.getUrl() == null) {
            throw new IllegalArgumentException("Parameter this.client.getUrl() is required and cannot be null.");
        }
        if (leaseId == null) {
            throw new IllegalArgumentException("Parameter leaseId is required and cannot be null.");
        }
        final String comp = "lease";
        final String restype = "container";
        final String action = "renew";
        DateTimeRfc1123 ifModifiedSinceConverted = ifModifiedSince == null ? null : new DateTimeRfc1123(ifModifiedSince);
        DateTimeRfc1123 ifUnmodifiedSinceConverted = ifUnmodifiedSince == null ? null : new DateTimeRfc1123(ifUnmodifiedSince);
        return service.renewLease(this.client.getUrl(), comp, restype, action, timeout, leaseId, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, this.client.getVersion(), requestId);
    }

    /**
     * [Update] establishes and manages a lock on a container for delete operations. The lock duration can be 15 to 60 seconds, or can be infinite.
     * 
     * @param leaseId 
     * @param timeout 
     * @param ifModifiedSince 
     * @param ifUnmodifiedSince 
     * @param requestId 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> renewLeaseAsync(String leaseId, Integer timeout, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String requestId) {
        return renewLeaseWithResponseAsync(leaseId, timeout, ifModifiedSince, ifUnmodifiedSince, requestId)
            .flatMap((ContainersRenewLeaseResponse res) -> Mono.empty());
    }

    /**
     * [Update] establishes and manages a lock on a container for delete operations. The lock duration can be 15 to 60 seconds, or can be infinite.
     * 
     * @param leaseId 
     * @param timeout 
     * @param ifModifiedSince 
     * @param ifUnmodifiedSince 
     * @param requestId 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void renewLease(String leaseId, Integer timeout, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String requestId) {
        renewLeaseAsync(leaseId, timeout, ifModifiedSince, ifUnmodifiedSince, requestId).block();
    }

    /**
     * [Update] establishes and manages a lock on a container for delete operations. The lock duration can be 15 to 60 seconds, or can be infinite.
     * 
     * @param timeout 
     * @param breakPeriod 
     * @param ifModifiedSince 
     * @param ifUnmodifiedSince 
     * @param requestId 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ContainersBreakLeaseResponse> breakLeaseWithResponseAsync(Integer timeout, Integer breakPeriod, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String requestId) {
        if (this.client.getUrl() == null) {
            throw new IllegalArgumentException("Parameter this.client.getUrl() is required and cannot be null.");
        }
        final String comp = "lease";
        final String restype = "container";
        final String action = "break";
        DateTimeRfc1123 ifModifiedSinceConverted = ifModifiedSince == null ? null : new DateTimeRfc1123(ifModifiedSince);
        DateTimeRfc1123 ifUnmodifiedSinceConverted = ifUnmodifiedSince == null ? null : new DateTimeRfc1123(ifUnmodifiedSince);
        return service.breakLease(this.client.getUrl(), comp, restype, action, timeout, breakPeriod, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, this.client.getVersion(), requestId);
    }

    /**
     * [Update] establishes and manages a lock on a container for delete operations. The lock duration can be 15 to 60 seconds, or can be infinite.
     * 
     * @param timeout 
     * @param breakPeriod 
     * @param ifModifiedSince 
     * @param ifUnmodifiedSince 
     * @param requestId 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> breakLeaseAsync(Integer timeout, Integer breakPeriod, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String requestId) {
        return breakLeaseWithResponseAsync(timeout, breakPeriod, ifModifiedSince, ifUnmodifiedSince, requestId)
            .flatMap((ContainersBreakLeaseResponse res) -> Mono.empty());
    }

    /**
     * [Update] establishes and manages a lock on a container for delete operations. The lock duration can be 15 to 60 seconds, or can be infinite.
     * 
     * @param timeout 
     * @param breakPeriod 
     * @param ifModifiedSince 
     * @param ifUnmodifiedSince 
     * @param requestId 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void breakLease(Integer timeout, Integer breakPeriod, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String requestId) {
        breakLeaseAsync(timeout, breakPeriod, ifModifiedSince, ifUnmodifiedSince, requestId).block();
    }

    /**
     * [Update] establishes and manages a lock on a container for delete operations. The lock duration can be 15 to 60 seconds, or can be infinite.
     * 
     * @param leaseId 
     * @param proposedLeaseId 
     * @param timeout 
     * @param ifModifiedSince 
     * @param ifUnmodifiedSince 
     * @param requestId 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ContainersChangeLeaseResponse> changeLeaseWithResponseAsync(String leaseId, String proposedLeaseId, Integer timeout, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String requestId) {
        if (this.client.getUrl() == null) {
            throw new IllegalArgumentException("Parameter this.client.getUrl() is required and cannot be null.");
        }
        if (leaseId == null) {
            throw new IllegalArgumentException("Parameter leaseId is required and cannot be null.");
        }
        if (proposedLeaseId == null) {
            throw new IllegalArgumentException("Parameter proposedLeaseId is required and cannot be null.");
        }
        final String comp = "lease";
        final String restype = "container";
        final String action = "change";
        DateTimeRfc1123 ifModifiedSinceConverted = ifModifiedSince == null ? null : new DateTimeRfc1123(ifModifiedSince);
        DateTimeRfc1123 ifUnmodifiedSinceConverted = ifUnmodifiedSince == null ? null : new DateTimeRfc1123(ifUnmodifiedSince);
        return service.changeLease(this.client.getUrl(), comp, restype, action, timeout, leaseId, proposedLeaseId, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, this.client.getVersion(), requestId);
    }

    /**
     * [Update] establishes and manages a lock on a container for delete operations. The lock duration can be 15 to 60 seconds, or can be infinite.
     * 
     * @param leaseId 
     * @param proposedLeaseId 
     * @param timeout 
     * @param ifModifiedSince 
     * @param ifUnmodifiedSince 
     * @param requestId 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> changeLeaseAsync(String leaseId, String proposedLeaseId, Integer timeout, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String requestId) {
        return changeLeaseWithResponseAsync(leaseId, proposedLeaseId, timeout, ifModifiedSince, ifUnmodifiedSince, requestId)
            .flatMap((ContainersChangeLeaseResponse res) -> Mono.empty());
    }

    /**
     * [Update] establishes and manages a lock on a container for delete operations. The lock duration can be 15 to 60 seconds, or can be infinite.
     * 
     * @param leaseId 
     * @param proposedLeaseId 
     * @param timeout 
     * @param ifModifiedSince 
     * @param ifUnmodifiedSince 
     * @param requestId 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void changeLease(String leaseId, String proposedLeaseId, Integer timeout, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String requestId) {
        changeLeaseAsync(leaseId, proposedLeaseId, timeout, ifModifiedSince, ifUnmodifiedSince, requestId).block();
    }

    /**
     * [Update] The List Blobs operation returns a list of the blobs under the specified container.
     * 
     * @param prefix 
     * @param marker 
     * @param maxresults 
     * @param include Array of ListBlobsIncludeItem.
     * @param timeout 
     * @param requestId 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<Long>> listBlobFlatSegmentSinglePageAsync(String prefix, String marker, Integer maxresults, List<ListBlobsIncludeItem> include, Integer timeout, String requestId) {
        final String restype = "container";
        final String comp = "list";
        return service.listBlobFlatSegment(this.client.getUrl(), restype, comp, prefix, marker, maxresults, includeConverted, timeout, this.client.getVersion(), requestId).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().getValue(),
            res.getValue().getNextMarker(),
            res.getDeserializedHeaders()));
    }

    /**
     * [Update] The List Blobs operation returns a list of the blobs under the specified container.
     * 
     * @param prefix 
     * @param marker 
     * @param maxresults 
     * @param include Array of ListBlobsIncludeItem.
     * @param timeout 
     * @param requestId 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<Long> listBlobFlatSegmentAsync(String prefix, String marker, Integer maxresults, List<ListBlobsIncludeItem> include, Integer timeout, String requestId) {
        return new PagedFlux<>(
            () -> listBlobFlatSegmentSinglePageAsync(prefix, marker, maxresults, include, timeout, requestId),
            nextLink -> listBlobFlatSegmentNextSinglePageAsync(nextLink));
    }

    /**
     * [Update] The List Blobs operation returns a list of the blobs under the specified container.
     * 
     * @param prefix 
     * @param marker 
     * @param maxresults 
     * @param include Array of ListBlobsIncludeItem.
     * @param timeout 
     * @param requestId 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<Long> listBlobFlatSegment(String prefix, String marker, Integer maxresults, List<ListBlobsIncludeItem> include, Integer timeout, String requestId) {
        return new PagedIterable<>(listBlobFlatSegmentAsync(prefix, marker, maxresults, include, timeout, requestId));
    }

    /**
     * [Update] The List Blobs operation returns a list of the blobs under the specified container.
     * 
     * @param delimiter 
     * @param prefix 
     * @param marker 
     * @param maxresults 
     * @param include Array of ListBlobsIncludeItem.
     * @param timeout 
     * @param requestId 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<Long>> listBlobHierarchySegmentSinglePageAsync(String delimiter, String prefix, String marker, Integer maxresults, List<ListBlobsIncludeItem> include, Integer timeout, String requestId) {
        final String restype = "container";
        final String comp = "list";
        return service.listBlobHierarchySegment(this.client.getUrl(), restype, comp, prefix, delimiter, marker, maxresults, includeConverted, timeout, this.client.getVersion(), requestId).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().getValue(),
            res.getValue().getNextMarker(),
            res.getDeserializedHeaders()));
    }

    /**
     * [Update] The List Blobs operation returns a list of the blobs under the specified container.
     * 
     * @param delimiter 
     * @param prefix 
     * @param marker 
     * @param maxresults 
     * @param include Array of ListBlobsIncludeItem.
     * @param timeout 
     * @param requestId 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<Long> listBlobHierarchySegmentAsync(String delimiter, String prefix, String marker, Integer maxresults, List<ListBlobsIncludeItem> include, Integer timeout, String requestId) {
        return new PagedFlux<>(
            () -> listBlobHierarchySegmentSinglePageAsync(delimiter, prefix, marker, maxresults, include, timeout, requestId),
            nextLink -> listBlobHierarchySegmentNextSinglePageAsync(nextLink));
    }

    /**
     * [Update] The List Blobs operation returns a list of the blobs under the specified container.
     * 
     * @param delimiter 
     * @param prefix 
     * @param marker 
     * @param maxresults 
     * @param include Array of ListBlobsIncludeItem.
     * @param timeout 
     * @param requestId 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<Long> listBlobHierarchySegment(String delimiter, String prefix, String marker, Integer maxresults, List<ListBlobsIncludeItem> include, Integer timeout, String requestId) {
        return new PagedIterable<>(listBlobHierarchySegmentAsync(delimiter, prefix, marker, maxresults, include, timeout, requestId));
    }

    /**
     * Returns the sku name and account kind.
     * 
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ContainersGetAccountInfoResponse> getAccountInfoWithResponseAsync() {
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
            .flatMap((ContainersGetAccountInfoResponse res) -> Mono.empty());
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
     * Get the next page of items.
     * 
     * @param nextLink null
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<Long>> listBlobFlatSegmentNextSinglePageAsync(String nextLink) {
        return service.listBlobFlatSegmentNext(nextLink).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().getValue(),
            res.getValue().getNextMarker(),
            res.getDeserializedHeaders()));
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
    public Mono<PagedResponse<Long>> listBlobHierarchySegmentNextSinglePageAsync(String nextLink) {
        return service.listBlobHierarchySegmentNext(nextLink).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().getValue(),
            res.getValue().getNextMarker(),
            res.getDeserializedHeaders()));
    }
}
