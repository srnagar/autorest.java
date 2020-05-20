package fixtures.xmlservice.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for CopyStatusType. */
public enum CopyStatusType {
    /** Enum value pending. */
    PENDING("pending"),

    /** Enum value success. */
    SUCCESS("success"),

    /** Enum value aborted. */
    ABORTED("aborted"),

    /** Enum value failed. */
    FAILED("failed");

    /** The actual serialized value for a CopyStatusType instance. */
    private final String value;

    CopyStatusType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a CopyStatusType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed CopyStatusType object, or null if unable to parse.
     */
    @JsonCreator
    public static CopyStatusType fromString(String value) {
        CopyStatusType[] items = CopyStatusType.values();
        for (CopyStatusType item : items) {
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
