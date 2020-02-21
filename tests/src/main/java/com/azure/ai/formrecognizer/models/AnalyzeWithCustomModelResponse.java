package com.azure.ai.formrecognizer.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;

/**
 * Contains all response data for the analyzeWithCustomModel operation.
 */
public final class AnalyzeWithCustomModelResponse extends ResponseBase<AnalyzeWithCustomModelHeaders, Void> {
    /**
     * Creates an instance of AnalyzeWithCustomModelResponse.
     * 
     * @param request the request which resulted in this AnalyzeWithCustomModelResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public AnalyzeWithCustomModelResponse(HttpRequest request, int statusCode, HttpHeaders rawHeaders, Void value, AnalyzeWithCustomModelHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }
}
