/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodyboolean.implementation;

import fixtures.bodyboolean.AutoRestBoolTestService;
import fixtures.bodyboolean.Bools;
import com.microsoft.rest.ServiceClient;
import com.microsoft.rest.RestClient;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/**
 * Initializes a new instance of the AutoRestBoolTestService class.
 */
public class AutoRestBoolTestServiceImpl extends ServiceClient implements AutoRestBoolTestService {

    /**
     * The Bools object to access its operations.
     */
    private Bools bools;

    /**
     * Gets the Bools object to access its operations.
     * @return the Bools object.
     */
    public Bools bools() {
        return this.bools;
    }

    /**
     * Initializes an instance of AutoRestBoolTestService client.
     */
    public AutoRestBoolTestServiceImpl() {
        this("http://localhost");
    }

    /**
     * Initializes an instance of AutoRestBoolTestService client.
     *
     * @param baseUrl the base URL of the host
     */
    public AutoRestBoolTestServiceImpl(String baseUrl) {
        super(baseUrl);
        initialize();
    }

    /**
     * Initializes an instance of AutoRestBoolTestService client.
     *
     * @param clientBuilder the builder for building an OkHttp client, bundled with user configurations
     * @param restBuilder the builder for building an Retrofit client, bundled with user configurations
     */
    public AutoRestBoolTestServiceImpl(OkHttpClient.Builder clientBuilder, Retrofit.Builder restBuilder) {
        this("http://localhost", clientBuilder, restBuilder);
        initialize();
    }

    /**
     * Initializes an instance of AutoRestBoolTestService client.
     *
     * @param baseUrl the base URL of the host
     * @param clientBuilder the builder for building an OkHttp client, bundled with user configurations
     * @param restBuilder the builder for building an Retrofit client, bundled with user configurations
     */
    public AutoRestBoolTestServiceImpl(String baseUrl, OkHttpClient.Builder clientBuilder, Retrofit.Builder restBuilder) {
        super(baseUrl, clientBuilder, restBuilder);
        initialize();
    }

    /**
     * Initializes an instance of AutoRestBoolTestService client.
     *
     * @param restClient the REST client containing pre-configured settings
     */
    public AutoRestBoolTestServiceImpl(RestClient restClient) {
        super(restClient);
        initialize();
    }

    private void initialize() {
        this.bools = new BoolsImpl(retrofit(), this);
    }
}