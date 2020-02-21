package com.azure.storage.blob.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;

/**
 * Contains all response data for the acquireLease operation.
 */
public final class BlobsAcquireLeaseResponse extends ResponseBase<BlobsAcquireLeaseHeaders, Void> {
    /**
     * Creates an instance of BlobsAcquireLeaseResponse.
     * 
     * @param request the request which resulted in this BlobsAcquireLeaseResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public BlobsAcquireLeaseResponse(HttpRequest request, int statusCode, HttpHeaders rawHeaders, Void value, BlobsAcquireLeaseHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }
}
