package com.azure.ai.formrecognizer.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/**
 * The DocumentResult model.
 */
@Fluent
public final class DocumentResult {
    /*
     * Document type.
     */
    @JsonProperty(value = "docType", required = true)
    private String docType;

    /*
     * First and last page number where the document is found.
     */
    @JsonProperty(value = "pageRange", required = true)
    private List<Integer> pageRange;

    /*
     * Dictionary of named field values.
     */
    @JsonProperty(value = "fields", required = true)
    private Map<String, FieldValue> fields;

    /**
     * Get the docType property: Document type.
     * 
     * @return the docType value.
     */
    public String getDocType() {
        return this.docType;
    }

    /**
     * Set the docType property: Document type.
     * 
     * @param docType the docType value to set.
     * @return the DocumentResult object itself.
     */
    public DocumentResult setDocType(String docType) {
        this.docType = docType;
        return this;
    }

    /**
     * Get the pageRange property: First and last page number where the
     * document is found.
     * 
     * @return the pageRange value.
     */
    public List<Integer> getPageRange() {
        return this.pageRange;
    }

    /**
     * Set the pageRange property: First and last page number where the
     * document is found.
     * 
     * @param pageRange the pageRange value to set.
     * @return the DocumentResult object itself.
     */
    public DocumentResult setPageRange(List<Integer> pageRange) {
        this.pageRange = pageRange;
        return this;
    }

    /**
     * Get the fields property: Dictionary of named field values.
     * 
     * @return the fields value.
     */
    public Map<String, FieldValue> getFields() {
        return this.fields;
    }

    /**
     * Set the fields property: Dictionary of named field values.
     * 
     * @param fields the fields value to set.
     * @return the DocumentResult object itself.
     */
    public DocumentResult setFields(Map<String, FieldValue> fields) {
        this.fields = fields;
        return this;
    }

    public void validate() {
        if (getDocType() == null) {
            throw new IllegalArgumentException("Missing required property docType in model DocumentResult");
        }
        if (getPageRange() == null) {
            throw new IllegalArgumentException("Missing required property pageRange in model DocumentResult");
        }
        if (getFields() == null) {
            throw new IllegalArgumentException("Missing required property fields in model DocumentResult");
        } else {
            getFields().values().forEach(e -> e.validate());
        }
    }
}
