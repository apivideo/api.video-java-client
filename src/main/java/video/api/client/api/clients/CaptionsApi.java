/*
 * api.video Java API client
 * api.video is an API that encodes on the go to facilitate immediate playback, enhancing viewer streaming experiences across multiple devices and platforms. You can stream live or on-demand online videos within minutes.
 *
 * The version of the OpenAPI document: 1
 * Contact: ecosystem@api.video
 *
 * NOTE: This class is auto generated.
 * Do not edit the class manually.
 */

package video.api.client.api.clients;

import com.google.gson.reflect.TypeToken;

import java.io.File;
import java.io.IOException;

import video.api.client.api.models.*;
import video.api.client.api.upload.*;
import video.api.client.api.*;

import java.lang.reflect.Type;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CaptionsApi {
    private ApiClient localVarApiClient;

    public CaptionsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Constructor for CaptionsApi production environment where API key is not required.
     */
    public CaptionsApi() {
        this.localVarApiClient = new ApiClient(Environment.PRODUCTION.basePath);
    }

    /**
     * Constructor for CaptionsApi with custom API base path where API key is not required.
     * 
     * @param basePath
     *            the api base path. Expected Environment.PRODUCTION.basePath (default) or Environment.SANDBOX.basePath.
     */
    public CaptionsApi(String basePath) {
        this.localVarApiClient = new ApiClient(basePath);
    }

    /**
     * Constructor for CaptionsApi with custom API base path where API key is not required.
     * 
     * @param environment
     *            the target environment. Expected Environment.PRODUCTION (default) or Environment.SANDBOX.
     */
    public CaptionsApi(Environment environment) {
        this.localVarApiClient = new ApiClient(environment.basePath);
    }

    /**
     * Constructor for CaptionsApi with custom API base path
     * 
     * @param apiKey
     *            the api key to use to authenticate to the API
     * @param basePath
     *            the api base path. Expected Environment.PRODUCTION.basePath (default) or Environment.SANDBOX.basePath.
     */
    public CaptionsApi(String apiKey, String basePath) {
        this.localVarApiClient = new ApiClient(apiKey, basePath);
    }

    /**
     * Constructor for CaptionsApi with custom API base path
     * 
     * @param apiKey
     *            the api key to use to authenticate to the API
     * @param environment
     *            the target environment. Expected Environment.PRODUCTION (default) or Environment.SANDBOX.
     */
    public CaptionsApi(String apiKey, Environment environment) {
        this.localVarApiClient = new ApiClient(apiKey, environment.basePath);
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for upload
     * 
     * @param videoId
     *            The unique identifier for the video you want to add a caption to. (required)
     * @param language
     *            A valid BCP 47 language representation. (required)
     * @param file
     *            The video text track (VTT) you want to upload. (required)
     * @param _callback
     *            Callback for upload/download progress
     * 
     * @return Call to execute
     * 
     * @throws ApiException
     *             If fail to serialize the request body object
     * 
     * @http.response.details
     *                        <table summary="Response Details" border="1">
     *                        <tr>
     *                        <td>Status Code</td>
     *                        <td>Description</td>
     *                        <td>Response Headers</td>
     *                        </tr>
     *                        <tr>
     *                        <td>200</td>
     *                        <td>Success</td>
     *                        <td>-</td>
     *                        </tr>
     *                        <tr>
     *                        <td>400</td>
     *                        <td>Bad Request</td>
     *                        <td>-</td>
     *                        </tr>
     *                        <tr>
     *                        <td>404</td>
     *                        <td>Not Found</td>
     *                        <td>-</td>
     *                        </tr>
     *                        </table>
     */
    private okhttp3.Call uploadCall(String videoId, String language, File file, final ApiCallback _callback)
            throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/videos/{videoId}/captions/{language}"
                .replaceAll("\\{" + "videoId" + "\\}", localVarApiClient.escapeString(videoId.toString()))
                .replaceAll("\\{" + "language" + "\\}", localVarApiClient.escapeString(language.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (file != null) {
            localVarFormParams.put("file", file);
        }

        final String[] localVarAccepts = { "application/json" };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = { "multipart/form-data" };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams,
                localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call uploadValidateBeforeCall(String videoId, String language, File file,
            final ApiCallback _callback) throws ApiException {

        // verify the required parameter 'videoId' is set
        if (videoId == null) {
            throw new ApiException("Missing the required parameter 'videoId' when calling upload");
        }

        // verify the required parameter 'language' is set
        if (language == null) {
            throw new ApiException("Missing the required parameter 'language' when calling upload");
        }

        // verify the required parameter 'file' is set
        if (file == null) {
            throw new ApiException("Missing the required parameter 'file' when calling upload");
        }

        okhttp3.Call localVarCall = uploadCall(videoId, language, file, _callback);
        return localVarCall;
    }

    /**
     * Upload a caption
     *
     * Upload a VTT file to add captions to your video. Read our [captioning
     * tutorial](https://api.video/blog/tutorials/adding-captions) for more details.
     * 
     * @param videoId
     *            The unique identifier for the video you want to add a caption to. (required)
     * @param language
     *            A valid BCP 47 language representation. (required)
     * @param file
     *            The video text track (VTT) you want to upload. (required)
     * 
     * @return Caption
     * 
     * @throws ApiException
     *             If fail to call the API, e.g. server error or cannot deserialize the response body
     * 
     * @http.response.details
     *                        <table summary="Response Details" border="1">
     *                        <tr>
     *                        <td>Status Code</td>
     *                        <td>Description</td>
     *                        <td>Response Headers</td>
     *                        </tr>
     *                        <tr>
     *                        <td>200</td>
     *                        <td>Success</td>
     *                        <td>-</td>
     *                        </tr>
     *                        <tr>
     *                        <td>400</td>
     *                        <td>Bad Request</td>
     *                        <td>-</td>
     *                        </tr>
     *                        <tr>
     *                        <td>404</td>
     *                        <td>Not Found</td>
     *                        <td>-</td>
     *                        </tr>
     *                        </table>
     */
    public Caption upload(String videoId, String language, File file) throws ApiException {
        ApiResponse<Caption> localVarResp = uploadWithHttpInfo(videoId, language, file);
        return localVarResp.getData();
    }

    /**
     * Upload a caption
     *
     * Upload a VTT file to add captions to your video. Read our [captioning
     * tutorial](https://api.video/blog/tutorials/adding-captions) for more details.
     * 
     * @param videoId
     *            The unique identifier for the video you want to add a caption to. (required)
     * @param language
     *            A valid BCP 47 language representation. (required)
     * @param file
     *            The video text track (VTT) you want to upload. (required)
     * 
     * @return ApiResponse&lt;Caption&gt;
     * 
     * @throws ApiException
     *             If fail to call the API, e.g. server error or cannot deserialize the response body
     * 
     * @http.response.details
     *                        <table summary="Response Details" border="1">
     *                        <tr>
     *                        <td>Status Code</td>
     *                        <td>Description</td>
     *                        <td>Response Headers</td>
     *                        </tr>
     *                        <tr>
     *                        <td>200</td>
     *                        <td>Success</td>
     *                        <td>-</td>
     *                        </tr>
     *                        <tr>
     *                        <td>400</td>
     *                        <td>Bad Request</td>
     *                        <td>-</td>
     *                        </tr>
     *                        <tr>
     *                        <td>404</td>
     *                        <td>Not Found</td>
     *                        <td>-</td>
     *                        </tr>
     *                        </table>
     */
    public ApiResponse<Caption> uploadWithHttpInfo(String videoId, String language, File file) throws ApiException {
        okhttp3.Call localVarCall = uploadValidateBeforeCall(videoId, language, file, null);
        Type localVarReturnType = new TypeToken<Caption>() {
        }.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Upload a caption (asynchronously) Upload a VTT file to add captions to your video. Read our [captioning
     * tutorial](https://api.video/blog/tutorials/adding-captions) for more details.
     * 
     * @param videoId
     *            The unique identifier for the video you want to add a caption to. (required)
     * @param language
     *            A valid BCP 47 language representation. (required)
     * @param file
     *            The video text track (VTT) you want to upload. (required)
     * @param _callback
     *            The callback to be executed when the API call finishes
     * 
     * @return The request call
     * 
     * @throws ApiException
     *             If fail to process the API call, e.g. serializing the request body object
     * 
     * @http.response.details
     *                        <table summary="Response Details" border="1">
     *                        <tr>
     *                        <td>Status Code</td>
     *                        <td>Description</td>
     *                        <td>Response Headers</td>
     *                        </tr>
     *                        <tr>
     *                        <td>200</td>
     *                        <td>Success</td>
     *                        <td>-</td>
     *                        </tr>
     *                        <tr>
     *                        <td>400</td>
     *                        <td>Bad Request</td>
     *                        <td>-</td>
     *                        </tr>
     *                        <tr>
     *                        <td>404</td>
     *                        <td>Not Found</td>
     *                        <td>-</td>
     *                        </tr>
     *                        </table>
     */
    public okhttp3.Call uploadAsync(String videoId, String language, File file, final ApiCallback<Caption> _callback)
            throws ApiException {
        okhttp3.Call localVarCall = uploadValidateBeforeCall(videoId, language, file, _callback);
        Type localVarReturnType = new TypeToken<Caption>() {
        }.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    /**
     * Build call for get
     * 
     * @param videoId
     *            The unique identifier for the video you want captions for. (required)
     * @param language
     *            A valid [BCP 47](https://github.com/libyal/libfwnt/wiki/Language-Code-identifiers) language
     *            representation (required)
     * @param _callback
     *            Callback for upload/download progress
     * 
     * @return Call to execute
     * 
     * @throws ApiException
     *             If fail to serialize the request body object
     * 
     * @http.response.details
     *                        <table summary="Response Details" border="1">
     *                        <tr>
     *                        <td>Status Code</td>
     *                        <td>Description</td>
     *                        <td>Response Headers</td>
     *                        </tr>
     *                        <tr>
     *                        <td>200</td>
     *                        <td>Success</td>
     *                        <td>-</td>
     *                        </tr>
     *                        <tr>
     *                        <td>404</td>
     *                        <td>Not Found</td>
     *                        <td>-</td>
     *                        </tr>
     *                        </table>
     */
    private okhttp3.Call getCall(String videoId, String language, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/videos/{videoId}/captions/{language}"
                .replaceAll("\\{" + "videoId" + "\\}", localVarApiClient.escapeString(videoId.toString()))
                .replaceAll("\\{" + "language" + "\\}", localVarApiClient.escapeString(language.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = { "application/json" };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {

        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams,
                localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getValidateBeforeCall(String videoId, String language, final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter 'videoId' is set
        if (videoId == null) {
            throw new ApiException("Missing the required parameter 'videoId' when calling get");
        }

        // verify the required parameter 'language' is set
        if (language == null) {
            throw new ApiException("Missing the required parameter 'language' when calling get");
        }

        okhttp3.Call localVarCall = getCall(videoId, language, _callback);
        return localVarCall;
    }

    /**
     * Retrieve a caption
     *
     * Retrieve a caption for a video in a specific language. If the language is available, the caption is returned.
     * Otherwise, you will get a error indicating the caption was not found.
     * 
     * Tutorials that use the [captions endpoint](https://api.video/blog/endpoints/captions).
     * 
     * @param videoId
     *            The unique identifier for the video you want captions for. (required)
     * @param language
     *            A valid [BCP 47](https://github.com/libyal/libfwnt/wiki/Language-Code-identifiers) language
     *            representation (required)
     * 
     * @return Caption
     * 
     * @throws ApiException
     *             If fail to call the API, e.g. server error or cannot deserialize the response body
     * 
     * @http.response.details
     *                        <table summary="Response Details" border="1">
     *                        <tr>
     *                        <td>Status Code</td>
     *                        <td>Description</td>
     *                        <td>Response Headers</td>
     *                        </tr>
     *                        <tr>
     *                        <td>200</td>
     *                        <td>Success</td>
     *                        <td>-</td>
     *                        </tr>
     *                        <tr>
     *                        <td>404</td>
     *                        <td>Not Found</td>
     *                        <td>-</td>
     *                        </tr>
     *                        </table>
     */
    public Caption get(String videoId, String language) throws ApiException {
        ApiResponse<Caption> localVarResp = getWithHttpInfo(videoId, language);
        return localVarResp.getData();
    }

    /**
     * Retrieve a caption
     *
     * Retrieve a caption for a video in a specific language. If the language is available, the caption is returned.
     * Otherwise, you will get a error indicating the caption was not found.
     * 
     * Tutorials that use the [captions endpoint](https://api.video/blog/endpoints/captions).
     * 
     * @param videoId
     *            The unique identifier for the video you want captions for. (required)
     * @param language
     *            A valid [BCP 47](https://github.com/libyal/libfwnt/wiki/Language-Code-identifiers) language
     *            representation (required)
     * 
     * @return ApiResponse&lt;Caption&gt;
     * 
     * @throws ApiException
     *             If fail to call the API, e.g. server error or cannot deserialize the response body
     * 
     * @http.response.details
     *                        <table summary="Response Details" border="1">
     *                        <tr>
     *                        <td>Status Code</td>
     *                        <td>Description</td>
     *                        <td>Response Headers</td>
     *                        </tr>
     *                        <tr>
     *                        <td>200</td>
     *                        <td>Success</td>
     *                        <td>-</td>
     *                        </tr>
     *                        <tr>
     *                        <td>404</td>
     *                        <td>Not Found</td>
     *                        <td>-</td>
     *                        </tr>
     *                        </table>
     */
    public ApiResponse<Caption> getWithHttpInfo(String videoId, String language) throws ApiException {
        okhttp3.Call localVarCall = getValidateBeforeCall(videoId, language, null);
        Type localVarReturnType = new TypeToken<Caption>() {
        }.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Retrieve a caption (asynchronously) Retrieve a caption for a video in a specific language. If the language is
     * available, the caption is returned. Otherwise, you will get a error indicating the caption was not found.
     * 
     * Tutorials that use the [captions endpoint](https://api.video/blog/endpoints/captions).
     * 
     * @param videoId
     *            The unique identifier for the video you want captions for. (required)
     * @param language
     *            A valid [BCP 47](https://github.com/libyal/libfwnt/wiki/Language-Code-identifiers) language
     *            representation (required)
     * @param _callback
     *            The callback to be executed when the API call finishes
     * 
     * @return The request call
     * 
     * @throws ApiException
     *             If fail to process the API call, e.g. serializing the request body object
     * 
     * @http.response.details
     *                        <table summary="Response Details" border="1">
     *                        <tr>
     *                        <td>Status Code</td>
     *                        <td>Description</td>
     *                        <td>Response Headers</td>
     *                        </tr>
     *                        <tr>
     *                        <td>200</td>
     *                        <td>Success</td>
     *                        <td>-</td>
     *                        </tr>
     *                        <tr>
     *                        <td>404</td>
     *                        <td>Not Found</td>
     *                        <td>-</td>
     *                        </tr>
     *                        </table>
     */
    public okhttp3.Call getAsync(String videoId, String language, final ApiCallback<Caption> _callback)
            throws ApiException {
        okhttp3.Call localVarCall = getValidateBeforeCall(videoId, language, _callback);
        Type localVarReturnType = new TypeToken<Caption>() {
        }.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    /**
     * Build call for update
     * 
     * @param videoId
     *            The unique identifier for the video you want to have automatic captions for. (required)
     * @param language
     *            A valid [BCP 47](https://github.com/libyal/libfwnt/wiki/Language-Code-identifiers) language
     *            representation. (required)
     * @param captionsUpdatePayload
     *            (required)
     * @param _callback
     *            Callback for upload/download progress
     * 
     * @return Call to execute
     * 
     * @throws ApiException
     *             If fail to serialize the request body object
     * 
     * @http.response.details
     *                        <table summary="Response Details" border="1">
     *                        <tr>
     *                        <td>Status Code</td>
     *                        <td>Description</td>
     *                        <td>Response Headers</td>
     *                        </tr>
     *                        <tr>
     *                        <td>200</td>
     *                        <td>Success</td>
     *                        <td>-</td>
     *                        </tr>
     *                        <tr>
     *                        <td>400</td>
     *                        <td>Bad Request</td>
     *                        <td>-</td>
     *                        </tr>
     *                        <tr>
     *                        <td>404</td>
     *                        <td>Not Found</td>
     *                        <td>-</td>
     *                        </tr>
     *                        </table>
     */
    private okhttp3.Call updateCall(String videoId, String language, CaptionsUpdatePayload captionsUpdatePayload,
            final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = captionsUpdatePayload;

        // create path and map variables
        String localVarPath = "/videos/{videoId}/captions/{language}"
                .replaceAll("\\{" + "videoId" + "\\}", localVarApiClient.escapeString(videoId.toString()))
                .replaceAll("\\{" + "language" + "\\}", localVarApiClient.escapeString(language.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = { "application/json" };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        return localVarApiClient.buildCall(localVarPath, "PATCH", localVarQueryParams, localVarCollectionQueryParams,
                localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call updateValidateBeforeCall(String videoId, String language,
            CaptionsUpdatePayload captionsUpdatePayload, final ApiCallback _callback) throws ApiException {

        // verify the required parameter 'videoId' is set
        if (videoId == null) {
            throw new ApiException("Missing the required parameter 'videoId' when calling update");
        }

        // verify the required parameter 'language' is set
        if (language == null) {
            throw new ApiException("Missing the required parameter 'language' when calling update");
        }

        // verify the required parameter 'captionsUpdatePayload' is set
        if (captionsUpdatePayload == null) {
            throw new ApiException("Missing the required parameter 'captionsUpdatePayload' when calling update");
        }

        okhttp3.Call localVarCall = updateCall(videoId, language, captionsUpdatePayload, _callback);
        return localVarCall;
    }

    /**
     * Update a caption
     *
     * To have the captions on automatically, use this method to set default: true.
     * 
     * @param videoId
     *            The unique identifier for the video you want to have automatic captions for. (required)
     * @param language
     *            A valid [BCP 47](https://github.com/libyal/libfwnt/wiki/Language-Code-identifiers) language
     *            representation. (required)
     * @param captionsUpdatePayload
     *            (required)
     * 
     * @return Caption
     * 
     * @throws ApiException
     *             If fail to call the API, e.g. server error or cannot deserialize the response body
     * 
     * @http.response.details
     *                        <table summary="Response Details" border="1">
     *                        <tr>
     *                        <td>Status Code</td>
     *                        <td>Description</td>
     *                        <td>Response Headers</td>
     *                        </tr>
     *                        <tr>
     *                        <td>200</td>
     *                        <td>Success</td>
     *                        <td>-</td>
     *                        </tr>
     *                        <tr>
     *                        <td>400</td>
     *                        <td>Bad Request</td>
     *                        <td>-</td>
     *                        </tr>
     *                        <tr>
     *                        <td>404</td>
     *                        <td>Not Found</td>
     *                        <td>-</td>
     *                        </tr>
     *                        </table>
     */
    public Caption update(String videoId, String language, CaptionsUpdatePayload captionsUpdatePayload)
            throws ApiException {
        ApiResponse<Caption> localVarResp = updateWithHttpInfo(videoId, language, captionsUpdatePayload);
        return localVarResp.getData();
    }

    /**
     * Update a caption
     *
     * To have the captions on automatically, use this method to set default: true.
     * 
     * @param videoId
     *            The unique identifier for the video you want to have automatic captions for. (required)
     * @param language
     *            A valid [BCP 47](https://github.com/libyal/libfwnt/wiki/Language-Code-identifiers) language
     *            representation. (required)
     * @param captionsUpdatePayload
     *            (required)
     * 
     * @return ApiResponse&lt;Caption&gt;
     * 
     * @throws ApiException
     *             If fail to call the API, e.g. server error or cannot deserialize the response body
     * 
     * @http.response.details
     *                        <table summary="Response Details" border="1">
     *                        <tr>
     *                        <td>Status Code</td>
     *                        <td>Description</td>
     *                        <td>Response Headers</td>
     *                        </tr>
     *                        <tr>
     *                        <td>200</td>
     *                        <td>Success</td>
     *                        <td>-</td>
     *                        </tr>
     *                        <tr>
     *                        <td>400</td>
     *                        <td>Bad Request</td>
     *                        <td>-</td>
     *                        </tr>
     *                        <tr>
     *                        <td>404</td>
     *                        <td>Not Found</td>
     *                        <td>-</td>
     *                        </tr>
     *                        </table>
     */
    public ApiResponse<Caption> updateWithHttpInfo(String videoId, String language,
            CaptionsUpdatePayload captionsUpdatePayload) throws ApiException {
        okhttp3.Call localVarCall = updateValidateBeforeCall(videoId, language, captionsUpdatePayload, null);
        Type localVarReturnType = new TypeToken<Caption>() {
        }.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update a caption (asynchronously) To have the captions on automatically, use this method to set default: true.
     * 
     * @param videoId
     *            The unique identifier for the video you want to have automatic captions for. (required)
     * @param language
     *            A valid [BCP 47](https://github.com/libyal/libfwnt/wiki/Language-Code-identifiers) language
     *            representation. (required)
     * @param captionsUpdatePayload
     *            (required)
     * @param _callback
     *            The callback to be executed when the API call finishes
     * 
     * @return The request call
     * 
     * @throws ApiException
     *             If fail to process the API call, e.g. serializing the request body object
     * 
     * @http.response.details
     *                        <table summary="Response Details" border="1">
     *                        <tr>
     *                        <td>Status Code</td>
     *                        <td>Description</td>
     *                        <td>Response Headers</td>
     *                        </tr>
     *                        <tr>
     *                        <td>200</td>
     *                        <td>Success</td>
     *                        <td>-</td>
     *                        </tr>
     *                        <tr>
     *                        <td>400</td>
     *                        <td>Bad Request</td>
     *                        <td>-</td>
     *                        </tr>
     *                        <tr>
     *                        <td>404</td>
     *                        <td>Not Found</td>
     *                        <td>-</td>
     *                        </tr>
     *                        </table>
     */
    public okhttp3.Call updateAsync(String videoId, String language, CaptionsUpdatePayload captionsUpdatePayload,
            final ApiCallback<Caption> _callback) throws ApiException {
        okhttp3.Call localVarCall = updateValidateBeforeCall(videoId, language, captionsUpdatePayload, _callback);
        Type localVarReturnType = new TypeToken<Caption>() {
        }.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    /**
     * Build call for delete
     * 
     * @param videoId
     *            The unique identifier for the video you want to delete a caption from. (required)
     * @param language
     *            A valid [BCP 47](https://github.com/libyal/libfwnt/wiki/Language-Code-identifiers) language
     *            representation. (required)
     * @param _callback
     *            Callback for upload/download progress
     * 
     * @return Call to execute
     * 
     * @throws ApiException
     *             If fail to serialize the request body object
     * 
     * @http.response.details
     *                        <table summary="Response Details" border="1">
     *                        <tr>
     *                        <td>Status Code</td>
     *                        <td>Description</td>
     *                        <td>Response Headers</td>
     *                        </tr>
     *                        <tr>
     *                        <td>204</td>
     *                        <td>No Content</td>
     *                        <td>-</td>
     *                        </tr>
     *                        <tr>
     *                        <td>404</td>
     *                        <td>Not Found</td>
     *                        <td>-</td>
     *                        </tr>
     *                        </table>
     */
    private okhttp3.Call deleteCall(String videoId, String language, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/videos/{videoId}/captions/{language}"
                .replaceAll("\\{" + "videoId" + "\\}", localVarApiClient.escapeString(videoId.toString()))
                .replaceAll("\\{" + "language" + "\\}", localVarApiClient.escapeString(language.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = { "application/json" };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {

        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        return localVarApiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams,
                localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteValidateBeforeCall(String videoId, String language, final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter 'videoId' is set
        if (videoId == null) {
            throw new ApiException("Missing the required parameter 'videoId' when calling delete");
        }

        // verify the required parameter 'language' is set
        if (language == null) {
            throw new ApiException("Missing the required parameter 'language' when calling delete");
        }

        okhttp3.Call localVarCall = deleteCall(videoId, language, _callback);
        return localVarCall;
    }

    /**
     * Delete a caption
     *
     * Delete a caption in a specific language by providing the video ID for the video you want to delete the caption
     * from and the language the caption is in.
     * 
     * @param videoId
     *            The unique identifier for the video you want to delete a caption from. (required)
     * @param language
     *            A valid [BCP 47](https://github.com/libyal/libfwnt/wiki/Language-Code-identifiers) language
     *            representation. (required)
     * 
     * @throws ApiException
     *             If fail to call the API, e.g. server error or cannot deserialize the response body
     * 
     * @http.response.details
     *                        <table summary="Response Details" border="1">
     *                        <tr>
     *                        <td>Status Code</td>
     *                        <td>Description</td>
     *                        <td>Response Headers</td>
     *                        </tr>
     *                        <tr>
     *                        <td>204</td>
     *                        <td>No Content</td>
     *                        <td>-</td>
     *                        </tr>
     *                        <tr>
     *                        <td>404</td>
     *                        <td>Not Found</td>
     *                        <td>-</td>
     *                        </tr>
     *                        </table>
     */
    public void delete(String videoId, String language) throws ApiException {
        deleteWithHttpInfo(videoId, language);
    }

    /**
     * Delete a caption
     *
     * Delete a caption in a specific language by providing the video ID for the video you want to delete the caption
     * from and the language the caption is in.
     * 
     * @param videoId
     *            The unique identifier for the video you want to delete a caption from. (required)
     * @param language
     *            A valid [BCP 47](https://github.com/libyal/libfwnt/wiki/Language-Code-identifiers) language
     *            representation. (required)
     * 
     * @return ApiResponse&lt;Void&gt;
     * 
     * @throws ApiException
     *             If fail to call the API, e.g. server error or cannot deserialize the response body
     * 
     * @http.response.details
     *                        <table summary="Response Details" border="1">
     *                        <tr>
     *                        <td>Status Code</td>
     *                        <td>Description</td>
     *                        <td>Response Headers</td>
     *                        </tr>
     *                        <tr>
     *                        <td>204</td>
     *                        <td>No Content</td>
     *                        <td>-</td>
     *                        </tr>
     *                        <tr>
     *                        <td>404</td>
     *                        <td>Not Found</td>
     *                        <td>-</td>
     *                        </tr>
     *                        </table>
     */
    public ApiResponse<Void> deleteWithHttpInfo(String videoId, String language) throws ApiException {
        okhttp3.Call localVarCall = deleteValidateBeforeCall(videoId, language, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Delete a caption (asynchronously) Delete a caption in a specific language by providing the video ID for the video
     * you want to delete the caption from and the language the caption is in.
     * 
     * @param videoId
     *            The unique identifier for the video you want to delete a caption from. (required)
     * @param language
     *            A valid [BCP 47](https://github.com/libyal/libfwnt/wiki/Language-Code-identifiers) language
     *            representation. (required)
     * @param _callback
     *            The callback to be executed when the API call finishes
     * 
     * @return The request call
     * 
     * @throws ApiException
     *             If fail to process the API call, e.g. serializing the request body object
     * 
     * @http.response.details
     *                        <table summary="Response Details" border="1">
     *                        <tr>
     *                        <td>Status Code</td>
     *                        <td>Description</td>
     *                        <td>Response Headers</td>
     *                        </tr>
     *                        <tr>
     *                        <td>204</td>
     *                        <td>No Content</td>
     *                        <td>-</td>
     *                        </tr>
     *                        <tr>
     *                        <td>404</td>
     *                        <td>Not Found</td>
     *                        <td>-</td>
     *                        </tr>
     *                        </table>
     */
    public okhttp3.Call deleteAsync(String videoId, String language, final ApiCallback<Void> _callback)
            throws ApiException {
        okhttp3.Call localVarCall = deleteValidateBeforeCall(videoId, language, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }

    private okhttp3.Call listCall(String videoId, Integer currentPage, Integer pageSize, final ApiCallback _callback)
            throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/videos/{videoId}/captions".replaceAll("\\{" + "videoId" + "\\}",
                localVarApiClient.escapeString(videoId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (currentPage != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("currentPage", currentPage));
        }

        if (pageSize != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("pageSize", pageSize));
        }

        final String[] localVarAccepts = { "application/json" };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {

        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams,
                localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call listValidateBeforeCall(String videoId, Integer currentPage, Integer pageSize,
            final ApiCallback _callback) throws ApiException {

        // verify the required parameter 'videoId' is set
        if (videoId == null) {
            throw new ApiException("Missing the required parameter 'videoId' when calling list");
        }

        okhttp3.Call localVarCall = listCall(videoId, currentPage, pageSize, _callback);
        return localVarCall;
    }

    private ApiResponse<CaptionsListResponse> listWithHttpInfo(String videoId, Integer currentPage, Integer pageSize)
            throws ApiException {
        okhttp3.Call localVarCall = listValidateBeforeCall(videoId, currentPage, pageSize, null);
        Type localVarReturnType = new TypeToken<CaptionsListResponse>() {
        }.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call listAsync(String videoId, Integer currentPage, Integer pageSize,
            final ApiCallback<CaptionsListResponse> _callback) throws ApiException {
        okhttp3.Call localVarCall = listValidateBeforeCall(videoId, currentPage, pageSize, _callback);
        Type localVarReturnType = new TypeToken<CaptionsListResponse>() {
        }.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIlistRequest {
        private final String videoId;
        private Integer currentPage;
        private Integer pageSize;

        private APIlistRequest(String videoId) {
            this.videoId = videoId;
        }

        /**
         * Set currentPage
         * 
         * @param currentPage
         *            Choose the number of search results to return per page. Minimum value: 1 (optional, default to 1)
         * 
         * @return APIlistRequest
         */
        public APIlistRequest currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * Set pageSize
         * 
         * @param pageSize
         *            Results per page. Allowed values 1-100, default is 25. (optional, default to 25)
         * 
         * @return APIlistRequest
         */
        public APIlistRequest pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Build call for list
         * 
         * @param _callback
         *            ApiCallback API callback
         * 
         * @return Call to execute
         * 
         * @throws ApiException
         *             If fail to serialize the request body object
         * 
         * @http.response.details
         *                        <table summary="Response Details" border="1">
         *                        <tr>
         *                        <td>Status Code</td>
         *                        <td>Description</td>
         *                        <td>Response Headers</td>
         *                        </tr>
         *                        <tr>
         *                        <td>200</td>
         *                        <td>Success</td>
         *                        <td>-</td>
         *                        </tr>
         *                        <tr>
         *                        <td>404</td>
         *                        <td>Not Found</td>
         *                        <td>-</td>
         *                        </tr>
         *                        </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return listCall(videoId, currentPage, pageSize, _callback);
        }

        /**
         * Execute list request
         * 
         * @return CaptionsListResponse
         * 
         * @throws ApiException
         *             If fail to call the API, e.g. server error or cannot deserialize the response body
         * 
         * @http.response.details
         *                        <table summary="Response Details" border="1">
         *                        <tr>
         *                        <td>Status Code</td>
         *                        <td>Description</td>
         *                        <td>Response Headers</td>
         *                        </tr>
         *                        <tr>
         *                        <td>200</td>
         *                        <td>Success</td>
         *                        <td>-</td>
         *                        </tr>
         *                        <tr>
         *                        <td>404</td>
         *                        <td>Not Found</td>
         *                        <td>-</td>
         *                        </tr>
         *                        </table>
         */
        public Page<Caption> execute() throws ApiException {
            ApiResponse<CaptionsListResponse> localVarResp = listWithHttpInfo(videoId, currentPage, pageSize);
            return new Page<>(localVarResp.getData().getData(), localVarResp.getData().getPagination(), () -> {
                try {
                    return copy().currentPage((currentPage == null ? 1 : currentPage) + 1).execute();
                } catch (ApiException e) {
                    throw new RuntimeException(e);
                }
            }); //
        }

        private APIlistRequest copy() {
            APIlistRequest copy = new APIlistRequest(videoId);
            copy.currentPage(currentPage);
            copy.pageSize(pageSize);
            return copy;
        }

        /**
         * Execute list request with HTTP info returned
         * 
         * @return ApiResponse&lt;CaptionsListResponse&gt;
         * 
         * @throws ApiException
         *             If fail to call the API, e.g. server error or cannot deserialize the response body
         * 
         * @http.response.details
         *                        <table summary="Response Details" border="1">
         *                        <tr>
         *                        <td>Status Code</td>
         *                        <td>Description</td>
         *                        <td>Response Headers</td>
         *                        </tr>
         *                        <tr>
         *                        <td>200</td>
         *                        <td>Success</td>
         *                        <td>-</td>
         *                        </tr>
         *                        <tr>
         *                        <td>404</td>
         *                        <td>Not Found</td>
         *                        <td>-</td>
         *                        </tr>
         *                        </table>
         */
        public ApiResponse<CaptionsListResponse> executeWithHttpInfo() throws ApiException {
            return listWithHttpInfo(videoId, currentPage, pageSize);
        }

        /**
         * Execute list request (asynchronously)
         * 
         * @param _callback
         *            The callback to be executed when the API call finishes
         * 
         * @return The request call
         * 
         * @throws ApiException
         *             If fail to process the API call, e.g. serializing the request body object
         * 
         * @http.response.details
         *                        <table summary="Response Details" border="1">
         *                        <tr>
         *                        <td>Status Code</td>
         *                        <td>Description</td>
         *                        <td>Response Headers</td>
         *                        </tr>
         *                        <tr>
         *                        <td>200</td>
         *                        <td>Success</td>
         *                        <td>-</td>
         *                        </tr>
         *                        <tr>
         *                        <td>404</td>
         *                        <td>Not Found</td>
         *                        <td>-</td>
         *                        </tr>
         *                        </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Page<Caption>> _callback) throws ApiException {
            ApiCallback<CaptionsListResponse> apiCallback = new ApiCallback<CaptionsListResponse>() {

                @Override
                public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
                    _callback.onFailure(e, statusCode, responseHeaders);
                }

                @Override
                public void onSuccess(CaptionsListResponse result, int statusCode,
                        Map<String, List<String>> responseHeaders) {
                    _callback.onSuccess(new Page<>(result.getData(), result.getPagination(), () -> {
                        try {
                            return copy().currentPage((currentPage == null ? 1 : currentPage) + 1).execute();
                        } catch (ApiException e) {
                            throw new RuntimeException(e);
                        }
                    }), statusCode, responseHeaders);
                }

                @Override
                public void onUploadProgress(long bytesWritten, long contentLength, boolean done) {
                    _callback.onUploadProgress(bytesWritten, contentLength, done);
                }

                @Override
                public void onDownloadProgress(long bytesRead, long contentLength, boolean done) {
                    _callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };
            return listAsync(videoId, currentPage, pageSize, apiCallback);
        }
    }

    /**
     * List video captions
     *
     * Retrieve a list of available captions for the videoId you provide.
     * 
     * @param videoId
     *            The unique identifier for the video you want to retrieve a list of captions for. (required)
     * 
     * @return APIlistRequest
     * 
     * @http.response.details
     *                        <table summary="Response Details" border="1">
     *                        <tr>
     *                        <td>Status Code</td>
     *                        <td>Description</td>
     *                        <td>Response Headers</td>
     *                        </tr>
     *                        <tr>
     *                        <td>200</td>
     *                        <td>Success</td>
     *                        <td>-</td>
     *                        </tr>
     *                        <tr>
     *                        <td>404</td>
     *                        <td>Not Found</td>
     *                        <td>-</td>
     *                        </tr>
     *                        </table>
     */
    public APIlistRequest list(String videoId) {
        return new APIlistRequest(videoId);
    }
}
