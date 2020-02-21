package com.azure.storage.blob.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;

/**
 * Contains all response data for the getBlockList operation.
 */
public final class BlockBlobsGetBlockListResponse extends ResponseBase<BlockBlobsGetBlockListHeaders, BlockList> {
    /**
     * Creates an instance of BlockBlobsGetBlockListResponse.
     * 
     * @param request the request which resulted in this BlockBlobsGetBlockListResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public BlockBlobsGetBlockListResponse(HttpRequest request, int statusCode, HttpHeaders rawHeaders, BlockList value, BlockBlobsGetBlockListHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }

    /**
     * @return the deserialized response body.
     */
    @Override
    public BlockList getValue() {
        return super.getValue();
    }
}
