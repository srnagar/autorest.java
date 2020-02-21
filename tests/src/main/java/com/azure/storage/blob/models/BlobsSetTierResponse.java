package com.azure.storage.blob.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;

/**
 * Contains all response data for the setTier operation.
 */
public final class BlobsSetTierResponse extends ResponseBase<BlobsSetTierHeaders, Void> {
    /**
     * Creates an instance of BlobsSetTierResponse.
     * 
     * @param request the request which resulted in this BlobsSetTierResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public BlobsSetTierResponse(HttpRequest request, int statusCode, HttpHeaders rawHeaders, Void value, BlobsSetTierHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }
}
