package com.azure.ai.formrecognizer.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Defines values for Enum0.
 */
public final class Enum0 extends ExpandableStringEnum<Enum0> {
    /**
     * Static value full for Enum0.
     */
    public static final Enum0 FULL = fromString("full");

    /**
     * Static value summary for Enum0.
     */
    public static final Enum0 SUMMARY = fromString("summary");

    /**
     * Creates or finds a Enum0 from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding Enum0.
     */
    @JsonCreator
    public static Enum0 fromString(String name) {
        return fromString(name, Enum0.class);
    }

    /**
     * @return known Enum0 values.
     */
    public static Collection<Enum0> values() {
        return values(Enum0.class);
    }
}
