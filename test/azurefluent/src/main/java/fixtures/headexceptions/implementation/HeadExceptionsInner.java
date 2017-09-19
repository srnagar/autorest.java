/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.headexceptions.implementation;

import com.google.common.reflect.TypeToken;
import com.microsoft.azure.CloudException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.v2.annotations.ExpectedResponses;
import com.microsoft.rest.v2.annotations.HEAD;
import com.microsoft.rest.v2.annotations.HeaderParam;
import com.microsoft.rest.v2.annotations.Headers;
import com.microsoft.rest.v2.annotations.Host;
import com.microsoft.rest.v2.annotations.UnexpectedResponseExceptionType;
import com.microsoft.rest.v2.http.HttpClient;
import java.io.IOException;
import rx.functions.Func1;
import rx.Observable;
import rx.Single;
import com.microsoft.azure.v2.AzureProxy;

/**
 * An instance of this class provides access to all the operations defined
 * in HeadExceptions.
 */
public class HeadExceptionsInner {
    /** The RestProxy service to perform REST calls. */
    private HeadExceptionsService service;
    /** The service client containing this operation class. */
    private AutoRestHeadExceptionTestServiceImpl client;

    /**
     * Initializes an instance of HeadExceptionsInner.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public HeadExceptionsInner(AutoRestHeadExceptionTestServiceImpl client) {
        this.service = AzureProxy.create(HeadExceptionsService.class, client.httpClient(), client.serializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for HeadExceptions to be
     * used by Retrofit to perform actually REST calls.
     */
    @Host("http://localhost")
    interface HeadExceptionsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.headexceptions.HeadExceptions head200" })
        @HEAD("http/success/200")
        Single<Void> head200(@HeaderParam("accept-language") String acceptLanguage, @HeaderParam("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.headexceptions.HeadExceptions head204" })
        @HEAD("http/success/204")
        Single<Void> head204(@HeaderParam("accept-language") String acceptLanguage, @HeaderParam("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.headexceptions.HeadExceptions head404" })
        @HEAD("http/success/404")
        Single<Void> head404(@HeaderParam("accept-language") String acceptLanguage, @HeaderParam("User-Agent") String userAgent);

    }

    /**
     * Return 200 status code if successful.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void head200() {
        head200Async().toBlocking().value();
    }

    /**
     * Return 200 status code if successful.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> head200Async(final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(head200Async(), serviceCallback);
    }

    /**
     * Return 200 status code if successful.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Single<Void> head200Async() {
        return service.head200(this.client.acceptLanguage(), this.client.userAgent());
    }


    /**
     * Return 204 status code if successful.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void head204() {
        head204Async().toBlocking().value();
    }

    /**
     * Return 204 status code if successful.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> head204Async(final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(head204Async(), serviceCallback);
    }

    /**
     * Return 204 status code if successful.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Single<Void> head204Async() {
        return service.head204(this.client.acceptLanguage(), this.client.userAgent());
    }


    /**
     * Return 404 status code if successful.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void head404() {
        head404Async().toBlocking().value();
    }

    /**
     * Return 404 status code if successful.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> head404Async(final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(head404Async(), serviceCallback);
    }

    /**
     * Return 404 status code if successful.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Single<Void> head404Async() {
        return service.head404(this.client.acceptLanguage(), this.client.userAgent());
    }


}
