package com.azure.storage.blob.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;

/**
 * Contains all response data for the listBlobFlatSegment operation.
 */
public final class ContainersListBlobFlatSegmentResponse extends ResponseBase<ContainersListBlobFlatSegmentHeaders, ListBlobsFlatSegmentResponse> {
    /**
     * Creates an instance of ContainersListBlobFlatSegmentResponse.
     * 
     * @param request the request which resulted in this ContainersListBlobFlatSegmentResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public ContainersListBlobFlatSegmentResponse(HttpRequest request, int statusCode, HttpHeaders rawHeaders, ListBlobsFlatSegmentResponse value, ContainersListBlobFlatSegmentHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }

    /**
     * @return the deserialized response body.
     */
    @Override
    public ListBlobsFlatSegmentResponse getValue() {
        return super.getValue();
    }
}
