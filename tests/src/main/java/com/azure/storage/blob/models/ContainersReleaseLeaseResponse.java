package com.azure.storage.blob.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;

/**
 * Contains all response data for the releaseLease operation.
 */
public final class ContainersReleaseLeaseResponse extends ResponseBase<ContainersReleaseLeaseHeaders, Void> {
    /**
     * Creates an instance of ContainersReleaseLeaseResponse.
     * 
     * @param request the request which resulted in this ContainersReleaseLeaseResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public ContainersReleaseLeaseResponse(HttpRequest request, int statusCode, HttpHeaders rawHeaders, Void value, ContainersReleaseLeaseHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }
}
