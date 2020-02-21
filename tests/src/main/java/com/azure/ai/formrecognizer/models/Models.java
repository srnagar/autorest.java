package com.azure.ai.formrecognizer.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The Models model.
 */
@Fluent
public final class Models {
    /*
     * Summary of all trained custom models.
     */
    @JsonProperty(value = "summary")
    private ModelsSummary summary;

    /*
     * Collection of trained custom models.
     */
    @JsonProperty(value = "modelList")
    private List<ModelInfo> modelList;

    /*
     * Link to the next page of custom models.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the summary property: Summary of all trained custom models.
     * 
     * @return the summary value.
     */
    public ModelsSummary getSummary() {
        return this.summary;
    }

    /**
     * Set the summary property: Summary of all trained custom models.
     * 
     * @param summary the summary value to set.
     * @return the Models object itself.
     */
    public Models setSummary(ModelsSummary summary) {
        this.summary = summary;
        return this;
    }

    /**
     * Get the modelList property: Collection of trained custom models.
     * 
     * @return the modelList value.
     */
    public List<ModelInfo> getModelList() {
        return this.modelList;
    }

    /**
     * Set the modelList property: Collection of trained custom models.
     * 
     * @param modelList the modelList value to set.
     * @return the Models object itself.
     */
    public Models setModelList(List<ModelInfo> modelList) {
        this.modelList = modelList;
        return this;
    }

    /**
     * Get the nextLink property: Link to the next page of custom models.
     * 
     * @return the nextLink value.
     */
    public String getNextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: Link to the next page of custom models.
     * 
     * @param nextLink the nextLink value to set.
     * @return the Models object itself.
     */
    public Models setNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    public void validate() {
        if (getSummary() != null) {
            getSummary().validate();
        }
        if (getModelList() != null) {
            getModelList().forEach(e -> e.validate());
        }
    }
}
