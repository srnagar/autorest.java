package com.azure.storage.blob.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The BlobItem model.
 */
@Fluent
public final class BlobItem {
    /*
     * The Name property.
     */
    @JsonProperty(value = "Name", required = true)
    private String name;

    /*
     * The Deleted property.
     */
    @JsonProperty(value = "Deleted", required = true)
    private boolean deleted;

    /*
     * The Snapshot property.
     */
    @JsonProperty(value = "Snapshot", required = true)
    private String snapshot;

    /*
     * Properties of a blob
     */
    @JsonProperty(value = "Properties", required = true)
    private BlobProperties properties;

    /*
     * The Metadata property.
     */
    @JsonProperty(value = "Metadata")
    private BlobMetadata metadata;

    /**
     * Get the name property: The Name property.
     * 
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The Name property.
     * 
     * @param name the name value to set.
     * @return the BlobItem object itself.
     */
    public BlobItem setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the deleted property: The Deleted property.
     * 
     * @return the deleted value.
     */
    public boolean isDeleted() {
        return this.deleted;
    }

    /**
     * Set the deleted property: The Deleted property.
     * 
     * @param deleted the deleted value to set.
     * @return the BlobItem object itself.
     */
    public BlobItem setDeleted(boolean deleted) {
        this.deleted = deleted;
        return this;
    }

    /**
     * Get the snapshot property: The Snapshot property.
     * 
     * @return the snapshot value.
     */
    public String getSnapshot() {
        return this.snapshot;
    }

    /**
     * Set the snapshot property: The Snapshot property.
     * 
     * @param snapshot the snapshot value to set.
     * @return the BlobItem object itself.
     */
    public BlobItem setSnapshot(String snapshot) {
        this.snapshot = snapshot;
        return this;
    }

    /**
     * Get the properties property: Properties of a blob.
     * 
     * @return the properties value.
     */
    public BlobProperties getProperties() {
        return this.properties;
    }

    /**
     * Set the properties property: Properties of a blob.
     * 
     * @param properties the properties value to set.
     * @return the BlobItem object itself.
     */
    public BlobItem setProperties(BlobProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the metadata property: The Metadata property.
     * 
     * @return the metadata value.
     */
    public BlobMetadata getMetadata() {
        return this.metadata;
    }

    /**
     * Set the metadata property: The Metadata property.
     * 
     * @param metadata the metadata value to set.
     * @return the BlobItem object itself.
     */
    public BlobItem setMetadata(BlobMetadata metadata) {
        this.metadata = metadata;
        return this;
    }

    public void validate() {
        if (getName() == null) {
            throw new IllegalArgumentException("Missing required property name in model BlobItem");
        }
        if (getSnapshot() == null) {
            throw new IllegalArgumentException("Missing required property snapshot in model BlobItem");
        }
        if (getProperties() == null) {
            throw new IllegalArgumentException("Missing required property properties in model BlobItem");
        } else {
            getProperties().validate();
        }
        if (getMetadata() != null) {
            getMetadata().validate();
        }
    }
}
