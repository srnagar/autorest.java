package com.azure.storage.blob.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;

/**
 * Contains all response data for the listBlobHierarchySegment operation.
 */
public final class ContainersListBlobHierarchySegmentResponse extends ResponseBase<ContainersListBlobHierarchySegmentHeaders, ListBlobsHierarchySegmentResponse> {
    /**
     * Creates an instance of ContainersListBlobHierarchySegmentResponse.
     * 
     * @param request the request which resulted in this ContainersListBlobHierarchySegmentResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public ContainersListBlobHierarchySegmentResponse(HttpRequest request, int statusCode, HttpHeaders rawHeaders, ListBlobsHierarchySegmentResponse value, ContainersListBlobHierarchySegmentHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }

    /**
     * @return the deserialized response body.
     */
    @Override
    public ListBlobsHierarchySegmentResponse getValue() {
        return super.getValue();
    }
}
