package com.azure.ai.formrecognizer.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/**
 * The KeysResult model.
 */
@Fluent
public final class KeysResult {
    /*
     * Object mapping clusterIds to a list of keys.
     */
    @JsonProperty(value = "clusters", required = true)
    private Map<String, List<String>> clusters;

    /**
     * Get the clusters property: Object mapping clusterIds to a list of keys.
     * 
     * @return the clusters value.
     */
    public Map<String, List<String>> getClusters() {
        return this.clusters;
    }

    /**
     * Set the clusters property: Object mapping clusterIds to a list of keys.
     * 
     * @param clusters the clusters value to set.
     * @return the KeysResult object itself.
     */
    public KeysResult setClusters(Map<String, List<String>> clusters) {
        this.clusters = clusters;
        return this;
    }

    public void validate() {
        if (getClusters() == null) {
            throw new IllegalArgumentException("Missing required property clusters in model KeysResult");
        }
    }
}
