package com.azure.storage.blob.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;

/**
 * Contains all response data for the setAccessPolicy operation.
 */
public final class ContainersSetAccessPolicyResponse extends ResponseBase<ContainersSetAccessPolicyHeaders, Void> {
    /**
     * Creates an instance of ContainersSetAccessPolicyResponse.
     * 
     * @param request the request which resulted in this ContainersSetAccessPolicyResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public ContainersSetAccessPolicyResponse(HttpRequest request, int statusCode, HttpHeaders rawHeaders, Void value, ContainersSetAccessPolicyHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }
}
