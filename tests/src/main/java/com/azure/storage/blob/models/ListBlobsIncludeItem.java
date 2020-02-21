package com.azure.storage.blob.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for ListBlobsIncludeItem.
 */
public enum ListBlobsIncludeItem {
    /**
     * Enum value copy.
     */
    COPY("copy"),

    /**
     * Enum value deleted.
     */
    DELETED("deleted"),

    /**
     * Enum value metadata.
     */
    METADATA("metadata"),

    /**
     * Enum value snapshots.
     */
    SNAPSHOTS("snapshots"),

    /**
     * Enum value uncommittedblobs.
     */
    UNCOMMITTEDBLOBS("uncommittedblobs");

    /**
     * The actual serialized value for a ListBlobsIncludeItem instance.
     */
    private final String value;

    ListBlobsIncludeItem(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a ListBlobsIncludeItem instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed ListBlobsIncludeItem object, or null if unable to parse.
     */
    @JsonCreator
    public static ListBlobsIncludeItem fromString(String value) {
        ListBlobsIncludeItem[] items = ListBlobsIncludeItem.values();
        for (ListBlobsIncludeItem item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
