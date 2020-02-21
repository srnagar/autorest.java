package com.azure.storage.blob.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;

/**
 * Contains all response data for the rename operation.
 */
public final class DirectorysRenameResponse extends ResponseBase<DirectorysRenameHeaders, Void> {
    /**
     * Creates an instance of DirectorysRenameResponse.
     * 
     * @param request the request which resulted in this DirectorysRenameResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public DirectorysRenameResponse(HttpRequest request, int statusCode, HttpHeaders rawHeaders, Void value, DirectorysRenameHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }
}
