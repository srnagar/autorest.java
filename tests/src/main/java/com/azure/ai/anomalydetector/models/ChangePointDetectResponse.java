package com.azure.ai.anomalydetector.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The ChangePointDetectResponse model.
 */
@Fluent
public final class ChangePointDetectResponse {
    /*
     * Frequency extracted from the series, zero means no recurrent pattern has
     * been found.
     */
    @JsonProperty(value = "period", required = true)
    private int period;

    /*
     * isChangePoint contains change point properties for each input point.
     * True means an anomaly either negative or positive has been detected. The
     * index of the array is consistent with the input series.
     */
    @JsonProperty(value = "isChangePoint", required = true)
    private List<Boolean> isChangePoint;

    /*
     * the change point confidence of each point
     */
    @JsonProperty(value = "confidenceScores", required = true)
    private List<Float> confidenceScores;

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
     * @return the ChangePointDetectResponse object itself.
     */
    public ChangePointDetectResponse setPeriod(int period) {
        this.period = period;
        return this;
    }

    /**
     * Get the isChangePoint property: isChangePoint contains change point
     * properties for each input point. True means an anomaly either negative
     * or positive has been detected. The index of the array is consistent with
     * the input series.
     * 
     * @return the isChangePoint value.
     */
    public List<Boolean> getIsChangePoint() {
        return this.isChangePoint;
    }

    /**
     * Set the isChangePoint property: isChangePoint contains change point
     * properties for each input point. True means an anomaly either negative
     * or positive has been detected. The index of the array is consistent with
     * the input series.
     * 
     * @param isChangePoint the isChangePoint value to set.
     * @return the ChangePointDetectResponse object itself.
     */
    public ChangePointDetectResponse setIsChangePoint(List<Boolean> isChangePoint) {
        this.isChangePoint = isChangePoint;
        return this;
    }

    /**
     * Get the confidenceScores property: the change point confidence of each
     * point.
     * 
     * @return the confidenceScores value.
     */
    public List<Float> getConfidenceScores() {
        return this.confidenceScores;
    }

    /**
     * Set the confidenceScores property: the change point confidence of each
     * point.
     * 
     * @param confidenceScores the confidenceScores value to set.
     * @return the ChangePointDetectResponse object itself.
     */
    public ChangePointDetectResponse setConfidenceScores(List<Float> confidenceScores) {
        this.confidenceScores = confidenceScores;
        return this;
    }

    public void validate() {
        if (getIsChangePoint() == null) {
            throw new IllegalArgumentException("Missing required property isChangePoint in model ChangePointDetectResponse");
        }
        if (getConfidenceScores() == null) {
            throw new IllegalArgumentException("Missing required property confidenceScores in model ChangePointDetectResponse");
        }
    }
}
