package com.azure.storage.blob.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;

/**
 * Contains all response data for the listBlobFlatSegmentNext operation.
 */
public final class ContainersListBlobFlatSegmentNextResponse extends ResponseBase<ContainersListBlobFlatSegmentNextHeaders, ListBlobsFlatSegmentResponse> {
    /**
     * Creates an instance of ContainersListBlobFlatSegmentNextResponse.
     * 
     * @param request the request which resulted in this ContainersListBlobFlatSegmentNextResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public ContainersListBlobFlatSegmentNextResponse(HttpRequest request, int statusCode, HttpHeaders rawHeaders, ListBlobsFlatSegmentResponse value, ContainersListBlobFlatSegmentNextHeaders headers) {
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
