package com.azure.storage.blob.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;

/**
 * Contains all response data for the changeLease operation.
 */
public final class ContainersChangeLeaseResponse extends ResponseBase<ContainersChangeLeaseHeaders, Void> {
    /**
     * Creates an instance of ContainersChangeLeaseResponse.
     * 
     * @param request the request which resulted in this ContainersChangeLeaseResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public ContainersChangeLeaseResponse(HttpRequest request, int statusCode, HttpHeaders rawHeaders, Void value, ContainersChangeLeaseHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }
}
