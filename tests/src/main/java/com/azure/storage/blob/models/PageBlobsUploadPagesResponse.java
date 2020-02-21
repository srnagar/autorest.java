package com.azure.storage.blob.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;

/**
 * Contains all response data for the uploadPages operation.
 */
public final class PageBlobsUploadPagesResponse extends ResponseBase<PageBlobsUploadPagesHeaders, Void> {
    /**
     * Creates an instance of PageBlobsUploadPagesResponse.
     * 
     * @param request the request which resulted in this PageBlobsUploadPagesResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public PageBlobsUploadPagesResponse(HttpRequest request, int statusCode, HttpHeaders rawHeaders, Void value, PageBlobsUploadPagesHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }
}
