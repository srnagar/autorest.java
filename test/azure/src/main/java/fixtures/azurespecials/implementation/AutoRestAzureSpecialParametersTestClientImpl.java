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

import com.microsoft.azure.AzureClient;
import com.microsoft.azure.AzureServiceClient;
import com.microsoft.rest.credentials.ServiceClientCredentials;
import com.microsoft.rest.RestClient;
import fixtures.azurespecials.ApiVersionDefaults;
import fixtures.azurespecials.ApiVersionLocals;
import fixtures.azurespecials.AutoRestAzureSpecialParametersTestClient;
import fixtures.azurespecials.Headers;
import fixtures.azurespecials.Odatas;
import fixtures.azurespecials.SkipUrlEncodings;
import fixtures.azurespecials.SubscriptionInCredentials;
import fixtures.azurespecials.SubscriptionInMethods;
import fixtures.azurespecials.XMsClientRequestIds;

/**
 * Initializes a new instance of the AutoRestAzureSpecialParametersTestClientImpl class.
 */
public class AutoRestAzureSpecialParametersTestClientImpl extends AzureServiceClient implements AutoRestAzureSpecialParametersTestClient {
    /** the {@link AzureClient} used for long running operations. */
    private AzureClient azureClient;

    /**
     * Gets the {@link AzureClient} used for long running operations.
     * @return the azure client;
     */
    public AzureClient getAzureClient() {
        return this.azureClient;
    }

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

    /** The preferred language for the response. */
    private String acceptLanguage;

    /**
     * Gets The preferred language for the response.
     *
     * @return the acceptLanguage value.
     */
    public String acceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * Sets The preferred language for the response.
     *
     * @param acceptLanguage the acceptLanguage value.
     * @return the service client itself
     */
    public AutoRestAzureSpecialParametersTestClientImpl withAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }

    /** The retry timeout in seconds for Long Running Operations. Default value is 30. */
    private int longRunningOperationRetryTimeout;

    /**
     * Gets The retry timeout in seconds for Long Running Operations. Default value is 30.
     *
     * @return the longRunningOperationRetryTimeout value.
     */
    public int longRunningOperationRetryTimeout() {
        return this.longRunningOperationRetryTimeout;
    }

    /**
     * Sets The retry timeout in seconds for Long Running Operations. Default value is 30.
     *
     * @param longRunningOperationRetryTimeout the longRunningOperationRetryTimeout value.
     * @return the service client itself
     */
    public AutoRestAzureSpecialParametersTestClientImpl withLongRunningOperationRetryTimeout(int longRunningOperationRetryTimeout) {
        this.longRunningOperationRetryTimeout = longRunningOperationRetryTimeout;
        return this;
    }

    /** Whether a unique x-ms-client-request-id should be generated. When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true. */
    private boolean generateClientRequestId;

    /**
     * Gets Whether a unique x-ms-client-request-id should be generated. When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     *
     * @return the generateClientRequestId value.
     */
    public boolean generateClientRequestId() {
        return this.generateClientRequestId;
    }

    /**
     * Sets Whether a unique x-ms-client-request-id should be generated. When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     *
     * @param generateClientRequestId the generateClientRequestId value.
     * @return the service client itself
     */
    public AutoRestAzureSpecialParametersTestClientImpl withGenerateClientRequestId(boolean generateClientRequestId) {
        this.generateClientRequestId = generateClientRequestId;
        return this;
    }

    /**
     * The XMsClientRequestIds object to access its operations.
     */
    private XMsClientRequestIds xMsClientRequestIds;

    /**
     * Gets the XMsClientRequestIds object to access its operations.
     * @return the XMsClientRequestIds object.
     */
    public XMsClientRequestIds xMsClientRequestIds() {
        return this.xMsClientRequestIds;
    }

    /**
     * The SubscriptionInCredentials object to access its operations.
     */
    private SubscriptionInCredentials subscriptionInCredentials;

    /**
     * Gets the SubscriptionInCredentials object to access its operations.
     * @return the SubscriptionInCredentials object.
     */
    public SubscriptionInCredentials subscriptionInCredentials() {
        return this.subscriptionInCredentials;
    }

    /**
     * The SubscriptionInMethods object to access its operations.
     */
    private SubscriptionInMethods subscriptionInMethods;

    /**
     * Gets the SubscriptionInMethods object to access its operations.
     * @return the SubscriptionInMethods object.
     */
    public SubscriptionInMethods subscriptionInMethods() {
        return this.subscriptionInMethods;
    }

    /**
     * The ApiVersionDefaults object to access its operations.
     */
    private ApiVersionDefaults apiVersionDefaults;

    /**
     * Gets the ApiVersionDefaults object to access its operations.
     * @return the ApiVersionDefaults object.
     */
    public ApiVersionDefaults apiVersionDefaults() {
        return this.apiVersionDefaults;
    }

    /**
     * The ApiVersionLocals object to access its operations.
     */
    private ApiVersionLocals apiVersionLocals;

    /**
     * Gets the ApiVersionLocals object to access its operations.
     * @return the ApiVersionLocals object.
     */
    public ApiVersionLocals apiVersionLocals() {
        return this.apiVersionLocals;
    }

    /**
     * The SkipUrlEncodings object to access its operations.
     */
    private SkipUrlEncodings skipUrlEncodings;

    /**
     * Gets the SkipUrlEncodings object to access its operations.
     * @return the SkipUrlEncodings object.
     */
    public SkipUrlEncodings skipUrlEncodings() {
        return this.skipUrlEncodings;
    }

    /**
     * The Odatas object to access its operations.
     */
    private Odatas odatas;

    /**
     * Gets the Odatas object to access its operations.
     * @return the Odatas object.
     */
    public Odatas odatas() {
        return this.odatas;
    }

    /**
     * The Headers object to access its operations.
     */
    private Headers headers;

    /**
     * Gets the Headers object to access its operations.
     * @return the Headers object.
     */
    public Headers headers() {
        return this.headers;
    }

    /**
     * Initializes an instance of AutoRestAzureSpecialParametersTestClient client.
     *
     * @param credentials the management credentials for Azure
     */
    public AutoRestAzureSpecialParametersTestClientImpl(ServiceClientCredentials credentials) {
        this("http://localhost:3000", credentials);
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
        this.xMsClientRequestIds = new XMsClientRequestIdsImpl(restClient().retrofit(), this);
        this.subscriptionInCredentials = new SubscriptionInCredentialsImpl(restClient().retrofit(), this);
        this.subscriptionInMethods = new SubscriptionInMethodsImpl(restClient().retrofit(), this);
        this.apiVersionDefaults = new ApiVersionDefaultsImpl(restClient().retrofit(), this);
        this.apiVersionLocals = new ApiVersionLocalsImpl(restClient().retrofit(), this);
        this.skipUrlEncodings = new SkipUrlEncodingsImpl(restClient().retrofit(), this);
        this.odatas = new OdatasImpl(restClient().retrofit(), this);
        this.headers = new HeadersImpl(restClient().retrofit(), this);
        this.azureClient = new AzureClient(this);
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
