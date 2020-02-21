package com.azure.storage.blob.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;

/**
 * Contains all response data for the delete operation.
 */
public final class BlobsDeleteResponse extends ResponseBase<BlobsDeleteHeaders, Void> {
    /**
     * Creates an instance of BlobsDeleteResponse.
     * 
     * @param request the request which resulted in this BlobsDeleteResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public BlobsDeleteResponse(HttpRequest request, int statusCode, HttpHeaders rawHeaders, Void value, BlobsDeleteHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }
}
