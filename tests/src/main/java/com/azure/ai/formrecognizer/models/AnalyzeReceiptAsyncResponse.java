package com.azure.ai.formrecognizer.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;

/**
 * Contains all response data for the analyzeReceiptAsync operation.
 */
public final class AnalyzeReceiptAsyncResponse extends ResponseBase<AnalyzeReceiptAsyncHeaders, Void> {
    /**
     * Creates an instance of AnalyzeReceiptAsyncResponse.
     * 
     * @param request the request which resulted in this AnalyzeReceiptAsyncResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public AnalyzeReceiptAsyncResponse(HttpRequest request, int statusCode, HttpHeaders rawHeaders, Void value, AnalyzeReceiptAsyncHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }
}
