package com.azure.storage.blob;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
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
import com.azure.storage.blob.models.AccessTier;
import com.azure.storage.blob.models.BlockBlobsCommitBlockListResponse;
import com.azure.storage.blob.models.BlockBlobsGetBlockListResponse;
import com.azure.storage.blob.models.BlockBlobsStageBlockFromURLResponse;
import com.azure.storage.blob.models.BlockBlobsStageBlockResponse;
import com.azure.storage.blob.models.BlockBlobsUploadResponse;
import com.azure.storage.blob.models.BlockList;
import com.azure.storage.blob.models.BlockListType;
import com.azure.storage.blob.models.BlockLookupList;
import com.azure.storage.blob.models.StorageErrorException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.time.OffsetDateTime;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * BlockBlobs.
 */
public final class BlockBlobs {
    /**
     * The proxy service used to perform REST calls.
     */
    private BlockBlobsService service;

    /**
     * The service client containing this operation class.
     */
    private AzureBlobStorage client;

    /**
     * Initializes an instance of BlockBlobs.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    public BlockBlobs(AzureBlobStorage client) {
        this.service = RestProxy.create(BlockBlobsService.class, client.getHttpPipeline());
        this.client = client;
    }

    /**
     * The interface defining all the services for AzureBlobStorageBlockBlobs
     * to be used by the proxy service to perform REST calls.
     */
    @Host("{url}")
    @ServiceInterface(name = "AzureBlobStorageBlockBlobs")
    private interface BlockBlobsService {
        @Put("/{containerName}/{blob}")
        @ExpectedResponses({201})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<BlockBlobsUploadResponse> upload(@HostParam("url") String url, @HeaderParam("x-ms-blob-type") String blobType, @QueryParam("timeout") Integer timeout, @HeaderParam("Content-MD5") String transactionalContentMD5, @HeaderParam("Content-Length") long contentLength, @HeaderParam("x-ms-blob-content-type") String blobContentType, @HeaderParam("x-ms-blob-content-encoding") String blobContentEncoding, @HeaderParam("x-ms-blob-content-language") String blobContentLanguage, @HeaderParam("x-ms-blob-content-md5") String blobContentMD5, @HeaderParam("x-ms-blob-cache-control") String blobCacheControl, @HeaderParam("x-ms-meta") String metadata, @HeaderParam("x-ms-lease-id") String leaseId, @HeaderParam("x-ms-blob-content-disposition") String blobContentDisposition, @HeaderParam("x-ms-encryption-key") String encryptionKey, @HeaderParam("x-ms-encryption-key-sha256") String encryptionKeySha256, @HeaderParam("x-ms-encryption-algorithm") String encryptionAlgorithm, @HeaderParam("x-ms-encryption-scope") String encryptionScope, @HeaderParam("x-ms-access-tier") AccessTier tier, @HeaderParam("If-Modified-Since") DateTimeRfc1123 ifModifiedSince, @HeaderParam("If-Unmodified-Since") DateTimeRfc1123 ifUnmodifiedSince, @HeaderParam("If-Match") String ifMatch, @HeaderParam("If-None-Match") String ifNoneMatch, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId, @BodyParam("application/octet-stream") ByteBuffer body);

        @Put("/{containerName}/{blob}")
        @ExpectedResponses({201})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<BlockBlobsStageBlockResponse> stageBlock(@HostParam("url") String url, @QueryParam("comp") String comp, @QueryParam("blockid") String blockId, @HeaderParam("Content-Length") long contentLength, @HeaderParam("Content-MD5") String transactionalContentMD5, @HeaderParam("x-ms-content-crc64") String transactionalContentCrc64, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-lease-id") String leaseId, @HeaderParam("x-ms-encryption-key") String encryptionKey, @HeaderParam("x-ms-encryption-key-sha256") String encryptionKeySha256, @HeaderParam("x-ms-encryption-algorithm") String encryptionAlgorithm, @HeaderParam("x-ms-encryption-scope") String encryptionScope, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId, @BodyParam("application/octet-stream") ByteBuffer body);

        @Put("/{containerName}/{blob}")
        @ExpectedResponses({201})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<BlockBlobsStageBlockFromURLResponse> stageBlockFromURL(@HostParam("url") String url, @QueryParam("comp") String comp, @QueryParam("blockid") String blockId, @HeaderParam("Content-Length") long contentLength, @HeaderParam("x-ms-copy-source") URL sourceUrl, @HeaderParam("x-ms-source-range") String sourceRange, @HeaderParam("x-ms-source-content-md5") String sourceContentMD5, @HeaderParam("x-ms-source-content-crc64") String sourceContentcrc64, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-encryption-key") String encryptionKey, @HeaderParam("x-ms-encryption-key-sha256") String encryptionKeySha256, @HeaderParam("x-ms-encryption-algorithm") String encryptionAlgorithm, @HeaderParam("x-ms-encryption-scope") String encryptionScope, @HeaderParam("x-ms-lease-id") String leaseId, @HeaderParam("x-ms-source-if-modified-since") DateTimeRfc1123 sourceIfModifiedSince, @HeaderParam("x-ms-source-if-unmodified-since") DateTimeRfc1123 sourceIfUnmodifiedSince, @HeaderParam("x-ms-source-if-match") String sourceIfMatch, @HeaderParam("x-ms-source-if-none-match") String sourceIfNoneMatch, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId);

        @Put("/{containerName}/{blob}")
        @ExpectedResponses({201})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<BlockBlobsCommitBlockListResponse> commitBlockList(@HostParam("url") String url, @QueryParam("comp") String comp, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-blob-cache-control") String blobCacheControl, @HeaderParam("x-ms-blob-content-type") String blobContentType, @HeaderParam("x-ms-blob-content-encoding") String blobContentEncoding, @HeaderParam("x-ms-blob-content-language") String blobContentLanguage, @HeaderParam("x-ms-blob-content-md5") String blobContentMD5, @HeaderParam("Content-MD5") String transactionalContentMD5, @HeaderParam("x-ms-content-crc64") String transactionalContentCrc64, @HeaderParam("x-ms-meta") String metadata, @HeaderParam("x-ms-lease-id") String leaseId, @HeaderParam("x-ms-blob-content-disposition") String blobContentDisposition, @HeaderParam("x-ms-encryption-key") String encryptionKey, @HeaderParam("x-ms-encryption-key-sha256") String encryptionKeySha256, @HeaderParam("x-ms-encryption-algorithm") String encryptionAlgorithm, @HeaderParam("x-ms-encryption-scope") String encryptionScope, @HeaderParam("x-ms-access-tier") AccessTier tier, @HeaderParam("If-Modified-Since") DateTimeRfc1123 ifModifiedSince, @HeaderParam("If-Unmodified-Since") DateTimeRfc1123 ifUnmodifiedSince, @HeaderParam("If-Match") String ifMatch, @HeaderParam("If-None-Match") String ifNoneMatch, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId, @BodyParam("application/xml") BlockLookupList blocks);

        @Get("/{containerName}/{blob}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<BlockBlobsGetBlockListResponse> getBlockList(@HostParam("url") String url, @QueryParam("comp") String comp, @QueryParam("snapshot") String snapshot, @QueryParam("blocklisttype") BlockListType listType, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-lease-id") String leaseId, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId);
    }

    /**
     * The Upload Block Blob operation updates the content of an existing block blob. Updating an existing block blob overwrites any existing metadata on the blob. Partial updates are not supported with Put Blob; the content of the existing blob is overwritten with the content of the new blob. To perform a partial update of the content of a block blob, use the Put Block List operation.
     * 
     * @param contentLength 
     * @param timeout 
     * @param transactionalContentMD5 
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
     * @param tier 
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
    public Mono<BlockBlobsUploadResponse> uploadWithResponseAsync(long contentLength, Integer timeout, byte[] transactionalContentMD5, String blobContentType, String blobContentEncoding, String blobContentLanguage, byte[] blobContentMD5, String blobCacheControl, String metadata, String leaseId, String blobContentDisposition, String encryptionKey, String encryptionKeySha256, String encryptionScope, AccessTier tier, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String ifMatch, String ifNoneMatch, String requestId, ByteBuffer body) {
        if (this.client.getUrl() == null) {
            throw new IllegalArgumentException("Parameter this.client.getUrl() is required and cannot be null.");
        }
        final String blobType = "BlockBlob";
        final String encryptionAlgorithm = "AES256";
        String transactionalContentMD5Converted = Base64Util.encodeToString(transactionalContentMD5);
        String blobContentMD5Converted = Base64Util.encodeToString(blobContentMD5);
        DateTimeRfc1123 ifModifiedSinceConverted = ifModifiedSince == null ? null : new DateTimeRfc1123(ifModifiedSince);
        DateTimeRfc1123 ifUnmodifiedSinceConverted = ifUnmodifiedSince == null ? null : new DateTimeRfc1123(ifUnmodifiedSince);
        return service.upload(this.client.getUrl(), blobType, timeout, transactionalContentMD5Converted, contentLength, blobContentType, blobContentEncoding, blobContentLanguage, blobContentMD5Converted, blobCacheControl, metadata, leaseId, blobContentDisposition, encryptionKey, encryptionKeySha256, encryptionAlgorithm, encryptionScope, tier, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, ifMatch, ifNoneMatch, this.client.getVersion(), requestId, body);
    }

    /**
     * The Upload Block Blob operation updates the content of an existing block blob. Updating an existing block blob overwrites any existing metadata on the blob. Partial updates are not supported with Put Blob; the content of the existing blob is overwritten with the content of the new blob. To perform a partial update of the content of a block blob, use the Put Block List operation.
     * 
     * @param contentLength 
     * @param timeout 
     * @param transactionalContentMD5 
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
     * @param tier 
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
    public Mono<Void> uploadAsync(long contentLength, Integer timeout, byte[] transactionalContentMD5, String blobContentType, String blobContentEncoding, String blobContentLanguage, byte[] blobContentMD5, String blobCacheControl, String metadata, String leaseId, String blobContentDisposition, String encryptionKey, String encryptionKeySha256, String encryptionScope, AccessTier tier, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String ifMatch, String ifNoneMatch, String requestId, ByteBuffer body) {
        return uploadWithResponseAsync(contentLength, timeout, transactionalContentMD5, blobContentType, blobContentEncoding, blobContentLanguage, blobContentMD5, blobCacheControl, metadata, leaseId, blobContentDisposition, encryptionKey, encryptionKeySha256, encryptionScope, tier, ifModifiedSince, ifUnmodifiedSince, ifMatch, ifNoneMatch, requestId, body)
            .flatMap((BlockBlobsUploadResponse res) -> Mono.empty());
    }

    /**
     * The Upload Block Blob operation updates the content of an existing block blob. Updating an existing block blob overwrites any existing metadata on the blob. Partial updates are not supported with Put Blob; the content of the existing blob is overwritten with the content of the new blob. To perform a partial update of the content of a block blob, use the Put Block List operation.
     * 
     * @param contentLength 
     * @param timeout 
     * @param transactionalContentMD5 
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
     * @param tier 
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
    public void upload(long contentLength, Integer timeout, byte[] transactionalContentMD5, String blobContentType, String blobContentEncoding, String blobContentLanguage, byte[] blobContentMD5, String blobCacheControl, String metadata, String leaseId, String blobContentDisposition, String encryptionKey, String encryptionKeySha256, String encryptionScope, AccessTier tier, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String ifMatch, String ifNoneMatch, String requestId, ByteBuffer body) {
        uploadAsync(contentLength, timeout, transactionalContentMD5, blobContentType, blobContentEncoding, blobContentLanguage, blobContentMD5, blobCacheControl, metadata, leaseId, blobContentDisposition, encryptionKey, encryptionKeySha256, encryptionScope, tier, ifModifiedSince, ifUnmodifiedSince, ifMatch, ifNoneMatch, requestId, body).block();
    }

    /**
     * The Stage Block operation creates a new block to be committed as part of a blob.
     * 
     * @param blockId 
     * @param contentLength 
     * @param transactionalContentMD5 
     * @param transactionalContentCrc64 
     * @param timeout 
     * @param leaseId 
     * @param encryptionKey 
     * @param encryptionKeySha256 
     * @param encryptionScope 
     * @param requestId 
     * @param body 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<BlockBlobsStageBlockResponse> stageBlockWithResponseAsync(String blockId, long contentLength, byte[] transactionalContentMD5, byte[] transactionalContentCrc64, Integer timeout, String leaseId, String encryptionKey, String encryptionKeySha256, String encryptionScope, String requestId, ByteBuffer body) {
        if (this.client.getUrl() == null) {
            throw new IllegalArgumentException("Parameter this.client.getUrl() is required and cannot be null.");
        }
        if (blockId == null) {
            throw new IllegalArgumentException("Parameter blockId is required and cannot be null.");
        }
        final String comp = "block";
        final String encryptionAlgorithm = "AES256";
        String transactionalContentMD5Converted = Base64Util.encodeToString(transactionalContentMD5);
        String transactionalContentCrc64Converted = Base64Util.encodeToString(transactionalContentCrc64);
        return service.stageBlock(this.client.getUrl(), comp, blockId, contentLength, transactionalContentMD5Converted, transactionalContentCrc64Converted, timeout, leaseId, encryptionKey, encryptionKeySha256, encryptionAlgorithm, encryptionScope, this.client.getVersion(), requestId, body);
    }

    /**
     * The Stage Block operation creates a new block to be committed as part of a blob.
     * 
     * @param blockId 
     * @param contentLength 
     * @param transactionalContentMD5 
     * @param transactionalContentCrc64 
     * @param timeout 
     * @param leaseId 
     * @param encryptionKey 
     * @param encryptionKeySha256 
     * @param encryptionScope 
     * @param requestId 
     * @param body 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> stageBlockAsync(String blockId, long contentLength, byte[] transactionalContentMD5, byte[] transactionalContentCrc64, Integer timeout, String leaseId, String encryptionKey, String encryptionKeySha256, String encryptionScope, String requestId, ByteBuffer body) {
        return stageBlockWithResponseAsync(blockId, contentLength, transactionalContentMD5, transactionalContentCrc64, timeout, leaseId, encryptionKey, encryptionKeySha256, encryptionScope, requestId, body)
            .flatMap((BlockBlobsStageBlockResponse res) -> Mono.empty());
    }

    /**
     * The Stage Block operation creates a new block to be committed as part of a blob.
     * 
     * @param blockId 
     * @param contentLength 
     * @param transactionalContentMD5 
     * @param transactionalContentCrc64 
     * @param timeout 
     * @param leaseId 
     * @param encryptionKey 
     * @param encryptionKeySha256 
     * @param encryptionScope 
     * @param requestId 
     * @param body 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void stageBlock(String blockId, long contentLength, byte[] transactionalContentMD5, byte[] transactionalContentCrc64, Integer timeout, String leaseId, String encryptionKey, String encryptionKeySha256, String encryptionScope, String requestId, ByteBuffer body) {
        stageBlockAsync(blockId, contentLength, transactionalContentMD5, transactionalContentCrc64, timeout, leaseId, encryptionKey, encryptionKeySha256, encryptionScope, requestId, body).block();
    }

    /**
     * The Stage Block operation creates a new block to be committed as part of a blob where the contents are read from a URL.
     * 
     * @param blockId 
     * @param contentLength 
     * @param sourceUrl 
     * @param sourceRange 
     * @param sourceContentMD5 
     * @param sourceContentcrc64 
     * @param timeout 
     * @param encryptionKey 
     * @param encryptionKeySha256 
     * @param encryptionScope 
     * @param leaseId 
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
    public Mono<BlockBlobsStageBlockFromURLResponse> stageBlockFromURLWithResponseAsync(String blockId, long contentLength, URL sourceUrl, String sourceRange, byte[] sourceContentMD5, byte[] sourceContentcrc64, Integer timeout, String encryptionKey, String encryptionKeySha256, String encryptionScope, String leaseId, OffsetDateTime sourceIfModifiedSince, OffsetDateTime sourceIfUnmodifiedSince, String sourceIfMatch, String sourceIfNoneMatch, String requestId) {
        if (this.client.getUrl() == null) {
            throw new IllegalArgumentException("Parameter this.client.getUrl() is required and cannot be null.");
        }
        if (blockId == null) {
            throw new IllegalArgumentException("Parameter blockId is required and cannot be null.");
        }
        if (sourceUrl == null) {
            throw new IllegalArgumentException("Parameter sourceUrl is required and cannot be null.");
        }
        final String comp = "block";
        final String encryptionAlgorithm = "AES256";
        String sourceContentMD5Converted = Base64Util.encodeToString(sourceContentMD5);
        String sourceContentcrc64Converted = Base64Util.encodeToString(sourceContentcrc64);
        DateTimeRfc1123 sourceIfModifiedSinceConverted = sourceIfModifiedSince == null ? null : new DateTimeRfc1123(sourceIfModifiedSince);
        DateTimeRfc1123 sourceIfUnmodifiedSinceConverted = sourceIfUnmodifiedSince == null ? null : new DateTimeRfc1123(sourceIfUnmodifiedSince);
        return service.stageBlockFromURL(this.client.getUrl(), comp, blockId, contentLength, sourceUrl, sourceRange, sourceContentMD5Converted, sourceContentcrc64Converted, timeout, encryptionKey, encryptionKeySha256, encryptionAlgorithm, encryptionScope, leaseId, sourceIfModifiedSinceConverted, sourceIfUnmodifiedSinceConverted, sourceIfMatch, sourceIfNoneMatch, this.client.getVersion(), requestId);
    }

    /**
     * The Stage Block operation creates a new block to be committed as part of a blob where the contents are read from a URL.
     * 
     * @param blockId 
     * @param contentLength 
     * @param sourceUrl 
     * @param sourceRange 
     * @param sourceContentMD5 
     * @param sourceContentcrc64 
     * @param timeout 
     * @param encryptionKey 
     * @param encryptionKeySha256 
     * @param encryptionScope 
     * @param leaseId 
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
    public Mono<Void> stageBlockFromURLAsync(String blockId, long contentLength, URL sourceUrl, String sourceRange, byte[] sourceContentMD5, byte[] sourceContentcrc64, Integer timeout, String encryptionKey, String encryptionKeySha256, String encryptionScope, String leaseId, OffsetDateTime sourceIfModifiedSince, OffsetDateTime sourceIfUnmodifiedSince, String sourceIfMatch, String sourceIfNoneMatch, String requestId) {
        return stageBlockFromURLWithResponseAsync(blockId, contentLength, sourceUrl, sourceRange, sourceContentMD5, sourceContentcrc64, timeout, encryptionKey, encryptionKeySha256, encryptionScope, leaseId, sourceIfModifiedSince, sourceIfUnmodifiedSince, sourceIfMatch, sourceIfNoneMatch, requestId)
            .flatMap((BlockBlobsStageBlockFromURLResponse res) -> Mono.empty());
    }

    /**
     * The Stage Block operation creates a new block to be committed as part of a blob where the contents are read from a URL.
     * 
     * @param blockId 
     * @param contentLength 
     * @param sourceUrl 
     * @param sourceRange 
     * @param sourceContentMD5 
     * @param sourceContentcrc64 
     * @param timeout 
     * @param encryptionKey 
     * @param encryptionKeySha256 
     * @param encryptionScope 
     * @param leaseId 
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
    public void stageBlockFromURL(String blockId, long contentLength, URL sourceUrl, String sourceRange, byte[] sourceContentMD5, byte[] sourceContentcrc64, Integer timeout, String encryptionKey, String encryptionKeySha256, String encryptionScope, String leaseId, OffsetDateTime sourceIfModifiedSince, OffsetDateTime sourceIfUnmodifiedSince, String sourceIfMatch, String sourceIfNoneMatch, String requestId) {
        stageBlockFromURLAsync(blockId, contentLength, sourceUrl, sourceRange, sourceContentMD5, sourceContentcrc64, timeout, encryptionKey, encryptionKeySha256, encryptionScope, leaseId, sourceIfModifiedSince, sourceIfUnmodifiedSince, sourceIfMatch, sourceIfNoneMatch, requestId).block();
    }

    /**
     * The Commit Block List operation writes a blob by specifying the list of block IDs that make up the blob. In order to be written as part of a blob, a block must have been successfully written to the server in a prior Put Block operation. You can call Put Block List to update a blob by uploading only those blocks that have changed, then committing the new and existing blocks together. You can do this by specifying whether to commit a block from the committed block list or from the uncommitted block list, or to commit the most recently uploaded version of the block, whichever list it may belong to.
     * 
     * @param blocks 
     * @param timeout 
     * @param blobCacheControl 
     * @param blobContentType 
     * @param blobContentEncoding 
     * @param blobContentLanguage 
     * @param blobContentMD5 
     * @param transactionalContentMD5 
     * @param transactionalContentCrc64 
     * @param metadata 
     * @param leaseId 
     * @param blobContentDisposition 
     * @param encryptionKey 
     * @param encryptionKeySha256 
     * @param encryptionScope 
     * @param tier 
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
    public Mono<BlockBlobsCommitBlockListResponse> commitBlockListWithResponseAsync(BlockLookupList blocks, Integer timeout, String blobCacheControl, String blobContentType, String blobContentEncoding, String blobContentLanguage, byte[] blobContentMD5, byte[] transactionalContentMD5, byte[] transactionalContentCrc64, String metadata, String leaseId, String blobContentDisposition, String encryptionKey, String encryptionKeySha256, String encryptionScope, AccessTier tier, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String ifMatch, String ifNoneMatch, String requestId) {
        if (this.client.getUrl() == null) {
            throw new IllegalArgumentException("Parameter this.client.getUrl() is required and cannot be null.");
        }
        if (blocks == null) {
            throw new IllegalArgumentException("Parameter blocks is required and cannot be null.");
        } else {
            blocks.validate();
        }
        final String comp = "blocklist";
        final String encryptionAlgorithm = "AES256";
        String blobContentMD5Converted = Base64Util.encodeToString(blobContentMD5);
        String transactionalContentMD5Converted = Base64Util.encodeToString(transactionalContentMD5);
        String transactionalContentCrc64Converted = Base64Util.encodeToString(transactionalContentCrc64);
        DateTimeRfc1123 ifModifiedSinceConverted = ifModifiedSince == null ? null : new DateTimeRfc1123(ifModifiedSince);
        DateTimeRfc1123 ifUnmodifiedSinceConverted = ifUnmodifiedSince == null ? null : new DateTimeRfc1123(ifUnmodifiedSince);
        return service.commitBlockList(this.client.getUrl(), comp, timeout, blobCacheControl, blobContentType, blobContentEncoding, blobContentLanguage, blobContentMD5Converted, transactionalContentMD5Converted, transactionalContentCrc64Converted, metadata, leaseId, blobContentDisposition, encryptionKey, encryptionKeySha256, encryptionAlgorithm, encryptionScope, tier, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, ifMatch, ifNoneMatch, this.client.getVersion(), requestId, blocks);
    }

    /**
     * The Commit Block List operation writes a blob by specifying the list of block IDs that make up the blob. In order to be written as part of a blob, a block must have been successfully written to the server in a prior Put Block operation. You can call Put Block List to update a blob by uploading only those blocks that have changed, then committing the new and existing blocks together. You can do this by specifying whether to commit a block from the committed block list or from the uncommitted block list, or to commit the most recently uploaded version of the block, whichever list it may belong to.
     * 
     * @param blocks 
     * @param timeout 
     * @param blobCacheControl 
     * @param blobContentType 
     * @param blobContentEncoding 
     * @param blobContentLanguage 
     * @param blobContentMD5 
     * @param transactionalContentMD5 
     * @param transactionalContentCrc64 
     * @param metadata 
     * @param leaseId 
     * @param blobContentDisposition 
     * @param encryptionKey 
     * @param encryptionKeySha256 
     * @param encryptionScope 
     * @param tier 
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
    public Mono<Void> commitBlockListAsync(BlockLookupList blocks, Integer timeout, String blobCacheControl, String blobContentType, String blobContentEncoding, String blobContentLanguage, byte[] blobContentMD5, byte[] transactionalContentMD5, byte[] transactionalContentCrc64, String metadata, String leaseId, String blobContentDisposition, String encryptionKey, String encryptionKeySha256, String encryptionScope, AccessTier tier, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String ifMatch, String ifNoneMatch, String requestId) {
        return commitBlockListWithResponseAsync(blocks, timeout, blobCacheControl, blobContentType, blobContentEncoding, blobContentLanguage, blobContentMD5, transactionalContentMD5, transactionalContentCrc64, metadata, leaseId, blobContentDisposition, encryptionKey, encryptionKeySha256, encryptionScope, tier, ifModifiedSince, ifUnmodifiedSince, ifMatch, ifNoneMatch, requestId)
            .flatMap((BlockBlobsCommitBlockListResponse res) -> Mono.empty());
    }

    /**
     * The Commit Block List operation writes a blob by specifying the list of block IDs that make up the blob. In order to be written as part of a blob, a block must have been successfully written to the server in a prior Put Block operation. You can call Put Block List to update a blob by uploading only those blocks that have changed, then committing the new and existing blocks together. You can do this by specifying whether to commit a block from the committed block list or from the uncommitted block list, or to commit the most recently uploaded version of the block, whichever list it may belong to.
     * 
     * @param blocks 
     * @param timeout 
     * @param blobCacheControl 
     * @param blobContentType 
     * @param blobContentEncoding 
     * @param blobContentLanguage 
     * @param blobContentMD5 
     * @param transactionalContentMD5 
     * @param transactionalContentCrc64 
     * @param metadata 
     * @param leaseId 
     * @param blobContentDisposition 
     * @param encryptionKey 
     * @param encryptionKeySha256 
     * @param encryptionScope 
     * @param tier 
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
    public void commitBlockList(BlockLookupList blocks, Integer timeout, String blobCacheControl, String blobContentType, String blobContentEncoding, String blobContentLanguage, byte[] blobContentMD5, byte[] transactionalContentMD5, byte[] transactionalContentCrc64, String metadata, String leaseId, String blobContentDisposition, String encryptionKey, String encryptionKeySha256, String encryptionScope, AccessTier tier, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String ifMatch, String ifNoneMatch, String requestId) {
        commitBlockListAsync(blocks, timeout, blobCacheControl, blobContentType, blobContentEncoding, blobContentLanguage, blobContentMD5, transactionalContentMD5, transactionalContentCrc64, metadata, leaseId, blobContentDisposition, encryptionKey, encryptionKeySha256, encryptionScope, tier, ifModifiedSince, ifUnmodifiedSince, ifMatch, ifNoneMatch, requestId).block();
    }

    /**
     * The Get Block List operation retrieves the list of blocks that have been uploaded as part of a block blob.
     * 
     * @param listType 
     * @param snapshot 
     * @param timeout 
     * @param leaseId 
     * @param requestId 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<BlockBlobsGetBlockListResponse> getBlockListWithResponseAsync(BlockListType listType, String snapshot, Integer timeout, String leaseId, String requestId) {
        if (this.client.getUrl() == null) {
            throw new IllegalArgumentException("Parameter this.client.getUrl() is required and cannot be null.");
        }
        if (listType == null) {
            throw new IllegalArgumentException("Parameter listType is required and cannot be null.");
        }
        final String comp = "blocklist";
        return service.getBlockList(this.client.getUrl(), comp, snapshot, listType, timeout, leaseId, this.client.getVersion(), requestId);
    }

    /**
     * The Get Block List operation retrieves the list of blocks that have been uploaded as part of a block blob.
     * 
     * @param listType 
     * @param snapshot 
     * @param timeout 
     * @param leaseId 
     * @param requestId 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<BlockList> getBlockListAsync(BlockListType listType, String snapshot, Integer timeout, String leaseId, String requestId) {
        return getBlockListWithResponseAsync(listType, snapshot, timeout, leaseId, requestId)
            .flatMap((BlockBlobsGetBlockListResponse res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * The Get Block List operation retrieves the list of blocks that have been uploaded as part of a block blob.
     * 
     * @param listType 
     * @param snapshot 
     * @param timeout 
     * @param leaseId 
     * @param requestId 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public BlockList getBlockList(BlockListType listType, String snapshot, Integer timeout, String leaseId, String requestId) {
        return getBlockListAsync(listType, snapshot, timeout, leaseId, requestId).block();
    }
}
