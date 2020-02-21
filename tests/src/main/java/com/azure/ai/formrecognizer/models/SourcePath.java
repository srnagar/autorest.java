package com.azure.ai.formrecognizer.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The SourcePath model.
 */
@Fluent
public final class SourcePath {
    /*
     * File source path.
     */
    @JsonProperty(value = "source")
    private String source;

    /**
     * Get the source property: File source path.
     * 
     * @return the source value.
     */
    public String getSource() {
        return this.source;
    }

    /**
     * Set the source property: File source path.
     * 
     * @param source the source value to set.
     * @return the SourcePath object itself.
     */
    public SourcePath setSource(String source) {
        this.source = source;
        return this;
    }

    public void validate() {
    }
}
