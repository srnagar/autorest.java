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
import com.azure.storage.blob.models.PageBlobsClearPagesResponse;
import com.azure.storage.blob.models.PageBlobsCopyIncrementalResponse;
import com.azure.storage.blob.models.PageBlobsCreateResponse;
import com.azure.storage.blob.models.PageBlobsGetPageRangesDiffResponse;
import com.azure.storage.blob.models.PageBlobsGetPageRangesResponse;
import com.azure.storage.blob.models.PageBlobsResizeResponse;
import com.azure.storage.blob.models.PageBlobsUpdateSequenceNumberResponse;
import com.azure.storage.blob.models.PageBlobsUploadPagesFromURLResponse;
import com.azure.storage.blob.models.PageBlobsUploadPagesResponse;
import com.azure.storage.blob.models.PageList;
import com.azure.storage.blob.models.PremiumPageBlobAccessTier;
import com.azure.storage.blob.models.SequenceNumberActionType;
import com.azure.storage.blob.models.StorageErrorException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.time.OffsetDateTime;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * PageBlobs.
 */
public final class PageBlobs {
    /**
     * The proxy service used to perform REST calls.
     */
    private PageBlobsService service;

    /**
     * The service client containing this operation class.
     */
    private AzureBlobStorage client;

    /**
     * Initializes an instance of PageBlobs.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    public PageBlobs(AzureBlobStorage client) {
        this.service = RestProxy.create(PageBlobsService.class, client.getHttpPipeline());
        this.client = client;
    }

    /**
     * The interface defining all the services for AzureBlobStoragePageBlobs to
     * be used by the proxy service to perform REST calls.
     */
    @Host("{url}")
    @ServiceInterface(name = "AzureBlobStoragePageBlobs")
    private interface PageBlobsService {
        @Put("/{containerName}/{blob}")
        @ExpectedResponses({201})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<PageBlobsCreateResponse> create(@HostParam("url") String url, @HeaderParam("x-ms-blob-type") String blobType, @QueryParam("timeout") Integer timeout, @HeaderParam("Content-Length") long contentLength, @HeaderParam("x-ms-access-tier") PremiumPageBlobAccessTier tier, @HeaderParam("x-ms-blob-content-type") String blobContentType, @HeaderParam("x-ms-blob-content-encoding") String blobContentEncoding, @HeaderParam("x-ms-blob-content-language") String blobContentLanguage, @HeaderParam("x-ms-blob-content-md5") String blobContentMD5, @HeaderParam("x-ms-blob-cache-control") String blobCacheControl, @HeaderParam("x-ms-meta") String metadata, @HeaderParam("x-ms-lease-id") String leaseId, @HeaderParam("x-ms-blob-content-disposition") String blobContentDisposition, @HeaderParam("x-ms-encryption-key") String encryptionKey, @HeaderParam("x-ms-encryption-key-sha256") String encryptionKeySha256, @HeaderParam("x-ms-encryption-algorithm") String encryptionAlgorithm, @HeaderParam("x-ms-encryption-scope") String encryptionScope, @HeaderParam("If-Modified-Since") DateTimeRfc1123 ifModifiedSince, @HeaderParam("If-Unmodified-Since") DateTimeRfc1123 ifUnmodifiedSince, @HeaderParam("If-Match") String ifMatch, @HeaderParam("If-None-Match") String ifNoneMatch, @HeaderParam("x-ms-blob-content-length") long blobContentLength, @HeaderParam("x-ms-blob-sequence-number") Long blobSequenceNumber, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId);

        @Put("/{containerName}/{blob}")
        @ExpectedResponses({201})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<PageBlobsUploadPagesResponse> uploadPages(@HostParam("url") String url, @QueryParam("comp") String comp, @HeaderParam("x-ms-page-write") String pageWrite, @HeaderParam("Content-Length") long contentLength, @HeaderParam("Content-MD5") String transactionalContentMD5, @HeaderParam("x-ms-content-crc64") String transactionalContentCrc64, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-range") String range, @HeaderParam("x-ms-lease-id") String leaseId, @HeaderParam("x-ms-encryption-key") String encryptionKey, @HeaderParam("x-ms-encryption-key-sha256") String encryptionKeySha256, @HeaderParam("x-ms-encryption-algorithm") String encryptionAlgorithm, @HeaderParam("x-ms-encryption-scope") String encryptionScope, @HeaderParam("x-ms-if-sequence-number-le") Long ifSequenceNumberLessThanOrEqualTo, @HeaderParam("x-ms-if-sequence-number-lt") Long ifSequenceNumberLessThan, @HeaderParam("x-ms-if-sequence-number-eq") Long ifSequenceNumberEqualTo, @HeaderParam("If-Modified-Since") DateTimeRfc1123 ifModifiedSince, @HeaderParam("If-Unmodified-Since") DateTimeRfc1123 ifUnmodifiedSince, @HeaderParam("If-Match") String ifMatch, @HeaderParam("If-None-Match") String ifNoneMatch, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId, @BodyParam("application/octet-stream") ByteBuffer body);

        @Put("/{containerName}/{blob}")
        @ExpectedResponses({201})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<PageBlobsClearPagesResponse> clearPages(@HostParam("url") String url, @QueryParam("comp") String comp, @HeaderParam("x-ms-page-write") String pageWrite, @HeaderParam("Content-Length") long contentLength, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-range") String range, @HeaderParam("x-ms-lease-id") String leaseId, @HeaderParam("x-ms-encryption-key") String encryptionKey, @HeaderParam("x-ms-encryption-key-sha256") String encryptionKeySha256, @HeaderParam("x-ms-encryption-algorithm") String encryptionAlgorithm, @HeaderParam("x-ms-encryption-scope") String encryptionScope, @HeaderParam("x-ms-if-sequence-number-le") Long ifSequenceNumberLessThanOrEqualTo, @HeaderParam("x-ms-if-sequence-number-lt") Long ifSequenceNumberLessThan, @HeaderParam("x-ms-if-sequence-number-eq") Long ifSequenceNumberEqualTo, @HeaderParam("If-Modified-Since") DateTimeRfc1123 ifModifiedSince, @HeaderParam("If-Unmodified-Since") DateTimeRfc1123 ifUnmodifiedSince, @HeaderParam("If-Match") String ifMatch, @HeaderParam("If-None-Match") String ifNoneMatch, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId);

        @Put("/{containerName}/{blob}")
        @ExpectedResponses({201})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<PageBlobsUploadPagesFromURLResponse> uploadPagesFromURL(@HostParam("url") String url, @QueryParam("comp") String comp, @HeaderParam("x-ms-page-write") String pageWrite, @HeaderParam("x-ms-copy-source") URL sourceUrl, @HeaderParam("x-ms-source-range") String sourceRange, @HeaderParam("x-ms-source-content-md5") String sourceContentMD5, @HeaderParam("x-ms-source-content-crc64") String sourceContentcrc64, @HeaderParam("Content-Length") long contentLength, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-range") String range, @HeaderParam("x-ms-encryption-key") String encryptionKey, @HeaderParam("x-ms-encryption-key-sha256") String encryptionKeySha256, @HeaderParam("x-ms-encryption-algorithm") String encryptionAlgorithm, @HeaderParam("x-ms-encryption-scope") String encryptionScope, @HeaderParam("x-ms-lease-id") String leaseId, @HeaderParam("x-ms-if-sequence-number-le") Long ifSequenceNumberLessThanOrEqualTo, @HeaderParam("x-ms-if-sequence-number-lt") Long ifSequenceNumberLessThan, @HeaderParam("x-ms-if-sequence-number-eq") Long ifSequenceNumberEqualTo, @HeaderParam("If-Modified-Since") DateTimeRfc1123 ifModifiedSince, @HeaderParam("If-Unmodified-Since") DateTimeRfc1123 ifUnmodifiedSince, @HeaderParam("If-Match") String ifMatch, @HeaderParam("If-None-Match") String ifNoneMatch, @HeaderParam("x-ms-source-if-modified-since") DateTimeRfc1123 sourceIfModifiedSince, @HeaderParam("x-ms-source-if-unmodified-since") DateTimeRfc1123 sourceIfUnmodifiedSince, @HeaderParam("x-ms-source-if-match") String sourceIfMatch, @HeaderParam("x-ms-source-if-none-match") String sourceIfNoneMatch, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId);

        @Get("/{containerName}/{blob}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<PageBlobsGetPageRangesResponse> getPageRanges(@HostParam("url") String url, @QueryParam("comp") String comp, @QueryParam("snapshot") String snapshot, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-range") String range, @HeaderParam("x-ms-lease-id") String leaseId, @HeaderParam("If-Modified-Since") DateTimeRfc1123 ifModifiedSince, @HeaderParam("If-Unmodified-Since") DateTimeRfc1123 ifUnmodifiedSince, @HeaderParam("If-Match") String ifMatch, @HeaderParam("If-None-Match") String ifNoneMatch, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId);

        @Get("/{containerName}/{blob}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<PageBlobsGetPageRangesDiffResponse> getPageRangesDiff(@HostParam("url") String url, @QueryParam("comp") String comp, @QueryParam("snapshot") String snapshot, @QueryParam("timeout") Integer timeout, @QueryParam("prevsnapshot") String prevsnapshot, @HeaderParam("x-ms-previous-snapshot-url") URL prevSnapshotUrl, @HeaderParam("x-ms-range") String range, @HeaderParam("x-ms-lease-id") String leaseId, @HeaderParam("If-Modified-Since") DateTimeRfc1123 ifModifiedSince, @HeaderParam("If-Unmodified-Since") DateTimeRfc1123 ifUnmodifiedSince, @HeaderParam("If-Match") String ifMatch, @HeaderParam("If-None-Match") String ifNoneMatch, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId);

        @Put("/{containerName}/{blob}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<PageBlobsResizeResponse> resize(@HostParam("url") String url, @QueryParam("comp") String comp, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-lease-id") String leaseId, @HeaderParam("x-ms-encryption-key") String encryptionKey, @HeaderParam("x-ms-encryption-key-sha256") String encryptionKeySha256, @HeaderParam("x-ms-encryption-algorithm") String encryptionAlgorithm, @HeaderParam("x-ms-encryption-scope") String encryptionScope, @HeaderParam("If-Modified-Since") DateTimeRfc1123 ifModifiedSince, @HeaderParam("If-Unmodified-Since") DateTimeRfc1123 ifUnmodifiedSince, @HeaderParam("If-Match") String ifMatch, @HeaderParam("If-None-Match") String ifNoneMatch, @HeaderParam("x-ms-blob-content-length") long blobContentLength, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId);

        @Put("/{containerName}/{blob}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<PageBlobsUpdateSequenceNumberResponse> updateSequenceNumber(@HostParam("url") String url, @QueryParam("comp") String comp, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-lease-id") String leaseId, @HeaderParam("If-Modified-Since") DateTimeRfc1123 ifModifiedSince, @HeaderParam("If-Unmodified-Since") DateTimeRfc1123 ifUnmodifiedSince, @HeaderParam("If-Match") String ifMatch, @HeaderParam("If-None-Match") String ifNoneMatch, @HeaderParam("x-ms-sequence-number-action") SequenceNumberActionType sequenceNumberAction, @HeaderParam("x-ms-blob-sequence-number") Long blobSequenceNumber, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId);

        @Put("/{containerName}/{blob}")
        @ExpectedResponses({202})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<PageBlobsCopyIncrementalResponse> copyIncremental(@HostParam("url") String url, @QueryParam("comp") String comp, @QueryParam("timeout") Integer timeout, @HeaderParam("If-Modified-Since") DateTimeRfc1123 ifModifiedSince, @HeaderParam("If-Unmodified-Since") DateTimeRfc1123 ifUnmodifiedSince, @HeaderParam("If-Match") String ifMatch, @HeaderParam("If-None-Match") String ifNoneMatch, @HeaderParam("x-ms-copy-source") URL copySource, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId);
    }

    /**
     * The Create operation creates a new page blob.
     * 
     * @param contentLength 
     * @param blobContentLength 
     * @param timeout 
     * @param tier 
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
     * @param blobSequenceNumber 
     * @param requestId 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PageBlobsCreateResponse> createWithResponseAsync(long contentLength, long blobContentLength, Integer timeout, PremiumPageBlobAccessTier tier, String blobContentType, String blobContentEncoding, String blobContentLanguage, byte[] blobContentMD5, String blobCacheControl, String metadata, String leaseId, String blobContentDisposition, String encryptionKey, String encryptionKeySha256, String encryptionScope, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String ifMatch, String ifNoneMatch, Long blobSequenceNumber, String requestId) {
        if (this.client.getUrl() == null) {
            throw new IllegalArgumentException("Parameter this.client.getUrl() is required and cannot be null.");
        }
        final String blobType = "PageBlob";
        final String encryptionAlgorithm = "AES256";
        String blobContentMD5Converted = Base64Util.encodeToString(blobContentMD5);
        DateTimeRfc1123 ifModifiedSinceConverted = ifModifiedSince == null ? null : new DateTimeRfc1123(ifModifiedSince);
        DateTimeRfc1123 ifUnmodifiedSinceConverted = ifUnmodifiedSince == null ? null : new DateTimeRfc1123(ifUnmodifiedSince);
        return service.create(this.client.getUrl(), blobType, timeout, contentLength, tier, blobContentType, blobContentEncoding, blobContentLanguage, blobContentMD5Converted, blobCacheControl, metadata, leaseId, blobContentDisposition, encryptionKey, encryptionKeySha256, encryptionAlgorithm, encryptionScope, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, ifMatch, ifNoneMatch, blobContentLength, blobSequenceNumber, this.client.getVersion(), requestId);
    }

    /**
     * The Create operation creates a new page blob.
     * 
     * @param contentLength 
     * @param blobContentLength 
     * @param timeout 
     * @param tier 
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
     * @param blobSequenceNumber 
     * @param requestId 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> createAsync(long contentLength, long blobContentLength, Integer timeout, PremiumPageBlobAccessTier tier, String blobContentType, String blobContentEncoding, String blobContentLanguage, byte[] blobContentMD5, String blobCacheControl, String metadata, String leaseId, String blobContentDisposition, String encryptionKey, String encryptionKeySha256, String encryptionScope, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String ifMatch, String ifNoneMatch, Long blobSequenceNumber, String requestId) {
        return createWithResponseAsync(contentLength, blobContentLength, timeout, tier, blobContentType, blobContentEncoding, blobContentLanguage, blobContentMD5, blobCacheControl, metadata, leaseId, blobContentDisposition, encryptionKey, encryptionKeySha256, encryptionScope, ifModifiedSince, ifUnmodifiedSince, ifMatch, ifNoneMatch, blobSequenceNumber, requestId)
            .flatMap((PageBlobsCreateResponse res) -> Mono.empty());
    }

    /**
     * The Create operation creates a new page blob.
     * 
     * @param contentLength 
     * @param blobContentLength 
     * @param timeout 
     * @param tier 
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
     * @param blobSequenceNumber 
     * @param requestId 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void create(long contentLength, long blobContentLength, Integer timeout, PremiumPageBlobAccessTier tier, String blobContentType, String blobContentEncoding, String blobContentLanguage, byte[] blobContentMD5, String blobCacheControl, String metadata, String leaseId, String blobContentDisposition, String encryptionKey, String encryptionKeySha256, String encryptionScope, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String ifMatch, String ifNoneMatch, Long blobSequenceNumber, String requestId) {
        createAsync(contentLength, blobContentLength, timeout, tier, blobContentType, blobContentEncoding, blobContentLanguage, blobContentMD5, blobCacheControl, metadata, leaseId, blobContentDisposition, encryptionKey, encryptionKeySha256, encryptionScope, ifModifiedSince, ifUnmodifiedSince, ifMatch, ifNoneMatch, blobSequenceNumber, requestId).block();
    }

    /**
     * The Upload Pages operation writes a range of pages to a page blob.
     * 
     * @param contentLength 
     * @param transactionalContentMD5 
     * @param transactionalContentCrc64 
     * @param timeout 
     * @param range 
     * @param leaseId 
     * @param encryptionKey 
     * @param encryptionKeySha256 
     * @param encryptionScope 
     * @param ifSequenceNumberLessThanOrEqualTo 
     * @param ifSequenceNumberLessThan 
     * @param ifSequenceNumberEqualTo 
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
    public Mono<PageBlobsUploadPagesResponse> uploadPagesWithResponseAsync(long contentLength, byte[] transactionalContentMD5, byte[] transactionalContentCrc64, Integer timeout, String range, String leaseId, String encryptionKey, String encryptionKeySha256, String encryptionScope, Long ifSequenceNumberLessThanOrEqualTo, Long ifSequenceNumberLessThan, Long ifSequenceNumberEqualTo, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String ifMatch, String ifNoneMatch, String requestId, ByteBuffer body) {
        if (this.client.getUrl() == null) {
            throw new IllegalArgumentException("Parameter this.client.getUrl() is required and cannot be null.");
        }
        final String comp = "page";
        final String pageWrite = "update";
        final String encryptionAlgorithm = "AES256";
        String transactionalContentMD5Converted = Base64Util.encodeToString(transactionalContentMD5);
        String transactionalContentCrc64Converted = Base64Util.encodeToString(transactionalContentCrc64);
        DateTimeRfc1123 ifModifiedSinceConverted = ifModifiedSince == null ? null : new DateTimeRfc1123(ifModifiedSince);
        DateTimeRfc1123 ifUnmodifiedSinceConverted = ifUnmodifiedSince == null ? null : new DateTimeRfc1123(ifUnmodifiedSince);
        return service.uploadPages(this.client.getUrl(), comp, pageWrite, contentLength, transactionalContentMD5Converted, transactionalContentCrc64Converted, timeout, range, leaseId, encryptionKey, encryptionKeySha256, encryptionAlgorithm, encryptionScope, ifSequenceNumberLessThanOrEqualTo, ifSequenceNumberLessThan, ifSequenceNumberEqualTo, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, ifMatch, ifNoneMatch, this.client.getVersion(), requestId, body);
    }

    /**
     * The Upload Pages operation writes a range of pages to a page blob.
     * 
     * @param contentLength 
     * @param transactionalContentMD5 
     * @param transactionalContentCrc64 
     * @param timeout 
     * @param range 
     * @param leaseId 
     * @param encryptionKey 
     * @param encryptionKeySha256 
     * @param encryptionScope 
     * @param ifSequenceNumberLessThanOrEqualTo 
     * @param ifSequenceNumberLessThan 
     * @param ifSequenceNumberEqualTo 
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
    public Mono<Void> uploadPagesAsync(long contentLength, byte[] transactionalContentMD5, byte[] transactionalContentCrc64, Integer timeout, String range, String leaseId, String encryptionKey, String encryptionKeySha256, String encryptionScope, Long ifSequenceNumberLessThanOrEqualTo, Long ifSequenceNumberLessThan, Long ifSequenceNumberEqualTo, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String ifMatch, String ifNoneMatch, String requestId, ByteBuffer body) {
        return uploadPagesWithResponseAsync(contentLength, transactionalContentMD5, transactionalContentCrc64, timeout, range, leaseId, encryptionKey, encryptionKeySha256, encryptionScope, ifSequenceNumberLessThanOrEqualTo, ifSequenceNumberLessThan, ifSequenceNumberEqualTo, ifModifiedSince, ifUnmodifiedSince, ifMatch, ifNoneMatch, requestId, body)
            .flatMap((PageBlobsUploadPagesResponse res) -> Mono.empty());
    }

    /**
     * The Upload Pages operation writes a range of pages to a page blob.
     * 
     * @param contentLength 
     * @param transactionalContentMD5 
     * @param transactionalContentCrc64 
     * @param timeout 
     * @param range 
     * @param leaseId 
     * @param encryptionKey 
     * @param encryptionKeySha256 
     * @param encryptionScope 
     * @param ifSequenceNumberLessThanOrEqualTo 
     * @param ifSequenceNumberLessThan 
     * @param ifSequenceNumberEqualTo 
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
    public void uploadPages(long contentLength, byte[] transactionalContentMD5, byte[] transactionalContentCrc64, Integer timeout, String range, String leaseId, String encryptionKey, String encryptionKeySha256, String encryptionScope, Long ifSequenceNumberLessThanOrEqualTo, Long ifSequenceNumberLessThan, Long ifSequenceNumberEqualTo, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String ifMatch, String ifNoneMatch, String requestId, ByteBuffer body) {
        uploadPagesAsync(contentLength, transactionalContentMD5, transactionalContentCrc64, timeout, range, leaseId, encryptionKey, encryptionKeySha256, encryptionScope, ifSequenceNumberLessThanOrEqualTo, ifSequenceNumberLessThan, ifSequenceNumberEqualTo, ifModifiedSince, ifUnmodifiedSince, ifMatch, ifNoneMatch, requestId, body).block();
    }

    /**
     * The Clear Pages operation clears a set of pages from a page blob.
     * 
     * @param contentLength 
     * @param timeout 
     * @param range 
     * @param leaseId 
     * @param encryptionKey 
     * @param encryptionKeySha256 
     * @param encryptionScope 
     * @param ifSequenceNumberLessThanOrEqualTo 
     * @param ifSequenceNumberLessThan 
     * @param ifSequenceNumberEqualTo 
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
    public Mono<PageBlobsClearPagesResponse> clearPagesWithResponseAsync(long contentLength, Integer timeout, String range, String leaseId, String encryptionKey, String encryptionKeySha256, String encryptionScope, Long ifSequenceNumberLessThanOrEqualTo, Long ifSequenceNumberLessThan, Long ifSequenceNumberEqualTo, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String ifMatch, String ifNoneMatch, String requestId) {
        if (this.client.getUrl() == null) {
            throw new IllegalArgumentException("Parameter this.client.getUrl() is required and cannot be null.");
        }
        final String comp = "page";
        final String pageWrite = "clear";
        final String encryptionAlgorithm = "AES256";
        DateTimeRfc1123 ifModifiedSinceConverted = ifModifiedSince == null ? null : new DateTimeRfc1123(ifModifiedSince);
        DateTimeRfc1123 ifUnmodifiedSinceConverted = ifUnmodifiedSince == null ? null : new DateTimeRfc1123(ifUnmodifiedSince);
        return service.clearPages(this.client.getUrl(), comp, pageWrite, contentLength, timeout, range, leaseId, encryptionKey, encryptionKeySha256, encryptionAlgorithm, encryptionScope, ifSequenceNumberLessThanOrEqualTo, ifSequenceNumberLessThan, ifSequenceNumberEqualTo, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, ifMatch, ifNoneMatch, this.client.getVersion(), requestId);
    }

    /**
     * The Clear Pages operation clears a set of pages from a page blob.
     * 
     * @param contentLength 
     * @param timeout 
     * @param range 
     * @param leaseId 
     * @param encryptionKey 
     * @param encryptionKeySha256 
     * @param encryptionScope 
     * @param ifSequenceNumberLessThanOrEqualTo 
     * @param ifSequenceNumberLessThan 
     * @param ifSequenceNumberEqualTo 
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
    public Mono<Void> clearPagesAsync(long contentLength, Integer timeout, String range, String leaseId, String encryptionKey, String encryptionKeySha256, String encryptionScope, Long ifSequenceNumberLessThanOrEqualTo, Long ifSequenceNumberLessThan, Long ifSequenceNumberEqualTo, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String ifMatch, String ifNoneMatch, String requestId) {
        return clearPagesWithResponseAsync(contentLength, timeout, range, leaseId, encryptionKey, encryptionKeySha256, encryptionScope, ifSequenceNumberLessThanOrEqualTo, ifSequenceNumberLessThan, ifSequenceNumberEqualTo, ifModifiedSince, ifUnmodifiedSince, ifMatch, ifNoneMatch, requestId)
            .flatMap((PageBlobsClearPagesResponse res) -> Mono.empty());
    }

    /**
     * The Clear Pages operation clears a set of pages from a page blob.
     * 
     * @param contentLength 
     * @param timeout 
     * @param range 
     * @param leaseId 
     * @param encryptionKey 
     * @param encryptionKeySha256 
     * @param encryptionScope 
     * @param ifSequenceNumberLessThanOrEqualTo 
     * @param ifSequenceNumberLessThan 
     * @param ifSequenceNumberEqualTo 
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
    public void clearPages(long contentLength, Integer timeout, String range, String leaseId, String encryptionKey, String encryptionKeySha256, String encryptionScope, Long ifSequenceNumberLessThanOrEqualTo, Long ifSequenceNumberLessThan, Long ifSequenceNumberEqualTo, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String ifMatch, String ifNoneMatch, String requestId) {
        clearPagesAsync(contentLength, timeout, range, leaseId, encryptionKey, encryptionKeySha256, encryptionScope, ifSequenceNumberLessThanOrEqualTo, ifSequenceNumberLessThan, ifSequenceNumberEqualTo, ifModifiedSince, ifUnmodifiedSince, ifMatch, ifNoneMatch, requestId).block();
    }

    /**
     * The Upload Pages operation writes a range of pages to a page blob where the contents are read from a URL.
     * 
     * @param sourceUrl 
     * @param sourceRange 
     * @param contentLength 
     * @param range 
     * @param sourceContentMD5 
     * @param sourceContentcrc64 
     * @param timeout 
     * @param encryptionKey 
     * @param encryptionKeySha256 
     * @param encryptionScope 
     * @param leaseId 
     * @param ifSequenceNumberLessThanOrEqualTo 
     * @param ifSequenceNumberLessThan 
     * @param ifSequenceNumberEqualTo 
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
    public Mono<PageBlobsUploadPagesFromURLResponse> uploadPagesFromURLWithResponseAsync(URL sourceUrl, String sourceRange, long contentLength, String range, byte[] sourceContentMD5, byte[] sourceContentcrc64, Integer timeout, String encryptionKey, String encryptionKeySha256, String encryptionScope, String leaseId, Long ifSequenceNumberLessThanOrEqualTo, Long ifSequenceNumberLessThan, Long ifSequenceNumberEqualTo, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String ifMatch, String ifNoneMatch, OffsetDateTime sourceIfModifiedSince, OffsetDateTime sourceIfUnmodifiedSince, String sourceIfMatch, String sourceIfNoneMatch, String requestId) {
        if (this.client.getUrl() == null) {
            throw new IllegalArgumentException("Parameter this.client.getUrl() is required and cannot be null.");
        }
        if (sourceUrl == null) {
            throw new IllegalArgumentException("Parameter sourceUrl is required and cannot be null.");
        }
        if (sourceRange == null) {
            throw new IllegalArgumentException("Parameter sourceRange is required and cannot be null.");
        }
        if (range == null) {
            throw new IllegalArgumentException("Parameter range is required and cannot be null.");
        }
        final String comp = "page";
        final String pageWrite = "update";
        final String encryptionAlgorithm = "AES256";
        String sourceContentMD5Converted = Base64Util.encodeToString(sourceContentMD5);
        String sourceContentcrc64Converted = Base64Util.encodeToString(sourceContentcrc64);
        DateTimeRfc1123 ifModifiedSinceConverted = ifModifiedSince == null ? null : new DateTimeRfc1123(ifModifiedSince);
        DateTimeRfc1123 ifUnmodifiedSinceConverted = ifUnmodifiedSince == null ? null : new DateTimeRfc1123(ifUnmodifiedSince);
        DateTimeRfc1123 sourceIfModifiedSinceConverted = sourceIfModifiedSince == null ? null : new DateTimeRfc1123(sourceIfModifiedSince);
        DateTimeRfc1123 sourceIfUnmodifiedSinceConverted = sourceIfUnmodifiedSince == null ? null : new DateTimeRfc1123(sourceIfUnmodifiedSince);
        return service.uploadPagesFromURL(this.client.getUrl(), comp, pageWrite, sourceUrl, sourceRange, sourceContentMD5Converted, sourceContentcrc64Converted, contentLength, timeout, range, encryptionKey, encryptionKeySha256, encryptionAlgorithm, encryptionScope, leaseId, ifSequenceNumberLessThanOrEqualTo, ifSequenceNumberLessThan, ifSequenceNumberEqualTo, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, ifMatch, ifNoneMatch, sourceIfModifiedSinceConverted, sourceIfUnmodifiedSinceConverted, sourceIfMatch, sourceIfNoneMatch, this.client.getVersion(), requestId);
    }

    /**
     * The Upload Pages operation writes a range of pages to a page blob where the contents are read from a URL.
     * 
     * @param sourceUrl 
     * @param sourceRange 
     * @param contentLength 
     * @param range 
     * @param sourceContentMD5 
     * @param sourceContentcrc64 
     * @param timeout 
     * @param encryptionKey 
     * @param encryptionKeySha256 
     * @param encryptionScope 
     * @param leaseId 
     * @param ifSequenceNumberLessThanOrEqualTo 
     * @param ifSequenceNumberLessThan 
     * @param ifSequenceNumberEqualTo 
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
    public Mono<Void> uploadPagesFromURLAsync(URL sourceUrl, String sourceRange, long contentLength, String range, byte[] sourceContentMD5, byte[] sourceContentcrc64, Integer timeout, String encryptionKey, String encryptionKeySha256, String encryptionScope, String leaseId, Long ifSequenceNumberLessThanOrEqualTo, Long ifSequenceNumberLessThan, Long ifSequenceNumberEqualTo, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String ifMatch, String ifNoneMatch, OffsetDateTime sourceIfModifiedSince, OffsetDateTime sourceIfUnmodifiedSince, String sourceIfMatch, String sourceIfNoneMatch, String requestId) {
        return uploadPagesFromURLWithResponseAsync(sourceUrl, sourceRange, contentLength, range, sourceContentMD5, sourceContentcrc64, timeout, encryptionKey, encryptionKeySha256, encryptionScope, leaseId, ifSequenceNumberLessThanOrEqualTo, ifSequenceNumberLessThan, ifSequenceNumberEqualTo, ifModifiedSince, ifUnmodifiedSince, ifMatch, ifNoneMatch, sourceIfModifiedSince, sourceIfUnmodifiedSince, sourceIfMatch, sourceIfNoneMatch, requestId)
            .flatMap((PageBlobsUploadPagesFromURLResponse res) -> Mono.empty());
    }

    /**
     * The Upload Pages operation writes a range of pages to a page blob where the contents are read from a URL.
     * 
     * @param sourceUrl 
     * @param sourceRange 
     * @param contentLength 
     * @param range 
     * @param sourceContentMD5 
     * @param sourceContentcrc64 
     * @param timeout 
     * @param encryptionKey 
     * @param encryptionKeySha256 
     * @param encryptionScope 
     * @param leaseId 
     * @param ifSequenceNumberLessThanOrEqualTo 
     * @param ifSequenceNumberLessThan 
     * @param ifSequenceNumberEqualTo 
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
    public void uploadPagesFromURL(URL sourceUrl, String sourceRange, long contentLength, String range, byte[] sourceContentMD5, byte[] sourceContentcrc64, Integer timeout, String encryptionKey, String encryptionKeySha256, String encryptionScope, String leaseId, Long ifSequenceNumberLessThanOrEqualTo, Long ifSequenceNumberLessThan, Long ifSequenceNumberEqualTo, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String ifMatch, String ifNoneMatch, OffsetDateTime sourceIfModifiedSince, OffsetDateTime sourceIfUnmodifiedSince, String sourceIfMatch, String sourceIfNoneMatch, String requestId) {
        uploadPagesFromURLAsync(sourceUrl, sourceRange, contentLength, range, sourceContentMD5, sourceContentcrc64, timeout, encryptionKey, encryptionKeySha256, encryptionScope, leaseId, ifSequenceNumberLessThanOrEqualTo, ifSequenceNumberLessThan, ifSequenceNumberEqualTo, ifModifiedSince, ifUnmodifiedSince, ifMatch, ifNoneMatch, sourceIfModifiedSince, sourceIfUnmodifiedSince, sourceIfMatch, sourceIfNoneMatch, requestId).block();
    }

    /**
     * The Get Page Ranges operation returns the list of valid page ranges for a page blob or snapshot of a page blob.
     * 
     * @param snapshot 
     * @param timeout 
     * @param range 
     * @param leaseId 
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
    public Mono<PageBlobsGetPageRangesResponse> getPageRangesWithResponseAsync(String snapshot, Integer timeout, String range, String leaseId, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String ifMatch, String ifNoneMatch, String requestId) {
        if (this.client.getUrl() == null) {
            throw new IllegalArgumentException("Parameter this.client.getUrl() is required and cannot be null.");
        }
        final String comp = "pagelist";
        DateTimeRfc1123 ifModifiedSinceConverted = ifModifiedSince == null ? null : new DateTimeRfc1123(ifModifiedSince);
        DateTimeRfc1123 ifUnmodifiedSinceConverted = ifUnmodifiedSince == null ? null : new DateTimeRfc1123(ifUnmodifiedSince);
        return service.getPageRanges(this.client.getUrl(), comp, snapshot, timeout, range, leaseId, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, ifMatch, ifNoneMatch, this.client.getVersion(), requestId);
    }

    /**
     * The Get Page Ranges operation returns the list of valid page ranges for a page blob or snapshot of a page blob.
     * 
     * @param snapshot 
     * @param timeout 
     * @param range 
     * @param leaseId 
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
    public Mono<PageList> getPageRangesAsync(String snapshot, Integer timeout, String range, String leaseId, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String ifMatch, String ifNoneMatch, String requestId) {
        return getPageRangesWithResponseAsync(snapshot, timeout, range, leaseId, ifModifiedSince, ifUnmodifiedSince, ifMatch, ifNoneMatch, requestId)
            .flatMap((PageBlobsGetPageRangesResponse res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * The Get Page Ranges operation returns the list of valid page ranges for a page blob or snapshot of a page blob.
     * 
     * @param snapshot 
     * @param timeout 
     * @param range 
     * @param leaseId 
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
    public PageList getPageRanges(String snapshot, Integer timeout, String range, String leaseId, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String ifMatch, String ifNoneMatch, String requestId) {
        return getPageRangesAsync(snapshot, timeout, range, leaseId, ifModifiedSince, ifUnmodifiedSince, ifMatch, ifNoneMatch, requestId).block();
    }

    /**
     * The Get Page Ranges Diff operation returns the list of valid page ranges for a page blob that were changed between target blob and previous snapshot.
     * 
     * @param snapshot 
     * @param timeout 
     * @param prevsnapshot 
     * @param prevSnapshotUrl 
     * @param range 
     * @param leaseId 
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
    public Mono<PageBlobsGetPageRangesDiffResponse> getPageRangesDiffWithResponseAsync(String snapshot, Integer timeout, String prevsnapshot, URL prevSnapshotUrl, String range, String leaseId, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String ifMatch, String ifNoneMatch, String requestId) {
        if (this.client.getUrl() == null) {
            throw new IllegalArgumentException("Parameter this.client.getUrl() is required and cannot be null.");
        }
        final String comp = "pagelist";
        DateTimeRfc1123 ifModifiedSinceConverted = ifModifiedSince == null ? null : new DateTimeRfc1123(ifModifiedSince);
        DateTimeRfc1123 ifUnmodifiedSinceConverted = ifUnmodifiedSince == null ? null : new DateTimeRfc1123(ifUnmodifiedSince);
        return service.getPageRangesDiff(this.client.getUrl(), comp, snapshot, timeout, prevsnapshot, prevSnapshotUrl, range, leaseId, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, ifMatch, ifNoneMatch, this.client.getVersion(), requestId);
    }

    /**
     * The Get Page Ranges Diff operation returns the list of valid page ranges for a page blob that were changed between target blob and previous snapshot.
     * 
     * @param snapshot 
     * @param timeout 
     * @param prevsnapshot 
     * @param prevSnapshotUrl 
     * @param range 
     * @param leaseId 
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
    public Mono<PageList> getPageRangesDiffAsync(String snapshot, Integer timeout, String prevsnapshot, URL prevSnapshotUrl, String range, String leaseId, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String ifMatch, String ifNoneMatch, String requestId) {
        return getPageRangesDiffWithResponseAsync(snapshot, timeout, prevsnapshot, prevSnapshotUrl, range, leaseId, ifModifiedSince, ifUnmodifiedSince, ifMatch, ifNoneMatch, requestId)
            .flatMap((PageBlobsGetPageRangesDiffResponse res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * The Get Page Ranges Diff operation returns the list of valid page ranges for a page blob that were changed between target blob and previous snapshot.
     * 
     * @param snapshot 
     * @param timeout 
     * @param prevsnapshot 
     * @param prevSnapshotUrl 
     * @param range 
     * @param leaseId 
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
    public PageList getPageRangesDiff(String snapshot, Integer timeout, String prevsnapshot, URL prevSnapshotUrl, String range, String leaseId, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String ifMatch, String ifNoneMatch, String requestId) {
        return getPageRangesDiffAsync(snapshot, timeout, prevsnapshot, prevSnapshotUrl, range, leaseId, ifModifiedSince, ifUnmodifiedSince, ifMatch, ifNoneMatch, requestId).block();
    }

    /**
     * Resize the Blob.
     * 
     * @param blobContentLength 
     * @param timeout 
     * @param leaseId 
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
    public Mono<PageBlobsResizeResponse> resizeWithResponseAsync(long blobContentLength, Integer timeout, String leaseId, String encryptionKey, String encryptionKeySha256, String encryptionScope, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String ifMatch, String ifNoneMatch, String requestId) {
        if (this.client.getUrl() == null) {
            throw new IllegalArgumentException("Parameter this.client.getUrl() is required and cannot be null.");
        }
        final String comp = "properties";
        final String encryptionAlgorithm = "AES256";
        DateTimeRfc1123 ifModifiedSinceConverted = ifModifiedSince == null ? null : new DateTimeRfc1123(ifModifiedSince);
        DateTimeRfc1123 ifUnmodifiedSinceConverted = ifUnmodifiedSince == null ? null : new DateTimeRfc1123(ifUnmodifiedSince);
        return service.resize(this.client.getUrl(), comp, timeout, leaseId, encryptionKey, encryptionKeySha256, encryptionAlgorithm, encryptionScope, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, ifMatch, ifNoneMatch, blobContentLength, this.client.getVersion(), requestId);
    }

    /**
     * Resize the Blob.
     * 
     * @param blobContentLength 
     * @param timeout 
     * @param leaseId 
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
    public Mono<Void> resizeAsync(long blobContentLength, Integer timeout, String leaseId, String encryptionKey, String encryptionKeySha256, String encryptionScope, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String ifMatch, String ifNoneMatch, String requestId) {
        return resizeWithResponseAsync(blobContentLength, timeout, leaseId, encryptionKey, encryptionKeySha256, encryptionScope, ifModifiedSince, ifUnmodifiedSince, ifMatch, ifNoneMatch, requestId)
            .flatMap((PageBlobsResizeResponse res) -> Mono.empty());
    }

    /**
     * Resize the Blob.
     * 
     * @param blobContentLength 
     * @param timeout 
     * @param leaseId 
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
    public void resize(long blobContentLength, Integer timeout, String leaseId, String encryptionKey, String encryptionKeySha256, String encryptionScope, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String ifMatch, String ifNoneMatch, String requestId) {
        resizeAsync(blobContentLength, timeout, leaseId, encryptionKey, encryptionKeySha256, encryptionScope, ifModifiedSince, ifUnmodifiedSince, ifMatch, ifNoneMatch, requestId).block();
    }

    /**
     * Update the sequence number of the blob.
     * 
     * @param sequenceNumberAction 
     * @param timeout 
     * @param leaseId 
     * @param ifModifiedSince 
     * @param ifUnmodifiedSince 
     * @param ifMatch 
     * @param ifNoneMatch 
     * @param blobSequenceNumber 
     * @param requestId 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PageBlobsUpdateSequenceNumberResponse> updateSequenceNumberWithResponseAsync(SequenceNumberActionType sequenceNumberAction, Integer timeout, String leaseId, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String ifMatch, String ifNoneMatch, Long blobSequenceNumber, String requestId) {
        if (this.client.getUrl() == null) {
            throw new IllegalArgumentException("Parameter this.client.getUrl() is required and cannot be null.");
        }
        if (sequenceNumberAction == null) {
            throw new IllegalArgumentException("Parameter sequenceNumberAction is required and cannot be null.");
        }
        final String comp = "properties";
        DateTimeRfc1123 ifModifiedSinceConverted = ifModifiedSince == null ? null : new DateTimeRfc1123(ifModifiedSince);
        DateTimeRfc1123 ifUnmodifiedSinceConverted = ifUnmodifiedSince == null ? null : new DateTimeRfc1123(ifUnmodifiedSince);
        return service.updateSequenceNumber(this.client.getUrl(), comp, timeout, leaseId, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, ifMatch, ifNoneMatch, sequenceNumberAction, blobSequenceNumber, this.client.getVersion(), requestId);
    }

    /**
     * Update the sequence number of the blob.
     * 
     * @param sequenceNumberAction 
     * @param timeout 
     * @param leaseId 
     * @param ifModifiedSince 
     * @param ifUnmodifiedSince 
     * @param ifMatch 
     * @param ifNoneMatch 
     * @param blobSequenceNumber 
     * @param requestId 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> updateSequenceNumberAsync(SequenceNumberActionType sequenceNumberAction, Integer timeout, String leaseId, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String ifMatch, String ifNoneMatch, Long blobSequenceNumber, String requestId) {
        return updateSequenceNumberWithResponseAsync(sequenceNumberAction, timeout, leaseId, ifModifiedSince, ifUnmodifiedSince, ifMatch, ifNoneMatch, blobSequenceNumber, requestId)
            .flatMap((PageBlobsUpdateSequenceNumberResponse res) -> Mono.empty());
    }

    /**
     * Update the sequence number of the blob.
     * 
     * @param sequenceNumberAction 
     * @param timeout 
     * @param leaseId 
     * @param ifModifiedSince 
     * @param ifUnmodifiedSince 
     * @param ifMatch 
     * @param ifNoneMatch 
     * @param blobSequenceNumber 
     * @param requestId 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void updateSequenceNumber(SequenceNumberActionType sequenceNumberAction, Integer timeout, String leaseId, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String ifMatch, String ifNoneMatch, Long blobSequenceNumber, String requestId) {
        updateSequenceNumberAsync(sequenceNumberAction, timeout, leaseId, ifModifiedSince, ifUnmodifiedSince, ifMatch, ifNoneMatch, blobSequenceNumber, requestId).block();
    }

    /**
     * The Copy Incremental operation copies a snapshot of the source page blob to a destination page blob. The snapshot is copied such that only the differential changes between the previously copied snapshot are transferred to the destination. The copied snapshots are complete copies of the original snapshot and can be read or copied from as usual. This API is supported since REST version 2016-05-31.
     * 
     * @param copySource 
     * @param timeout 
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
    public Mono<PageBlobsCopyIncrementalResponse> copyIncrementalWithResponseAsync(URL copySource, Integer timeout, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String ifMatch, String ifNoneMatch, String requestId) {
        if (this.client.getUrl() == null) {
            throw new IllegalArgumentException("Parameter this.client.getUrl() is required and cannot be null.");
        }
        if (copySource == null) {
            throw new IllegalArgumentException("Parameter copySource is required and cannot be null.");
        }
        final String comp = "incrementalcopy";
        DateTimeRfc1123 ifModifiedSinceConverted = ifModifiedSince == null ? null : new DateTimeRfc1123(ifModifiedSince);
        DateTimeRfc1123 ifUnmodifiedSinceConverted = ifUnmodifiedSince == null ? null : new DateTimeRfc1123(ifUnmodifiedSince);
        return service.copyIncremental(this.client.getUrl(), comp, timeout, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, ifMatch, ifNoneMatch, copySource, this.client.getVersion(), requestId);
    }

    /**
     * The Copy Incremental operation copies a snapshot of the source page blob to a destination page blob. The snapshot is copied such that only the differential changes between the previously copied snapshot are transferred to the destination. The copied snapshots are complete copies of the original snapshot and can be read or copied from as usual. This API is supported since REST version 2016-05-31.
     * 
     * @param copySource 
     * @param timeout 
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
    public Mono<Void> copyIncrementalAsync(URL copySource, Integer timeout, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String ifMatch, String ifNoneMatch, String requestId) {
        return copyIncrementalWithResponseAsync(copySource, timeout, ifModifiedSince, ifUnmodifiedSince, ifMatch, ifNoneMatch, requestId)
            .flatMap((PageBlobsCopyIncrementalResponse res) -> Mono.empty());
    }

    /**
     * The Copy Incremental operation copies a snapshot of the source page blob to a destination page blob. The snapshot is copied such that only the differential changes between the previously copied snapshot are transferred to the destination. The copied snapshots are complete copies of the original snapshot and can be read or copied from as usual. This API is supported since REST version 2016-05-31.
     * 
     * @param copySource 
     * @param timeout 
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
    public void copyIncremental(URL copySource, Integer timeout, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String ifMatch, String ifNoneMatch, String requestId) {
        copyIncrementalAsync(copySource, timeout, ifModifiedSince, ifUnmodifiedSince, ifMatch, ifNoneMatch, requestId).block();
    }
}
