package com.azure.ai.anomalydetector.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for Granularity.
 */
public enum Granularity {
    /**
     * Enum value yearly.
     */
    YEARLY("yearly"),

    /**
     * Enum value monthly.
     */
    MONTHLY("monthly"),

    /**
     * Enum value weekly.
     */
    WEEKLY("weekly"),

    /**
     * Enum value daily.
     */
    DAILY("daily"),

    /**
     * Enum value hourly.
     */
    HOURLY("hourly"),

    /**
     * Enum value minutely.
     */
    MINUTELY("minutely");

    /**
     * The actual serialized value for a Granularity instance.
     */
    private final String value;

    Granularity(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a Granularity instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed Granularity object, or null if unable to parse.
     */
    @JsonCreator
    public static Granularity fromString(String value) {
        Granularity[] items = Granularity.values();
        for (Granularity item : items) {
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
