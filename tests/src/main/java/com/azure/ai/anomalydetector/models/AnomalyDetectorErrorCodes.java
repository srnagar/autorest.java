package com.azure.ai.anomalydetector.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Defines values for AnomalyDetectorErrorCodes.
 */
public final class AnomalyDetectorErrorCodes extends ExpandableStringEnum<AnomalyDetectorErrorCodes> {
    /**
     * Static value InvalidCustomInterval for AnomalyDetectorErrorCodes.
     */
    public static final AnomalyDetectorErrorCodes INVALID_CUSTOM_INTERVAL = fromString("InvalidCustomInterval");

    /**
     * Static value BadArgument for AnomalyDetectorErrorCodes.
     */
    public static final AnomalyDetectorErrorCodes BAD_ARGUMENT = fromString("BadArgument");

    /**
     * Static value InvalidGranularity for AnomalyDetectorErrorCodes.
     */
    public static final AnomalyDetectorErrorCodes INVALID_GRANULARITY = fromString("InvalidGranularity");

    /**
     * Static value InvalidPeriod for AnomalyDetectorErrorCodes.
     */
    public static final AnomalyDetectorErrorCodes INVALID_PERIOD = fromString("InvalidPeriod");

    /**
     * Static value InvalidModelArgument for AnomalyDetectorErrorCodes.
     */
    public static final AnomalyDetectorErrorCodes INVALID_MODEL_ARGUMENT = fromString("InvalidModelArgument");

    /**
     * Static value InvalidSeries for AnomalyDetectorErrorCodes.
     */
    public static final AnomalyDetectorErrorCodes INVALID_SERIES = fromString("InvalidSeries");

    /**
     * Static value InvalidJsonFormat for AnomalyDetectorErrorCodes.
     */
    public static final AnomalyDetectorErrorCodes INVALID_JSON_FORMAT = fromString("InvalidJsonFormat");

    /**
     * Static value RequiredGranularity for AnomalyDetectorErrorCodes.
     */
    public static final AnomalyDetectorErrorCodes REQUIRED_GRANULARITY = fromString("RequiredGranularity");

    /**
     * Static value RequiredSeries for AnomalyDetectorErrorCodes.
     */
    public static final AnomalyDetectorErrorCodes REQUIRED_SERIES = fromString("RequiredSeries");

    /**
     * Creates or finds a AnomalyDetectorErrorCodes from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding AnomalyDetectorErrorCodes.
     */
    @JsonCreator
    public static AnomalyDetectorErrorCodes fromString(String name) {
        return fromString(name, AnomalyDetectorErrorCodes.class);
    }

    /**
     * @return known AnomalyDetectorErrorCodes values.
     */
    public static Collection<AnomalyDetectorErrorCodes> values() {
        return values(AnomalyDetectorErrorCodes.class);
    }
}
