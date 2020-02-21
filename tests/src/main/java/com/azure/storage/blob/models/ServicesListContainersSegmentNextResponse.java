package com.azure.storage.blob.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;

/**
 * Contains all response data for the listContainersSegmentNext operation.
 */
public final class ServicesListContainersSegmentNextResponse extends ResponseBase<ServicesListContainersSegmentNextHeaders, ListContainersSegmentResponse> {
    /**
     * Creates an instance of ServicesListContainersSegmentNextResponse.
     * 
     * @param request the request which resulted in this ServicesListContainersSegmentNextResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public ServicesListContainersSegmentNextResponse(HttpRequest request, int statusCode, HttpHeaders rawHeaders, ListContainersSegmentResponse value, ServicesListContainersSegmentNextHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }

    /**
     * @return the deserialized response body.
     */
    @Override
    public ListContainersSegmentResponse getValue() {
        return super.getValue();
    }
}
