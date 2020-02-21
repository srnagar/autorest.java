package com.azure.storage.blob;

import com.azure.core.annotation.Delete;
import com.azure.core.annotation.ExpectedResponses;
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
import com.azure.core.util.DateTimeRfc1123;
import com.azure.storage.blob.models.DataLakeStorageErrorException;
import com.azure.storage.blob.models.DirectorysCreateResponse;
import com.azure.storage.blob.models.DirectorysDeleteResponse;
import com.azure.storage.blob.models.DirectorysGetAccessControlResponse;
import com.azure.storage.blob.models.DirectorysRenameResponse;
import com.azure.storage.blob.models.DirectorysSetAccessControlResponse;
import com.azure.storage.blob.models.PathRenameMode;
import java.time.OffsetDateTime;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * Directorys.
 */
public final class Directorys {
    /**
     * The proxy service used to perform REST calls.
     */
    private DirectorysService service;

    /**
     * The service client containing this operation class.
     */
    private AzureBlobStorage client;

    /**
     * Initializes an instance of Directorys.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    public Directorys(AzureBlobStorage client) {
        this.service = RestProxy.create(DirectorysService.class, client.getHttpPipeline());
        this.client = client;
    }

    /**
     * The interface defining all the services for AzureBlobStorageDirectorys
     * to be used by the proxy service to perform REST calls.
     */
    @Host("{url}")
    @ServiceInterface(name = "AzureBlobStorageDirectorys")
    private interface DirectorysService {
        @Put("/{filesystem}/{path}")
        @ExpectedResponses({201})
        @UnexpectedResponseExceptionType(DataLakeStorageErrorException.class)
        Mono<DirectorysCreateResponse> create(@HostParam("url") String url, @QueryParam("resource") String resource, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-properties") String directoryProperties, @HeaderParam("x-ms-permissions") String posixPermissions, @HeaderParam("x-ms-umask") String posixUmask, @HeaderParam("x-ms-cache-control") String cacheControl, @HeaderParam("x-ms-content-type") String contentType, @HeaderParam("x-ms-content-encoding") String contentEncoding, @HeaderParam("x-ms-content-language") String contentLanguage, @HeaderParam("x-ms-content-disposition") String contentDisposition, @HeaderParam("x-ms-lease-id") String leaseId, @HeaderParam("If-Modified-Since") DateTimeRfc1123 ifModifiedSince, @HeaderParam("If-Unmodified-Since") DateTimeRfc1123 ifUnmodifiedSince, @HeaderParam("If-Match") String ifMatch, @HeaderParam("If-None-Match") String ifNoneMatch, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId);

        @Put("/{filesystem}/{path}")
        @ExpectedResponses({201})
        @UnexpectedResponseExceptionType(DataLakeStorageErrorException.class)
        Mono<DirectorysRenameResponse> rename(@HostParam("url") String url, @QueryParam("timeout") Integer timeout, @QueryParam("continuation") String marker, @QueryParam("mode") PathRenameMode pathRenameMode, @HeaderParam("x-ms-rename-source") String renameSource, @HeaderParam("x-ms-properties") String directoryProperties, @HeaderParam("x-ms-permissions") String posixPermissions, @HeaderParam("x-ms-umask") String posixUmask, @HeaderParam("x-ms-cache-control") String cacheControl, @HeaderParam("x-ms-content-type") String contentType, @HeaderParam("x-ms-content-encoding") String contentEncoding, @HeaderParam("x-ms-content-language") String contentLanguage, @HeaderParam("x-ms-content-disposition") String contentDisposition, @HeaderParam("x-ms-lease-id") String leaseId, @HeaderParam("x-ms-source-lease-id") String sourceLeaseId, @HeaderParam("If-Modified-Since") DateTimeRfc1123 ifModifiedSince, @HeaderParam("If-Unmodified-Since") DateTimeRfc1123 ifUnmodifiedSince, @HeaderParam("If-Match") String ifMatch, @HeaderParam("If-None-Match") String ifNoneMatch, @HeaderParam("x-ms-source-if-modified-since") DateTimeRfc1123 sourceIfModifiedSince, @HeaderParam("x-ms-source-if-unmodified-since") DateTimeRfc1123 sourceIfUnmodifiedSince, @HeaderParam("x-ms-source-if-match") String sourceIfMatch, @HeaderParam("x-ms-source-if-none-match") String sourceIfNoneMatch, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId);

        @Delete("/{filesystem}/{path}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(DataLakeStorageErrorException.class)
        Mono<DirectorysDeleteResponse> delete(@HostParam("url") String url, @QueryParam("timeout") Integer timeout, @QueryParam("recursive") boolean recursiveDirectoryDelete, @QueryParam("continuation") String marker, @HeaderParam("x-ms-lease-id") String leaseId, @HeaderParam("If-Modified-Since") DateTimeRfc1123 ifModifiedSince, @HeaderParam("If-Unmodified-Since") DateTimeRfc1123 ifUnmodifiedSince, @HeaderParam("If-Match") String ifMatch, @HeaderParam("If-None-Match") String ifNoneMatch, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId);

        @Patch("/{filesystem}/{path}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(DataLakeStorageErrorException.class)
        Mono<DirectorysSetAccessControlResponse> setAccessControl(@HostParam("url") String url, @QueryParam("action") String action, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-lease-id") String leaseId, @HeaderParam("x-ms-owner") String owner, @HeaderParam("x-ms-group") String group, @HeaderParam("x-ms-permissions") String posixPermissions, @HeaderParam("x-ms-acl") String posixAcl, @HeaderParam("If-Match") String ifMatch, @HeaderParam("If-None-Match") String ifNoneMatch, @HeaderParam("If-Modified-Since") DateTimeRfc1123 ifModifiedSince, @HeaderParam("If-Unmodified-Since") DateTimeRfc1123 ifUnmodifiedSince, @HeaderParam("x-ms-client-request-id") String requestId, @HeaderParam("x-ms-version") String version);

        @Head("/{filesystem}/{path}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(DataLakeStorageErrorException.class)
        Mono<DirectorysGetAccessControlResponse> getAccessControl(@HostParam("url") String url, @QueryParam("action") String action, @QueryParam("timeout") Integer timeout, @QueryParam("upn") Boolean upn, @HeaderParam("x-ms-lease-id") String leaseId, @HeaderParam("If-Match") String ifMatch, @HeaderParam("If-None-Match") String ifNoneMatch, @HeaderParam("If-Modified-Since") DateTimeRfc1123 ifModifiedSince, @HeaderParam("If-Unmodified-Since") DateTimeRfc1123 ifUnmodifiedSince, @HeaderParam("x-ms-client-request-id") String requestId, @HeaderParam("x-ms-version") String version);
    }

    /**
     * Create a directory. By default, the destination is overwritten and if the destination already exists and has a lease the lease is broken. This operation supports conditional HTTP requests.  For more information, see [Specifying Conditional Headers for Blob Service Operations](https://docs.microsoft.com/en-us/rest/api/storageservices/specifying-conditional-headers-for-blob-service-operations).  To fail if the destination already exists, use a conditional request with If-None-Match: "*".
     * 
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
     * @param ifModifiedSince 
     * @param ifUnmodifiedSince 
     * @param ifMatch 
     * @param ifNoneMatch 
     * @param requestId 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DataLakeStorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DirectorysCreateResponse> createWithResponseAsync(Integer timeout, String directoryProperties, String posixPermissions, String posixUmask, String cacheControl, String contentType, String contentEncoding, String contentLanguage, String contentDisposition, String leaseId, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String ifMatch, String ifNoneMatch, String requestId) {
        if (this.client.getUrl() == null) {
            throw new IllegalArgumentException("Parameter this.client.getUrl() is required and cannot be null.");
        }
        final String resource = "directory";
        DateTimeRfc1123 ifModifiedSinceConverted = ifModifiedSince == null ? null : new DateTimeRfc1123(ifModifiedSince);
        DateTimeRfc1123 ifUnmodifiedSinceConverted = ifUnmodifiedSince == null ? null : new DateTimeRfc1123(ifUnmodifiedSince);
        return service.create(this.client.getUrl(), resource, timeout, directoryProperties, posixPermissions, posixUmask, cacheControl, contentType, contentEncoding, contentLanguage, contentDisposition, leaseId, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, ifMatch, ifNoneMatch, this.client.getVersion(), requestId);
    }

    /**
     * Create a directory. By default, the destination is overwritten and if the destination already exists and has a lease the lease is broken. This operation supports conditional HTTP requests.  For more information, see [Specifying Conditional Headers for Blob Service Operations](https://docs.microsoft.com/en-us/rest/api/storageservices/specifying-conditional-headers-for-blob-service-operations).  To fail if the destination already exists, use a conditional request with If-None-Match: "*".
     * 
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
     * @param ifModifiedSince 
     * @param ifUnmodifiedSince 
     * @param ifMatch 
     * @param ifNoneMatch 
     * @param requestId 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DataLakeStorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> createAsync(Integer timeout, String directoryProperties, String posixPermissions, String posixUmask, String cacheControl, String contentType, String contentEncoding, String contentLanguage, String contentDisposition, String leaseId, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String ifMatch, String ifNoneMatch, String requestId) {
        return createWithResponseAsync(timeout, directoryProperties, posixPermissions, posixUmask, cacheControl, contentType, contentEncoding, contentLanguage, contentDisposition, leaseId, ifModifiedSince, ifUnmodifiedSince, ifMatch, ifNoneMatch, requestId)
            .flatMap((DirectorysCreateResponse res) -> Mono.empty());
    }

    /**
     * Create a directory. By default, the destination is overwritten and if the destination already exists and has a lease the lease is broken. This operation supports conditional HTTP requests.  For more information, see [Specifying Conditional Headers for Blob Service Operations](https://docs.microsoft.com/en-us/rest/api/storageservices/specifying-conditional-headers-for-blob-service-operations).  To fail if the destination already exists, use a conditional request with If-None-Match: "*".
     * 
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
     * @param ifModifiedSince 
     * @param ifUnmodifiedSince 
     * @param ifMatch 
     * @param ifNoneMatch 
     * @param requestId 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DataLakeStorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void create(Integer timeout, String directoryProperties, String posixPermissions, String posixUmask, String cacheControl, String contentType, String contentEncoding, String contentLanguage, String contentDisposition, String leaseId, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String ifMatch, String ifNoneMatch, String requestId) {
        createAsync(timeout, directoryProperties, posixPermissions, posixUmask, cacheControl, contentType, contentEncoding, contentLanguage, contentDisposition, leaseId, ifModifiedSince, ifUnmodifiedSince, ifMatch, ifNoneMatch, requestId).block();
    }

    /**
     * Rename a directory. By default, the destination is overwritten and if the destination already exists and has a lease the lease is broken. This operation supports conditional HTTP requests. For more information, see [Specifying Conditional Headers for Blob Service Operations](https://docs.microsoft.com/en-us/rest/api/storageservices/specifying-conditional-headers-for-blob-service-operations). To fail if the destination already exists, use a conditional request with If-None-Match: "*".
     * 
     * @param renameSource 
     * @param timeout 
     * @param marker 
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
    public Mono<DirectorysRenameResponse> renameWithResponseAsync(String renameSource, Integer timeout, String marker, String directoryProperties, String posixPermissions, String posixUmask, String cacheControl, String contentType, String contentEncoding, String contentLanguage, String contentDisposition, String leaseId, String sourceLeaseId, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String ifMatch, String ifNoneMatch, OffsetDateTime sourceIfModifiedSince, OffsetDateTime sourceIfUnmodifiedSince, String sourceIfMatch, String sourceIfNoneMatch, String requestId) {
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
        return service.rename(this.client.getUrl(), timeout, marker, this.client.getPathRenameMode(), renameSource, directoryProperties, posixPermissions, posixUmask, cacheControl, contentType, contentEncoding, contentLanguage, contentDisposition, leaseId, sourceLeaseId, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, ifMatch, ifNoneMatch, sourceIfModifiedSinceConverted, sourceIfUnmodifiedSinceConverted, sourceIfMatch, sourceIfNoneMatch, this.client.getVersion(), requestId);
    }

    /**
     * Rename a directory. By default, the destination is overwritten and if the destination already exists and has a lease the lease is broken. This operation supports conditional HTTP requests. For more information, see [Specifying Conditional Headers for Blob Service Operations](https://docs.microsoft.com/en-us/rest/api/storageservices/specifying-conditional-headers-for-blob-service-operations). To fail if the destination already exists, use a conditional request with If-None-Match: "*".
     * 
     * @param renameSource 
     * @param timeout 
     * @param marker 
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
    public Mono<Void> renameAsync(String renameSource, Integer timeout, String marker, String directoryProperties, String posixPermissions, String posixUmask, String cacheControl, String contentType, String contentEncoding, String contentLanguage, String contentDisposition, String leaseId, String sourceLeaseId, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String ifMatch, String ifNoneMatch, OffsetDateTime sourceIfModifiedSince, OffsetDateTime sourceIfUnmodifiedSince, String sourceIfMatch, String sourceIfNoneMatch, String requestId) {
        return renameWithResponseAsync(renameSource, timeout, marker, directoryProperties, posixPermissions, posixUmask, cacheControl, contentType, contentEncoding, contentLanguage, contentDisposition, leaseId, sourceLeaseId, ifModifiedSince, ifUnmodifiedSince, ifMatch, ifNoneMatch, sourceIfModifiedSince, sourceIfUnmodifiedSince, sourceIfMatch, sourceIfNoneMatch, requestId)
            .flatMap((DirectorysRenameResponse res) -> Mono.empty());
    }

    /**
     * Rename a directory. By default, the destination is overwritten and if the destination already exists and has a lease the lease is broken. This operation supports conditional HTTP requests. For more information, see [Specifying Conditional Headers for Blob Service Operations](https://docs.microsoft.com/en-us/rest/api/storageservices/specifying-conditional-headers-for-blob-service-operations). To fail if the destination already exists, use a conditional request with If-None-Match: "*".
     * 
     * @param renameSource 
     * @param timeout 
     * @param marker 
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
    public void rename(String renameSource, Integer timeout, String marker, String directoryProperties, String posixPermissions, String posixUmask, String cacheControl, String contentType, String contentEncoding, String contentLanguage, String contentDisposition, String leaseId, String sourceLeaseId, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String ifMatch, String ifNoneMatch, OffsetDateTime sourceIfModifiedSince, OffsetDateTime sourceIfUnmodifiedSince, String sourceIfMatch, String sourceIfNoneMatch, String requestId) {
        renameAsync(renameSource, timeout, marker, directoryProperties, posixPermissions, posixUmask, cacheControl, contentType, contentEncoding, contentLanguage, contentDisposition, leaseId, sourceLeaseId, ifModifiedSince, ifUnmodifiedSince, ifMatch, ifNoneMatch, sourceIfModifiedSince, sourceIfUnmodifiedSince, sourceIfMatch, sourceIfNoneMatch, requestId).block();
    }

    /**
     * Deletes the directory.
     * 
     * @param recursiveDirectoryDelete 
     * @param timeout 
     * @param marker 
     * @param leaseId 
     * @param ifModifiedSince 
     * @param ifUnmodifiedSince 
     * @param ifMatch 
     * @param ifNoneMatch 
     * @param requestId 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DataLakeStorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DirectorysDeleteResponse> deleteWithResponseAsync(boolean recursiveDirectoryDelete, Integer timeout, String marker, String leaseId, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String ifMatch, String ifNoneMatch, String requestId) {
        if (this.client.getUrl() == null) {
            throw new IllegalArgumentException("Parameter this.client.getUrl() is required and cannot be null.");
        }
        DateTimeRfc1123 ifModifiedSinceConverted = ifModifiedSince == null ? null : new DateTimeRfc1123(ifModifiedSince);
        DateTimeRfc1123 ifUnmodifiedSinceConverted = ifUnmodifiedSince == null ? null : new DateTimeRfc1123(ifUnmodifiedSince);
        return service.delete(this.client.getUrl(), timeout, recursiveDirectoryDelete, marker, leaseId, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, ifMatch, ifNoneMatch, this.client.getVersion(), requestId);
    }

    /**
     * Deletes the directory.
     * 
     * @param recursiveDirectoryDelete 
     * @param timeout 
     * @param marker 
     * @param leaseId 
     * @param ifModifiedSince 
     * @param ifUnmodifiedSince 
     * @param ifMatch 
     * @param ifNoneMatch 
     * @param requestId 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DataLakeStorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteAsync(boolean recursiveDirectoryDelete, Integer timeout, String marker, String leaseId, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String ifMatch, String ifNoneMatch, String requestId) {
        return deleteWithResponseAsync(recursiveDirectoryDelete, timeout, marker, leaseId, ifModifiedSince, ifUnmodifiedSince, ifMatch, ifNoneMatch, requestId)
            .flatMap((DirectorysDeleteResponse res) -> Mono.empty());
    }

    /**
     * Deletes the directory.
     * 
     * @param recursiveDirectoryDelete 
     * @param timeout 
     * @param marker 
     * @param leaseId 
     * @param ifModifiedSince 
     * @param ifUnmodifiedSince 
     * @param ifMatch 
     * @param ifNoneMatch 
     * @param requestId 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DataLakeStorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(boolean recursiveDirectoryDelete, Integer timeout, String marker, String leaseId, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String ifMatch, String ifNoneMatch, String requestId) {
        deleteAsync(recursiveDirectoryDelete, timeout, marker, leaseId, ifModifiedSince, ifUnmodifiedSince, ifMatch, ifNoneMatch, requestId).block();
    }

    /**
     * Set the owner, group, permissions, or access control list for a directory.
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
    public Mono<DirectorysSetAccessControlResponse> setAccessControlWithResponseAsync(Integer timeout, String leaseId, String owner, String group, String posixPermissions, String posixAcl, String ifMatch, String ifNoneMatch, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String requestId) {
        if (this.client.getUrl() == null) {
            throw new IllegalArgumentException("Parameter this.client.getUrl() is required and cannot be null.");
        }
        final String action = "setAccessControl";
        DateTimeRfc1123 ifModifiedSinceConverted = ifModifiedSince == null ? null : new DateTimeRfc1123(ifModifiedSince);
        DateTimeRfc1123 ifUnmodifiedSinceConverted = ifUnmodifiedSince == null ? null : new DateTimeRfc1123(ifUnmodifiedSince);
        return service.setAccessControl(this.client.getUrl(), action, timeout, leaseId, owner, group, posixPermissions, posixAcl, ifMatch, ifNoneMatch, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, requestId, this.client.getVersion());
    }

    /**
     * Set the owner, group, permissions, or access control list for a directory.
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
            .flatMap((DirectorysSetAccessControlResponse res) -> Mono.empty());
    }

    /**
     * Set the owner, group, permissions, or access control list for a directory.
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
     * Get the owner, group, permissions, or access control list for a directory.
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
    public Mono<DirectorysGetAccessControlResponse> getAccessControlWithResponseAsync(Integer timeout, Boolean upn, String leaseId, String ifMatch, String ifNoneMatch, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String requestId) {
        if (this.client.getUrl() == null) {
            throw new IllegalArgumentException("Parameter this.client.getUrl() is required and cannot be null.");
        }
        final String action = "getAccessControl";
        DateTimeRfc1123 ifModifiedSinceConverted = ifModifiedSince == null ? null : new DateTimeRfc1123(ifModifiedSince);
        DateTimeRfc1123 ifUnmodifiedSinceConverted = ifUnmodifiedSince == null ? null : new DateTimeRfc1123(ifUnmodifiedSince);
        return service.getAccessControl(this.client.getUrl(), action, timeout, upn, leaseId, ifMatch, ifNoneMatch, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, requestId, this.client.getVersion());
    }

    /**
     * Get the owner, group, permissions, or access control list for a directory.
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
            .flatMap((DirectorysGetAccessControlResponse res) -> Mono.empty());
    }

    /**
     * Get the owner, group, permissions, or access control list for a directory.
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
}
