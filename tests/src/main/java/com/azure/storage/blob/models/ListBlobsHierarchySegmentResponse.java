package com.azure.storage.blob.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The ListBlobsHierarchySegmentResponse model.
 */
@Fluent
public final class ListBlobsHierarchySegmentResponse {
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
     * The Delimiter property.
     */
    @JsonProperty(value = "Delimiter")
    private String delimiter;

    /*
     * The Segment property.
     */
    @JsonProperty(value = "Blobs", required = true)
    private BlobHierarchyListSegment segment;

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
     * @return the ListBlobsHierarchySegmentResponse object itself.
     */
    public ListBlobsHierarchySegmentResponse setServiceEndpoint(String serviceEndpoint) {
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
     * @return the ListBlobsHierarchySegmentResponse object itself.
     */
    public ListBlobsHierarchySegmentResponse setContainerName(String containerName) {
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
     * @return the ListBlobsHierarchySegmentResponse object itself.
     */
    public ListBlobsHierarchySegmentResponse setPrefix(String prefix) {
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
     * @return the ListBlobsHierarchySegmentResponse object itself.
     */
    public ListBlobsHierarchySegmentResponse setMarker(String marker) {
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
     * @return the ListBlobsHierarchySegmentResponse object itself.
     */
    public ListBlobsHierarchySegmentResponse setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * Get the delimiter property: The Delimiter property.
     * 
     * @return the delimiter value.
     */
    public String getDelimiter() {
        return this.delimiter;
    }

    /**
     * Set the delimiter property: The Delimiter property.
     * 
     * @param delimiter the delimiter value to set.
     * @return the ListBlobsHierarchySegmentResponse object itself.
     */
    public ListBlobsHierarchySegmentResponse setDelimiter(String delimiter) {
        this.delimiter = delimiter;
        return this;
    }

    /**
     * Get the segment property: The Segment property.
     * 
     * @return the segment value.
     */
    public BlobHierarchyListSegment getSegment() {
        return this.segment;
    }

    /**
     * Set the segment property: The Segment property.
     * 
     * @param segment the segment value to set.
     * @return the ListBlobsHierarchySegmentResponse object itself.
     */
    public ListBlobsHierarchySegmentResponse setSegment(BlobHierarchyListSegment segment) {
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
     * @return the ListBlobsHierarchySegmentResponse object itself.
     */
    public ListBlobsHierarchySegmentResponse setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }

    public void validate() {
        if (getServiceEndpoint() == null) {
            throw new IllegalArgumentException("Missing required property serviceEndpoint in model ListBlobsHierarchySegmentResponse");
        }
        if (getContainerName() == null) {
            throw new IllegalArgumentException("Missing required property containerName in model ListBlobsHierarchySegmentResponse");
        }
        if (getSegment() == null) {
            throw new IllegalArgumentException("Missing required property segment in model ListBlobsHierarchySegmentResponse");
        } else {
            getSegment().validate();
        }
    }
}
