package com.azure.ai.formrecognizer.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The AnalyzeResult model.
 */
@Fluent
public final class AnalyzeResult {
    /*
     * Version of schema used for this result.
     */
    @JsonProperty(value = "version", required = true)
    private String version;

    /*
     * Text extracted from the input.
     */
    @JsonProperty(value = "readResults", required = true)
    private List<ReadResult> readResults;

    /*
     * Page-level information extracted from the input.
     */
    @JsonProperty(value = "pageResults")
    private List<PageResult> pageResults;

    /*
     * Document-level information extracted from the input.
     */
    @JsonProperty(value = "documentResults")
    private List<DocumentResult> documentResults;

    /*
     * List of errors reported during the analyze operation.
     */
    @JsonProperty(value = "errors")
    private List<ErrorInformation> errors;

    /**
     * Get the version property: Version of schema used for this result.
     * 
     * @return the version value.
     */
    public String getVersion() {
        return this.version;
    }

    /**
     * Set the version property: Version of schema used for this result.
     * 
     * @param version the version value to set.
     * @return the AnalyzeResult object itself.
     */
    public AnalyzeResult setVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get the readResults property: Text extracted from the input.
     * 
     * @return the readResults value.
     */
    public List<ReadResult> getReadResults() {
        return this.readResults;
    }

    /**
     * Set the readResults property: Text extracted from the input.
     * 
     * @param readResults the readResults value to set.
     * @return the AnalyzeResult object itself.
     */
    public AnalyzeResult setReadResults(List<ReadResult> readResults) {
        this.readResults = readResults;
        return this;
    }

    /**
     * Get the pageResults property: Page-level information extracted from the
     * input.
     * 
     * @return the pageResults value.
     */
    public List<PageResult> getPageResults() {
        return this.pageResults;
    }

    /**
     * Set the pageResults property: Page-level information extracted from the
     * input.
     * 
     * @param pageResults the pageResults value to set.
     * @return the AnalyzeResult object itself.
     */
    public AnalyzeResult setPageResults(List<PageResult> pageResults) {
        this.pageResults = pageResults;
        return this;
    }

    /**
     * Get the documentResults property: Document-level information extracted
     * from the input.
     * 
     * @return the documentResults value.
     */
    public List<DocumentResult> getDocumentResults() {
        return this.documentResults;
    }

    /**
     * Set the documentResults property: Document-level information extracted
     * from the input.
     * 
     * @param documentResults the documentResults value to set.
     * @return the AnalyzeResult object itself.
     */
    public AnalyzeResult setDocumentResults(List<DocumentResult> documentResults) {
        this.documentResults = documentResults;
        return this;
    }

    /**
     * Get the errors property: List of errors reported during the analyze
     * operation.
     * 
     * @return the errors value.
     */
    public List<ErrorInformation> getErrors() {
        return this.errors;
    }

    /**
     * Set the errors property: List of errors reported during the analyze
     * operation.
     * 
     * @param errors the errors value to set.
     * @return the AnalyzeResult object itself.
     */
    public AnalyzeResult setErrors(List<ErrorInformation> errors) {
        this.errors = errors;
        return this;
    }

    public void validate() {
        if (getVersion() == null) {
            throw new IllegalArgumentException("Missing required property version in model AnalyzeResult");
        }
        if (getReadResults() == null) {
            throw new IllegalArgumentException("Missing required property readResults in model AnalyzeResult");
        } else {
            getReadResults().forEach(e -> e.validate());
        }
        if (getPageResults() != null) {
            getPageResults().forEach(e -> e.validate());
        }
        if (getDocumentResults() != null) {
            getDocumentResults().forEach(e -> e.validate());
        }
        if (getErrors() != null) {
            getErrors().forEach(e -> e.validate());
        }
    }
}
