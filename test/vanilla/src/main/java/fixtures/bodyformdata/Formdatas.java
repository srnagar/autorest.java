/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodyformdata;

import com.microsoft.rest.v2.ServiceCallback;
import com.microsoft.rest.v2.ServiceFuture;
import com.microsoft.rest.v2.StreamResponse;
import fixtures.bodyformdata.models.ErrorException;
import io.reactivex.Flowable;
import io.reactivex.Maybe;
import io.reactivex.Single;
import io.reactivex.annotations.NonNull;
import java.nio.ByteBuffer;

/**
 * An instance of this class provides access to all the operations defined in
 * Formdatas.
 */
public interface Formdatas {
    /**
     * Upload file.
     *
     * @param fileContent File to upload.
     * @param fileName File name to upload. Name has to be spelled exactly as written here.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Flowable&lt;ByteBuffer&gt; object if successful.
     */
    Flowable<ByteBuffer> uploadFile(@NonNull Flowable<ByteBuffer> fileContent, @NonNull String fileName);

    /**
     * Upload file.
     *
     * @param fileContent File to upload.
     * @param fileName File name to upload. Name has to be spelled exactly as written here.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<Flowable<ByteBuffer>> uploadFileAsync(@NonNull Flowable<ByteBuffer> fileContent, @NonNull String fileName, ServiceCallback<Flowable<ByteBuffer>> serviceCallback);

    /**
     * Upload file.
     *
     * @param fileContent File to upload.
     * @param fileName File name to upload. Name has to be spelled exactly as written here.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    Single<StreamResponse> uploadFileWithRestResponseAsync(@NonNull Flowable<ByteBuffer> fileContent, @NonNull String fileName);

    /**
     * Upload file.
     *
     * @param fileContent File to upload.
     * @param fileName File name to upload. Name has to be spelled exactly as written here.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    Maybe<Flowable<ByteBuffer>> uploadFileAsync(@NonNull Flowable<ByteBuffer> fileContent, @NonNull String fileName);

    /**
     * Upload file.
     *
     * @param contentLength The content length.
     * @param fileContent File to upload.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Flowable&lt;ByteBuffer&gt; object if successful.
     */
    Flowable<ByteBuffer> uploadFileViaBody(@NonNull long contentLength, @NonNull Flowable<ByteBuffer> fileContent);

    /**
     * Upload file.
     *
     * @param contentLength The content length.
     * @param fileContent File to upload.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<Flowable<ByteBuffer>> uploadFileViaBodyAsync(@NonNull long contentLength, @NonNull Flowable<ByteBuffer> fileContent, ServiceCallback<Flowable<ByteBuffer>> serviceCallback);

    /**
     * Upload file.
     *
     * @param contentLength The content length.
     * @param fileContent File to upload.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    Single<StreamResponse> uploadFileViaBodyWithRestResponseAsync(@NonNull long contentLength, @NonNull Flowable<ByteBuffer> fileContent);

    /**
     * Upload file.
     *
     * @param contentLength The content length.
     * @param fileContent File to upload.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    Maybe<Flowable<ByteBuffer>> uploadFileViaBodyAsync(@NonNull long contentLength, @NonNull Flowable<ByteBuffer> fileContent);
}
