package com.azure.storage.blob.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;

/**
 * Contains all response data for the getPageRanges operation.
 */
public final class PageBlobsGetPageRangesResponse extends ResponseBase<PageBlobsGetPageRangesHeaders, PageList> {
    /**
     * Creates an instance of PageBlobsGetPageRangesResponse.
     * 
     * @param request the request which resulted in this PageBlobsGetPageRangesResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public PageBlobsGetPageRangesResponse(HttpRequest request, int statusCode, HttpHeaders rawHeaders, PageList value, PageBlobsGetPageRangesHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }

    /**
     * @return the deserialized response body.
     */
    @Override
    public PageList getValue() {
        return super.getValue();
    }
}
