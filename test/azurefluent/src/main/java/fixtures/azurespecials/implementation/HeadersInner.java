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

import com.google.common.reflect.TypeToken;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponseWithHeaders;
import com.microsoft.rest.v2.annotations.ExpectedResponses;
import com.microsoft.rest.v2.annotations.HEAD;
import com.microsoft.rest.v2.annotations.HeaderParam;
import com.microsoft.rest.v2.annotations.Headers;
import com.microsoft.rest.v2.annotations.Host;
import com.microsoft.rest.v2.annotations.POST;
import com.microsoft.rest.v2.annotations.UnexpectedResponseExceptionType;
import com.microsoft.rest.v2.http.HttpClient;
import com.microsoft.rest.Validator;
import fixtures.azurespecials.ErrorException;
import java.io.IOException;
import rx.functions.Func1;
import rx.Observable;
import rx.Single;
import com.microsoft.azure.v2.AzureProxy;

/**
 * An instance of this class provides access to all the operations defined
 * in Headers.
 */
public class HeadersInner {
    /** The RestProxy service to perform REST calls. */
    private HeadersService service;
    /** The service client containing this operation class. */
    private AutoRestAzureSpecialParametersTestClientImpl client;

    /**
     * Initializes an instance of HeadersInner.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public HeadersInner(AutoRestAzureSpecialParametersTestClientImpl client) {
        this.service = AzureProxy.create(HeadersService.class, client.httpClient(), client.serializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for Headers to be
     * used by Retrofit to perform actually REST calls.
     */
    @Host("http://localhost")
    interface HeadersService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.azurespecials.Headers customNamedRequestId" })
        @POST("azurespecials/customNamedRequestId")
        Single<Void> customNamedRequestId(@HeaderParam("foo-client-request-id") String fooClientRequestId, @HeaderParam("accept-language") String acceptLanguage, @HeaderParam("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.azurespecials.Headers customNamedRequestIdParamGrouping" })
        @POST("azurespecials/customNamedRequestIdParamGrouping")
        Single<Void> customNamedRequestIdParamGrouping(@HeaderParam("accept-language") String acceptLanguage, @HeaderParam("foo-client-request-id") String fooClientRequestId, @HeaderParam("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.azurespecials.Headers customNamedRequestIdHead" })
        @HEAD("azurespecials/customNamedRequestIdHead")
        Single<Boolean> customNamedRequestIdHead(@HeaderParam("foo-client-request-id") String fooClientRequestId, @HeaderParam("accept-language") String acceptLanguage, @HeaderParam("User-Agent") String userAgent);

    }

    /**
     * Send foo-client-request-id = 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0 in the header of the request.
     *
     * @param fooClientRequestId The fooRequestId
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void customNamedRequestId(String fooClientRequestId) {
        customNamedRequestIdAsync(fooClientRequestId).toBlocking().value();
    }

    /**
     * Send foo-client-request-id = 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0 in the header of the request.
     *
     * @param fooClientRequestId The fooRequestId
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> customNamedRequestIdAsync(String fooClientRequestId, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody/* RestProxy doesn't support headers */(customNamedRequestIdAsync(fooClientRequestId), serviceCallback);
    }

    /**
     * Send foo-client-request-id = 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0 in the header of the request.
     *
     * @param fooClientRequestId The fooRequestId
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponseWithHeaders} object if successful.
     */
    public Single<Void> customNamedRequestIdAsync(String fooClientRequestId) {
        if (fooClientRequestId == null) {
            throw new IllegalArgumentException("Parameter fooClientRequestId is required and cannot be null.");
        }
        return service.customNamedRequestId(fooClientRequestId, this.client.acceptLanguage(), this.client.userAgent());
    }


    /**
     * Send foo-client-request-id = 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0 in the header of the request, via a parameter group.
     *
     * @param headerCustomNamedRequestIdParamGroupingParameters Additional parameters for the operation
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void customNamedRequestIdParamGrouping(HeaderCustomNamedRequestIdParamGroupingParametersInner headerCustomNamedRequestIdParamGroupingParameters) {
        customNamedRequestIdParamGroupingAsync(headerCustomNamedRequestIdParamGroupingParameters).toBlocking().value();
    }

    /**
     * Send foo-client-request-id = 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0 in the header of the request, via a parameter group.
     *
     * @param headerCustomNamedRequestIdParamGroupingParameters Additional parameters for the operation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> customNamedRequestIdParamGroupingAsync(HeaderCustomNamedRequestIdParamGroupingParametersInner headerCustomNamedRequestIdParamGroupingParameters, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody/* RestProxy doesn't support headers */(customNamedRequestIdParamGroupingAsync(headerCustomNamedRequestIdParamGroupingParameters), serviceCallback);
    }

    /**
     * Send foo-client-request-id = 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0 in the header of the request, via a parameter group.
     *
     * @param headerCustomNamedRequestIdParamGroupingParameters Additional parameters for the operation
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponseWithHeaders} object if successful.
     */
    public Single<Void> customNamedRequestIdParamGroupingAsync(HeaderCustomNamedRequestIdParamGroupingParametersInner headerCustomNamedRequestIdParamGroupingParameters) {
        if (headerCustomNamedRequestIdParamGroupingParameters == null) {
            throw new IllegalArgumentException("Parameter headerCustomNamedRequestIdParamGroupingParameters is required and cannot be null.");
        }
        Validator.validate(headerCustomNamedRequestIdParamGroupingParameters);
        String fooClientRequestId = headerCustomNamedRequestIdParamGroupingParameters.fooClientRequestId();
        return service.customNamedRequestIdParamGrouping(this.client.acceptLanguage(), fooClientRequestId, this.client.userAgent());
    }


    /**
     * Send foo-client-request-id = 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0 in the header of the request.
     *
     * @param fooClientRequestId The fooRequestId
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the boolean object if successful.
     */
    public boolean customNamedRequestIdHead(String fooClientRequestId) {
        return customNamedRequestIdHeadAsync(fooClientRequestId).toBlocking().value();
    }

    /**
     * Send foo-client-request-id = 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0 in the header of the request.
     *
     * @param fooClientRequestId The fooRequestId
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Boolean> customNamedRequestIdHeadAsync(String fooClientRequestId, final ServiceCallback<Boolean> serviceCallback) {
        return ServiceFuture.fromBody/* RestProxy doesn't support headers */(customNamedRequestIdHeadAsync(fooClientRequestId), serviceCallback);
    }

    /**
     * Send foo-client-request-id = 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0 in the header of the request.
     *
     * @param fooClientRequestId The fooRequestId
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Boolean object
     */
    public Single<Boolean> customNamedRequestIdHeadAsync(String fooClientRequestId) {
        if (fooClientRequestId == null) {
            throw new IllegalArgumentException("Parameter fooClientRequestId is required and cannot be null.");
        }
        return service.customNamedRequestIdHead(fooClientRequestId, this.client.acceptLanguage(), this.client.userAgent());
    }


}
