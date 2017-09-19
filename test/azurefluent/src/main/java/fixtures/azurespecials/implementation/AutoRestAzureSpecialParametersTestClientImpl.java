/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.azurespecials.implementation;

import com.microsoft.azure.AzureServiceClient;
import com.microsoft.azure.v2.AzureProxy;
import com.microsoft.rest.credentials.ServiceClientCredentials;
import com.microsoft.rest.RestClient;
import rx.Single;

/**
 * Initializes a new instance of the AutoRestAzureSpecialParametersTestClientImpl class.
 */
public class AutoRestAzureSpecialParametersTestClientImpl extends AzureServiceClient {


    /** The subscription id, which appears in the path, always modeled in credentials. The value is always '1234-5678-9012-3456'. */
    private String subscriptionId;

    /**
     * Gets The subscription id, which appears in the path, always modeled in credentials. The value is always '1234-5678-9012-3456'.
     *
     * @return the subscriptionId value.
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Sets The subscription id, which appears in the path, always modeled in credentials. The value is always '1234-5678-9012-3456'.
     *
     * @param subscriptionId the subscriptionId value.
     * @return the service client itself
     */
    public AutoRestAzureSpecialParametersTestClientImpl withSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /** The api version, which appears in the query, the value is always '2015-07-01-preview'. */
    private String apiVersion;

    /**
     * Gets The api version, which appears in the query, the value is always '2015-07-01-preview'.
     *
     * @return the apiVersion value.
     */
    public String apiVersion() {
        return this.apiVersion;
    }

    /** Gets or sets the preferred language for the response. */
    private String acceptLanguage;

    /**
     * Gets Gets or sets the preferred language for the response.
     *
     * @return the acceptLanguage value.
     */
    public String acceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * Sets Gets or sets the preferred language for the response.
     *
     * @param acceptLanguage the acceptLanguage value.
     * @return the service client itself
     */
    public AutoRestAzureSpecialParametersTestClientImpl withAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }

    /** Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30. */
    private int longRunningOperationRetryTimeout;

    /**
     * Gets Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30.
     *
     * @return the longRunningOperationRetryTimeout value.
     */
    public int longRunningOperationRetryTimeout() {
        return this.longRunningOperationRetryTimeout;
    }

    /**
     * Sets Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30.
     *
     * @param longRunningOperationRetryTimeout the longRunningOperationRetryTimeout value.
     * @return the service client itself
     */
    public AutoRestAzureSpecialParametersTestClientImpl withLongRunningOperationRetryTimeout(int longRunningOperationRetryTimeout) {
        this.longRunningOperationRetryTimeout = longRunningOperationRetryTimeout;
        return this;
    }

    /** When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true. */
    private boolean generateClientRequestId;

    /**
     * Gets When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     *
     * @return the generateClientRequestId value.
     */
    public boolean generateClientRequestId() {
        return this.generateClientRequestId;
    }

    /**
     * Sets When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     *
     * @param generateClientRequestId the generateClientRequestId value.
     * @return the service client itself
     */
    public AutoRestAzureSpecialParametersTestClientImpl withGenerateClientRequestId(boolean generateClientRequestId) {
        this.generateClientRequestId = generateClientRequestId;
        return this;
    }

    /**
     * The XMsClientRequestIdsInner object to access its operations.
     */
    private XMsClientRequestIdsInner xMsClientRequestIds;

    /**
     * Gets the XMsClientRequestIdsInner object to access its operations.
     * @return the XMsClientRequestIdsInner object.
     */
    public XMsClientRequestIdsInner xMsClientRequestIds() {
        return this.xMsClientRequestIds;
    }

    /**
     * The SubscriptionInCredentialsInner object to access its operations.
     */
    private SubscriptionInCredentialsInner subscriptionInCredentials;

    /**
     * Gets the SubscriptionInCredentialsInner object to access its operations.
     * @return the SubscriptionInCredentialsInner object.
     */
    public SubscriptionInCredentialsInner subscriptionInCredentials() {
        return this.subscriptionInCredentials;
    }

    /**
     * The SubscriptionInMethodsInner object to access its operations.
     */
    private SubscriptionInMethodsInner subscriptionInMethods;

    /**
     * Gets the SubscriptionInMethodsInner object to access its operations.
     * @return the SubscriptionInMethodsInner object.
     */
    public SubscriptionInMethodsInner subscriptionInMethods() {
        return this.subscriptionInMethods;
    }

    /**
     * The ApiVersionDefaultsInner object to access its operations.
     */
    private ApiVersionDefaultsInner apiVersionDefaults;

    /**
     * Gets the ApiVersionDefaultsInner object to access its operations.
     * @return the ApiVersionDefaultsInner object.
     */
    public ApiVersionDefaultsInner apiVersionDefaults() {
        return this.apiVersionDefaults;
    }

    /**
     * The ApiVersionLocalsInner object to access its operations.
     */
    private ApiVersionLocalsInner apiVersionLocals;

    /**
     * Gets the ApiVersionLocalsInner object to access its operations.
     * @return the ApiVersionLocalsInner object.
     */
    public ApiVersionLocalsInner apiVersionLocals() {
        return this.apiVersionLocals;
    }

    /**
     * The SkipUrlEncodingsInner object to access its operations.
     */
    private SkipUrlEncodingsInner skipUrlEncodings;

    /**
     * Gets the SkipUrlEncodingsInner object to access its operations.
     * @return the SkipUrlEncodingsInner object.
     */
    public SkipUrlEncodingsInner skipUrlEncodings() {
        return this.skipUrlEncodings;
    }

    /**
     * The OdatasInner object to access its operations.
     */
    private OdatasInner odatas;

    /**
     * Gets the OdatasInner object to access its operations.
     * @return the OdatasInner object.
     */
    public OdatasInner odatas() {
        return this.odatas;
    }

    /**
     * The HeadersInner object to access its operations.
     */
    private HeadersInner headers;

    /**
     * Gets the HeadersInner object to access its operations.
     * @return the HeadersInner object.
     */
    public HeadersInner headers() {
        return this.headers;
    }

    /**
     * Initializes an instance of AutoRestAzureSpecialParametersTestClient client.
     *
     * @param credentials the management credentials for Azure
     */
    public AutoRestAzureSpecialParametersTestClientImpl(ServiceClientCredentials credentials) {
        this("http://localhost", credentials);
    }

    /**
     * Initializes an instance of AutoRestAzureSpecialParametersTestClient client.
     *
     * @param baseUrl the base URL of the host
     * @param credentials the management credentials for Azure
     */
    public AutoRestAzureSpecialParametersTestClientImpl(String baseUrl, ServiceClientCredentials credentials) {
        super(baseUrl, credentials);
        initialize();
    }

    /**
     * Initializes an instance of AutoRestAzureSpecialParametersTestClient client.
     *
     * @param restClient the REST client to connect to Azure.
     */
    public AutoRestAzureSpecialParametersTestClientImpl(RestClient restClient) {
        super(restClient);
        initialize();
    }

    protected void initialize() {
        this.apiVersion = "2015-07-01-preview";
        this.acceptLanguage = "en-US";
        this.longRunningOperationRetryTimeout = 30;
        this.generateClientRequestId = true;
        this.xMsClientRequestIds = new XMsClientRequestIdsInner(this);
        this.subscriptionInCredentials = new SubscriptionInCredentialsInner(this);
        this.subscriptionInMethods = new SubscriptionInMethodsInner(this);
        this.apiVersionDefaults = new ApiVersionDefaultsInner(this);
        this.apiVersionLocals = new ApiVersionLocalsInner(this);
        this.skipUrlEncodings = new SkipUrlEncodingsInner(this);
        this.odatas = new OdatasInner(this);
        this.headers = new HeadersInner(this);
    }

    /**
     * Gets the User-Agent header for the client.
     *
     * @return the user agent string.
     */
    @Override
    public String userAgent() {
        return String.format("%s (%s, %s)", super.userAgent(), "AutoRestAzureSpecialParametersTestClient", "2015-07-01-preview");
    }
}
