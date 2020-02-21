package com.azure.ai.formrecognizer.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The PageResult model.
 */
@Fluent
public final class PageResult {
    /*
     * Page number.
     */
    @JsonProperty(value = "page", required = true)
    private int page;

    /*
     * Cluster identifier.
     */
    @JsonProperty(value = "clusterId")
    private Integer clusterId;

    /*
     * List of key-value pairs extracted from the page.
     */
    @JsonProperty(value = "keyValuePairs")
    private List<KeyValuePair> keyValuePairs;

    /*
     * List of data tables extracted from the page.
     */
    @JsonProperty(value = "tables")
    private List<DataTable> tables;

    /**
     * Get the page property: Page number.
     * 
     * @return the page value.
     */
    public int getPage() {
        return this.page;
    }

    /**
     * Set the page property: Page number.
     * 
     * @param page the page value to set.
     * @return the PageResult object itself.
     */
    public PageResult setPage(int page) {
        this.page = page;
        return this;
    }

    /**
     * Get the clusterId property: Cluster identifier.
     * 
     * @return the clusterId value.
     */
    public Integer getClusterId() {
        return this.clusterId;
    }

    /**
     * Set the clusterId property: Cluster identifier.
     * 
     * @param clusterId the clusterId value to set.
     * @return the PageResult object itself.
     */
    public PageResult setClusterId(Integer clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * Get the keyValuePairs property: List of key-value pairs extracted from
     * the page.
     * 
     * @return the keyValuePairs value.
     */
    public List<KeyValuePair> getKeyValuePairs() {
        return this.keyValuePairs;
    }

    /**
     * Set the keyValuePairs property: List of key-value pairs extracted from
     * the page.
     * 
     * @param keyValuePairs the keyValuePairs value to set.
     * @return the PageResult object itself.
     */
    public PageResult setKeyValuePairs(List<KeyValuePair> keyValuePairs) {
        this.keyValuePairs = keyValuePairs;
        return this;
    }

    /**
     * Get the tables property: List of data tables extracted from the page.
     * 
     * @return the tables value.
     */
    public List<DataTable> getTables() {
        return this.tables;
    }

    /**
     * Set the tables property: List of data tables extracted from the page.
     * 
     * @param tables the tables value to set.
     * @return the PageResult object itself.
     */
    public PageResult setTables(List<DataTable> tables) {
        this.tables = tables;
        return this;
    }

    public void validate() {
        if (getKeyValuePairs() != null) {
            getKeyValuePairs().forEach(e -> e.validate());
        }
        if (getTables() != null) {
            getTables().forEach(e -> e.validate());
        }
    }
}
