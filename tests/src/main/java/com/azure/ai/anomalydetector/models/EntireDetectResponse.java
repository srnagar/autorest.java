package com.azure.ai.anomalydetector.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The EntireDetectResponse model.
 */
@Fluent
public final class EntireDetectResponse {
    /*
     * Frequency extracted from the series, zero means no recurrent pattern has
     * been found.
     */
    @JsonProperty(value = "period", required = true)
    private int period;

    /*
     * ExpectedValues contain expected value for each input point. The index of
     * the array is consistent with the input series.
     */
    @JsonProperty(value = "expectedValues", required = true)
    private List<Float> expectedValues;

    /*
     * UpperMargins contain upper margin of each input point. UpperMargin is
     * used to calculate upperBoundary, which equals to expectedValue + (100 -
     * marginScale)*upperMargin. Anomalies in response can be filtered by
     * upperBoundary and lowerBoundary. By adjusting marginScale value, less
     * significant anomalies can be filtered in client side. The index of the
     * array is consistent with the input series.
     */
    @JsonProperty(value = "upperMargins", required = true)
    private List<Float> upperMargins;

    /*
     * LowerMargins contain lower margin of each input point. LowerMargin is
     * used to calculate lowerBoundary, which equals to expectedValue - (100 -
     * marginScale)*lowerMargin. Points between the boundary can be marked as
     * normal ones in client side. The index of the array is consistent with
     * the input series.
     */
    @JsonProperty(value = "lowerMargins", required = true)
    private List<Float> lowerMargins;

    /*
     * IsAnomaly contains anomaly properties for each input point. True means
     * an anomaly either negative or positive has been detected. The index of
     * the array is consistent with the input series.
     */
    @JsonProperty(value = "isAnomaly", required = true)
    private List<Boolean> isAnomaly;

    /*
     * IsNegativeAnomaly contains anomaly status in negative direction for each
     * input point. True means a negative anomaly has been detected. A negative
     * anomaly means the point is detected as an anomaly and its real value is
     * smaller than the expected one. The index of the array is consistent with
     * the input series.
     */
    @JsonProperty(value = "isNegativeAnomaly", required = true)
    private List<Boolean> isNegativeAnomaly;

    /*
     * IsPositiveAnomaly contain anomaly status in positive direction for each
     * input point. True means a positive anomaly has been detected. A positive
     * anomaly means the point is detected as an anomaly and its real value is
     * larger than the expected one. The index of the array is consistent with
     * the input series.
     */
    @JsonProperty(value = "isPositiveAnomaly", required = true)
    private List<Boolean> isPositiveAnomaly;

    /**
     * Get the period property: Frequency extracted from the series, zero means
     * no recurrent pattern has been found.
     * 
     * @return the period value.
     */
    public int getPeriod() {
        return this.period;
    }

    /**
     * Set the period property: Frequency extracted from the series, zero means
     * no recurrent pattern has been found.
     * 
     * @param period the period value to set.
     * @return the EntireDetectResponse object itself.
     */
    public EntireDetectResponse setPeriod(int period) {
        this.period = period;
        return this;
    }

    /**
     * Get the expectedValues property: ExpectedValues contain expected value
     * for each input point. The index of the array is consistent with the
     * input series.
     * 
     * @return the expectedValues value.
     */
    public List<Float> getExpectedValues() {
        return this.expectedValues;
    }

    /**
     * Set the expectedValues property: ExpectedValues contain expected value
     * for each input point. The index of the array is consistent with the
     * input series.
     * 
     * @param expectedValues the expectedValues value to set.
     * @return the EntireDetectResponse object itself.
     */
    public EntireDetectResponse setExpectedValues(List<Float> expectedValues) {
        this.expectedValues = expectedValues;
        return this;
    }

    /**
     * Get the upperMargins property: UpperMargins contain upper margin of each
     * input point. UpperMargin is used to calculate upperBoundary, which
     * equals to expectedValue + (100 - marginScale)*upperMargin. Anomalies in
     * response can be filtered by upperBoundary and lowerBoundary. By
     * adjusting marginScale value, less significant anomalies can be filtered
     * in client side. The index of the array is consistent with the input
     * series.
     * 
     * @return the upperMargins value.
     */
    public List<Float> getUpperMargins() {
        return this.upperMargins;
    }

    /**
     * Set the upperMargins property: UpperMargins contain upper margin of each
     * input point. UpperMargin is used to calculate upperBoundary, which
     * equals to expectedValue + (100 - marginScale)*upperMargin. Anomalies in
     * response can be filtered by upperBoundary and lowerBoundary. By
     * adjusting marginScale value, less significant anomalies can be filtered
     * in client side. The index of the array is consistent with the input
     * series.
     * 
     * @param upperMargins the upperMargins value to set.
     * @return the EntireDetectResponse object itself.
     */
    public EntireDetectResponse setUpperMargins(List<Float> upperMargins) {
        this.upperMargins = upperMargins;
        return this;
    }

    /**
     * Get the lowerMargins property: LowerMargins contain lower margin of each
     * input point. LowerMargin is used to calculate lowerBoundary, which
     * equals to expectedValue - (100 - marginScale)*lowerMargin. Points
     * between the boundary can be marked as normal ones in client side. The
     * index of the array is consistent with the input series.
     * 
     * @return the lowerMargins value.
     */
    public List<Float> getLowerMargins() {
        return this.lowerMargins;
    }

    /**
     * Set the lowerMargins property: LowerMargins contain lower margin of each
     * input point. LowerMargin is used to calculate lowerBoundary, which
     * equals to expectedValue - (100 - marginScale)*lowerMargin. Points
     * between the boundary can be marked as normal ones in client side. The
     * index of the array is consistent with the input series.
     * 
     * @param lowerMargins the lowerMargins value to set.
     * @return the EntireDetectResponse object itself.
     */
    public EntireDetectResponse setLowerMargins(List<Float> lowerMargins) {
        this.lowerMargins = lowerMargins;
        return this;
    }

    /**
     * Get the isAnomaly property: IsAnomaly contains anomaly properties for
     * each input point. True means an anomaly either negative or positive has
     * been detected. The index of the array is consistent with the input
     * series.
     * 
     * @return the isAnomaly value.
     */
    public List<Boolean> getIsAnomaly() {
        return this.isAnomaly;
    }

    /**
     * Set the isAnomaly property: IsAnomaly contains anomaly properties for
     * each input point. True means an anomaly either negative or positive has
     * been detected. The index of the array is consistent with the input
     * series.
     * 
     * @param isAnomaly the isAnomaly value to set.
     * @return the EntireDetectResponse object itself.
     */
    public EntireDetectResponse setIsAnomaly(List<Boolean> isAnomaly) {
        this.isAnomaly = isAnomaly;
        return this;
    }

    /**
     * Get the isNegativeAnomaly property: IsNegativeAnomaly contains anomaly
     * status in negative direction for each input point. True means a negative
     * anomaly has been detected. A negative anomaly means the point is
     * detected as an anomaly and its real value is smaller than the expected
     * one. The index of the array is consistent with the input series.
     * 
     * @return the isNegativeAnomaly value.
     */
    public List<Boolean> getIsNegativeAnomaly() {
        return this.isNegativeAnomaly;
    }

    /**
     * Set the isNegativeAnomaly property: IsNegativeAnomaly contains anomaly
     * status in negative direction for each input point. True means a negative
     * anomaly has been detected. A negative anomaly means the point is
     * detected as an anomaly and its real value is smaller than the expected
     * one. The index of the array is consistent with the input series.
     * 
     * @param isNegativeAnomaly the isNegativeAnomaly value to set.
     * @return the EntireDetectResponse object itself.
     */
    public EntireDetectResponse setIsNegativeAnomaly(List<Boolean> isNegativeAnomaly) {
        this.isNegativeAnomaly = isNegativeAnomaly;
        return this;
    }

    /**
     * Get the isPositiveAnomaly property: IsPositiveAnomaly contain anomaly
     * status in positive direction for each input point. True means a positive
     * anomaly has been detected. A positive anomaly means the point is
     * detected as an anomaly and its real value is larger than the expected
     * one. The index of the array is consistent with the input series.
     * 
     * @return the isPositiveAnomaly value.
     */
    public List<Boolean> getIsPositiveAnomaly() {
        return this.isPositiveAnomaly;
    }

    /**
     * Set the isPositiveAnomaly property: IsPositiveAnomaly contain anomaly
     * status in positive direction for each input point. True means a positive
     * anomaly has been detected. A positive anomaly means the point is
     * detected as an anomaly and its real value is larger than the expected
     * one. The index of the array is consistent with the input series.
     * 
     * @param isPositiveAnomaly the isPositiveAnomaly value to set.
     * @return the EntireDetectResponse object itself.
     */
    public EntireDetectResponse setIsPositiveAnomaly(List<Boolean> isPositiveAnomaly) {
        this.isPositiveAnomaly = isPositiveAnomaly;
        return this;
    }

    public void validate() {
        if (getExpectedValues() == null) {
            throw new IllegalArgumentException("Missing required property expectedValues in model EntireDetectResponse");
        }
        if (getUpperMargins() == null) {
            throw new IllegalArgumentException("Missing required property upperMargins in model EntireDetectResponse");
        }
        if (getLowerMargins() == null) {
            throw new IllegalArgumentException("Missing required property lowerMargins in model EntireDetectResponse");
        }
        if (getIsAnomaly() == null) {
            throw new IllegalArgumentException("Missing required property isAnomaly in model EntireDetectResponse");
        }
        if (getIsNegativeAnomaly() == null) {
            throw new IllegalArgumentException("Missing required property isNegativeAnomaly in model EntireDetectResponse");
        }
        if (getIsPositiveAnomaly() == null) {
            throw new IllegalArgumentException("Missing required property isPositiveAnomaly in model EntireDetectResponse");
        }
    }
}
