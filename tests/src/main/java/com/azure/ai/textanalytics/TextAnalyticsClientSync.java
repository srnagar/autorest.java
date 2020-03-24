package com.azure.ai.textanalytics;

import com.azure.ai.textanalytics.models.EntitiesBatchResult;
import com.azure.ai.textanalytics.models.ErrorResponseException;
import com.azure.ai.textanalytics.models.KeyPhraseBatchResult;
import com.azure.ai.textanalytics.models.LanguageBatchInput;
import com.azure.ai.textanalytics.models.LanguageBatchResult;
import com.azure.ai.textanalytics.models.MultiLanguageBatchInput;
import com.azure.ai.textanalytics.models.SentimentBatchResult;
import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.CookiePolicy;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import reactor.core.publisher.Mono;

/**
 * Initializes a new instance of the synchronous TextAnalyticsClient type.
 */
@ServiceClient(builder = TextAnalyticsClientBuilder.class)
public final class TextAnalyticsClientSync {
    private TextAnalyticsClient serviceClient;

    /**
     * Initializes an instance of TextAnalyticsClient client.
     */
    TextAnalyticsClientSync(TextAnalyticsClient serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Scores close to 1 indicate 100% certainty that the identified language is true. A total of 120 languages are supported.
     * 
     * @param showStats 
     * @param languageBatchInput 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public LanguageBatchResult detectLanguage(Boolean showStats, LanguageBatchInput languageBatchInput) {
        return this.serviceClient.detectLanguage(showStats, languageBatchInput);
    }

    /**
     * To get even more information on each recognized entity we recommend using the Bing Entity Search API by querying for the recognized entities names. See the &lt;a href="https://docs.microsoft.com/en-us/azure/cognitive-services/text-analytics/text-analytics-supported-languages"&gt;Supported languages in Text Analytics API&lt;/a&gt; for the list of enabled languages.
     * 
     * @param showStats 
     * @param multiLanguageBatchInput 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public EntitiesBatchResult entities(Boolean showStats, MultiLanguageBatchInput multiLanguageBatchInput) {
        return this.serviceClient.entities(showStats, multiLanguageBatchInput);
    }

    /**
     * See the &lt;a href="https://docs.microsoft.com/en-us/azure/cognitive-services/text-analytics/overview#supported-languages"&gt;Text Analytics Documentation&lt;/a&gt; for details about the languages that are supported by key phrase extraction.
     * 
     * @param showStats 
     * @param multiLanguageBatchInput 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public KeyPhraseBatchResult keyPhrases(Boolean showStats, MultiLanguageBatchInput multiLanguageBatchInput) {
        return this.serviceClient.keyPhrases(showStats, multiLanguageBatchInput);
    }

    /**
     * Scores close to 1 indicate positive sentiment, while scores close to 0 indicate negative sentiment. A score of 0.5 indicates the lack of sentiment (e.g. a factoid statement). See the &lt;a href="https://docs.microsoft.com/en-us/azure/cognitive-services/text-analytics/overview#supported-languages"&gt;Text Analytics Documentation&lt;/a&gt; for details about the languages that are supported by sentiment analysis.
     * 
     * @param showStats 
     * @param multiLanguageBatchInput 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SentimentBatchResult sentiment(Boolean showStats, MultiLanguageBatchInput multiLanguageBatchInput) {
        return this.serviceClient.sentiment(showStats, multiLanguageBatchInput);
    }
}
