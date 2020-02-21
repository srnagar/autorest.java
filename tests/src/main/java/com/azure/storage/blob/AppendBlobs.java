package com.azure.storage.blob;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.Put;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.Base64Util;
import com.azure.core.util.DateTimeRfc1123;
import com.azure.storage.blob.models.AppendBlobsAppendBlockFromUrlResponse;
import com.azure.storage.blob.models.AppendBlobsAppendBlockResponse;
import com.azure.storage.blob.models.AppendBlobsCreateResponse;
import com.azure.storage.blob.models.StorageErrorException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.time.OffsetDateTime;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * AppendBlobs.
 */
public final class AppendBlobs {
    /**
     * The proxy service used to perform REST calls.
     */
    private AppendBlobsService service;

    /**
     * The service client containing this operation class.
     */
    private AzureBlobStorage client;

    /**
     * Initializes an instance of AppendBlobs.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    public AppendBlobs(AzureBlobStorage client) {
        this.service = RestProxy.create(AppendBlobsService.class, client.getHttpPipeline());
        this.client = client;
    }

    /**
     * The interface defining all the services for AzureBlobStorageAppendBlobs
     * to be used by the proxy service to perform REST calls.
     */
    @Host("{url}")
    @ServiceInterface(name = "AzureBlobStorageAppendBlobs")
    private interface AppendBlobsService {
        @Put("/{containerName}/{blob}")
        @ExpectedResponses({201})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<AppendBlobsCreateResponse> create(@HostParam("url") String url, @HeaderParam("x-ms-blob-type") String blobType, @QueryParam("timeout") Integer timeout, @HeaderParam("Content-Length") long contentLength, @HeaderParam("x-ms-blob-content-type") String blobContentType, @HeaderParam("x-ms-blob-content-encoding") String blobContentEncoding, @HeaderParam("x-ms-blob-content-language") String blobContentLanguage, @HeaderParam("x-ms-blob-content-md5") String blobContentMD5, @HeaderParam("x-ms-blob-cache-control") String blobCacheControl, @HeaderParam("x-ms-meta") String metadata, @HeaderParam("x-ms-lease-id") String leaseId, @HeaderParam("x-ms-blob-content-disposition") String blobContentDisposition, @HeaderParam("x-ms-encryption-key") String encryptionKey, @HeaderParam("x-ms-encryption-key-sha256") String encryptionKeySha256, @HeaderParam("x-ms-encryption-algorithm") String encryptionAlgorithm, @HeaderParam("x-ms-encryption-scope") String encryptionScope, @HeaderParam("If-Modified-Since") DateTimeRfc1123 ifModifiedSince, @HeaderParam("If-Unmodified-Since") DateTimeRfc1123 ifUnmodifiedSince, @HeaderParam("If-Match") String ifMatch, @HeaderParam("If-None-Match") String ifNoneMatch, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId);

        @Put("/{containerName}/{blob}")
        @ExpectedResponses({201})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<AppendBlobsAppendBlockResponse> appendBlock(@HostParam("url") String url, @QueryParam("comp") String comp, @QueryParam("timeout") Integer timeout, @HeaderParam("Content-Length") long contentLength, @HeaderParam("Content-MD5") String transactionalContentMD5, @HeaderParam("x-ms-content-crc64") String transactionalContentCrc64, @HeaderParam("x-ms-lease-id") String leaseId, @HeaderParam("x-ms-blob-condition-maxsize") Long maxSize, @HeaderParam("x-ms-blob-condition-appendpos") Long appendPosition, @HeaderParam("x-ms-encryption-key") String encryptionKey, @HeaderParam("x-ms-encryption-key-sha256") String encryptionKeySha256, @HeaderParam("x-ms-encryption-algorithm") String encryptionAlgorithm, @HeaderParam("x-ms-encryption-scope") String encryptionScope, @HeaderParam("If-Modified-Since") DateTimeRfc1123 ifModifiedSince, @HeaderParam("If-Unmodified-Since") DateTimeRfc1123 ifUnmodifiedSince, @HeaderParam("If-Match") String ifMatch, @HeaderParam("If-None-Match") String ifNoneMatch, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId, @BodyParam("application/octet-stream") ByteBuffer body);

        @Put("/{containerName}/{blob}")
        @ExpectedResponses({201})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<AppendBlobsAppendBlockFromUrlResponse> appendBlockFromUrl(@HostParam("url") String url, @QueryParam("comp") String comp, @HeaderParam("x-ms-copy-source") URL sourceUrl, @HeaderParam("x-ms-source-range") String sourceRange, @HeaderParam("x-ms-source-content-md5") String sourceContentMD5, @HeaderParam("x-ms-source-content-crc64") String sourceContentcrc64, @QueryParam("timeout") Integer timeout, @HeaderParam("Content-Length") long contentLength, @HeaderParam("Content-MD5") String transactionalContentMD5, @HeaderParam("x-ms-encryption-key") String encryptionKey, @HeaderParam("x-ms-encryption-key-sha256") String encryptionKeySha256, @HeaderParam("x-ms-encryption-algorithm") String encryptionAlgorithm, @HeaderParam("x-ms-encryption-scope") String encryptionScope, @HeaderParam("x-ms-lease-id") String leaseId, @HeaderParam("x-ms-blob-condition-maxsize") Long maxSize, @HeaderParam("x-ms-blob-condition-appendpos") Long appendPosition, @HeaderParam("If-Modified-Since") DateTimeRfc1123 ifModifiedSince, @HeaderParam("If-Unmodified-Since") DateTimeRfc1123 ifUnmodifiedSince, @HeaderParam("If-Match") String ifMatch, @HeaderParam("If-None-Match") String ifNoneMatch, @HeaderParam("x-ms-source-if-modified-since") DateTimeRfc1123 sourceIfModifiedSince, @HeaderParam("x-ms-source-if-unmodified-since") DateTimeRfc1123 sourceIfUnmodifiedSince, @HeaderParam("x-ms-source-if-match") String sourceIfMatch, @HeaderParam("x-ms-source-if-none-match") String sourceIfNoneMatch, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId);
    }

    /**
     * The Create Append Blob operation creates a new append blob.
     * 
     * @param contentLength 
     * @param timeout 
     * @param blobContentType 
     * @param blobContentEncoding 
     * @param blobContentLanguage 
     * @param blobContentMD5 
     * @param blobCacheControl 
     * @param metadata 
     * @param leaseId 
     * @param blobContentDisposition 
     * @param encryptionKey 
     * @param encryptionKeySha256 
     * @param encryptionScope 
     * @param ifModifiedSince 
     * @param ifUnmodifiedSince 
     * @param ifMatch 
     * @param ifNoneMatch 
     * @param requestId 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<AppendBlobsCreateResponse> createWithResponseAsync(long contentLength, Integer timeout, String blobContentType, String blobContentEncoding, String blobContentLanguage, byte[] blobContentMD5, String blobCacheControl, String metadata, String leaseId, String blobContentDisposition, String encryptionKey, String encryptionKeySha256, String encryptionScope, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String ifMatch, String ifNoneMatch, String requestId) {
        if (this.client.getUrl() == null) {
            throw new IllegalArgumentException("Parameter this.client.getUrl() is required and cannot be null.");
        }
        final String blobType = "AppendBlob";
        final String encryptionAlgorithm = "AES256";
        String blobContentMD5Converted = Base64Util.encodeToString(blobContentMD5);
        DateTimeRfc1123 ifModifiedSinceConverted = ifModifiedSince == null ? null : new DateTimeRfc1123(ifModifiedSince);
        DateTimeRfc1123 ifUnmodifiedSinceConverted = ifUnmodifiedSince == null ? null : new DateTimeRfc1123(ifUnmodifiedSince);
        return service.create(this.client.getUrl(), blobType, timeout, contentLength, blobContentType, blobContentEncoding, blobContentLanguage, blobContentMD5Converted, blobCacheControl, metadata, leaseId, blobContentDisposition, encryptionKey, encryptionKeySha256, encryptionAlgorithm, encryptionScope, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, ifMatch, ifNoneMatch, this.client.getVersion(), requestId);
    }

    /**
     * The Create Append Blob operation creates a new append blob.
     * 
     * @param contentLength 
     * @param timeout 
     * @param blobContentType 
     * @param blobContentEncoding 
     * @param blobContentLanguage 
     * @param blobContentMD5 
     * @param blobCacheControl 
     * @param metadata 
     * @param leaseId 
     * @param blobContentDisposition 
     * @param encryptionKey 
     * @param encryptionKeySha256 
     * @param encryptionScope 
     * @param ifModifiedSince 
     * @param ifUnmodifiedSince 
     * @param ifMatch 
     * @param ifNoneMatch 
     * @param requestId 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> createAsync(long contentLength, Integer timeout, String blobContentType, String blobContentEncoding, String blobContentLanguage, byte[] blobContentMD5, String blobCacheControl, String metadata, String leaseId, String blobContentDisposition, String encryptionKey, String encryptionKeySha256, String encryptionScope, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String ifMatch, String ifNoneMatch, String requestId) {
        return createWithResponseAsync(contentLength, timeout, blobContentType, blobContentEncoding, blobContentLanguage, blobContentMD5, blobCacheControl, metadata, leaseId, blobContentDisposition, encryptionKey, encryptionKeySha256, encryptionScope, ifModifiedSince, ifUnmodifiedSince, ifMatch, ifNoneMatch, requestId)
            .flatMap((AppendBlobsCreateResponse res) -> Mono.empty());
    }

    /**
     * The Create Append Blob operation creates a new append blob.
     * 
     * @param contentLength 
     * @param timeout 
     * @param blobContentType 
     * @param blobContentEncoding 
     * @param blobContentLanguage 
     * @param blobContentMD5 
     * @param blobCacheControl 
     * @param metadata 
     * @param leaseId 
     * @param blobContentDisposition 
     * @param encryptionKey 
     * @param encryptionKeySha256 
     * @param encryptionScope 
     * @param ifModifiedSince 
     * @param ifUnmodifiedSince 
     * @param ifMatch 
     * @param ifNoneMatch 
     * @param requestId 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void create(long contentLength, Integer timeout, String blobContentType, String blobContentEncoding, String blobContentLanguage, byte[] blobContentMD5, String blobCacheControl, String metadata, String leaseId, String blobContentDisposition, String encryptionKey, String encryptionKeySha256, String encryptionScope, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String ifMatch, String ifNoneMatch, String requestId) {
        createAsync(contentLength, timeout, blobContentType, blobContentEncoding, blobContentLanguage, blobContentMD5, blobCacheControl, metadata, leaseId, blobContentDisposition, encryptionKey, encryptionKeySha256, encryptionScope, ifModifiedSince, ifUnmodifiedSince, ifMatch, ifNoneMatch, requestId).block();
    }

    /**
     * The Append Block operation commits a new block of data to the end of an existing append blob. The Append Block operation is permitted only if the blob was created with x-ms-blob-type set to AppendBlob. Append Block is supported only on version 2015-02-21 version or later.
     * 
     * @param contentLength 
     * @param timeout 
     * @param transactionalContentMD5 
     * @param transactionalContentCrc64 
     * @param leaseId 
     * @param maxSize 
     * @param appendPosition 
     * @param encryptionKey 
     * @param encryptionKeySha256 
     * @param encryptionScope 
     * @param ifModifiedSince 
     * @param ifUnmodifiedSince 
     * @param ifMatch 
     * @param ifNoneMatch 
     * @param requestId 
     * @param body 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<AppendBlobsAppendBlockResponse> appendBlockWithResponseAsync(long contentLength, Integer timeout, byte[] transactionalContentMD5, byte[] transactionalContentCrc64, String leaseId, Long maxSize, Long appendPosition, String encryptionKey, String encryptionKeySha256, String encryptionScope, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String ifMatch, String ifNoneMatch, String requestId, ByteBuffer body) {
        if (this.client.getUrl() == null) {
            throw new IllegalArgumentException("Parameter this.client.getUrl() is required and cannot be null.");
        }
        final String comp = "appendblock";
        final String encryptionAlgorithm = "AES256";
        String transactionalContentMD5Converted = Base64Util.encodeToString(transactionalContentMD5);
        String transactionalContentCrc64Converted = Base64Util.encodeToString(transactionalContentCrc64);
        DateTimeRfc1123 ifModifiedSinceConverted = ifModifiedSince == null ? null : new DateTimeRfc1123(ifModifiedSince);
        DateTimeRfc1123 ifUnmodifiedSinceConverted = ifUnmodifiedSince == null ? null : new DateTimeRfc1123(ifUnmodifiedSince);
        return service.appendBlock(this.client.getUrl(), comp, timeout, contentLength, transactionalContentMD5Converted, transactionalContentCrc64Converted, leaseId, maxSize, appendPosition, encryptionKey, encryptionKeySha256, encryptionAlgorithm, encryptionScope, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, ifMatch, ifNoneMatch, this.client.getVersion(), requestId, body);
    }

    /**
     * The Append Block operation commits a new block of data to the end of an existing append blob. The Append Block operation is permitted only if the blob was created with x-ms-blob-type set to AppendBlob. Append Block is supported only on version 2015-02-21 version or later.
     * 
     * @param contentLength 
     * @param timeout 
     * @param transactionalContentMD5 
     * @param transactionalContentCrc64 
     * @param leaseId 
     * @param maxSize 
     * @param appendPosition 
     * @param encryptionKey 
     * @param encryptionKeySha256 
     * @param encryptionScope 
     * @param ifModifiedSince 
     * @param ifUnmodifiedSince 
     * @param ifMatch 
     * @param ifNoneMatch 
     * @param requestId 
     * @param body 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> appendBlockAsync(long contentLength, Integer timeout, byte[] transactionalContentMD5, byte[] transactionalContentCrc64, String leaseId, Long maxSize, Long appendPosition, String encryptionKey, String encryptionKeySha256, String encryptionScope, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String ifMatch, String ifNoneMatch, String requestId, ByteBuffer body) {
        return appendBlockWithResponseAsync(contentLength, timeout, transactionalContentMD5, transactionalContentCrc64, leaseId, maxSize, appendPosition, encryptionKey, encryptionKeySha256, encryptionScope, ifModifiedSince, ifUnmodifiedSince, ifMatch, ifNoneMatch, requestId, body)
            .flatMap((AppendBlobsAppendBlockResponse res) -> Mono.empty());
    }

    /**
     * The Append Block operation commits a new block of data to the end of an existing append blob. The Append Block operation is permitted only if the blob was created with x-ms-blob-type set to AppendBlob. Append Block is supported only on version 2015-02-21 version or later.
     * 
     * @param contentLength 
     * @param timeout 
     * @param transactionalContentMD5 
     * @param transactionalContentCrc64 
     * @param leaseId 
     * @param maxSize 
     * @param appendPosition 
     * @param encryptionKey 
     * @param encryptionKeySha256 
     * @param encryptionScope 
     * @param ifModifiedSince 
     * @param ifUnmodifiedSince 
     * @param ifMatch 
     * @param ifNoneMatch 
     * @param requestId 
     * @param body 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void appendBlock(long contentLength, Integer timeout, byte[] transactionalContentMD5, byte[] transactionalContentCrc64, String leaseId, Long maxSize, Long appendPosition, String encryptionKey, String encryptionKeySha256, String encryptionScope, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String ifMatch, String ifNoneMatch, String requestId, ByteBuffer body) {
        appendBlockAsync(contentLength, timeout, transactionalContentMD5, transactionalContentCrc64, leaseId, maxSize, appendPosition, encryptionKey, encryptionKeySha256, encryptionScope, ifModifiedSince, ifUnmodifiedSince, ifMatch, ifNoneMatch, requestId, body).block();
    }

    /**
     * The Append Block operation commits a new block of data to the end of an existing append blob where the contents are read from a source url. The Append Block operation is permitted only if the blob was created with x-ms-blob-type set to AppendBlob. Append Block is supported only on version 2015-02-21 version or later.
     * 
     * @param sourceUrl 
     * @param contentLength 
     * @param sourceRange 
     * @param sourceContentMD5 
     * @param sourceContentcrc64 
     * @param timeout 
     * @param transactionalContentMD5 
     * @param encryptionKey 
     * @param encryptionKeySha256 
     * @param encryptionScope 
     * @param leaseId 
     * @param maxSize 
     * @param appendPosition 
     * @param ifModifiedSince 
     * @param ifUnmodifiedSince 
     * @param ifMatch 
     * @param ifNoneMatch 
     * @param sourceIfModifiedSince 
     * @param sourceIfUnmodifiedSince 
     * @param sourceIfMatch 
     * @param sourceIfNoneMatch 
     * @param requestId 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<AppendBlobsAppendBlockFromUrlResponse> appendBlockFromUrlWithResponseAsync(URL sourceUrl, long contentLength, String sourceRange, byte[] sourceContentMD5, byte[] sourceContentcrc64, Integer timeout, byte[] transactionalContentMD5, String encryptionKey, String encryptionKeySha256, String encryptionScope, String leaseId, Long maxSize, Long appendPosition, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String ifMatch, String ifNoneMatch, OffsetDateTime sourceIfModifiedSince, OffsetDateTime sourceIfUnmodifiedSince, String sourceIfMatch, String sourceIfNoneMatch, String requestId) {
        if (this.client.getUrl() == null) {
            throw new IllegalArgumentException("Parameter this.client.getUrl() is required and cannot be null.");
        }
        if (sourceUrl == null) {
            throw new IllegalArgumentException("Parameter sourceUrl is required and cannot be null.");
        }
        final String comp = "appendblock";
        final String encryptionAlgorithm = "AES256";
        String sourceContentMD5Converted = Base64Util.encodeToString(sourceContentMD5);
        String sourceContentcrc64Converted = Base64Util.encodeToString(sourceContentcrc64);
        String transactionalContentMD5Converted = Base64Util.encodeToString(transactionalContentMD5);
        DateTimeRfc1123 ifModifiedSinceConverted = ifModifiedSince == null ? null : new DateTimeRfc1123(ifModifiedSince);
        DateTimeRfc1123 ifUnmodifiedSinceConverted = ifUnmodifiedSince == null ? null : new DateTimeRfc1123(ifUnmodifiedSince);
        DateTimeRfc1123 sourceIfModifiedSinceConverted = sourceIfModifiedSince == null ? null : new DateTimeRfc1123(sourceIfModifiedSince);
        DateTimeRfc1123 sourceIfUnmodifiedSinceConverted = sourceIfUnmodifiedSince == null ? null : new DateTimeRfc1123(sourceIfUnmodifiedSince);
        return service.appendBlockFromUrl(this.client.getUrl(), comp, sourceUrl, sourceRange, sourceContentMD5Converted, sourceContentcrc64Converted, timeout, contentLength, transactionalContentMD5Converted, encryptionKey, encryptionKeySha256, encryptionAlgorithm, encryptionScope, leaseId, maxSize, appendPosition, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, ifMatch, ifNoneMatch, sourceIfModifiedSinceConverted, sourceIfUnmodifiedSinceConverted, sourceIfMatch, sourceIfNoneMatch, this.client.getVersion(), requestId);
    }

    /**
     * The Append Block operation commits a new block of data to the end of an existing append blob where the contents are read from a source url. The Append Block operation is permitted only if the blob was created with x-ms-blob-type set to AppendBlob. Append Block is supported only on version 2015-02-21 version or later.
     * 
     * @param sourceUrl 
     * @param contentLength 
     * @param sourceRange 
     * @param sourceContentMD5 
     * @param sourceContentcrc64 
     * @param timeout 
     * @param transactionalContentMD5 
     * @param encryptionKey 
     * @param encryptionKeySha256 
     * @param encryptionScope 
     * @param leaseId 
     * @param maxSize 
     * @param appendPosition 
     * @param ifModifiedSince 
     * @param ifUnmodifiedSince 
     * @param ifMatch 
     * @param ifNoneMatch 
     * @param sourceIfModifiedSince 
     * @param sourceIfUnmodifiedSince 
     * @param sourceIfMatch 
     * @param sourceIfNoneMatch 
     * @param requestId 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> appendBlockFromUrlAsync(URL sourceUrl, long contentLength, String sourceRange, byte[] sourceContentMD5, byte[] sourceContentcrc64, Integer timeout, byte[] transactionalContentMD5, String encryptionKey, String encryptionKeySha256, String encryptionScope, String leaseId, Long maxSize, Long appendPosition, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String ifMatch, String ifNoneMatch, OffsetDateTime sourceIfModifiedSince, OffsetDateTime sourceIfUnmodifiedSince, String sourceIfMatch, String sourceIfNoneMatch, String requestId) {
        return appendBlockFromUrlWithResponseAsync(sourceUrl, contentLength, sourceRange, sourceContentMD5, sourceContentcrc64, timeout, transactionalContentMD5, encryptionKey, encryptionKeySha256, encryptionScope, leaseId, maxSize, appendPosition, ifModifiedSince, ifUnmodifiedSince, ifMatch, ifNoneMatch, sourceIfModifiedSince, sourceIfUnmodifiedSince, sourceIfMatch, sourceIfNoneMatch, requestId)
            .flatMap((AppendBlobsAppendBlockFromUrlResponse res) -> Mono.empty());
    }

    /**
     * The Append Block operation commits a new block of data to the end of an existing append blob where the contents are read from a source url. The Append Block operation is permitted only if the blob was created with x-ms-blob-type set to AppendBlob. Append Block is supported only on version 2015-02-21 version or later.
     * 
     * @param sourceUrl 
     * @param contentLength 
     * @param sourceRange 
     * @param sourceContentMD5 
     * @param sourceContentcrc64 
     * @param timeout 
     * @param transactionalContentMD5 
     * @param encryptionKey 
     * @param encryptionKeySha256 
     * @param encryptionScope 
     * @param leaseId 
     * @param maxSize 
     * @param appendPosition 
     * @param ifModifiedSince 
     * @param ifUnmodifiedSince 
     * @param ifMatch 
     * @param ifNoneMatch 
     * @param sourceIfModifiedSince 
     * @param sourceIfUnmodifiedSince 
     * @param sourceIfMatch 
     * @param sourceIfNoneMatch 
     * @param requestId 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void appendBlockFromUrl(URL sourceUrl, long contentLength, String sourceRange, byte[] sourceContentMD5, byte[] sourceContentcrc64, Integer timeout, byte[] transactionalContentMD5, String encryptionKey, String encryptionKeySha256, String encryptionScope, String leaseId, Long maxSize, Long appendPosition, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String ifMatch, String ifNoneMatch, OffsetDateTime sourceIfModifiedSince, OffsetDateTime sourceIfUnmodifiedSince, String sourceIfMatch, String sourceIfNoneMatch, String requestId) {
        appendBlockFromUrlAsync(sourceUrl, contentLength, sourceRange, sourceContentMD5, sourceContentcrc64, timeout, transactionalContentMD5, encryptionKey, encryptionKeySha256, encryptionScope, leaseId, maxSize, appendPosition, ifModifiedSince, ifUnmodifiedSince, ifMatch, ifNoneMatch, sourceIfModifiedSince, sourceIfUnmodifiedSince, sourceIfMatch, sourceIfNoneMatch, requestId).block();
    }
}
