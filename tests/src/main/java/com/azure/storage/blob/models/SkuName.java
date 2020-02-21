package com.azure.storage.blob.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for SkuName.
 */
public enum SkuName {
    /**
     * Enum value Standard_LRS.
     */
    STANDARD_LRS("Standard_LRS"),

    /**
     * Enum value Standard_GRS.
     */
    STANDARD_GRS("Standard_GRS"),

    /**
     * Enum value Standard_RAGRS.
     */
    STANDARD_RAGRS("Standard_RAGRS"),

    /**
     * Enum value Standard_ZRS.
     */
    STANDARD_ZRS("Standard_ZRS"),

    /**
     * Enum value Premium_LRS.
     */
    PREMIUM_LRS("Premium_LRS");

    /**
     * The actual serialized value for a SkuName instance.
     */
    private final String value;

    SkuName(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a SkuName instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed SkuName object, or null if unable to parse.
     */
    @JsonCreator
    public static SkuName fromString(String value) {
        SkuName[] items = SkuName.values();
        for (SkuName item : items) {
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
