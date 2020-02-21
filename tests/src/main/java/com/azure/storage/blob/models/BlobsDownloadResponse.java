package com.azure.storage.blob.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;

/**
 * Contains all response data for the download operation.
 */
public final class BlobsDownloadResponse extends ResponseBase<BlobsDownloadHeaders, Void> {
    /**
     * Creates an instance of BlobsDownloadResponse.
     * 
     * @param request the request which resulted in this BlobsDownloadResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public BlobsDownloadResponse(HttpRequest request, int statusCode, HttpHeaders rawHeaders, Void value, BlobsDownloadHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }
}
