package com.azure.storage.blob.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;

/**
 * Contains all response data for the create operation.
 */
public final class DirectorysCreateResponse extends ResponseBase<DirectorysCreateHeaders, Void> {
    /**
     * Creates an instance of DirectorysCreateResponse.
     * 
     * @param request the request which resulted in this DirectorysCreateResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public DirectorysCreateResponse(HttpRequest request, int statusCode, HttpHeaders rawHeaders, Void value, DirectorysCreateHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }
}
