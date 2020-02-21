package com.azure.storage.blob.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for SequenceNumberActionType.
 */
public enum SequenceNumberActionType {
    /**
     * Enum value max.
     */
    MAX("max"),

    /**
     * Enum value update.
     */
    UPDATE("update"),

    /**
     * Enum value increment.
     */
    INCREMENT("increment");

    /**
     * The actual serialized value for a SequenceNumberActionType instance.
     */
    private final String value;

    SequenceNumberActionType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a SequenceNumberActionType instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed SequenceNumberActionType object, or null if unable to parse.
     */
    @JsonCreator
    public static SequenceNumberActionType fromString(String value) {
        SequenceNumberActionType[] items = SequenceNumberActionType.values();
        for (SequenceNumberActionType item : items) {
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
