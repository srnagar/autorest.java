package com.azure.ai.formrecognizer.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;

/**
 * Contains all response data for the trainCustomModelAsync operation.
 */
public final class TrainCustomModelAsyncResponse extends ResponseBase<TrainCustomModelAsyncHeaders, Void> {
    /**
     * Creates an instance of TrainCustomModelAsyncResponse.
     * 
     * @param request the request which resulted in this TrainCustomModelAsyncResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public TrainCustomModelAsyncResponse(HttpRequest request, int statusCode, HttpHeaders rawHeaders, Void value, TrainCustomModelAsyncHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }
}
