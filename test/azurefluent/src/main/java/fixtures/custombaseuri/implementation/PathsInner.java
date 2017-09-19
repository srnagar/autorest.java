/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.custombaseuri.implementation;

import com.google.common.base.Joiner;
import com.google.common.reflect.TypeToken;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.v2.annotations.ExpectedResponses;
import com.microsoft.rest.v2.annotations.GET;
import com.microsoft.rest.v2.annotations.HeaderParam;
import com.microsoft.rest.v2.annotations.Headers;
import com.microsoft.rest.v2.annotations.Host;
import com.microsoft.rest.v2.annotations.UnexpectedResponseExceptionType;
import com.microsoft.rest.v2.http.HttpClient;
import fixtures.custombaseuri.ErrorException;
import java.io.IOException;
import rx.functions.Func1;
import rx.Observable;
import rx.Single;
import com.microsoft.azure.v2.AzureProxy;

/**
 * An instance of this class provides access to all the operations defined
 * in Paths.
 */
public class PathsInner {
    /** The RestProxy service to perform REST calls. */
    private PathsService service;
    /** The service client containing this operation class. */
    private AutoRestParameterizedHostTestClientImpl client;

    /**
     * Initializes an instance of PathsInner.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public PathsInner(AutoRestParameterizedHostTestClientImpl client) {
        this.service = AzureProxy.create(PathsService.class, client.httpClient(), client.serializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for Paths to be
     * used by Retrofit to perform actually REST calls.
     */
    @Host("http://{accountName}{host}")
    interface PathsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.custombaseuri.Paths getEmpty" })
        @GET("customuri")
        Single<Void> getEmpty(@HeaderParam("accept-language") String acceptLanguage, @HeaderParam("x-ms-parameterized-host") String parameterizedHost, @HeaderParam("User-Agent") String userAgent);

    }

    /**
     * Get a 200 to test a valid base uri.
     *
     * @param accountName Account Name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void getEmpty(String accountName) {
        getEmptyAsync(accountName).toBlocking().value();
    }

    /**
     * Get a 200 to test a valid base uri.
     *
     * @param accountName Account Name
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> getEmptyAsync(String accountName, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(getEmptyAsync(accountName), serviceCallback);
    }

    /**
     * Get a 200 to test a valid base uri.
     *
     * @param accountName Account Name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Single<Void> getEmptyAsync(String accountName) {
        if (accountName == null) {
            throw new IllegalArgumentException("Parameter accountName is required and cannot be null.");
        }
        if (this.client.host() == null) {
            throw new IllegalArgumentException("Parameter this.client.host() is required and cannot be null.");
        }
        String parameterizedHost = Joiner.on(", ").join("{accountName}", accountName, "{host}", this.client.host());
        return service.getEmpty(this.client.acceptLanguage(), parameterizedHost, this.client.userAgent());
    }


}
