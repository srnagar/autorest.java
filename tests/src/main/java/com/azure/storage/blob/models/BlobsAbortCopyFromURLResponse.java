package com.azure.storage.blob.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;

/**
 * Contains all response data for the abortCopyFromURL operation.
 */
public final class BlobsAbortCopyFromURLResponse extends ResponseBase<BlobsAbortCopyFromURLHeaders, Void> {
    /**
     * Creates an instance of BlobsAbortCopyFromURLResponse.
     * 
     * @param request the request which resulted in this BlobsAbortCopyFromURLResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public BlobsAbortCopyFromURLResponse(HttpRequest request, int statusCode, HttpHeaders rawHeaders, Void value, BlobsAbortCopyFromURLHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }
}
