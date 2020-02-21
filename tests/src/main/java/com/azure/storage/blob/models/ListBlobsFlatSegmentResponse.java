package com.azure.storage.blob.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The ListBlobsFlatSegmentResponse model.
 */
@Fluent
public final class ListBlobsFlatSegmentResponse {
    /*
     * The ServiceEndpoint property.
     */
    @JsonProperty(value = "ServiceEndpoint", required = true)
    private String serviceEndpoint;

    /*
     * The ContainerName property.
     */
    @JsonProperty(value = "ContainerName", required = true)
    private String containerName;

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
     * The Segment property.
     */
    @JsonProperty(value = "Blobs", required = true)
    private BlobFlatListSegment segment;

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
     * @return the ListBlobsFlatSegmentResponse object itself.
     */
    public ListBlobsFlatSegmentResponse setServiceEndpoint(String serviceEndpoint) {
        this.serviceEndpoint = serviceEndpoint;
        return this;
    }

    /**
     * Get the containerName property: The ContainerName property.
     * 
     * @return the containerName value.
     */
    public String getContainerName() {
        return this.containerName;
    }

    /**
     * Set the containerName property: The ContainerName property.
     * 
     * @param containerName the containerName value to set.
     * @return the ListBlobsFlatSegmentResponse object itself.
     */
    public ListBlobsFlatSegmentResponse setContainerName(String containerName) {
        this.containerName = containerName;
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
     * @return the ListBlobsFlatSegmentResponse object itself.
     */
    public ListBlobsFlatSegmentResponse setPrefix(String prefix) {
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
     * @return the ListBlobsFlatSegmentResponse object itself.
     */
    public ListBlobsFlatSegmentResponse setMarker(String marker) {
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
     * @return the ListBlobsFlatSegmentResponse object itself.
     */
    public ListBlobsFlatSegmentResponse setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * Get the segment property: The Segment property.
     * 
     * @return the segment value.
     */
    public BlobFlatListSegment getSegment() {
        return this.segment;
    }

    /**
     * Set the segment property: The Segment property.
     * 
     * @param segment the segment value to set.
     * @return the ListBlobsFlatSegmentResponse object itself.
     */
    public ListBlobsFlatSegmentResponse setSegment(BlobFlatListSegment segment) {
        this.segment = segment;
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
     * @return the ListBlobsFlatSegmentResponse object itself.
     */
    public ListBlobsFlatSegmentResponse setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }

    public void validate() {
        if (getServiceEndpoint() == null) {
            throw new IllegalArgumentException("Missing required property serviceEndpoint in model ListBlobsFlatSegmentResponse");
        }
        if (getContainerName() == null) {
            throw new IllegalArgumentException("Missing required property containerName in model ListBlobsFlatSegmentResponse");
        }
        if (getSegment() == null) {
            throw new IllegalArgumentException("Missing required property segment in model ListBlobsFlatSegmentResponse");
        } else {
            getSegment().validate();
        }
    }
}
