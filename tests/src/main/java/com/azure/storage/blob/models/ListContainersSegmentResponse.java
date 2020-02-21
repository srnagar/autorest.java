package com.azure.storage.blob.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The ListContainersSegmentResponse model.
 */
@Fluent
public final class ListContainersSegmentResponse {
    /*
     * The ServiceEndpoint property.
     */
    @JsonProperty(value = "ServiceEndpoint", required = true)
    private String serviceEndpoint;

    /*
     * The Prefix property.
     */
    @JsonProperty(value = "Prefix")
    private String prefix;

    /*
     * The Marker property.
     */
    @JsonProperty(value = "Marker")
    private String marker;

    /*
     * The MaxResults property.
     */
    @JsonProperty(value = "MaxResults")
    private Integer maxResults;

    /*
     * The ContainerItems property.
     */
    @JsonProperty(value = "Containers", required = true)
    private List<ContainerItem> containerItems;

    /*
     * The NextMarker property.
     */
    @JsonProperty(value = "NextMarker")
    private String nextMarker;

    /**
     * Get the serviceEndpoint property: The ServiceEndpoint property.
     * 
     * @return the serviceEndpoint value.
     */
    public String getServiceEndpoint() {
        return this.serviceEndpoint;
    }

    /**
     * Set the serviceEndpoint property: The ServiceEndpoint property.
     * 
     * @param serviceEndpoint the serviceEndpoint value to set.
     * @return the ListContainersSegmentResponse object itself.
     */
    public ListContainersSegmentResponse setServiceEndpoint(String serviceEndpoint) {
        this.serviceEndpoint = serviceEndpoint;
        return this;
    }

    /**
     * Get the prefix property: The Prefix property.
     * 
     * @return the prefix value.
     */
    public String getPrefix() {
        return this.prefix;
    }

    /**
     * Set the prefix property: The Prefix property.
     * 
     * @param prefix the prefix value to set.
     * @return the ListContainersSegmentResponse object itself.
     */
    public ListContainersSegmentResponse setPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }

    /**
     * Get the marker property: The Marker property.
     * 
     * @return the marker value.
     */
    public String getMarker() {
        return this.marker;
    }

    /**
     * Set the marker property: The Marker property.
     * 
     * @param marker the marker value to set.
     * @return the ListContainersSegmentResponse object itself.
     */
    public ListContainersSegmentResponse setMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * Get the maxResults property: The MaxResults property.
     * 
     * @return the maxResults value.
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * Set the maxResults property: The MaxResults property.
     * 
     * @param maxResults the maxResults value to set.
     * @return the ListContainersSegmentResponse object itself.
     */
    public ListContainersSegmentResponse setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * Get the containerItems property: The ContainerItems property.
     * 
     * @return the containerItems value.
     */
    public List<ContainerItem> getContainerItems() {
        return this.containerItems;
    }

    /**
     * Set the containerItems property: The ContainerItems property.
     * 
     * @param containerItems the containerItems value to set.
     * @return the ListContainersSegmentResponse object itself.
     */
    public ListContainersSegmentResponse setContainerItems(List<ContainerItem> containerItems) {
        this.containerItems = containerItems;
        return this;
    }

    /**
     * Get the nextMarker property: The NextMarker property.
     * 
     * @return the nextMarker value.
     */
    public String getNextMarker() {
        return this.nextMarker;
    }

    /**
     * Set the nextMarker property: The NextMarker property.
     * 
     * @param nextMarker the nextMarker value to set.
     * @return the ListContainersSegmentResponse object itself.
     */
    public ListContainersSegmentResponse setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }

    public void validate() {
        if (getServiceEndpoint() == null) {
            throw new IllegalArgumentException("Missing required property serviceEndpoint in model ListContainersSegmentResponse");
        }
        if (getContainerItems() == null) {
            throw new IllegalArgumentException("Missing required property containerItems in model ListContainersSegmentResponse");
        } else {
            getContainerItems().forEach(e -> e.validate());
        }
    }
}
