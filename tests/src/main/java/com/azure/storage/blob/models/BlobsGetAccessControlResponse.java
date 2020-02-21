package com.azure.storage.blob.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;

/**
 * Contains all response data for the getAccessControl operation.
 */
public final class BlobsGetAccessControlResponse extends ResponseBase<BlobsGetAccessControlHeaders, Void> {
    /**
     * Creates an instance of BlobsGetAccessControlResponse.
     * 
     * @param request the request which resulted in this BlobsGetAccessControlResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public BlobsGetAccessControlResponse(HttpRequest request, int statusCode, HttpHeaders rawHeaders, Void value, BlobsGetAccessControlHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }
}
