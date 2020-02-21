package com.azure.storage.blob.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;

/**
 * Contains all response data for the delete operation.
 */
public final class DirectorysDeleteResponse extends ResponseBase<DirectorysDeleteHeaders, Void> {
    /**
     * Creates an instance of DirectorysDeleteResponse.
     * 
     * @param request the request which resulted in this DirectorysDeleteResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public DirectorysDeleteResponse(HttpRequest request, int statusCode, HttpHeaders rawHeaders, Void value, DirectorysDeleteHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }
}
