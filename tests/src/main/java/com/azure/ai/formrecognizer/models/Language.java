package com.azure.ai.formrecognizer.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Defines values for Language.
 */
public final class Language extends ExpandableStringEnum<Language> {
    /**
     * Static value en for Language.
     */
    public static final Language EN = fromString("en");

    /**
     * Static value es for Language.
     */
    public static final Language ES = fromString("es");

    /**
     * Creates or finds a Language from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding Language.
     */
    @JsonCreator
    public static Language fromString(String name) {
        return fromString(name, Language.class);
    }

    /**
     * @return known Language values.
     */
    public static Collection<Language> values() {
        return values(Language.class);
    }
}
