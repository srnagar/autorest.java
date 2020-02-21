package com.azure.ai.anomalydetector.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The ChangePointDetectRequest model.
 */
@Fluent
public final class ChangePointDetectRequest {
    /*
     * Time series data points. Points should be sorted by timestamp in
     * ascending order to match the change point detection result.
     */
    @JsonProperty(value = "series", required = true)
    private List<Point> series;

    /*
     * Can only be one of yearly, monthly, weekly, daily, hourly or minutely.
     * Granularity is used for verify whether input series is valid.
     */
    @JsonProperty(value = "granularity", required = true)
    private Granularity granularity;

    /*
     * Custom Interval is used to set non-standard time interval, for example,
     * if the series is 5 minutes, request can be set as
     * {"granularity":"minutely", "customInterval":5}.
     */
    @JsonProperty(value = "customInterval")
    private Integer customInterval;

    /*
     * Optional argument, periodic value of a time series. If the value is null
     * or does not present, the API will determine the period automatically.
     */
    @JsonProperty(value = "period")
    private Integer period;

    /*
     * Optional argument, advanced model parameter, a default stableTrendWindow
     * will be used in detection.
     */
    @JsonProperty(value = "stableTrendWindow")
    private Integer stableTrendWindow;

    /*
     * Optional argument, advanced model parameter, between 0.0-1.0, the lower
     * the value is, the larger the trend error will be which means less change
     * point will be accepted.
     */
    @JsonProperty(value = "threshold")
    private Float threshold;

    /**
     * Get the series property: Time series data points. Points should be
     * sorted by timestamp in ascending order to match the change point
     * detection result.
     * 
     * @return the series value.
     */
    public List<Point> getSeries() {
        return this.series;
    }

    /**
     * Set the series property: Time series data points. Points should be
     * sorted by timestamp in ascending order to match the change point
     * detection result.
     * 
     * @param series the series value to set.
     * @return the ChangePointDetectRequest object itself.
     */
    public ChangePointDetectRequest setSeries(List<Point> series) {
        this.series = series;
        return this;
    }

    /**
     * Get the granularity property: Can only be one of yearly, monthly,
     * weekly, daily, hourly or minutely. Granularity is used for verify
     * whether input series is valid.
     * 
     * @return the granularity value.
     */
    public Granularity getGranularity() {
        return this.granularity;
    }

    /**
     * Set the granularity property: Can only be one of yearly, monthly,
     * weekly, daily, hourly or minutely. Granularity is used for verify
     * whether input series is valid.
     * 
     * @param granularity the granularity value to set.
     * @return the ChangePointDetectRequest object itself.
     */
    public ChangePointDetectRequest setGranularity(Granularity granularity) {
        this.granularity = granularity;
        return this;
    }

    /**
     * Get the customInterval property: Custom Interval is used to set
     * non-standard time interval, for example, if the series is 5 minutes,
     * request can be set as {"granularity":"minutely", "customInterval":5}.
     * 
     * @return the customInterval value.
     */
    public Integer getCustomInterval() {
        return this.customInterval;
    }

    /**
     * Set the customInterval property: Custom Interval is used to set
     * non-standard time interval, for example, if the series is 5 minutes,
     * request can be set as {"granularity":"minutely", "customInterval":5}.
     * 
     * @param customInterval the customInterval value to set.
     * @return the ChangePointDetectRequest object itself.
     */
    public ChangePointDetectRequest setCustomInterval(Integer customInterval) {
        this.customInterval = customInterval;
        return this;
    }

    /**
     * Get the period property: Optional argument, periodic value of a time
     * series. If the value is null or does not present, the API will determine
     * the period automatically.
     * 
     * @return the period value.
     */
    public Integer getPeriod() {
        return this.period;
    }

    /**
     * Set the period property: Optional argument, periodic value of a time
     * series. If the value is null or does not present, the API will determine
     * the period automatically.
     * 
     * @param period the period value to set.
     * @return the ChangePointDetectRequest object itself.
     */
    public ChangePointDetectRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }

    /**
     * Get the stableTrendWindow property: Optional argument, advanced model
     * parameter, a default stableTrendWindow will be used in detection.
     * 
     * @return the stableTrendWindow value.
     */
    public Integer getStableTrendWindow() {
        return this.stableTrendWindow;
    }

    /**
     * Set the stableTrendWindow property: Optional argument, advanced model
     * parameter, a default stableTrendWindow will be used in detection.
     * 
     * @param stableTrendWindow the stableTrendWindow value to set.
     * @return the ChangePointDetectRequest object itself.
     */
    public ChangePointDetectRequest setStableTrendWindow(Integer stableTrendWindow) {
        this.stableTrendWindow = stableTrendWindow;
        return this;
    }

    /**
     * Get the threshold property: Optional argument, advanced model parameter,
     * between 0.0-1.0, the lower the value is, the larger the trend error will
     * be which means less change point will be accepted.
     * 
     * @return the threshold value.
     */
    public Float getThreshold() {
        return this.threshold;
    }

    /**
     * Set the threshold property: Optional argument, advanced model parameter,
     * between 0.0-1.0, the lower the value is, the larger the trend error will
     * be which means less change point will be accepted.
     * 
     * @param threshold the threshold value to set.
     * @return the ChangePointDetectRequest object itself.
     */
    public ChangePointDetectRequest setThreshold(Float threshold) {
        this.threshold = threshold;
        return this;
    }

    public void validate() {
        if (getSeries() == null) {
            throw new IllegalArgumentException("Missing required property series in model ChangePointDetectRequest");
        } else {
            getSeries().forEach(e -> e.validate());
        }
        if (getGranularity() == null) {
            throw new IllegalArgumentException("Missing required property granularity in model ChangePointDetectRequest");
        }
    }
}
