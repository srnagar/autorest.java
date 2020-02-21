package com.azure.ai.anomalydetector.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The LastDetectResponse model.
 */
@Fluent
public final class LastDetectResponse {
    /*
     * Frequency extracted from the series, zero means no recurrent pattern has
     * been found.
     */
    @JsonProperty(value = "period", required = true)
    private int period;

    /*
     * Suggested input series points needed for detecting the latest point.
     */
    @JsonProperty(value = "suggestedWindow", required = true)
    private int suggestedWindow;

    /*
     * Expected value of the latest point.
     */
    @JsonProperty(value = "expectedValue", required = true)
    private float expectedValue;

    /*
     * Upper margin of the latest point. UpperMargin is used to calculate
     * upperBoundary, which equals to expectedValue + (100 -
     * marginScale)*upperMargin. If the value of latest point is between
     * upperBoundary and lowerBoundary, it should be treated as normal value.
     * By adjusting marginScale value, anomaly status of latest point can be
     * changed.
     */
    @JsonProperty(value = "upperMargin", required = true)
    private float upperMargin;

    /*
     * Lower margin of the latest point. LowerMargin is used to calculate
     * lowerBoundary, which equals to expectedValue - (100 -
     * marginScale)*lowerMargin.
     */
    @JsonProperty(value = "lowerMargin", required = true)
    private float lowerMargin;

    /*
     * Anomaly status of the latest point, true means the latest point is an
     * anomaly either in negative direction or positive direction.
     */
    @JsonProperty(value = "isAnomaly", required = true)
    private boolean isAnomaly;

    /*
     * Anomaly status in negative direction of the latest point. True means the
     * latest point is an anomaly and its real value is smaller than the
     * expected one.
     */
    @JsonProperty(value = "isNegativeAnomaly", required = true)
    private boolean isNegativeAnomaly;

    /*
     * Anomaly status in positive direction of the latest point. True means the
     * latest point is an anomaly and its real value is larger than the
     * expected one.
     */
    @JsonProperty(value = "isPositiveAnomaly", required = true)
    private boolean isPositiveAnomaly;

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
     * @return the LastDetectResponse object itself.
     */
    public LastDetectResponse setPeriod(int period) {
        this.period = period;
        return this;
    }

    /**
     * Get the suggestedWindow property: Suggested input series points needed
     * for detecting the latest point.
     * 
     * @return the suggestedWindow value.
     */
    public int getSuggestedWindow() {
        return this.suggestedWindow;
    }

    /**
     * Set the suggestedWindow property: Suggested input series points needed
     * for detecting the latest point.
     * 
     * @param suggestedWindow the suggestedWindow value to set.
     * @return the LastDetectResponse object itself.
     */
    public LastDetectResponse setSuggestedWindow(int suggestedWindow) {
        this.suggestedWindow = suggestedWindow;
        return this;
    }

    /**
     * Get the expectedValue property: Expected value of the latest point.
     * 
     * @return the expectedValue value.
     */
    public float getExpectedValue() {
        return this.expectedValue;
    }

    /**
     * Set the expectedValue property: Expected value of the latest point.
     * 
     * @param expectedValue the expectedValue value to set.
     * @return the LastDetectResponse object itself.
     */
    public LastDetectResponse setExpectedValue(float expectedValue) {
        this.expectedValue = expectedValue;
        return this;
    }

    /**
     * Get the upperMargin property: Upper margin of the latest point.
     * UpperMargin is used to calculate upperBoundary, which equals to
     * expectedValue + (100 - marginScale)*upperMargin. If the value of latest
     * point is between upperBoundary and lowerBoundary, it should be treated
     * as normal value. By adjusting marginScale value, anomaly status of
     * latest point can be changed.
     * 
     * @return the upperMargin value.
     */
    public float getUpperMargin() {
        return this.upperMargin;
    }

    /**
     * Set the upperMargin property: Upper margin of the latest point.
     * UpperMargin is used to calculate upperBoundary, which equals to
     * expectedValue + (100 - marginScale)*upperMargin. If the value of latest
     * point is between upperBoundary and lowerBoundary, it should be treated
     * as normal value. By adjusting marginScale value, anomaly status of
     * latest point can be changed.
     * 
     * @param upperMargin the upperMargin value to set.
     * @return the LastDetectResponse object itself.
     */
    public LastDetectResponse setUpperMargin(float upperMargin) {
        this.upperMargin = upperMargin;
        return this;
    }

    /**
     * Get the lowerMargin property: Lower margin of the latest point.
     * LowerMargin is used to calculate lowerBoundary, which equals to
     * expectedValue - (100 - marginScale)*lowerMargin.
     * 
     * @return the lowerMargin value.
     */
    public float getLowerMargin() {
        return this.lowerMargin;
    }

    /**
     * Set the lowerMargin property: Lower margin of the latest point.
     * LowerMargin is used to calculate lowerBoundary, which equals to
     * expectedValue - (100 - marginScale)*lowerMargin.
     * 
     * @param lowerMargin the lowerMargin value to set.
     * @return the LastDetectResponse object itself.
     */
    public LastDetectResponse setLowerMargin(float lowerMargin) {
        this.lowerMargin = lowerMargin;
        return this;
    }

    /**
     * Get the isAnomaly property: Anomaly status of the latest point, true
     * means the latest point is an anomaly either in negative direction or
     * positive direction.
     * 
     * @return the isAnomaly value.
     */
    public boolean isAnomaly() {
        return this.isAnomaly;
    }

    /**
     * Set the isAnomaly property: Anomaly status of the latest point, true
     * means the latest point is an anomaly either in negative direction or
     * positive direction.
     * 
     * @param isAnomaly the isAnomaly value to set.
     * @return the LastDetectResponse object itself.
     */
    public LastDetectResponse setIsAnomaly(boolean isAnomaly) {
        this.isAnomaly = isAnomaly;
        return this;
    }

    /**
     * Get the isNegativeAnomaly property: Anomaly status in negative direction
     * of the latest point. True means the latest point is an anomaly and its
     * real value is smaller than the expected one.
     * 
     * @return the isNegativeAnomaly value.
     */
    public boolean isNegativeAnomaly() {
        return this.isNegativeAnomaly;
    }

    /**
     * Set the isNegativeAnomaly property: Anomaly status in negative direction
     * of the latest point. True means the latest point is an anomaly and its
     * real value is smaller than the expected one.
     * 
     * @param isNegativeAnomaly the isNegativeAnomaly value to set.
     * @return the LastDetectResponse object itself.
     */
    public LastDetectResponse setIsNegativeAnomaly(boolean isNegativeAnomaly) {
        this.isNegativeAnomaly = isNegativeAnomaly;
        return this;
    }

    /**
     * Get the isPositiveAnomaly property: Anomaly status in positive direction
     * of the latest point. True means the latest point is an anomaly and its
     * real value is larger than the expected one.
     * 
     * @return the isPositiveAnomaly value.
     */
    public boolean isPositiveAnomaly() {
        return this.isPositiveAnomaly;
    }

    /**
     * Set the isPositiveAnomaly property: Anomaly status in positive direction
     * of the latest point. True means the latest point is an anomaly and its
     * real value is larger than the expected one.
     * 
     * @param isPositiveAnomaly the isPositiveAnomaly value to set.
     * @return the LastDetectResponse object itself.
     */
    public LastDetectResponse setIsPositiveAnomaly(boolean isPositiveAnomaly) {
        this.isPositiveAnomaly = isPositiveAnomaly;
        return this;
    }

    public void validate() {
    }
}
