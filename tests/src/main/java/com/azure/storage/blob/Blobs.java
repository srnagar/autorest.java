package com.azure.storage.blob;

import com.azure.core.annotation.Delete;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.Head;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.Patch;
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
import com.azure.storage.blob.models.BlobsAbortCopyFromURLResponse;
import com.azure.storage.blob.models.BlobsAcquireLeaseResponse;
import com.azure.storage.blob.models.BlobsBreakLeaseResponse;
import com.azure.storage.blob.models.BlobsChangeLeaseResponse;
import com.azure.storage.blob.models.BlobsCopyFromURLResponse;
import com.azure.storage.blob.models.BlobsCreateSnapshotResponse;
import com.azure.storage.blob.models.BlobsDeleteResponse;
import com.azure.storage.blob.models.BlobsDownloadResponse;
import com.azure.storage.blob.models.BlobsGetAccessControlResponse;
import com.azure.storage.blob.models.BlobsGetAccountInfoResponse;
import com.azure.storage.blob.models.BlobsGetPropertiesResponse;
import com.azure.storage.blob.models.BlobsReleaseLeaseResponse;
import com.azure.storage.blob.models.BlobsRenameResponse;
import com.azure.storage.blob.models.BlobsRenewLeaseResponse;
import com.azure.storage.blob.models.BlobsSetAccessControlResponse;
import com.azure.storage.blob.models.BlobsSetHttpHeadersResponse;
import com.azure.storage.blob.models.BlobsSetMetadataResponse;
import com.azure.storage.blob.models.BlobsSetTierResponse;
import com.azure.storage.blob.models.BlobsStartCopyFromURLResponse;
import com.azure.storage.blob.models.BlobsUndeleteResponse;
import com.azure.storage.blob.models.DataLakeStorageErrorException;
import com.azure.storage.blob.models.DeleteSnapshotsOptionType;
import com.azure.storage.blob.models.PathRenameMode;
import com.azure.storage.blob.models.RehydratePriority;
import com.azure.storage.blob.models.StorageErrorException;
import java.net.URL;
import java.time.OffsetDateTime;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * Blobs.
 */
public final class Blobs {
    /**
     * The proxy service used to perform REST calls.
     */
    private BlobsService service;

    /**
     * The service client containing this operation class.
     */
    private AzureBlobStorage client;

    /**
     * Initializes an instance of Blobs.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    public Blobs(AzureBlobStorage client) {
        this.service = RestProxy.create(BlobsService.class, client.getHttpPipeline());
        this.client = client;
    }

    /**
     * The interface defining all the services for AzureBlobStorageBlobs to be
     * used by the proxy service to perform REST calls.
     */
    @Host("{url}")
    @ServiceInterface(name = "AzureBlobStorageBlobs")
    private interface BlobsService {
        @Get("/{containerName}/{blob}")
        @ExpectedResponses({200, 206})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<BlobsDownloadResponse> download(@HostParam("url") String url, @QueryParam("snapshot") String snapshot, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-range") String range, @HeaderParam("x-ms-lease-id") String leaseId, @HeaderParam("x-ms-range-get-content-md5") Boolean rangeGetContentMD5, @HeaderParam("x-ms-range-get-content-crc64") Boolean rangeGetContentCRC64, @HeaderParam("x-ms-encryption-key") String encryptionKey, @HeaderParam("x-ms-encryption-key-sha256") String encryptionKeySha256, @HeaderParam("x-ms-encryption-algorithm") String encryptionAlgorithm, @HeaderParam("If-Modified-Since") DateTimeRfc1123 ifModifiedSince, @HeaderParam("If-Unmodified-Since") DateTimeRfc1123 ifUnmodifiedSince, @HeaderParam("If-Match") String ifMatch, @HeaderParam("If-None-Match") String ifNoneMatch, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId);

        @Head("/{containerName}/{blob}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<BlobsGetPropertiesResponse> getProperties(@HostParam("url") String url, @QueryParam("snapshot") String snapshot, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-lease-id") String leaseId, @HeaderParam("x-ms-encryption-key") String encryptionKey, @HeaderParam("x-ms-encryption-key-sha256") String encryptionKeySha256, @HeaderParam("x-ms-encryption-algorithm") String encryptionAlgorithm, @HeaderParam("If-Modified-Since") DateTimeRfc1123 ifModifiedSince, @HeaderParam("If-Unmodified-Since") DateTimeRfc1123 ifUnmodifiedSince, @HeaderParam("If-Match") String ifMatch, @HeaderParam("If-None-Match") String ifNoneMatch, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId);

        @Delete("/{containerName}/{blob}")
        @ExpectedResponses({202})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<BlobsDeleteResponse> delete(@HostParam("url") String url, @QueryParam("snapshot") String snapshot, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-lease-id") String leaseId, @HeaderParam("x-ms-delete-snapshots") DeleteSnapshotsOptionType deleteSnapshots, @HeaderParam("If-Modified-Since") DateTimeRfc1123 ifModifiedSince, @HeaderParam("If-Unmodified-Since") DateTimeRfc1123 ifUnmodifiedSince, @HeaderParam("If-Match") String ifMatch, @HeaderParam("If-None-Match") String ifNoneMatch, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId);

        @Patch("/{filesystem}/{path}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(DataLakeStorageErrorException.class)
        Mono<BlobsSetAccessControlResponse> setAccessControl(@HostParam("url") String url, @QueryParam("action") String action, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-lease-id") String leaseId, @HeaderParam("x-ms-owner") String owner, @HeaderParam("x-ms-group") String group, @HeaderParam("x-ms-permissions") String posixPermissions, @HeaderParam("x-ms-acl") String posixAcl, @HeaderParam("If-Match") String ifMatch, @HeaderParam("If-None-Match") String ifNoneMatch, @HeaderParam("If-Modified-Since") DateTimeRfc1123 ifModifiedSince, @HeaderParam("If-Unmodified-Since") DateTimeRfc1123 ifUnmodifiedSince, @HeaderParam("x-ms-client-request-id") String requestId, @HeaderParam("x-ms-version") String version);

        @Head("/{filesystem}/{path}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(DataLakeStorageErrorException.class)
        Mono<BlobsGetAccessControlResponse> getAccessControl(@HostParam("url") String url, @QueryParam("action") String action, @QueryParam("timeout") Integer timeout, @QueryParam("upn") Boolean upn, @HeaderParam("x-ms-lease-id") String leaseId, @HeaderParam("If-Match") String ifMatch, @HeaderParam("If-None-Match") String ifNoneMatch, @HeaderParam("If-Modified-Since") DateTimeRfc1123 ifModifiedSince, @HeaderParam("If-Unmodified-Since") DateTimeRfc1123 ifUnmodifiedSince, @HeaderParam("x-ms-client-request-id") String requestId, @HeaderParam("x-ms-version") String version);

        @Put("/{filesystem}/{path}")
        @ExpectedResponses({201})
        @UnexpectedResponseExceptionType(DataLakeStorageErrorException.class)
        Mono<BlobsRenameResponse> rename(@HostParam("url") String url, @QueryParam("timeout") Integer timeout, @QueryParam("mode") PathRenameMode pathRenameMode, @HeaderParam("x-ms-rename-source") String renameSource, @HeaderParam("x-ms-properties") String directoryProperties, @HeaderParam("x-ms-permissions") String posixPermissions, @HeaderParam("x-ms-umask") String posixUmask, @HeaderParam("x-ms-cache-control") String cacheControl, @HeaderParam("x-ms-content-type") String contentType, @HeaderParam("x-ms-content-encoding") String contentEncoding, @HeaderParam("x-ms-content-language") String contentLanguage, @HeaderParam("x-ms-content-disposition") String contentDisposition, @HeaderParam("x-ms-lease-id") String leaseId, @HeaderParam("x-ms-source-lease-id") String sourceLeaseId, @HeaderParam("If-Modified-Since") DateTimeRfc1123 ifModifiedSince, @HeaderParam("If-Unmodified-Since") DateTimeRfc1123 ifUnmodifiedSince, @HeaderParam("If-Match") String ifMatch, @HeaderParam("If-None-Match") String ifNoneMatch, @HeaderParam("x-ms-source-if-modified-since") DateTimeRfc1123 sourceIfModifiedSince, @HeaderParam("x-ms-source-if-unmodified-since") DateTimeRfc1123 sourceIfUnmodifiedSince, @HeaderParam("x-ms-source-if-match") String sourceIfMatch, @HeaderParam("x-ms-source-if-none-match") String sourceIfNoneMatch, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId);

        @Put("/{containerName}/{blob}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<BlobsUndeleteResponse> undelete(@HostParam("url") String url, @QueryParam("comp") String comp, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId);

        @Put("/{containerName}/{blob}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<BlobsSetHttpHeadersResponse> setHttpHeaders(@HostParam("url") String url, @QueryParam("comp") String comp, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-blob-cache-control") String blobCacheControl, @HeaderParam("x-ms-blob-content-type") String blobContentType, @HeaderParam("x-ms-blob-content-md5") String blobContentMD5, @HeaderParam("x-ms-blob-content-encoding") String blobContentEncoding, @HeaderParam("x-ms-blob-content-language") String blobContentLanguage, @HeaderParam("x-ms-lease-id") String leaseId, @HeaderParam("If-Modified-Since") DateTimeRfc1123 ifModifiedSince, @HeaderParam("If-Unmodified-Since") DateTimeRfc1123 ifUnmodifiedSince, @HeaderParam("If-Match") String ifMatch, @HeaderParam("If-None-Match") String ifNoneMatch, @HeaderParam("x-ms-blob-content-disposition") String blobContentDisposition, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId);

        @Put("/{containerName}/{blob}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<BlobsSetMetadataResponse> setMetadata(@HostParam("url") String url, @QueryParam("comp") String comp, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-meta") String metadata, @HeaderParam("x-ms-lease-id") String leaseId, @HeaderParam("x-ms-encryption-key") String encryptionKey, @HeaderParam("x-ms-encryption-key-sha256") String encryptionKeySha256, @HeaderParam("x-ms-encryption-algorithm") String encryptionAlgorithm, @HeaderParam("x-ms-encryption-scope") String encryptionScope, @HeaderParam("If-Modified-Since") DateTimeRfc1123 ifModifiedSince, @HeaderParam("If-Unmodified-Since") DateTimeRfc1123 ifUnmodifiedSince, @HeaderParam("If-Match") String ifMatch, @HeaderParam("If-None-Match") String ifNoneMatch, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId);

        @Put("/{containerName}/{blob}")
        @ExpectedResponses({201})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<BlobsAcquireLeaseResponse> acquireLease(@HostParam("url") String url, @QueryParam("comp") String comp, @HeaderParam("x-ms-lease-action") String action, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-lease-duration") Integer duration, @HeaderParam("x-ms-proposed-lease-id") String proposedLeaseId, @HeaderParam("If-Modified-Since") DateTimeRfc1123 ifModifiedSince, @HeaderParam("If-Unmodified-Since") DateTimeRfc1123 ifUnmodifiedSince, @HeaderParam("If-Match") String ifMatch, @HeaderParam("If-None-Match") String ifNoneMatch, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId);

        @Put("/{containerName}/{blob}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<BlobsReleaseLeaseResponse> releaseLease(@HostParam("url") String url, @QueryParam("comp") String comp, @HeaderParam("x-ms-lease-action") String action, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-lease-id") String leaseId, @HeaderParam("If-Modified-Since") DateTimeRfc1123 ifModifiedSince, @HeaderParam("If-Unmodified-Since") DateTimeRfc1123 ifUnmodifiedSince, @HeaderParam("If-Match") String ifMatch, @HeaderParam("If-None-Match") String ifNoneMatch, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId);

        @Put("/{containerName}/{blob}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<BlobsRenewLeaseResponse> renewLease(@HostParam("url") String url, @QueryParam("comp") String comp, @HeaderParam("x-ms-lease-action") String action, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-lease-id") String leaseId, @HeaderParam("If-Modified-Since") DateTimeRfc1123 ifModifiedSince, @HeaderParam("If-Unmodified-Since") DateTimeRfc1123 ifUnmodifiedSince, @HeaderParam("If-Match") String ifMatch, @HeaderParam("If-None-Match") String ifNoneMatch, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId);

        @Put("/{containerName}/{blob}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<BlobsChangeLeaseResponse> changeLease(@HostParam("url") String url, @QueryParam("comp") String comp, @HeaderParam("x-ms-lease-action") String action, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-lease-id") String leaseId, @HeaderParam("x-ms-proposed-lease-id") String proposedLeaseId, @HeaderParam("If-Modified-Since") DateTimeRfc1123 ifModifiedSince, @HeaderParam("If-Unmodified-Since") DateTimeRfc1123 ifUnmodifiedSince, @HeaderParam("If-Match") String ifMatch, @HeaderParam("If-None-Match") String ifNoneMatch, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId);

        @Put("/{containerName}/{blob}")
        @ExpectedResponses({202})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<BlobsBreakLeaseResponse> breakLease(@HostParam("url") String url, @QueryParam("comp") String comp, @HeaderParam("x-ms-lease-action") String action, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-lease-break-period") Integer breakPeriod, @HeaderParam("If-Modified-Since") DateTimeRfc1123 ifModifiedSince, @HeaderParam("If-Unmodified-Since") DateTimeRfc1123 ifUnmodifiedSince, @HeaderParam("If-Match") String ifMatch, @HeaderParam("If-None-Match") String ifNoneMatch, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId);

        @Put("/{containerName}/{blob}")
        @ExpectedResponses({201})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<BlobsCreateSnapshotResponse> createSnapshot(@HostParam("url") String url, @QueryParam("comp") String comp, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-meta") String metadata, @HeaderParam("x-ms-encryption-key") String encryptionKey, @HeaderParam("x-ms-encryption-key-sha256") String encryptionKeySha256, @HeaderParam("x-ms-encryption-algorithm") String encryptionAlgorithm, @HeaderParam("x-ms-encryption-scope") String encryptionScope, @HeaderParam("If-Modified-Since") DateTimeRfc1123 ifModifiedSince, @HeaderParam("If-Unmodified-Since") DateTimeRfc1123 ifUnmodifiedSince, @HeaderParam("If-Match") String ifMatch, @HeaderParam("If-None-Match") String ifNoneMatch, @HeaderParam("x-ms-lease-id") String leaseId, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId);

        @Put("/{containerName}/{blob}")
        @ExpectedResponses({202})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<BlobsStartCopyFromURLResponse> startCopyFromURL(@HostParam("url") String url, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-meta") String metadata, @HeaderParam("x-ms-access-tier") AccessTier tier, @HeaderParam("x-ms-rehydrate-priority") RehydratePriority rehydratePriority, @HeaderParam("x-ms-source-if-modified-since") DateTimeRfc1123 sourceIfModifiedSince, @HeaderParam("x-ms-source-if-unmodified-since") DateTimeRfc1123 sourceIfUnmodifiedSince, @HeaderParam("x-ms-source-if-match") String sourceIfMatch, @HeaderParam("x-ms-source-if-none-match") String sourceIfNoneMatch, @HeaderParam("If-Modified-Since") DateTimeRfc1123 ifModifiedSince, @HeaderParam("If-Unmodified-Since") DateTimeRfc1123 ifUnmodifiedSince, @HeaderParam("If-Match") String ifMatch, @HeaderParam("If-None-Match") String ifNoneMatch, @HeaderParam("x-ms-copy-source") URL copySource, @HeaderParam("x-ms-lease-id") String leaseId, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId);

        @Put("/{containerName}/{blob}")
        @ExpectedResponses({202})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<BlobsCopyFromURLResponse> copyFromURL(@HostParam("url") String url, @HeaderParam("x-ms-requires-sync") String xMsRequiresSync, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-meta") String metadata, @HeaderParam("x-ms-access-tier") AccessTier tier, @HeaderParam("x-ms-source-if-modified-since") DateTimeRfc1123 sourceIfModifiedSince, @HeaderParam("x-ms-source-if-unmodified-since") DateTimeRfc1123 sourceIfUnmodifiedSince, @HeaderParam("x-ms-source-if-match") String sourceIfMatch, @HeaderParam("x-ms-source-if-none-match") String sourceIfNoneMatch, @HeaderParam("If-Modified-Since") DateTimeRfc1123 ifModifiedSince, @HeaderParam("If-Unmodified-Since") DateTimeRfc1123 ifUnmodifiedSince, @HeaderParam("If-Match") String ifMatch, @HeaderParam("If-None-Match") String ifNoneMatch, @HeaderParam("x-ms-copy-source") URL copySource, @HeaderParam("x-ms-lease-id") String leaseId, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId, @HeaderParam("x-ms-source-content-md5") String sourceContentMD5);

        @Put("/{containerName}/{blob}")
        @ExpectedResponses({204})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<BlobsAbortCopyFromURLResponse> abortCopyFromURL(@HostParam("url") String url, @QueryParam("comp") String comp, @HeaderParam("x-ms-copy-action") String copyActionAbortConstant, @QueryParam("copyid") String copyId, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-lease-id") String leaseId, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId);

        @Put("/{containerName}/{blob}")
        @ExpectedResponses({200, 202})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<BlobsSetTierResponse> setTier(@HostParam("url") String url, @QueryParam("comp") String comp, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-access-tier") AccessTier tier, @HeaderParam("x-ms-rehydrate-priority") RehydratePriority rehydratePriority, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId, @HeaderParam("x-ms-lease-id") String leaseId);

        @Get("/{containerName}/{blob}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<BlobsGetAccountInfoResponse> getAccountInfo(@HostParam("url") String url, @QueryParam("restype") String restype, @QueryParam("comp") String comp, @HeaderParam("x-ms-version") String version);
    }

    /**
     * The Download operation reads or downloads a blob from the system, including its metadata and properties. You can also call Download to read a snapshot.
     * 
     * @param snapshot 
     * @param timeout 
     * @param range 
     * @param leaseId 
     * @param rangeGetContentMD5 
     * @param rangeGetContentCRC64 
     * @param encryptionKey 
     * @param encryptionKeySha256 
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
    public Mono<BlobsDownloadResponse> downloadWithResponseAsync(String snapshot, Integer timeout, String range, String leaseId, Boolean rangeGetContentMD5, Boolean rangeGetContentCRC64, String encryptionKey, String encryptionKeySha256, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String ifMatch, String ifNoneMatch, String requestId) {
        if (this.client.getUrl() == null) {
            throw new IllegalArgumentException("Parameter this.client.getUrl() is required and cannot be null.");
        }
        final String encryptionAlgorithm = "AES256";
        DateTimeRfc1123 ifModifiedSinceConverted = ifModifiedSince == null ? null : new DateTimeRfc1123(ifModifiedSince);
        DateTimeRfc1123 ifUnmodifiedSinceConverted = ifUnmodifiedSince == null ? null : new DateTimeRfc1123(ifUnmodifiedSince);
        return service.download(this.client.getUrl(), snapshot, timeout, range, leaseId, rangeGetContentMD5, rangeGetContentCRC64, encryptionKey, encryptionKeySha256, encryptionAlgorithm, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, ifMatch, ifNoneMatch, this.client.getVersion(), requestId);
    }

    /**
     * The Download operation reads or downloads a blob from the system, including its metadata and properties. You can also call Download to read a snapshot.
     * 
     * @param snapshot 
     * @param timeout 
     * @param range 
     * @param leaseId 
     * @param rangeGetContentMD5 
     * @param rangeGetContentCRC64 
     * @param encryptionKey 
     * @param encryptionKeySha256 
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
    public Mono<Void> downloadAsync(String snapshot, Integer timeout, String range, String leaseId, Boolean rangeGetContentMD5, Boolean rangeGetContentCRC64, String encryptionKey, String encryptionKeySha256, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String ifMatch, String ifNoneMatch, String requestId) {
        return downloadWithResponseAsync(snapshot, timeout, range, leaseId, rangeGetContentMD5, rangeGetContentCRC64, encryptionKey, encryptionKeySha256, ifModifiedSince, ifUnmodifiedSince, ifMatch, ifNoneMatch, requestId)
            .flatMap((BlobsDownloadResponse res) -> Mono.empty());
    }

    /**
     * The Download operation reads or downloads a blob from the system, including its metadata and properties. You can also call Download to read a snapshot.
     * 
     * @param snapshot 
     * @param timeout 
     * @param range 
     * @param leaseId 
     * @param rangeGetContentMD5 
     * @param rangeGetContentCRC64 
     * @param encryptionKey 
     * @param encryptionKeySha256 
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
    public void download(String snapshot, Integer timeout, String range, String leaseId, Boolean rangeGetContentMD5, Boolean rangeGetContentCRC64, String encryptionKey, String encryptionKeySha256, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String ifMatch, String ifNoneMatch, String requestId) {
        downloadAsync(snapshot, timeout, range, leaseId, rangeGetContentMD5, rangeGetContentCRC64, encryptionKey, encryptionKeySha256, ifModifiedSince, ifUnmodifiedSince, ifMatch, ifNoneMatch, requestId).block();
    }

    /**
     * The Get Properties operation returns all user-defined metadata, standard HTTP properties, and system properties for the blob. It does not return the content of the blob.
     * 
     * @param snapshot 
     * @param timeout 
     * @param leaseId 
     * @param encryptionKey 
     * @param encryptionKeySha256 
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
    public Mono<BlobsGetPropertiesResponse> getPropertiesWithResponseAsync(String snapshot, Integer timeout, String leaseId, String encryptionKey, String encryptionKeySha256, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String ifMatch, String ifNoneMatch, String requestId) {
        if (this.client.getUrl() == null) {
            throw new IllegalArgumentException("Parameter this.client.getUrl() is required and cannot be null.");
        }
        final String encryptionAlgorithm = "AES256";
        DateTimeRfc1123 ifModifiedSinceConverted = ifModifiedSince == null ? null : new DateTimeRfc1123(ifModifiedSince);
        DateTimeRfc1123 ifUnmodifiedSinceConverted = ifUnmodifiedSince == null ? null : new DateTimeRfc1123(ifUnmodifiedSince);
        return service.getProperties(this.client.getUrl(), snapshot, timeout, leaseId, encryptionKey, encryptionKeySha256, encryptionAlgorithm, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, ifMatch, ifNoneMatch, this.client.getVersion(), requestId);
    }

    /**
     * The Get Properties operation returns all user-defined metadata, standard HTTP properties, and system properties for the blob. It does not return the content of the blob.
     * 
     * @param snapshot 
     * @param timeout 
     * @param leaseId 
     * @param encryptionKey 
     * @param encryptionKeySha256 
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
    public Mono<Void> getPropertiesAsync(String snapshot, Integer timeout, String leaseId, String encryptionKey, String encryptionKeySha256, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String ifMatch, String ifNoneMatch, String requestId) {
        return getPropertiesWithResponseAsync(snapshot, timeout, leaseId, encryptionKey, encryptionKeySha256, ifModifiedSince, ifUnmodifiedSince, ifMatch, ifNoneMatch, requestId)
            .flatMap((BlobsGetPropertiesResponse res) -> Mono.empty());
    }

    /**
     * The Get Properties operation returns all user-defined metadata, standard HTTP properties, and system properties for the blob. It does not return the content of the blob.
     * 
     * @param snapshot 
     * @param timeout 
     * @param leaseId 
     * @param encryptionKey 
     * @param encryptionKeySha256 
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
    public void getProperties(String snapshot, Integer timeout, String leaseId, String encryptionKey, String encryptionKeySha256, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String ifMatch, String ifNoneMatch, String requestId) {
        getPropertiesAsync(snapshot, timeout, leaseId, encryptionKey, encryptionKeySha256, ifModifiedSince, ifUnmodifiedSince, ifMatch, ifNoneMatch, requestId).block();
    }

    /**
     * If the storage account's soft delete feature is disabled then, when a blob is deleted, it is permanently removed from the storage account. If the storage account's soft delete feature is enabled, then, when a blob is deleted, it is marked for deletion and becomes inaccessible immediately. However, the blob service retains the blob or snapshot for the number of days specified by the DeleteRetentionPolicy section of [Storage service properties] (Set-Blob-Service-Properties.md). After the specified number of days has passed, the blob's data is permanently removed from the storage account. Note that you continue to be charged for the soft-deleted blob's storage until it is permanently removed. Use the List Blobs API and specify the "include=deleted" query parameter to discover which blobs and snapshots have been soft deleted. You can then use the Undelete Blob API to restore a soft-deleted blob. All other operations on a soft-deleted blob or snapshot causes the service to return an HTTP status code of 404 (ResourceNotFound).
     * 
     * @param snapshot 
     * @param timeout 
     * @param leaseId 
     * @param deleteSnapshots 
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
    public Mono<BlobsDeleteResponse> deleteWithResponseAsync(String snapshot, Integer timeout, String leaseId, DeleteSnapshotsOptionType deleteSnapshots, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String ifMatch, String ifNoneMatch, String requestId) {
        if (this.client.getUrl() == null) {
            throw new IllegalArgumentException("Parameter this.client.getUrl() is required and cannot be null.");
        }
        DateTimeRfc1123 ifModifiedSinceConverted = ifModifiedSince == null ? null : new DateTimeRfc1123(ifModifiedSince);
        DateTimeRfc1123 ifUnmodifiedSinceConverted = ifUnmodifiedSince == null ? null : new DateTimeRfc1123(ifUnmodifiedSince);
        return service.delete(this.client.getUrl(), snapshot, timeout, leaseId, deleteSnapshots, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, ifMatch, ifNoneMatch, this.client.getVersion(), requestId);
    }

    /**
     * If the storage account's soft delete feature is disabled then, when a blob is deleted, it is permanently removed from the storage account. If the storage account's soft delete feature is enabled, then, when a blob is deleted, it is marked for deletion and becomes inaccessible immediately. However, the blob service retains the blob or snapshot for the number of days specified by the DeleteRetentionPolicy section of [Storage service properties] (Set-Blob-Service-Properties.md). After the specified number of days has passed, the blob's data is permanently removed from the storage account. Note that you continue to be charged for the soft-deleted blob's storage until it is permanently removed. Use the List Blobs API and specify the "include=deleted" query parameter to discover which blobs and snapshots have been soft deleted. You can then use the Undelete Blob API to restore a soft-deleted blob. All other operations on a soft-deleted blob or snapshot causes the service to return an HTTP status code of 404 (ResourceNotFound).
     * 
     * @param snapshot 
     * @param timeout 
     * @param leaseId 
     * @param deleteSnapshots 
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
    public Mono<Void> deleteAsync(String snapshot, Integer timeout, String leaseId, DeleteSnapshotsOptionType deleteSnapshots, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String ifMatch, String ifNoneMatch, String requestId) {
        return deleteWithResponseAsync(snapshot, timeout, leaseId, deleteSnapshots, ifModifiedSince, ifUnmodifiedSince, ifMatch, ifNoneMatch, requestId)
            .flatMap((BlobsDeleteResponse res) -> Mono.empty());
    }

    /**
     * If the storage account's soft delete feature is disabled then, when a blob is deleted, it is permanently removed from the storage account. If the storage account's soft delete feature is enabled, then, when a blob is deleted, it is marked for deletion and becomes inaccessible immediately. However, the blob service retains the blob or snapshot for the number of days specified by the DeleteRetentionPolicy section of [Storage service properties] (Set-Blob-Service-Properties.md). After the specified number of days has passed, the blob's data is permanently removed from the storage account. Note that you continue to be charged for the soft-deleted blob's storage until it is permanently removed. Use the List Blobs API and specify the "include=deleted" query parameter to discover which blobs and snapshots have been soft deleted. You can then use the Undelete Blob API to restore a soft-deleted blob. All other operations on a soft-deleted blob or snapshot causes the service to return an HTTP status code of 404 (ResourceNotFound).
     * 
     * @param snapshot 
     * @param timeout 
     * @param leaseId 
     * @param deleteSnapshots 
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
    public void delete(String snapshot, Integer timeout, String leaseId, DeleteSnapshotsOptionType deleteSnapshots, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String ifMatch, String ifNoneMatch, String requestId) {
        deleteAsync(snapshot, timeout, leaseId, deleteSnapshots, ifModifiedSince, ifUnmodifiedSince, ifMatch, ifNoneMatch, requestId).block();
    }

    /**
     * Set the owner, group, permissions, or access control list for a blob.
     * 
     * @param timeout 
     * @param leaseId 
     * @param owner 
     * @param group 
     * @param posixPermissions 
     * @param posixAcl 
     * @param ifMatch 
     * @param ifNoneMatch 
     * @param ifModifiedSince 
     * @param ifUnmodifiedSince 
     * @param requestId 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DataLakeStorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<BlobsSetAccessControlResponse> setAccessControlWithResponseAsync(Integer timeout, String leaseId, String owner, String group, String posixPermissions, String posixAcl, String ifMatch, String ifNoneMatch, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String requestId) {
        if (this.client.getUrl() == null) {
            throw new IllegalArgumentException("Parameter this.client.getUrl() is required and cannot be null.");
        }
        final String action = "setAccessControl";
        DateTimeRfc1123 ifModifiedSinceConverted = ifModifiedSince == null ? null : new DateTimeRfc1123(ifModifiedSince);
        DateTimeRfc1123 ifUnmodifiedSinceConverted = ifUnmodifiedSince == null ? null : new DateTimeRfc1123(ifUnmodifiedSince);
        return service.setAccessControl(this.client.getUrl(), action, timeout, leaseId, owner, group, posixPermissions, posixAcl, ifMatch, ifNoneMatch, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, requestId, this.client.getVersion());
    }

    /**
     * Set the owner, group, permissions, or access control list for a blob.
     * 
     * @param timeout 
     * @param leaseId 
     * @param owner 
     * @param group 
     * @param posixPermissions 
     * @param posixAcl 
     * @param ifMatch 
     * @param ifNoneMatch 
     * @param ifModifiedSince 
     * @param ifUnmodifiedSince 
     * @param requestId 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DataLakeStorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> setAccessControlAsync(Integer timeout, String leaseId, String owner, String group, String posixPermissions, String posixAcl, String ifMatch, String ifNoneMatch, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String requestId) {
        return setAccessControlWithResponseAsync(timeout, leaseId, owner, group, posixPermissions, posixAcl, ifMatch, ifNoneMatch, ifModifiedSince, ifUnmodifiedSince, requestId)
            .flatMap((BlobsSetAccessControlResponse res) -> Mono.empty());
    }

    /**
     * Set the owner, group, permissions, or access control list for a blob.
     * 
     * @param timeout 
     * @param leaseId 
     * @param owner 
     * @param group 
     * @param posixPermissions 
     * @param posixAcl 
     * @param ifMatch 
     * @param ifNoneMatch 
     * @param ifModifiedSince 
     * @param ifUnmodifiedSince 
     * @param requestId 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DataLakeStorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void setAccessControl(Integer timeout, String leaseId, String owner, String group, String posixPermissions, String posixAcl, String ifMatch, String ifNoneMatch, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String requestId) {
        setAccessControlAsync(timeout, leaseId, owner, group, posixPermissions, posixAcl, ifMatch, ifNoneMatch, ifModifiedSince, ifUnmodifiedSince, requestId).block();
    }

    /**
     * Get the owner, group, permissions, or access control list for a blob.
     * 
     * @param timeout 
     * @param upn 
     * @param leaseId 
     * @param ifMatch 
     * @param ifNoneMatch 
     * @param ifModifiedSince 
     * @param ifUnmodifiedSince 
     * @param requestId 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DataLakeStorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<BlobsGetAccessControlResponse> getAccessControlWithResponseAsync(Integer timeout, Boolean upn, String leaseId, String ifMatch, String ifNoneMatch, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String requestId) {
        if (this.client.getUrl() == null) {
            throw new IllegalArgumentException("Parameter this.client.getUrl() is required and cannot be null.");
        }
        final String action = "getAccessControl";
        DateTimeRfc1123 ifModifiedSinceConverted = ifModifiedSince == null ? null : new DateTimeRfc1123(ifModifiedSince);
        DateTimeRfc1123 ifUnmodifiedSinceConverted = ifUnmodifiedSince == null ? null : new DateTimeRfc1123(ifUnmodifiedSince);
        return service.getAccessControl(this.client.getUrl(), action, timeout, upn, leaseId, ifMatch, ifNoneMatch, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, requestId, this.client.getVersion());
    }

    /**
     * Get the owner, group, permissions, or access control list for a blob.
     * 
     * @param timeout 
     * @param upn 
     * @param leaseId 
     * @param ifMatch 
     * @param ifNoneMatch 
     * @param ifModifiedSince 
     * @param ifUnmodifiedSince 
     * @param requestId 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DataLakeStorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> getAccessControlAsync(Integer timeout, Boolean upn, String leaseId, String ifMatch, String ifNoneMatch, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String requestId) {
        return getAccessControlWithResponseAsync(timeout, upn, leaseId, ifMatch, ifNoneMatch, ifModifiedSince, ifUnmodifiedSince, requestId)
            .flatMap((BlobsGetAccessControlResponse res) -> Mono.empty());
    }

    /**
     * Get the owner, group, permissions, or access control list for a blob.
     * 
     * @param timeout 
     * @param upn 
     * @param leaseId 
     * @param ifMatch 
     * @param ifNoneMatch 
     * @param ifModifiedSince 
     * @param ifUnmodifiedSince 
     * @param requestId 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DataLakeStorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void getAccessControl(Integer timeout, Boolean upn, String leaseId, String ifMatch, String ifNoneMatch, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String requestId) {
        getAccessControlAsync(timeout, upn, leaseId, ifMatch, ifNoneMatch, ifModifiedSince, ifUnmodifiedSince, requestId).block();
    }

    /**
     * Rename a blob/file.  By default, the destination is overwritten and if the destination already exists and has a lease the lease is broken.  This operation supports conditional HTTP requests.  For more information, see [Specifying Conditional Headers for Blob Service Operations](https://docs.microsoft.com/en-us/rest/api/storageservices/specifying-conditional-headers-for-blob-service-operations).  To fail if the destination already exists, use a conditional request with If-None-Match: "*".
     * 
     * @param renameSource 
     * @param timeout 
     * @param directoryProperties 
     * @param posixPermissions 
     * @param posixUmask 
     * @param cacheControl 
     * @param contentType 
     * @param contentEncoding 
     * @param contentLanguage 
     * @param contentDisposition 
     * @param leaseId 
     * @param sourceLeaseId 
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
     * @throws DataLakeStorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<BlobsRenameResponse> renameWithResponseAsync(String renameSource, Integer timeout, String directoryProperties, String posixPermissions, String posixUmask, String cacheControl, String contentType, String contentEncoding, String contentLanguage, String contentDisposition, String leaseId, String sourceLeaseId, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String ifMatch, String ifNoneMatch, OffsetDateTime sourceIfModifiedSince, OffsetDateTime sourceIfUnmodifiedSince, String sourceIfMatch, String sourceIfNoneMatch, String requestId) {
        if (this.client.getUrl() == null) {
            throw new IllegalArgumentException("Parameter this.client.getUrl() is required and cannot be null.");
        }
        if (renameSource == null) {
            throw new IllegalArgumentException("Parameter renameSource is required and cannot be null.");
        }
        DateTimeRfc1123 ifModifiedSinceConverted = ifModifiedSince == null ? null : new DateTimeRfc1123(ifModifiedSince);
        DateTimeRfc1123 ifUnmodifiedSinceConverted = ifUnmodifiedSince == null ? null : new DateTimeRfc1123(ifUnmodifiedSince);
        DateTimeRfc1123 sourceIfModifiedSinceConverted = sourceIfModifiedSince == null ? null : new DateTimeRfc1123(sourceIfModifiedSince);
        DateTimeRfc1123 sourceIfUnmodifiedSinceConverted = sourceIfUnmodifiedSince == null ? null : new DateTimeRfc1123(sourceIfUnmodifiedSince);
        return service.rename(this.client.getUrl(), timeout, this.client.getPathRenameMode(), renameSource, directoryProperties, posixPermissions, posixUmask, cacheControl, contentType, contentEncoding, contentLanguage, contentDisposition, leaseId, sourceLeaseId, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, ifMatch, ifNoneMatch, sourceIfModifiedSinceConverted, sourceIfUnmodifiedSinceConverted, sourceIfMatch, sourceIfNoneMatch, this.client.getVersion(), requestId);
    }

    /**
     * Rename a blob/file.  By default, the destination is overwritten and if the destination already exists and has a lease the lease is broken.  This operation supports conditional HTTP requests.  For more information, see [Specifying Conditional Headers for Blob Service Operations](https://docs.microsoft.com/en-us/rest/api/storageservices/specifying-conditional-headers-for-blob-service-operations).  To fail if the destination already exists, use a conditional request with If-None-Match: "*".
     * 
     * @param renameSource 
     * @param timeout 
     * @param directoryProperties 
     * @param posixPermissions 
     * @param posixUmask 
     * @param cacheControl 
     * @param contentType 
     * @param contentEncoding 
     * @param contentLanguage 
     * @param contentDisposition 
     * @param leaseId 
     * @param sourceLeaseId 
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
     * @throws DataLakeStorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> renameAsync(String renameSource, Integer timeout, String directoryProperties, String posixPermissions, String posixUmask, String cacheControl, String contentType, String contentEncoding, String contentLanguage, String contentDisposition, String leaseId, String sourceLeaseId, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String ifMatch, String ifNoneMatch, OffsetDateTime sourceIfModifiedSince, OffsetDateTime sourceIfUnmodifiedSince, String sourceIfMatch, String sourceIfNoneMatch, String requestId) {
        return renameWithResponseAsync(renameSource, timeout, directoryProperties, posixPermissions, posixUmask, cacheControl, contentType, contentEncoding, contentLanguage, contentDisposition, leaseId, sourceLeaseId, ifModifiedSince, ifUnmodifiedSince, ifMatch, ifNoneMatch, sourceIfModifiedSince, sourceIfUnmodifiedSince, sourceIfMatch, sourceIfNoneMatch, requestId)
            .flatMap((BlobsRenameResponse res) -> Mono.empty());
    }

    /**
     * Rename a blob/file.  By default, the destination is overwritten and if the destination already exists and has a lease the lease is broken.  This operation supports conditional HTTP requests.  For more information, see [Specifying Conditional Headers for Blob Service Operations](https://docs.microsoft.com/en-us/rest/api/storageservices/specifying-conditional-headers-for-blob-service-operations).  To fail if the destination already exists, use a conditional request with If-None-Match: "*".
     * 
     * @param renameSource 
     * @param timeout 
     * @param directoryProperties 
     * @param posixPermissions 
     * @param posixUmask 
     * @param cacheControl 
     * @param contentType 
     * @param contentEncoding 
     * @param contentLanguage 
     * @param contentDisposition 
     * @param leaseId 
     * @param sourceLeaseId 
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
     * @throws DataLakeStorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void rename(String renameSource, Integer timeout, String directoryProperties, String posixPermissions, String posixUmask, String cacheControl, String contentType, String contentEncoding, String contentLanguage, String contentDisposition, String leaseId, String sourceLeaseId, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String ifMatch, String ifNoneMatch, OffsetDateTime sourceIfModifiedSince, OffsetDateTime sourceIfUnmodifiedSince, String sourceIfMatch, String sourceIfNoneMatch, String requestId) {
        renameAsync(renameSource, timeout, directoryProperties, posixPermissions, posixUmask, cacheControl, contentType, contentEncoding, contentLanguage, contentDisposition, leaseId, sourceLeaseId, ifModifiedSince, ifUnmodifiedSince, ifMatch, ifNoneMatch, sourceIfModifiedSince, sourceIfUnmodifiedSince, sourceIfMatch, sourceIfNoneMatch, requestId).block();
    }

    /**
     * Undelete a blob that was previously soft deleted.
     * 
     * @param timeout 
     * @param requestId 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<BlobsUndeleteResponse> undeleteWithResponseAsync(Integer timeout, String requestId) {
        if (this.client.getUrl() == null) {
            throw new IllegalArgumentException("Parameter this.client.getUrl() is required and cannot be null.");
        }
        final String comp = "undelete";
        return service.undelete(this.client.getUrl(), comp, timeout, this.client.getVersion(), requestId);
    }

    /**
     * Undelete a blob that was previously soft deleted.
     * 
     * @param timeout 
     * @param requestId 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> undeleteAsync(Integer timeout, String requestId) {
        return undeleteWithResponseAsync(timeout, requestId)
            .flatMap((BlobsUndeleteResponse res) -> Mono.empty());
    }

    /**
     * Undelete a blob that was previously soft deleted.
     * 
     * @param timeout 
     * @param requestId 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void undelete(Integer timeout, String requestId) {
        undeleteAsync(timeout, requestId).block();
    }

    /**
     * The Set HTTP Headers operation sets system properties on the blob.
     * 
     * @param timeout 
     * @param blobCacheControl 
     * @param blobContentType 
     * @param blobContentMD5 
     * @param blobContentEncoding 
     * @param blobContentLanguage 
     * @param leaseId 
     * @param ifModifiedSince 
     * @param ifUnmodifiedSince 
     * @param ifMatch 
     * @param ifNoneMatch 
     * @param blobContentDisposition 
     * @param requestId 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<BlobsSetHttpHeadersResponse> setHttpHeadersWithResponseAsync(Integer timeout, String blobCacheControl, String blobContentType, byte[] blobContentMD5, String blobContentEncoding, String blobContentLanguage, String leaseId, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String ifMatch, String ifNoneMatch, String blobContentDisposition, String requestId) {
        if (this.client.getUrl() == null) {
            throw new IllegalArgumentException("Parameter this.client.getUrl() is required and cannot be null.");
        }
        final String comp = "properties";
        String blobContentMD5Converted = Base64Util.encodeToString(blobContentMD5);
        DateTimeRfc1123 ifModifiedSinceConverted = ifModifiedSince == null ? null : new DateTimeRfc1123(ifModifiedSince);
        DateTimeRfc1123 ifUnmodifiedSinceConverted = ifUnmodifiedSince == null ? null : new DateTimeRfc1123(ifUnmodifiedSince);
        return service.setHttpHeaders(this.client.getUrl(), comp, timeout, blobCacheControl, blobContentType, blobContentMD5Converted, blobContentEncoding, blobContentLanguage, leaseId, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, ifMatch, ifNoneMatch, blobContentDisposition, this.client.getVersion(), requestId);
    }

    /**
     * The Set HTTP Headers operation sets system properties on the blob.
     * 
     * @param timeout 
     * @param blobCacheControl 
     * @param blobContentType 
     * @param blobContentMD5 
     * @param blobContentEncoding 
     * @param blobContentLanguage 
     * @param leaseId 
     * @param ifModifiedSince 
     * @param ifUnmodifiedSince 
     * @param ifMatch 
     * @param ifNoneMatch 
     * @param blobContentDisposition 
     * @param requestId 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> setHttpHeadersAsync(Integer timeout, String blobCacheControl, String blobContentType, byte[] blobContentMD5, String blobContentEncoding, String blobContentLanguage, String leaseId, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String ifMatch, String ifNoneMatch, String blobContentDisposition, String requestId) {
        return setHttpHeadersWithResponseAsync(timeout, blobCacheControl, blobContentType, blobContentMD5, blobContentEncoding, blobContentLanguage, leaseId, ifModifiedSince, ifUnmodifiedSince, ifMatch, ifNoneMatch, blobContentDisposition, requestId)
            .flatMap((BlobsSetHttpHeadersResponse res) -> Mono.empty());
    }

    /**
     * The Set HTTP Headers operation sets system properties on the blob.
     * 
     * @param timeout 
     * @param blobCacheControl 
     * @param blobContentType 
     * @param blobContentMD5 
     * @param blobContentEncoding 
     * @param blobContentLanguage 
     * @param leaseId 
     * @param ifModifiedSince 
     * @param ifUnmodifiedSince 
     * @param ifMatch 
     * @param ifNoneMatch 
     * @param blobContentDisposition 
     * @param requestId 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void setHttpHeaders(Integer timeout, String blobCacheControl, String blobContentType, byte[] blobContentMD5, String blobContentEncoding, String blobContentLanguage, String leaseId, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String ifMatch, String ifNoneMatch, String blobContentDisposition, String requestId) {
        setHttpHeadersAsync(timeout, blobCacheControl, blobContentType, blobContentMD5, blobContentEncoding, blobContentLanguage, leaseId, ifModifiedSince, ifUnmodifiedSince, ifMatch, ifNoneMatch, blobContentDisposition, requestId).block();
    }

    /**
     * The Set Blob Metadata operation sets user-defined metadata for the specified blob as one or more name-value pairs.
     * 
     * @param timeout 
     * @param metadata 
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
    public Mono<BlobsSetMetadataResponse> setMetadataWithResponseAsync(Integer timeout, String metadata, String leaseId, String encryptionKey, String encryptionKeySha256, String encryptionScope, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String ifMatch, String ifNoneMatch, String requestId) {
        if (this.client.getUrl() == null) {
            throw new IllegalArgumentException("Parameter this.client.getUrl() is required and cannot be null.");
        }
        final String comp = "metadata";
        final String encryptionAlgorithm = "AES256";
        DateTimeRfc1123 ifModifiedSinceConverted = ifModifiedSince == null ? null : new DateTimeRfc1123(ifModifiedSince);
        DateTimeRfc1123 ifUnmodifiedSinceConverted = ifUnmodifiedSince == null ? null : new DateTimeRfc1123(ifUnmodifiedSince);
        return service.setMetadata(this.client.getUrl(), comp, timeout, metadata, leaseId, encryptionKey, encryptionKeySha256, encryptionAlgorithm, encryptionScope, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, ifMatch, ifNoneMatch, this.client.getVersion(), requestId);
    }

    /**
     * The Set Blob Metadata operation sets user-defined metadata for the specified blob as one or more name-value pairs.
     * 
     * @param timeout 
     * @param metadata 
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
    public Mono<Void> setMetadataAsync(Integer timeout, String metadata, String leaseId, String encryptionKey, String encryptionKeySha256, String encryptionScope, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String ifMatch, String ifNoneMatch, String requestId) {
        return setMetadataWithResponseAsync(timeout, metadata, leaseId, encryptionKey, encryptionKeySha256, encryptionScope, ifModifiedSince, ifUnmodifiedSince, ifMatch, ifNoneMatch, requestId)
            .flatMap((BlobsSetMetadataResponse res) -> Mono.empty());
    }

    /**
     * The Set Blob Metadata operation sets user-defined metadata for the specified blob as one or more name-value pairs.
     * 
     * @param timeout 
     * @param metadata 
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
    public void setMetadata(Integer timeout, String metadata, String leaseId, String encryptionKey, String encryptionKeySha256, String encryptionScope, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String ifMatch, String ifNoneMatch, String requestId) {
        setMetadataAsync(timeout, metadata, leaseId, encryptionKey, encryptionKeySha256, encryptionScope, ifModifiedSince, ifUnmodifiedSince, ifMatch, ifNoneMatch, requestId).block();
    }

    /**
     * [Update] The Lease Blob operation establishes and manages a lock on a blob for write and delete operations.
     * 
     * @param timeout 
     * @param duration 
     * @param proposedLeaseId 
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
    public Mono<BlobsAcquireLeaseResponse> acquireLeaseWithResponseAsync(Integer timeout, Integer duration, String proposedLeaseId, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String ifMatch, String ifNoneMatch, String requestId) {
        if (this.client.getUrl() == null) {
            throw new IllegalArgumentException("Parameter this.client.getUrl() is required and cannot be null.");
        }
        final String comp = "lease";
        final String action = "acquire";
        DateTimeRfc1123 ifModifiedSinceConverted = ifModifiedSince == null ? null : new DateTimeRfc1123(ifModifiedSince);
        DateTimeRfc1123 ifUnmodifiedSinceConverted = ifUnmodifiedSince == null ? null : new DateTimeRfc1123(ifUnmodifiedSince);
        return service.acquireLease(this.client.getUrl(), comp, action, timeout, duration, proposedLeaseId, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, ifMatch, ifNoneMatch, this.client.getVersion(), requestId);
    }

    /**
     * [Update] The Lease Blob operation establishes and manages a lock on a blob for write and delete operations.
     * 
     * @param timeout 
     * @param duration 
     * @param proposedLeaseId 
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
    public Mono<Void> acquireLeaseAsync(Integer timeout, Integer duration, String proposedLeaseId, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String ifMatch, String ifNoneMatch, String requestId) {
        return acquireLeaseWithResponseAsync(timeout, duration, proposedLeaseId, ifModifiedSince, ifUnmodifiedSince, ifMatch, ifNoneMatch, requestId)
            .flatMap((BlobsAcquireLeaseResponse res) -> Mono.empty());
    }

    /**
     * [Update] The Lease Blob operation establishes and manages a lock on a blob for write and delete operations.
     * 
     * @param timeout 
     * @param duration 
     * @param proposedLeaseId 
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
    public void acquireLease(Integer timeout, Integer duration, String proposedLeaseId, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String ifMatch, String ifNoneMatch, String requestId) {
        acquireLeaseAsync(timeout, duration, proposedLeaseId, ifModifiedSince, ifUnmodifiedSince, ifMatch, ifNoneMatch, requestId).block();
    }

    /**
     * [Update] The Lease Blob operation establishes and manages a lock on a blob for write and delete operations.
     * 
     * @param leaseId 
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
    public Mono<BlobsReleaseLeaseResponse> releaseLeaseWithResponseAsync(String leaseId, Integer timeout, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String ifMatch, String ifNoneMatch, String requestId) {
        if (this.client.getUrl() == null) {
            throw new IllegalArgumentException("Parameter this.client.getUrl() is required and cannot be null.");
        }
        if (leaseId == null) {
            throw new IllegalArgumentException("Parameter leaseId is required and cannot be null.");
        }
        final String comp = "lease";
        final String action = "release";
        DateTimeRfc1123 ifModifiedSinceConverted = ifModifiedSince == null ? null : new DateTimeRfc1123(ifModifiedSince);
        DateTimeRfc1123 ifUnmodifiedSinceConverted = ifUnmodifiedSince == null ? null : new DateTimeRfc1123(ifUnmodifiedSince);
        return service.releaseLease(this.client.getUrl(), comp, action, timeout, leaseId, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, ifMatch, ifNoneMatch, this.client.getVersion(), requestId);
    }

    /**
     * [Update] The Lease Blob operation establishes and manages a lock on a blob for write and delete operations.
     * 
     * @param leaseId 
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
    public Mono<Void> releaseLeaseAsync(String leaseId, Integer timeout, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String ifMatch, String ifNoneMatch, String requestId) {
        return releaseLeaseWithResponseAsync(leaseId, timeout, ifModifiedSince, ifUnmodifiedSince, ifMatch, ifNoneMatch, requestId)
            .flatMap((BlobsReleaseLeaseResponse res) -> Mono.empty());
    }

    /**
     * [Update] The Lease Blob operation establishes and manages a lock on a blob for write and delete operations.
     * 
     * @param leaseId 
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
    public void releaseLease(String leaseId, Integer timeout, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String ifMatch, String ifNoneMatch, String requestId) {
        releaseLeaseAsync(leaseId, timeout, ifModifiedSince, ifUnmodifiedSince, ifMatch, ifNoneMatch, requestId).block();
    }

    /**
     * [Update] The Lease Blob operation establishes and manages a lock on a blob for write and delete operations.
     * 
     * @param leaseId 
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
    public Mono<BlobsRenewLeaseResponse> renewLeaseWithResponseAsync(String leaseId, Integer timeout, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String ifMatch, String ifNoneMatch, String requestId) {
        if (this.client.getUrl() == null) {
            throw new IllegalArgumentException("Parameter this.client.getUrl() is required and cannot be null.");
        }
        if (leaseId == null) {
            throw new IllegalArgumentException("Parameter leaseId is required and cannot be null.");
        }
        final String comp = "lease";
        final String action = "renew";
        DateTimeRfc1123 ifModifiedSinceConverted = ifModifiedSince == null ? null : new DateTimeRfc1123(ifModifiedSince);
        DateTimeRfc1123 ifUnmodifiedSinceConverted = ifUnmodifiedSince == null ? null : new DateTimeRfc1123(ifUnmodifiedSince);
        return service.renewLease(this.client.getUrl(), comp, action, timeout, leaseId, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, ifMatch, ifNoneMatch, this.client.getVersion(), requestId);
    }

    /**
     * [Update] The Lease Blob operation establishes and manages a lock on a blob for write and delete operations.
     * 
     * @param leaseId 
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
    public Mono<Void> renewLeaseAsync(String leaseId, Integer timeout, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String ifMatch, String ifNoneMatch, String requestId) {
        return renewLeaseWithResponseAsync(leaseId, timeout, ifModifiedSince, ifUnmodifiedSince, ifMatch, ifNoneMatch, requestId)
            .flatMap((BlobsRenewLeaseResponse res) -> Mono.empty());
    }

    /**
     * [Update] The Lease Blob operation establishes and manages a lock on a blob for write and delete operations.
     * 
     * @param leaseId 
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
    public void renewLease(String leaseId, Integer timeout, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String ifMatch, String ifNoneMatch, String requestId) {
        renewLeaseAsync(leaseId, timeout, ifModifiedSince, ifUnmodifiedSince, ifMatch, ifNoneMatch, requestId).block();
    }

    /**
     * [Update] The Lease Blob operation establishes and manages a lock on a blob for write and delete operations.
     * 
     * @param leaseId 
     * @param proposedLeaseId 
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
    public Mono<BlobsChangeLeaseResponse> changeLeaseWithResponseAsync(String leaseId, String proposedLeaseId, Integer timeout, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String ifMatch, String ifNoneMatch, String requestId) {
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
        final String action = "change";
        DateTimeRfc1123 ifModifiedSinceConverted = ifModifiedSince == null ? null : new DateTimeRfc1123(ifModifiedSince);
        DateTimeRfc1123 ifUnmodifiedSinceConverted = ifUnmodifiedSince == null ? null : new DateTimeRfc1123(ifUnmodifiedSince);
        return service.changeLease(this.client.getUrl(), comp, action, timeout, leaseId, proposedLeaseId, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, ifMatch, ifNoneMatch, this.client.getVersion(), requestId);
    }

    /**
     * [Update] The Lease Blob operation establishes and manages a lock on a blob for write and delete operations.
     * 
     * @param leaseId 
     * @param proposedLeaseId 
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
    public Mono<Void> changeLeaseAsync(String leaseId, String proposedLeaseId, Integer timeout, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String ifMatch, String ifNoneMatch, String requestId) {
        return changeLeaseWithResponseAsync(leaseId, proposedLeaseId, timeout, ifModifiedSince, ifUnmodifiedSince, ifMatch, ifNoneMatch, requestId)
            .flatMap((BlobsChangeLeaseResponse res) -> Mono.empty());
    }

    /**
     * [Update] The Lease Blob operation establishes and manages a lock on a blob for write and delete operations.
     * 
     * @param leaseId 
     * @param proposedLeaseId 
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
    public void changeLease(String leaseId, String proposedLeaseId, Integer timeout, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String ifMatch, String ifNoneMatch, String requestId) {
        changeLeaseAsync(leaseId, proposedLeaseId, timeout, ifModifiedSince, ifUnmodifiedSince, ifMatch, ifNoneMatch, requestId).block();
    }

    /**
     * [Update] The Lease Blob operation establishes and manages a lock on a blob for write and delete operations.
     * 
     * @param timeout 
     * @param breakPeriod 
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
    public Mono<BlobsBreakLeaseResponse> breakLeaseWithResponseAsync(Integer timeout, Integer breakPeriod, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String ifMatch, String ifNoneMatch, String requestId) {
        if (this.client.getUrl() == null) {
            throw new IllegalArgumentException("Parameter this.client.getUrl() is required and cannot be null.");
        }
        final String comp = "lease";
        final String action = "break";
        DateTimeRfc1123 ifModifiedSinceConverted = ifModifiedSince == null ? null : new DateTimeRfc1123(ifModifiedSince);
        DateTimeRfc1123 ifUnmodifiedSinceConverted = ifUnmodifiedSince == null ? null : new DateTimeRfc1123(ifUnmodifiedSince);
        return service.breakLease(this.client.getUrl(), comp, action, timeout, breakPeriod, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, ifMatch, ifNoneMatch, this.client.getVersion(), requestId);
    }

    /**
     * [Update] The Lease Blob operation establishes and manages a lock on a blob for write and delete operations.
     * 
     * @param timeout 
     * @param breakPeriod 
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
    public Mono<Void> breakLeaseAsync(Integer timeout, Integer breakPeriod, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String ifMatch, String ifNoneMatch, String requestId) {
        return breakLeaseWithResponseAsync(timeout, breakPeriod, ifModifiedSince, ifUnmodifiedSince, ifMatch, ifNoneMatch, requestId)
            .flatMap((BlobsBreakLeaseResponse res) -> Mono.empty());
    }

    /**
     * [Update] The Lease Blob operation establishes and manages a lock on a blob for write and delete operations.
     * 
     * @param timeout 
     * @param breakPeriod 
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
    public void breakLease(Integer timeout, Integer breakPeriod, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String ifMatch, String ifNoneMatch, String requestId) {
        breakLeaseAsync(timeout, breakPeriod, ifModifiedSince, ifUnmodifiedSince, ifMatch, ifNoneMatch, requestId).block();
    }

    /**
     * The Create Snapshot operation creates a read-only snapshot of a blob.
     * 
     * @param timeout 
     * @param metadata 
     * @param encryptionKey 
     * @param encryptionKeySha256 
     * @param encryptionScope 
     * @param ifModifiedSince 
     * @param ifUnmodifiedSince 
     * @param ifMatch 
     * @param ifNoneMatch 
     * @param leaseId 
     * @param requestId 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<BlobsCreateSnapshotResponse> createSnapshotWithResponseAsync(Integer timeout, String metadata, String encryptionKey, String encryptionKeySha256, String encryptionScope, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String ifMatch, String ifNoneMatch, String leaseId, String requestId) {
        if (this.client.getUrl() == null) {
            throw new IllegalArgumentException("Parameter this.client.getUrl() is required and cannot be null.");
        }
        final String comp = "snapshot";
        final String encryptionAlgorithm = "AES256";
        DateTimeRfc1123 ifModifiedSinceConverted = ifModifiedSince == null ? null : new DateTimeRfc1123(ifModifiedSince);
        DateTimeRfc1123 ifUnmodifiedSinceConverted = ifUnmodifiedSince == null ? null : new DateTimeRfc1123(ifUnmodifiedSince);
        return service.createSnapshot(this.client.getUrl(), comp, timeout, metadata, encryptionKey, encryptionKeySha256, encryptionAlgorithm, encryptionScope, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, ifMatch, ifNoneMatch, leaseId, this.client.getVersion(), requestId);
    }

    /**
     * The Create Snapshot operation creates a read-only snapshot of a blob.
     * 
     * @param timeout 
     * @param metadata 
     * @param encryptionKey 
     * @param encryptionKeySha256 
     * @param encryptionScope 
     * @param ifModifiedSince 
     * @param ifUnmodifiedSince 
     * @param ifMatch 
     * @param ifNoneMatch 
     * @param leaseId 
     * @param requestId 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> createSnapshotAsync(Integer timeout, String metadata, String encryptionKey, String encryptionKeySha256, String encryptionScope, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String ifMatch, String ifNoneMatch, String leaseId, String requestId) {
        return createSnapshotWithResponseAsync(timeout, metadata, encryptionKey, encryptionKeySha256, encryptionScope, ifModifiedSince, ifUnmodifiedSince, ifMatch, ifNoneMatch, leaseId, requestId)
            .flatMap((BlobsCreateSnapshotResponse res) -> Mono.empty());
    }

    /**
     * The Create Snapshot operation creates a read-only snapshot of a blob.
     * 
     * @param timeout 
     * @param metadata 
     * @param encryptionKey 
     * @param encryptionKeySha256 
     * @param encryptionScope 
     * @param ifModifiedSince 
     * @param ifUnmodifiedSince 
     * @param ifMatch 
     * @param ifNoneMatch 
     * @param leaseId 
     * @param requestId 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void createSnapshot(Integer timeout, String metadata, String encryptionKey, String encryptionKeySha256, String encryptionScope, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String ifMatch, String ifNoneMatch, String leaseId, String requestId) {
        createSnapshotAsync(timeout, metadata, encryptionKey, encryptionKeySha256, encryptionScope, ifModifiedSince, ifUnmodifiedSince, ifMatch, ifNoneMatch, leaseId, requestId).block();
    }

    /**
     * The Start Copy From URL operation copies a blob or an internet resource to a new blob.
     * 
     * @param copySource 
     * @param timeout 
     * @param metadata 
     * @param tier 
     * @param rehydratePriority 
     * @param sourceIfModifiedSince 
     * @param sourceIfUnmodifiedSince 
     * @param sourceIfMatch 
     * @param sourceIfNoneMatch 
     * @param ifModifiedSince 
     * @param ifUnmodifiedSince 
     * @param ifMatch 
     * @param ifNoneMatch 
     * @param leaseId 
     * @param requestId 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<BlobsStartCopyFromURLResponse> startCopyFromURLWithResponseAsync(URL copySource, Integer timeout, String metadata, AccessTier tier, RehydratePriority rehydratePriority, OffsetDateTime sourceIfModifiedSince, OffsetDateTime sourceIfUnmodifiedSince, String sourceIfMatch, String sourceIfNoneMatch, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String ifMatch, String ifNoneMatch, String leaseId, String requestId) {
        if (this.client.getUrl() == null) {
            throw new IllegalArgumentException("Parameter this.client.getUrl() is required and cannot be null.");
        }
        if (copySource == null) {
            throw new IllegalArgumentException("Parameter copySource is required and cannot be null.");
        }
        DateTimeRfc1123 sourceIfModifiedSinceConverted = sourceIfModifiedSince == null ? null : new DateTimeRfc1123(sourceIfModifiedSince);
        DateTimeRfc1123 sourceIfUnmodifiedSinceConverted = sourceIfUnmodifiedSince == null ? null : new DateTimeRfc1123(sourceIfUnmodifiedSince);
        DateTimeRfc1123 ifModifiedSinceConverted = ifModifiedSince == null ? null : new DateTimeRfc1123(ifModifiedSince);
        DateTimeRfc1123 ifUnmodifiedSinceConverted = ifUnmodifiedSince == null ? null : new DateTimeRfc1123(ifUnmodifiedSince);
        return service.startCopyFromURL(this.client.getUrl(), timeout, metadata, tier, rehydratePriority, sourceIfModifiedSinceConverted, sourceIfUnmodifiedSinceConverted, sourceIfMatch, sourceIfNoneMatch, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, ifMatch, ifNoneMatch, copySource, leaseId, this.client.getVersion(), requestId);
    }

    /**
     * The Start Copy From URL operation copies a blob or an internet resource to a new blob.
     * 
     * @param copySource 
     * @param timeout 
     * @param metadata 
     * @param tier 
     * @param rehydratePriority 
     * @param sourceIfModifiedSince 
     * @param sourceIfUnmodifiedSince 
     * @param sourceIfMatch 
     * @param sourceIfNoneMatch 
     * @param ifModifiedSince 
     * @param ifUnmodifiedSince 
     * @param ifMatch 
     * @param ifNoneMatch 
     * @param leaseId 
     * @param requestId 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> startCopyFromURLAsync(URL copySource, Integer timeout, String metadata, AccessTier tier, RehydratePriority rehydratePriority, OffsetDateTime sourceIfModifiedSince, OffsetDateTime sourceIfUnmodifiedSince, String sourceIfMatch, String sourceIfNoneMatch, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String ifMatch, String ifNoneMatch, String leaseId, String requestId) {
        return startCopyFromURLWithResponseAsync(copySource, timeout, metadata, tier, rehydratePriority, sourceIfModifiedSince, sourceIfUnmodifiedSince, sourceIfMatch, sourceIfNoneMatch, ifModifiedSince, ifUnmodifiedSince, ifMatch, ifNoneMatch, leaseId, requestId)
            .flatMap((BlobsStartCopyFromURLResponse res) -> Mono.empty());
    }

    /**
     * The Start Copy From URL operation copies a blob or an internet resource to a new blob.
     * 
     * @param copySource 
     * @param timeout 
     * @param metadata 
     * @param tier 
     * @param rehydratePriority 
     * @param sourceIfModifiedSince 
     * @param sourceIfUnmodifiedSince 
     * @param sourceIfMatch 
     * @param sourceIfNoneMatch 
     * @param ifModifiedSince 
     * @param ifUnmodifiedSince 
     * @param ifMatch 
     * @param ifNoneMatch 
     * @param leaseId 
     * @param requestId 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void startCopyFromURL(URL copySource, Integer timeout, String metadata, AccessTier tier, RehydratePriority rehydratePriority, OffsetDateTime sourceIfModifiedSince, OffsetDateTime sourceIfUnmodifiedSince, String sourceIfMatch, String sourceIfNoneMatch, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String ifMatch, String ifNoneMatch, String leaseId, String requestId) {
        startCopyFromURLAsync(copySource, timeout, metadata, tier, rehydratePriority, sourceIfModifiedSince, sourceIfUnmodifiedSince, sourceIfMatch, sourceIfNoneMatch, ifModifiedSince, ifUnmodifiedSince, ifMatch, ifNoneMatch, leaseId, requestId).block();
    }

    /**
     * The Copy From URL operation copies a blob or an internet resource to a new blob. It will not return a response until the copy is complete.
     * 
     * @param copySource 
     * @param timeout 
     * @param metadata 
     * @param tier 
     * @param sourceIfModifiedSince 
     * @param sourceIfUnmodifiedSince 
     * @param sourceIfMatch 
     * @param sourceIfNoneMatch 
     * @param ifModifiedSince 
     * @param ifUnmodifiedSince 
     * @param ifMatch 
     * @param ifNoneMatch 
     * @param leaseId 
     * @param requestId 
     * @param sourceContentMD5 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<BlobsCopyFromURLResponse> copyFromURLWithResponseAsync(URL copySource, Integer timeout, String metadata, AccessTier tier, OffsetDateTime sourceIfModifiedSince, OffsetDateTime sourceIfUnmodifiedSince, String sourceIfMatch, String sourceIfNoneMatch, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String ifMatch, String ifNoneMatch, String leaseId, String requestId, byte[] sourceContentMD5) {
        if (this.client.getUrl() == null) {
            throw new IllegalArgumentException("Parameter this.client.getUrl() is required and cannot be null.");
        }
        if (copySource == null) {
            throw new IllegalArgumentException("Parameter copySource is required and cannot be null.");
        }
        final String xMsRequiresSync = "true";
        DateTimeRfc1123 sourceIfModifiedSinceConverted = sourceIfModifiedSince == null ? null : new DateTimeRfc1123(sourceIfModifiedSince);
        DateTimeRfc1123 sourceIfUnmodifiedSinceConverted = sourceIfUnmodifiedSince == null ? null : new DateTimeRfc1123(sourceIfUnmodifiedSince);
        DateTimeRfc1123 ifModifiedSinceConverted = ifModifiedSince == null ? null : new DateTimeRfc1123(ifModifiedSince);
        DateTimeRfc1123 ifUnmodifiedSinceConverted = ifUnmodifiedSince == null ? null : new DateTimeRfc1123(ifUnmodifiedSince);
        String sourceContentMD5Converted = Base64Util.encodeToString(sourceContentMD5);
        return service.copyFromURL(this.client.getUrl(), xMsRequiresSync, timeout, metadata, tier, sourceIfModifiedSinceConverted, sourceIfUnmodifiedSinceConverted, sourceIfMatch, sourceIfNoneMatch, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, ifMatch, ifNoneMatch, copySource, leaseId, this.client.getVersion(), requestId, sourceContentMD5Converted);
    }

    /**
     * The Copy From URL operation copies a blob or an internet resource to a new blob. It will not return a response until the copy is complete.
     * 
     * @param copySource 
     * @param timeout 
     * @param metadata 
     * @param tier 
     * @param sourceIfModifiedSince 
     * @param sourceIfUnmodifiedSince 
     * @param sourceIfMatch 
     * @param sourceIfNoneMatch 
     * @param ifModifiedSince 
     * @param ifUnmodifiedSince 
     * @param ifMatch 
     * @param ifNoneMatch 
     * @param leaseId 
     * @param requestId 
     * @param sourceContentMD5 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> copyFromURLAsync(URL copySource, Integer timeout, String metadata, AccessTier tier, OffsetDateTime sourceIfModifiedSince, OffsetDateTime sourceIfUnmodifiedSince, String sourceIfMatch, String sourceIfNoneMatch, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String ifMatch, String ifNoneMatch, String leaseId, String requestId, byte[] sourceContentMD5) {
        return copyFromURLWithResponseAsync(copySource, timeout, metadata, tier, sourceIfModifiedSince, sourceIfUnmodifiedSince, sourceIfMatch, sourceIfNoneMatch, ifModifiedSince, ifUnmodifiedSince, ifMatch, ifNoneMatch, leaseId, requestId, sourceContentMD5)
            .flatMap((BlobsCopyFromURLResponse res) -> Mono.empty());
    }

    /**
     * The Copy From URL operation copies a blob or an internet resource to a new blob. It will not return a response until the copy is complete.
     * 
     * @param copySource 
     * @param timeout 
     * @param metadata 
     * @param tier 
     * @param sourceIfModifiedSince 
     * @param sourceIfUnmodifiedSince 
     * @param sourceIfMatch 
     * @param sourceIfNoneMatch 
     * @param ifModifiedSince 
     * @param ifUnmodifiedSince 
     * @param ifMatch 
     * @param ifNoneMatch 
     * @param leaseId 
     * @param requestId 
     * @param sourceContentMD5 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void copyFromURL(URL copySource, Integer timeout, String metadata, AccessTier tier, OffsetDateTime sourceIfModifiedSince, OffsetDateTime sourceIfUnmodifiedSince, String sourceIfMatch, String sourceIfNoneMatch, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String ifMatch, String ifNoneMatch, String leaseId, String requestId, byte[] sourceContentMD5) {
        copyFromURLAsync(copySource, timeout, metadata, tier, sourceIfModifiedSince, sourceIfUnmodifiedSince, sourceIfMatch, sourceIfNoneMatch, ifModifiedSince, ifUnmodifiedSince, ifMatch, ifNoneMatch, leaseId, requestId, sourceContentMD5).block();
    }

    /**
     * The Abort Copy From URL operation aborts a pending Copy From URL operation, and leaves a destination blob with zero length and full metadata.
     * 
     * @param copyId 
     * @param timeout 
     * @param leaseId 
     * @param requestId 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<BlobsAbortCopyFromURLResponse> abortCopyFromURLWithResponseAsync(String copyId, Integer timeout, String leaseId, String requestId) {
        if (this.client.getUrl() == null) {
            throw new IllegalArgumentException("Parameter this.client.getUrl() is required and cannot be null.");
        }
        if (copyId == null) {
            throw new IllegalArgumentException("Parameter copyId is required and cannot be null.");
        }
        final String comp = "copy";
        final String copyActionAbortConstant = "abort";
        return service.abortCopyFromURL(this.client.getUrl(), comp, copyActionAbortConstant, copyId, timeout, leaseId, this.client.getVersion(), requestId);
    }

    /**
     * The Abort Copy From URL operation aborts a pending Copy From URL operation, and leaves a destination blob with zero length and full metadata.
     * 
     * @param copyId 
     * @param timeout 
     * @param leaseId 
     * @param requestId 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> abortCopyFromURLAsync(String copyId, Integer timeout, String leaseId, String requestId) {
        return abortCopyFromURLWithResponseAsync(copyId, timeout, leaseId, requestId)
            .flatMap((BlobsAbortCopyFromURLResponse res) -> Mono.empty());
    }

    /**
     * The Abort Copy From URL operation aborts a pending Copy From URL operation, and leaves a destination blob with zero length and full metadata.
     * 
     * @param copyId 
     * @param timeout 
     * @param leaseId 
     * @param requestId 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void abortCopyFromURL(String copyId, Integer timeout, String leaseId, String requestId) {
        abortCopyFromURLAsync(copyId, timeout, leaseId, requestId).block();
    }

    /**
     * The Set Tier operation sets the tier on a blob. The operation is allowed on a page blob in a premium storage account and on a block blob in a blob storage account (locally redundant storage only). A premium page blob's tier determines the allowed size, IOPS, and bandwidth of the blob. A block blob's tier determines Hot/Cool/Archive storage type. This operation does not update the blob's ETag.
     * 
     * @param tier 
     * @param timeout 
     * @param rehydratePriority 
     * @param requestId 
     * @param leaseId 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<BlobsSetTierResponse> setTierWithResponseAsync(AccessTier tier, Integer timeout, RehydratePriority rehydratePriority, String requestId, String leaseId) {
        if (this.client.getUrl() == null) {
            throw new IllegalArgumentException("Parameter this.client.getUrl() is required and cannot be null.");
        }
        if (tier == null) {
            throw new IllegalArgumentException("Parameter tier is required and cannot be null.");
        }
        final String comp = "tier";
        return service.setTier(this.client.getUrl(), comp, timeout, tier, rehydratePriority, this.client.getVersion(), requestId, leaseId);
    }

    /**
     * The Set Tier operation sets the tier on a blob. The operation is allowed on a page blob in a premium storage account and on a block blob in a blob storage account (locally redundant storage only). A premium page blob's tier determines the allowed size, IOPS, and bandwidth of the blob. A block blob's tier determines Hot/Cool/Archive storage type. This operation does not update the blob's ETag.
     * 
     * @param tier 
     * @param timeout 
     * @param rehydratePriority 
     * @param requestId 
     * @param leaseId 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> setTierAsync(AccessTier tier, Integer timeout, RehydratePriority rehydratePriority, String requestId, String leaseId) {
        return setTierWithResponseAsync(tier, timeout, rehydratePriority, requestId, leaseId)
            .flatMap((BlobsSetTierResponse res) -> Mono.empty());
    }

    /**
     * The Set Tier operation sets the tier on a blob. The operation is allowed on a page blob in a premium storage account and on a block blob in a blob storage account (locally redundant storage only). A premium page blob's tier determines the allowed size, IOPS, and bandwidth of the blob. A block blob's tier determines Hot/Cool/Archive storage type. This operation does not update the blob's ETag.
     * 
     * @param tier 
     * @param timeout 
     * @param rehydratePriority 
     * @param requestId 
     * @param leaseId 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void setTier(AccessTier tier, Integer timeout, RehydratePriority rehydratePriority, String requestId, String leaseId) {
        setTierAsync(tier, timeout, rehydratePriority, requestId, leaseId).block();
    }

    /**
     * Returns the sku name and account kind.
     * 
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<BlobsGetAccountInfoResponse> getAccountInfoWithResponseAsync() {
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
            .flatMap((BlobsGetAccountInfoResponse res) -> Mono.empty());
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
}
