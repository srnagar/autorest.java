package com.azure.storage.blob.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for LeaseDurationType.
 */
public enum LeaseDurationType {
    /**
     * Enum value infinite.
     */
    INFINITE("infinite"),

    /**
     * Enum value fixed.
     */
    FIXED("fixed");

    /**
     * The actual serialized value for a LeaseDurationType instance.
     */
    private final String value;

    LeaseDurationType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a LeaseDurationType instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed LeaseDurationType object, or null if unable to parse.
     */
    @JsonCreator
    public static LeaseDurationType fromString(String value) {
        LeaseDurationType[] items = LeaseDurationType.values();
        for (LeaseDurationType item : items) {
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
