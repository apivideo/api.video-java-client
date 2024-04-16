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

import java.io.IOException;

import video.api.client.api.models.BadRequest;
import java.io.File;
import video.api.client.api.models.LiveStream;
import video.api.client.api.models.LiveStreamCreationPayload;
import video.api.client.api.models.LiveStreamListResponse;
import video.api.client.api.models.LiveStreamUpdatePayload;
import video.api.client.api.models.NotFound;
import video.api.client.api.models.TooManyRequests;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import video.api.client.api.models.*;
import video.api.client.api.upload.*;
import video.api.client.api.*;

public class LiveStreamsApi {
    private ApiClient localVarApiClient;

    public LiveStreamsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Constructor for LiveStreamsApi production environment where API key is not required.
     */
    public LiveStreamsApi() {
        this.localVarApiClient = new ApiClient(Environment.PRODUCTION.basePath);
    }

    /**
     * Constructor for LiveStreamsApi with custom API base path where API key is not required.
     * 
     * @param basePath
     *            the api base path. Expected Environment.PRODUCTION.basePath (default) or Environment.SANDBOX.basePath.
     */
    public LiveStreamsApi(String basePath) {
        this.localVarApiClient = new ApiClient(basePath);
    }

    /**
     * Constructor for LiveStreamsApi with custom API base path where API key is not required.
     * 
     * @param environment
     *            the target environment. Expected Environment.PRODUCTION (default) or Environment.SANDBOX.
     */
    public LiveStreamsApi(Environment environment) {
        this.localVarApiClient = new ApiClient(environment.basePath);
    }

    /**
     * Constructor for LiveStreamsApi with custom API base path
     * 
     * @param apiKey
     *            the api key to use to authenticate to the API
     * @param basePath
     *            the api base path. Expected Environment.PRODUCTION.basePath (default) or Environment.SANDBOX.basePath.
     */
    public LiveStreamsApi(String apiKey, String basePath) {
        this.localVarApiClient = new ApiClient(apiKey, basePath);
    }

    /**
     * Constructor for LiveStreamsApi with custom API base path
     * 
     * @param apiKey
     *            the api key to use to authenticate to the API
     * @param environment
     *            the target environment. Expected Environment.PRODUCTION (default) or Environment.SANDBOX.
     */
    public LiveStreamsApi(String apiKey, Environment environment) {
        this.localVarApiClient = new ApiClient(apiKey, environment.basePath);
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for create
     * 
     * @param liveStreamCreationPayload
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
     *                        <td>* X-RateLimit-Limit - The request limit per minute. <br>
     *                        * X-RateLimit-Remaining - The number of available requests left for the current time
     *                        window. <br>
     *                        * X-RateLimit-Retry-After - The number of seconds left until the current rate limit window
     *                        resets. <br>
     *                        </td>
     *                        </tr>
     *                        <tr>
     *                        <td>400</td>
     *                        <td>Bad Request</td>
     *                        <td>* X-RateLimit-Limit - The request limit per minute. <br>
     *                        * X-RateLimit-Remaining - The number of available requests left for the current time
     *                        window. <br>
     *                        * X-RateLimit-Retry-After - The number of seconds left until the current rate limit window
     *                        resets. <br>
     *                        </td>
     *                        </tr>
     *                        <tr>
     *                        <td>429</td>
     *                        <td>Too Many Requests</td>
     *                        <td>* X-RateLimit-Limit - The request limit per minute. <br>
     *                        * X-RateLimit-Remaining - The number of available requests left for the current time
     *                        window. <br>
     *                        * X-RateLimit-Retry-After - The number of seconds left until the current rate limit window
     *                        resets. <br>
     *                        </td>
     *                        </tr>
     *                        </table>
     */
    private okhttp3.Call createCall(LiveStreamCreationPayload liveStreamCreationPayload, final ApiCallback _callback)
            throws ApiException {
        Object localVarPostBody = liveStreamCreationPayload;

        // create path and map variables
        String localVarPath = "/live-streams";

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

        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams,
                localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createValidateBeforeCall(LiveStreamCreationPayload liveStreamCreationPayload,
            final ApiCallback _callback) throws ApiException {

        // verify the required parameter 'liveStreamCreationPayload' is set
        if (liveStreamCreationPayload == null) {
            throw new ApiException("Missing the required parameter 'liveStreamCreationPayload' when calling create");
        }

        if (liveStreamCreationPayload.getName() == null) {
            throw new ApiException(
                    "Missing the required parameter 'liveStreamCreationPayload.name' when calling create");
        }

        okhttp3.Call localVarCall = createCall(liveStreamCreationPayload, _callback);
        return localVarCall;
    }

    /**
     * Create live stream
     *
     * Creates a livestream object.
     * 
     * @param liveStreamCreationPayload
     *            (required)
     * 
     * @return LiveStream
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
     *                        <td>* X-RateLimit-Limit - The request limit per minute. <br>
     *                        * X-RateLimit-Remaining - The number of available requests left for the current time
     *                        window. <br>
     *                        * X-RateLimit-Retry-After - The number of seconds left until the current rate limit window
     *                        resets. <br>
     *                        </td>
     *                        </tr>
     *                        <tr>
     *                        <td>400</td>
     *                        <td>Bad Request</td>
     *                        <td>* X-RateLimit-Limit - The request limit per minute. <br>
     *                        * X-RateLimit-Remaining - The number of available requests left for the current time
     *                        window. <br>
     *                        * X-RateLimit-Retry-After - The number of seconds left until the current rate limit window
     *                        resets. <br>
     *                        </td>
     *                        </tr>
     *                        <tr>
     *                        <td>429</td>
     *                        <td>Too Many Requests</td>
     *                        <td>* X-RateLimit-Limit - The request limit per minute. <br>
     *                        * X-RateLimit-Remaining - The number of available requests left for the current time
     *                        window. <br>
     *                        * X-RateLimit-Retry-After - The number of seconds left until the current rate limit window
     *                        resets. <br>
     *                        </td>
     *                        </tr>
     *                        </table>
     */
    public LiveStream create(LiveStreamCreationPayload liveStreamCreationPayload) throws ApiException {
        ApiResponse<LiveStream> localVarResp = createWithHttpInfo(liveStreamCreationPayload);
        return localVarResp.getData();
    }

    /**
     * Create live stream
     *
     * Creates a livestream object.
     * 
     * @param liveStreamCreationPayload
     *            (required)
     * 
     * @return ApiResponse&lt;LiveStream&gt;
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
     *                        <td>* X-RateLimit-Limit - The request limit per minute. <br>
     *                        * X-RateLimit-Remaining - The number of available requests left for the current time
     *                        window. <br>
     *                        * X-RateLimit-Retry-After - The number of seconds left until the current rate limit window
     *                        resets. <br>
     *                        </td>
     *                        </tr>
     *                        <tr>
     *                        <td>400</td>
     *                        <td>Bad Request</td>
     *                        <td>* X-RateLimit-Limit - The request limit per minute. <br>
     *                        * X-RateLimit-Remaining - The number of available requests left for the current time
     *                        window. <br>
     *                        * X-RateLimit-Retry-After - The number of seconds left until the current rate limit window
     *                        resets. <br>
     *                        </td>
     *                        </tr>
     *                        <tr>
     *                        <td>429</td>
     *                        <td>Too Many Requests</td>
     *                        <td>* X-RateLimit-Limit - The request limit per minute. <br>
     *                        * X-RateLimit-Remaining - The number of available requests left for the current time
     *                        window. <br>
     *                        * X-RateLimit-Retry-After - The number of seconds left until the current rate limit window
     *                        resets. <br>
     *                        </td>
     *                        </tr>
     *                        </table>
     */
    public ApiResponse<LiveStream> createWithHttpInfo(LiveStreamCreationPayload liveStreamCreationPayload)
            throws ApiException {
        okhttp3.Call localVarCall = createValidateBeforeCall(liveStreamCreationPayload, null);
        Type localVarReturnType = new TypeToken<LiveStream>() {
        }.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create live stream (asynchronously) Creates a livestream object.
     * 
     * @param liveStreamCreationPayload
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
     *                        <td>* X-RateLimit-Limit - The request limit per minute. <br>
     *                        * X-RateLimit-Remaining - The number of available requests left for the current time
     *                        window. <br>
     *                        * X-RateLimit-Retry-After - The number of seconds left until the current rate limit window
     *                        resets. <br>
     *                        </td>
     *                        </tr>
     *                        <tr>
     *                        <td>400</td>
     *                        <td>Bad Request</td>
     *                        <td>* X-RateLimit-Limit - The request limit per minute. <br>
     *                        * X-RateLimit-Remaining - The number of available requests left for the current time
     *                        window. <br>
     *                        * X-RateLimit-Retry-After - The number of seconds left until the current rate limit window
     *                        resets. <br>
     *                        </td>
     *                        </tr>
     *                        <tr>
     *                        <td>429</td>
     *                        <td>Too Many Requests</td>
     *                        <td>* X-RateLimit-Limit - The request limit per minute. <br>
     *                        * X-RateLimit-Remaining - The number of available requests left for the current time
     *                        window. <br>
     *                        * X-RateLimit-Retry-After - The number of seconds left until the current rate limit window
     *                        resets. <br>
     *                        </td>
     *                        </tr>
     *                        </table>
     */
    public okhttp3.Call createAsync(LiveStreamCreationPayload liveStreamCreationPayload,
            final ApiCallback<LiveStream> _callback) throws ApiException {
        okhttp3.Call localVarCall = createValidateBeforeCall(liveStreamCreationPayload, _callback);
        Type localVarReturnType = new TypeToken<LiveStream>() {
        }.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    /**
     * Build call for get
     * 
     * @param liveStreamId
     *            The unique ID for the live stream you want to watch. (required)
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
     *                        <td>* X-RateLimit-Limit - The request limit per minute. <br>
     *                        * X-RateLimit-Remaining - The number of available requests left for the current time
     *                        window. <br>
     *                        * X-RateLimit-Retry-After - The number of seconds left until the current rate limit window
     *                        resets. <br>
     *                        </td>
     *                        </tr>
     *                        <tr>
     *                        <td>429</td>
     *                        <td>Too Many Requests</td>
     *                        <td>* X-RateLimit-Limit - The request limit per minute. <br>
     *                        * X-RateLimit-Remaining - The number of available requests left for the current time
     *                        window. <br>
     *                        * X-RateLimit-Retry-After - The number of seconds left until the current rate limit window
     *                        resets. <br>
     *                        </td>
     *                        </tr>
     *                        </table>
     */
    private okhttp3.Call getCall(String liveStreamId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/live-streams/{liveStreamId}".replaceAll("\\{" + "liveStreamId" + "\\}",
                localVarApiClient.escapeString(liveStreamId.toString()));

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
    private okhttp3.Call getValidateBeforeCall(String liveStreamId, final ApiCallback _callback) throws ApiException {

        // verify the required parameter 'liveStreamId' is set
        if (liveStreamId == null) {
            throw new ApiException("Missing the required parameter 'liveStreamId' when calling get");
        }

        okhttp3.Call localVarCall = getCall(liveStreamId, _callback);
        return localVarCall;
    }

    /**
     * Retrieve live stream
     *
     * Get a livestream by id.
     * 
     * @param liveStreamId
     *            The unique ID for the live stream you want to watch. (required)
     * 
     * @return LiveStream
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
     *                        <td>* X-RateLimit-Limit - The request limit per minute. <br>
     *                        * X-RateLimit-Remaining - The number of available requests left for the current time
     *                        window. <br>
     *                        * X-RateLimit-Retry-After - The number of seconds left until the current rate limit window
     *                        resets. <br>
     *                        </td>
     *                        </tr>
     *                        <tr>
     *                        <td>429</td>
     *                        <td>Too Many Requests</td>
     *                        <td>* X-RateLimit-Limit - The request limit per minute. <br>
     *                        * X-RateLimit-Remaining - The number of available requests left for the current time
     *                        window. <br>
     *                        * X-RateLimit-Retry-After - The number of seconds left until the current rate limit window
     *                        resets. <br>
     *                        </td>
     *                        </tr>
     *                        </table>
     */
    public LiveStream get(String liveStreamId) throws ApiException {
        ApiResponse<LiveStream> localVarResp = getWithHttpInfo(liveStreamId);
        return localVarResp.getData();
    }

    /**
     * Retrieve live stream
     *
     * Get a livestream by id.
     * 
     * @param liveStreamId
     *            The unique ID for the live stream you want to watch. (required)
     * 
     * @return ApiResponse&lt;LiveStream&gt;
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
     *                        <td>* X-RateLimit-Limit - The request limit per minute. <br>
     *                        * X-RateLimit-Remaining - The number of available requests left for the current time
     *                        window. <br>
     *                        * X-RateLimit-Retry-After - The number of seconds left until the current rate limit window
     *                        resets. <br>
     *                        </td>
     *                        </tr>
     *                        <tr>
     *                        <td>429</td>
     *                        <td>Too Many Requests</td>
     *                        <td>* X-RateLimit-Limit - The request limit per minute. <br>
     *                        * X-RateLimit-Remaining - The number of available requests left for the current time
     *                        window. <br>
     *                        * X-RateLimit-Retry-After - The number of seconds left until the current rate limit window
     *                        resets. <br>
     *                        </td>
     *                        </tr>
     *                        </table>
     */
    public ApiResponse<LiveStream> getWithHttpInfo(String liveStreamId) throws ApiException {
        okhttp3.Call localVarCall = getValidateBeforeCall(liveStreamId, null);
        Type localVarReturnType = new TypeToken<LiveStream>() {
        }.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Retrieve live stream (asynchronously) Get a livestream by id.
     * 
     * @param liveStreamId
     *            The unique ID for the live stream you want to watch. (required)
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
     *                        <td>* X-RateLimit-Limit - The request limit per minute. <br>
     *                        * X-RateLimit-Remaining - The number of available requests left for the current time
     *                        window. <br>
     *                        * X-RateLimit-Retry-After - The number of seconds left until the current rate limit window
     *                        resets. <br>
     *                        </td>
     *                        </tr>
     *                        <tr>
     *                        <td>429</td>
     *                        <td>Too Many Requests</td>
     *                        <td>* X-RateLimit-Limit - The request limit per minute. <br>
     *                        * X-RateLimit-Remaining - The number of available requests left for the current time
     *                        window. <br>
     *                        * X-RateLimit-Retry-After - The number of seconds left until the current rate limit window
     *                        resets. <br>
     *                        </td>
     *                        </tr>
     *                        </table>
     */
    public okhttp3.Call getAsync(String liveStreamId, final ApiCallback<LiveStream> _callback) throws ApiException {
        okhttp3.Call localVarCall = getValidateBeforeCall(liveStreamId, _callback);
        Type localVarReturnType = new TypeToken<LiveStream>() {
        }.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    /**
     * Build call for update
     * 
     * @param liveStreamId
     *            The unique ID for the live stream that you want to update information for such as player details.
     *            (required)
     * @param liveStreamUpdatePayload
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
     *                        <td>* X-RateLimit-Limit - The request limit per minute. <br>
     *                        * X-RateLimit-Remaining - The number of available requests left for the current time
     *                        window. <br>
     *                        * X-RateLimit-Retry-After - The number of seconds left until the current rate limit window
     *                        resets. <br>
     *                        </td>
     *                        </tr>
     *                        <tr>
     *                        <td>400</td>
     *                        <td>Bad Request</td>
     *                        <td>* X-RateLimit-Limit - The request limit per minute. <br>
     *                        * X-RateLimit-Remaining - The number of available requests left for the current time
     *                        window. <br>
     *                        * X-RateLimit-Retry-After - The number of seconds left until the current rate limit window
     *                        resets. <br>
     *                        </td>
     *                        </tr>
     *                        <tr>
     *                        <td>429</td>
     *                        <td>Too Many Requests</td>
     *                        <td>* X-RateLimit-Limit - The request limit per minute. <br>
     *                        * X-RateLimit-Remaining - The number of available requests left for the current time
     *                        window. <br>
     *                        * X-RateLimit-Retry-After - The number of seconds left until the current rate limit window
     *                        resets. <br>
     *                        </td>
     *                        </tr>
     *                        </table>
     */
    private okhttp3.Call updateCall(String liveStreamId, LiveStreamUpdatePayload liveStreamUpdatePayload,
            final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = liveStreamUpdatePayload;

        // create path and map variables
        String localVarPath = "/live-streams/{liveStreamId}".replaceAll("\\{" + "liveStreamId" + "\\}",
                localVarApiClient.escapeString(liveStreamId.toString()));

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
    private okhttp3.Call updateValidateBeforeCall(String liveStreamId, LiveStreamUpdatePayload liveStreamUpdatePayload,
            final ApiCallback _callback) throws ApiException {

        // verify the required parameter 'liveStreamId' is set
        if (liveStreamId == null) {
            throw new ApiException("Missing the required parameter 'liveStreamId' when calling update");
        }

        // verify the required parameter 'liveStreamUpdatePayload' is set
        if (liveStreamUpdatePayload == null) {
            throw new ApiException("Missing the required parameter 'liveStreamUpdatePayload' when calling update");
        }

        okhttp3.Call localVarCall = updateCall(liveStreamId, liveStreamUpdatePayload, _callback);
        return localVarCall;
    }

    /**
     * Update a live stream
     *
     * Updates the livestream object.
     * 
     * @param liveStreamId
     *            The unique ID for the live stream that you want to update information for such as player details.
     *            (required)
     * @param liveStreamUpdatePayload
     *            (required)
     * 
     * @return LiveStream
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
     *                        <td>* X-RateLimit-Limit - The request limit per minute. <br>
     *                        * X-RateLimit-Remaining - The number of available requests left for the current time
     *                        window. <br>
     *                        * X-RateLimit-Retry-After - The number of seconds left until the current rate limit window
     *                        resets. <br>
     *                        </td>
     *                        </tr>
     *                        <tr>
     *                        <td>400</td>
     *                        <td>Bad Request</td>
     *                        <td>* X-RateLimit-Limit - The request limit per minute. <br>
     *                        * X-RateLimit-Remaining - The number of available requests left for the current time
     *                        window. <br>
     *                        * X-RateLimit-Retry-After - The number of seconds left until the current rate limit window
     *                        resets. <br>
     *                        </td>
     *                        </tr>
     *                        <tr>
     *                        <td>429</td>
     *                        <td>Too Many Requests</td>
     *                        <td>* X-RateLimit-Limit - The request limit per minute. <br>
     *                        * X-RateLimit-Remaining - The number of available requests left for the current time
     *                        window. <br>
     *                        * X-RateLimit-Retry-After - The number of seconds left until the current rate limit window
     *                        resets. <br>
     *                        </td>
     *                        </tr>
     *                        </table>
     */
    public LiveStream update(String liveStreamId, LiveStreamUpdatePayload liveStreamUpdatePayload) throws ApiException {
        ApiResponse<LiveStream> localVarResp = updateWithHttpInfo(liveStreamId, liveStreamUpdatePayload);
        return localVarResp.getData();
    }

    /**
     * Update a live stream
     *
     * Updates the livestream object.
     * 
     * @param liveStreamId
     *            The unique ID for the live stream that you want to update information for such as player details.
     *            (required)
     * @param liveStreamUpdatePayload
     *            (required)
     * 
     * @return ApiResponse&lt;LiveStream&gt;
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
     *                        <td>* X-RateLimit-Limit - The request limit per minute. <br>
     *                        * X-RateLimit-Remaining - The number of available requests left for the current time
     *                        window. <br>
     *                        * X-RateLimit-Retry-After - The number of seconds left until the current rate limit window
     *                        resets. <br>
     *                        </td>
     *                        </tr>
     *                        <tr>
     *                        <td>400</td>
     *                        <td>Bad Request</td>
     *                        <td>* X-RateLimit-Limit - The request limit per minute. <br>
     *                        * X-RateLimit-Remaining - The number of available requests left for the current time
     *                        window. <br>
     *                        * X-RateLimit-Retry-After - The number of seconds left until the current rate limit window
     *                        resets. <br>
     *                        </td>
     *                        </tr>
     *                        <tr>
     *                        <td>429</td>
     *                        <td>Too Many Requests</td>
     *                        <td>* X-RateLimit-Limit - The request limit per minute. <br>
     *                        * X-RateLimit-Remaining - The number of available requests left for the current time
     *                        window. <br>
     *                        * X-RateLimit-Retry-After - The number of seconds left until the current rate limit window
     *                        resets. <br>
     *                        </td>
     *                        </tr>
     *                        </table>
     */
    public ApiResponse<LiveStream> updateWithHttpInfo(String liveStreamId,
            LiveStreamUpdatePayload liveStreamUpdatePayload) throws ApiException {
        okhttp3.Call localVarCall = updateValidateBeforeCall(liveStreamId, liveStreamUpdatePayload, null);
        Type localVarReturnType = new TypeToken<LiveStream>() {
        }.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update a live stream (asynchronously) Updates the livestream object.
     * 
     * @param liveStreamId
     *            The unique ID for the live stream that you want to update information for such as player details.
     *            (required)
     * @param liveStreamUpdatePayload
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
     *                        <td>* X-RateLimit-Limit - The request limit per minute. <br>
     *                        * X-RateLimit-Remaining - The number of available requests left for the current time
     *                        window. <br>
     *                        * X-RateLimit-Retry-After - The number of seconds left until the current rate limit window
     *                        resets. <br>
     *                        </td>
     *                        </tr>
     *                        <tr>
     *                        <td>400</td>
     *                        <td>Bad Request</td>
     *                        <td>* X-RateLimit-Limit - The request limit per minute. <br>
     *                        * X-RateLimit-Remaining - The number of available requests left for the current time
     *                        window. <br>
     *                        * X-RateLimit-Retry-After - The number of seconds left until the current rate limit window
     *                        resets. <br>
     *                        </td>
     *                        </tr>
     *                        <tr>
     *                        <td>429</td>
     *                        <td>Too Many Requests</td>
     *                        <td>* X-RateLimit-Limit - The request limit per minute. <br>
     *                        * X-RateLimit-Remaining - The number of available requests left for the current time
     *                        window. <br>
     *                        * X-RateLimit-Retry-After - The number of seconds left until the current rate limit window
     *                        resets. <br>
     *                        </td>
     *                        </tr>
     *                        </table>
     */
    public okhttp3.Call updateAsync(String liveStreamId, LiveStreamUpdatePayload liveStreamUpdatePayload,
            final ApiCallback<LiveStream> _callback) throws ApiException {
        okhttp3.Call localVarCall = updateValidateBeforeCall(liveStreamId, liveStreamUpdatePayload, _callback);
        Type localVarReturnType = new TypeToken<LiveStream>() {
        }.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    /**
     * Build call for delete
     * 
     * @param liveStreamId
     *            The unique ID for the live stream that you want to remove. (required)
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
     *                        <td>* X-RateLimit-Limit - The request limit per minute. <br>
     *                        * X-RateLimit-Remaining - The number of available requests left for the current time
     *                        window. <br>
     *                        * X-RateLimit-Retry-After - The number of seconds left until the current rate limit window
     *                        resets. <br>
     *                        </td>
     *                        </tr>
     *                        <tr>
     *                        <td>429</td>
     *                        <td>Too Many Requests</td>
     *                        <td>* X-RateLimit-Limit - The request limit per minute. <br>
     *                        * X-RateLimit-Remaining - The number of available requests left for the current time
     *                        window. <br>
     *                        * X-RateLimit-Retry-After - The number of seconds left until the current rate limit window
     *                        resets. <br>
     *                        </td>
     *                        </tr>
     *                        </table>
     */
    private okhttp3.Call deleteCall(String liveStreamId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/live-streams/{liveStreamId}".replaceAll("\\{" + "liveStreamId" + "\\}",
                localVarApiClient.escapeString(liveStreamId.toString()));

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
    private okhttp3.Call deleteValidateBeforeCall(String liveStreamId, final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter 'liveStreamId' is set
        if (liveStreamId == null) {
            throw new ApiException("Missing the required parameter 'liveStreamId' when calling delete");
        }

        okhttp3.Call localVarCall = deleteCall(liveStreamId, _callback);
        return localVarCall;
    }

    /**
     * Delete a live stream
     *
     * If you do not need a live stream any longer, you can send a request to delete it. All you need is the
     * liveStreamId.
     * 
     * @param liveStreamId
     *            The unique ID for the live stream that you want to remove. (required)
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
     *                        <td>* X-RateLimit-Limit - The request limit per minute. <br>
     *                        * X-RateLimit-Remaining - The number of available requests left for the current time
     *                        window. <br>
     *                        * X-RateLimit-Retry-After - The number of seconds left until the current rate limit window
     *                        resets. <br>
     *                        </td>
     *                        </tr>
     *                        <tr>
     *                        <td>429</td>
     *                        <td>Too Many Requests</td>
     *                        <td>* X-RateLimit-Limit - The request limit per minute. <br>
     *                        * X-RateLimit-Remaining - The number of available requests left for the current time
     *                        window. <br>
     *                        * X-RateLimit-Retry-After - The number of seconds left until the current rate limit window
     *                        resets. <br>
     *                        </td>
     *                        </tr>
     *                        </table>
     */
    public void delete(String liveStreamId) throws ApiException {
        deleteWithHttpInfo(liveStreamId);
    }

    /**
     * Delete a live stream
     *
     * If you do not need a live stream any longer, you can send a request to delete it. All you need is the
     * liveStreamId.
     * 
     * @param liveStreamId
     *            The unique ID for the live stream that you want to remove. (required)
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
     *                        <td>* X-RateLimit-Limit - The request limit per minute. <br>
     *                        * X-RateLimit-Remaining - The number of available requests left for the current time
     *                        window. <br>
     *                        * X-RateLimit-Retry-After - The number of seconds left until the current rate limit window
     *                        resets. <br>
     *                        </td>
     *                        </tr>
     *                        <tr>
     *                        <td>429</td>
     *                        <td>Too Many Requests</td>
     *                        <td>* X-RateLimit-Limit - The request limit per minute. <br>
     *                        * X-RateLimit-Remaining - The number of available requests left for the current time
     *                        window. <br>
     *                        * X-RateLimit-Retry-After - The number of seconds left until the current rate limit window
     *                        resets. <br>
     *                        </td>
     *                        </tr>
     *                        </table>
     */
    public ApiResponse<Void> deleteWithHttpInfo(String liveStreamId) throws ApiException {
        okhttp3.Call localVarCall = deleteValidateBeforeCall(liveStreamId, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Delete a live stream (asynchronously) If you do not need a live stream any longer, you can send a request to
     * delete it. All you need is the liveStreamId.
     * 
     * @param liveStreamId
     *            The unique ID for the live stream that you want to remove. (required)
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
     *                        <td>* X-RateLimit-Limit - The request limit per minute. <br>
     *                        * X-RateLimit-Remaining - The number of available requests left for the current time
     *                        window. <br>
     *                        * X-RateLimit-Retry-After - The number of seconds left until the current rate limit window
     *                        resets. <br>
     *                        </td>
     *                        </tr>
     *                        <tr>
     *                        <td>429</td>
     *                        <td>Too Many Requests</td>
     *                        <td>* X-RateLimit-Limit - The request limit per minute. <br>
     *                        * X-RateLimit-Remaining - The number of available requests left for the current time
     *                        window. <br>
     *                        * X-RateLimit-Retry-After - The number of seconds left until the current rate limit window
     *                        resets. <br>
     *                        </td>
     *                        </tr>
     *                        </table>
     */
    public okhttp3.Call deleteAsync(String liveStreamId, final ApiCallback<Void> _callback) throws ApiException {
        okhttp3.Call localVarCall = deleteValidateBeforeCall(liveStreamId, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }

    private okhttp3.Call listCall(String streamKey, String name, String sortBy, String sortOrder, Integer currentPage,
            Integer pageSize, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/live-streams";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (streamKey != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("streamKey", streamKey));
        }

        if (name != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("name", name));
        }

        if (sortBy != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("sortBy", sortBy));
        }

        if (sortOrder != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("sortOrder", sortOrder));
        }

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
    private okhttp3.Call listValidateBeforeCall(String streamKey, String name, String sortBy, String sortOrder,
            Integer currentPage, Integer pageSize, final ApiCallback _callback) throws ApiException {

        okhttp3.Call localVarCall = listCall(streamKey, name, sortBy, sortOrder, currentPage, pageSize, _callback);
        return localVarCall;
    }

    private ApiResponse<LiveStreamListResponse> listWithHttpInfo(String streamKey, String name, String sortBy,
            String sortOrder, Integer currentPage, Integer pageSize) throws ApiException {
        okhttp3.Call localVarCall = listValidateBeforeCall(streamKey, name, sortBy, sortOrder, currentPage, pageSize,
                null);
        Type localVarReturnType = new TypeToken<LiveStreamListResponse>() {
        }.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call listAsync(String streamKey, String name, String sortBy, String sortOrder, Integer currentPage,
            Integer pageSize, final ApiCallback<LiveStreamListResponse> _callback) throws ApiException {
        okhttp3.Call localVarCall = listValidateBeforeCall(streamKey, name, sortBy, sortOrder, currentPage, pageSize,
                _callback);
        Type localVarReturnType = new TypeToken<LiveStreamListResponse>() {
        }.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIlistRequest {
        private String streamKey;
        private String name;
        private String sortBy;
        private String sortOrder;
        private Integer currentPage;
        private Integer pageSize;

        private APIlistRequest() {
        }

        /**
         * Set streamKey
         * 
         * @param streamKey
         *            The unique stream key that allows you to stream videos. (optional)
         * 
         * @return APIlistRequest
         */
        public APIlistRequest streamKey(String streamKey) {
            this.streamKey = streamKey;
            return this;
        }

        /**
         * Set name
         * 
         * @param name
         *            You can filter live streams by their name or a part of their name. (optional)
         * 
         * @return APIlistRequest
         */
        public APIlistRequest name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Set sortBy
         * 
         * @param sortBy
         *            Enables you to sort live stream results. Allowed attributes: &#x60;name&#x60;,
         *            &#x60;createdAt&#x60;, &#x60;updatedAt&#x60;. &#x60;name&#x60; - the name of the live stream.
         *            &#x60;createdAt&#x60; - the time a live stream was created. &#x60;updatedAt&#x60; - the time a
         *            live stream was last updated. When using &#x60;createdAt&#x60; or &#x60;updatedAt&#x60;, the API
         *            sorts the results based on the ISO-8601 time format. (optional)
         * 
         * @return APIlistRequest
         */
        public APIlistRequest sortBy(String sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /**
         * Set sortOrder
         * 
         * @param sortOrder
         *            Allowed: asc, desc. Ascending for date and time means that earlier values precede later ones.
         *            Descending means that later values preced earlier ones. For title, it is 0-9 and A-Z ascending and
         *            Z-A, 9-0 descending. (optional)
         * 
         * @return APIlistRequest
         */
        public APIlistRequest sortOrder(String sortOrder) {
            this.sortOrder = sortOrder;
            return this;
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
         *                        <td>* X-RateLimit-Limit - The request limit per minute. <br>
         *                        * X-RateLimit-Remaining - The number of available requests left for the current time
         *                        window. <br>
         *                        * X-RateLimit-Retry-After - The number of seconds left until the current rate limit
         *                        window resets. <br>
         *                        </td>
         *                        </tr>
         *                        <tr>
         *                        <td>429</td>
         *                        <td>Too Many Requests</td>
         *                        <td>* X-RateLimit-Limit - The request limit per minute. <br>
         *                        * X-RateLimit-Remaining - The number of available requests left for the current time
         *                        window. <br>
         *                        * X-RateLimit-Retry-After - The number of seconds left until the current rate limit
         *                        window resets. <br>
         *                        </td>
         *                        </tr>
         *                        </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return listCall(streamKey, name, sortBy, sortOrder, currentPage, pageSize, _callback);
        }

        /**
         * Execute list request
         * 
         * @return LiveStreamListResponse
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
         *                        <td>* X-RateLimit-Limit - The request limit per minute. <br>
         *                        * X-RateLimit-Remaining - The number of available requests left for the current time
         *                        window. <br>
         *                        * X-RateLimit-Retry-After - The number of seconds left until the current rate limit
         *                        window resets. <br>
         *                        </td>
         *                        </tr>
         *                        <tr>
         *                        <td>429</td>
         *                        <td>Too Many Requests</td>
         *                        <td>* X-RateLimit-Limit - The request limit per minute. <br>
         *                        * X-RateLimit-Remaining - The number of available requests left for the current time
         *                        window. <br>
         *                        * X-RateLimit-Retry-After - The number of seconds left until the current rate limit
         *                        window resets. <br>
         *                        </td>
         *                        </tr>
         *                        </table>
         */
        public Page<LiveStream> execute() throws ApiException {
            ApiResponse<LiveStreamListResponse> localVarResp = listWithHttpInfo(streamKey, name, sortBy, sortOrder,
                    currentPage, pageSize);
            return new Page<>(localVarResp.getData().getData(), localVarResp.getData().getPagination(), () -> {
                try {
                    return copy().currentPage((currentPage == null ? 1 : currentPage) + 1).execute();
                } catch (ApiException e) {
                    throw new RuntimeException(e);
                }
            }); //
        }

        private APIlistRequest copy() {
            APIlistRequest copy = new APIlistRequest();
            copy.streamKey(streamKey);
            copy.name(name);
            copy.sortBy(sortBy);
            copy.sortOrder(sortOrder);
            copy.currentPage(currentPage);
            copy.pageSize(pageSize);
            return copy;
        }

        /**
         * Execute list request with HTTP info returned
         * 
         * @return ApiResponse&lt;LiveStreamListResponse&gt;
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
         *                        <td>* X-RateLimit-Limit - The request limit per minute. <br>
         *                        * X-RateLimit-Remaining - The number of available requests left for the current time
         *                        window. <br>
         *                        * X-RateLimit-Retry-After - The number of seconds left until the current rate limit
         *                        window resets. <br>
         *                        </td>
         *                        </tr>
         *                        <tr>
         *                        <td>429</td>
         *                        <td>Too Many Requests</td>
         *                        <td>* X-RateLimit-Limit - The request limit per minute. <br>
         *                        * X-RateLimit-Remaining - The number of available requests left for the current time
         *                        window. <br>
         *                        * X-RateLimit-Retry-After - The number of seconds left until the current rate limit
         *                        window resets. <br>
         *                        </td>
         *                        </tr>
         *                        </table>
         */
        public ApiResponse<LiveStreamListResponse> executeWithHttpInfo() throws ApiException {
            return listWithHttpInfo(streamKey, name, sortBy, sortOrder, currentPage, pageSize);
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
         *                        <td>* X-RateLimit-Limit - The request limit per minute. <br>
         *                        * X-RateLimit-Remaining - The number of available requests left for the current time
         *                        window. <br>
         *                        * X-RateLimit-Retry-After - The number of seconds left until the current rate limit
         *                        window resets. <br>
         *                        </td>
         *                        </tr>
         *                        <tr>
         *                        <td>429</td>
         *                        <td>Too Many Requests</td>
         *                        <td>* X-RateLimit-Limit - The request limit per minute. <br>
         *                        * X-RateLimit-Remaining - The number of available requests left for the current time
         *                        window. <br>
         *                        * X-RateLimit-Retry-After - The number of seconds left until the current rate limit
         *                        window resets. <br>
         *                        </td>
         *                        </tr>
         *                        </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Page<LiveStream>> _callback) throws ApiException {
            ApiCallback<LiveStreamListResponse> apiCallback = new ApiCallback<LiveStreamListResponse>() {

                @Override
                public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
                    _callback.onFailure(e, statusCode, responseHeaders);
                }

                @Override
                public void onSuccess(LiveStreamListResponse result, int statusCode,
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
            return listAsync(streamKey, name, sortBy, sortOrder, currentPage, pageSize, apiCallback);
        }
    }

    /**
     * List all live streams
     *
     * Get the list of livestreams on the workspace.
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
     *                        <td>* X-RateLimit-Limit - The request limit per minute. <br>
     *                        * X-RateLimit-Remaining - The number of available requests left for the current time
     *                        window. <br>
     *                        * X-RateLimit-Retry-After - The number of seconds left until the current rate limit window
     *                        resets. <br>
     *                        </td>
     *                        </tr>
     *                        <tr>
     *                        <td>429</td>
     *                        <td>Too Many Requests</td>
     *                        <td>* X-RateLimit-Limit - The request limit per minute. <br>
     *                        * X-RateLimit-Remaining - The number of available requests left for the current time
     *                        window. <br>
     *                        * X-RateLimit-Retry-After - The number of seconds left until the current rate limit window
     *                        resets. <br>
     *                        </td>
     *                        </tr>
     *                        </table>
     */
    public APIlistRequest list() {
        return new APIlistRequest();
    }

    /**
     * Build call for uploadThumbnail
     * 
     * @param liveStreamId
     *            The unique ID for the live stream you want to upload. (required)
     * @param file
     *            The image to be added as a thumbnail. The mime type should be image/jpeg, image/png or image/webp. The
     *            max allowed size is 8 MiB. (required)
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
     *                        <td>201</td>
     *                        <td>Created</td>
     *                        <td>* X-RateLimit-Limit - The request limit per minute. <br>
     *                        * X-RateLimit-Remaining - The number of available requests left for the current time
     *                        window. <br>
     *                        * X-RateLimit-Retry-After - The number of seconds left until the current rate limit window
     *                        resets. <br>
     *                        </td>
     *                        </tr>
     *                        <tr>
     *                        <td>400</td>
     *                        <td>Bad Request</td>
     *                        <td>* X-RateLimit-Limit - The request limit per minute. <br>
     *                        * X-RateLimit-Remaining - The number of available requests left for the current time
     *                        window. <br>
     *                        * X-RateLimit-Retry-After - The number of seconds left until the current rate limit window
     *                        resets. <br>
     *                        </td>
     *                        </tr>
     *                        <tr>
     *                        <td>404</td>
     *                        <td>Not Found</td>
     *                        <td>* X-RateLimit-Limit - The request limit per minute. <br>
     *                        * X-RateLimit-Remaining - The number of available requests left for the current time
     *                        window. <br>
     *                        * X-RateLimit-Retry-After - The number of seconds left until the current rate limit window
     *                        resets. <br>
     *                        </td>
     *                        </tr>
     *                        <tr>
     *                        <td>429</td>
     *                        <td>Too Many Requests</td>
     *                        <td>* X-RateLimit-Limit - The request limit per minute. <br>
     *                        * X-RateLimit-Remaining - The number of available requests left for the current time
     *                        window. <br>
     *                        * X-RateLimit-Retry-After - The number of seconds left until the current rate limit window
     *                        resets. <br>
     *                        </td>
     *                        </tr>
     *                        </table>
     */
    private okhttp3.Call uploadThumbnailCall(String liveStreamId, File file, final ApiCallback _callback)
            throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/live-streams/{liveStreamId}/thumbnail".replaceAll("\\{" + "liveStreamId" + "\\}",
                localVarApiClient.escapeString(liveStreamId.toString()));

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
    private okhttp3.Call uploadThumbnailValidateBeforeCall(String liveStreamId, File file, final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter 'liveStreamId' is set
        if (liveStreamId == null) {
            throw new ApiException("Missing the required parameter 'liveStreamId' when calling uploadThumbnail");
        }

        // verify the required parameter 'file' is set
        if (file == null) {
            throw new ApiException("Missing the required parameter 'file' when calling uploadThumbnail");
        }

        okhttp3.Call localVarCall = uploadThumbnailCall(liveStreamId, file, _callback);
        return localVarCall;
    }

    /**
     * Upload a thumbnail
     *
     * Upload the thumbnail for the livestream.
     * 
     * @param liveStreamId
     *            The unique ID for the live stream you want to upload. (required)
     * @param file
     *            The image to be added as a thumbnail. The mime type should be image/jpeg, image/png or image/webp. The
     *            max allowed size is 8 MiB. (required)
     * 
     * @return LiveStream
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
     *                        <td>201</td>
     *                        <td>Created</td>
     *                        <td>* X-RateLimit-Limit - The request limit per minute. <br>
     *                        * X-RateLimit-Remaining - The number of available requests left for the current time
     *                        window. <br>
     *                        * X-RateLimit-Retry-After - The number of seconds left until the current rate limit window
     *                        resets. <br>
     *                        </td>
     *                        </tr>
     *                        <tr>
     *                        <td>400</td>
     *                        <td>Bad Request</td>
     *                        <td>* X-RateLimit-Limit - The request limit per minute. <br>
     *                        * X-RateLimit-Remaining - The number of available requests left for the current time
     *                        window. <br>
     *                        * X-RateLimit-Retry-After - The number of seconds left until the current rate limit window
     *                        resets. <br>
     *                        </td>
     *                        </tr>
     *                        <tr>
     *                        <td>404</td>
     *                        <td>Not Found</td>
     *                        <td>* X-RateLimit-Limit - The request limit per minute. <br>
     *                        * X-RateLimit-Remaining - The number of available requests left for the current time
     *                        window. <br>
     *                        * X-RateLimit-Retry-After - The number of seconds left until the current rate limit window
     *                        resets. <br>
     *                        </td>
     *                        </tr>
     *                        <tr>
     *                        <td>429</td>
     *                        <td>Too Many Requests</td>
     *                        <td>* X-RateLimit-Limit - The request limit per minute. <br>
     *                        * X-RateLimit-Remaining - The number of available requests left for the current time
     *                        window. <br>
     *                        * X-RateLimit-Retry-After - The number of seconds left until the current rate limit window
     *                        resets. <br>
     *                        </td>
     *                        </tr>
     *                        </table>
     */
    public LiveStream uploadThumbnail(String liveStreamId, File file) throws ApiException {
        ApiResponse<LiveStream> localVarResp = uploadThumbnailWithHttpInfo(liveStreamId, file);
        return localVarResp.getData();
    }

    /**
     * Upload a thumbnail
     *
     * Upload the thumbnail for the livestream.
     * 
     * @param liveStreamId
     *            The unique ID for the live stream you want to upload. (required)
     * @param file
     *            The image to be added as a thumbnail. The mime type should be image/jpeg, image/png or image/webp. The
     *            max allowed size is 8 MiB. (required)
     * 
     * @return ApiResponse&lt;LiveStream&gt;
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
     *                        <td>201</td>
     *                        <td>Created</td>
     *                        <td>* X-RateLimit-Limit - The request limit per minute. <br>
     *                        * X-RateLimit-Remaining - The number of available requests left for the current time
     *                        window. <br>
     *                        * X-RateLimit-Retry-After - The number of seconds left until the current rate limit window
     *                        resets. <br>
     *                        </td>
     *                        </tr>
     *                        <tr>
     *                        <td>400</td>
     *                        <td>Bad Request</td>
     *                        <td>* X-RateLimit-Limit - The request limit per minute. <br>
     *                        * X-RateLimit-Remaining - The number of available requests left for the current time
     *                        window. <br>
     *                        * X-RateLimit-Retry-After - The number of seconds left until the current rate limit window
     *                        resets. <br>
     *                        </td>
     *                        </tr>
     *                        <tr>
     *                        <td>404</td>
     *                        <td>Not Found</td>
     *                        <td>* X-RateLimit-Limit - The request limit per minute. <br>
     *                        * X-RateLimit-Remaining - The number of available requests left for the current time
     *                        window. <br>
     *                        * X-RateLimit-Retry-After - The number of seconds left until the current rate limit window
     *                        resets. <br>
     *                        </td>
     *                        </tr>
     *                        <tr>
     *                        <td>429</td>
     *                        <td>Too Many Requests</td>
     *                        <td>* X-RateLimit-Limit - The request limit per minute. <br>
     *                        * X-RateLimit-Remaining - The number of available requests left for the current time
     *                        window. <br>
     *                        * X-RateLimit-Retry-After - The number of seconds left until the current rate limit window
     *                        resets. <br>
     *                        </td>
     *                        </tr>
     *                        </table>
     */
    public ApiResponse<LiveStream> uploadThumbnailWithHttpInfo(String liveStreamId, File file) throws ApiException {
        okhttp3.Call localVarCall = uploadThumbnailValidateBeforeCall(liveStreamId, file, null);
        Type localVarReturnType = new TypeToken<LiveStream>() {
        }.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Upload a thumbnail (asynchronously) Upload the thumbnail for the livestream.
     * 
     * @param liveStreamId
     *            The unique ID for the live stream you want to upload. (required)
     * @param file
     *            The image to be added as a thumbnail. The mime type should be image/jpeg, image/png or image/webp. The
     *            max allowed size is 8 MiB. (required)
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
     *                        <td>201</td>
     *                        <td>Created</td>
     *                        <td>* X-RateLimit-Limit - The request limit per minute. <br>
     *                        * X-RateLimit-Remaining - The number of available requests left for the current time
     *                        window. <br>
     *                        * X-RateLimit-Retry-After - The number of seconds left until the current rate limit window
     *                        resets. <br>
     *                        </td>
     *                        </tr>
     *                        <tr>
     *                        <td>400</td>
     *                        <td>Bad Request</td>
     *                        <td>* X-RateLimit-Limit - The request limit per minute. <br>
     *                        * X-RateLimit-Remaining - The number of available requests left for the current time
     *                        window. <br>
     *                        * X-RateLimit-Retry-After - The number of seconds left until the current rate limit window
     *                        resets. <br>
     *                        </td>
     *                        </tr>
     *                        <tr>
     *                        <td>404</td>
     *                        <td>Not Found</td>
     *                        <td>* X-RateLimit-Limit - The request limit per minute. <br>
     *                        * X-RateLimit-Remaining - The number of available requests left for the current time
     *                        window. <br>
     *                        * X-RateLimit-Retry-After - The number of seconds left until the current rate limit window
     *                        resets. <br>
     *                        </td>
     *                        </tr>
     *                        <tr>
     *                        <td>429</td>
     *                        <td>Too Many Requests</td>
     *                        <td>* X-RateLimit-Limit - The request limit per minute. <br>
     *                        * X-RateLimit-Remaining - The number of available requests left for the current time
     *                        window. <br>
     *                        * X-RateLimit-Retry-After - The number of seconds left until the current rate limit window
     *                        resets. <br>
     *                        </td>
     *                        </tr>
     *                        </table>
     */
    public okhttp3.Call uploadThumbnailAsync(String liveStreamId, File file, final ApiCallback<LiveStream> _callback)
            throws ApiException {
        okhttp3.Call localVarCall = uploadThumbnailValidateBeforeCall(liveStreamId, file, _callback);
        Type localVarReturnType = new TypeToken<LiveStream>() {
        }.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    /**
     * Build call for deleteThumbnail
     * 
     * @param liveStreamId
     *            The unique identifier of the live stream whose thumbnail you want to delete. (required)
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
     *                        <td>* X-RateLimit-Limit - The request limit per minute. <br>
     *                        * X-RateLimit-Remaining - The number of available requests left for the current time
     *                        window. <br>
     *                        * X-RateLimit-Retry-After - The number of seconds left until the current rate limit window
     *                        resets. <br>
     *                        </td>
     *                        </tr>
     *                        <tr>
     *                        <td>404</td>
     *                        <td>Not Found</td>
     *                        <td>* X-RateLimit-Limit - The request limit per minute. <br>
     *                        * X-RateLimit-Remaining - The number of available requests left for the current time
     *                        window. <br>
     *                        * X-RateLimit-Retry-After - The number of seconds left until the current rate limit window
     *                        resets. <br>
     *                        </td>
     *                        </tr>
     *                        <tr>
     *                        <td>429</td>
     *                        <td>Too Many Requests</td>
     *                        <td>* X-RateLimit-Limit - The request limit per minute. <br>
     *                        * X-RateLimit-Remaining - The number of available requests left for the current time
     *                        window. <br>
     *                        * X-RateLimit-Retry-After - The number of seconds left until the current rate limit window
     *                        resets. <br>
     *                        </td>
     *                        </tr>
     *                        </table>
     */
    private okhttp3.Call deleteThumbnailCall(String liveStreamId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/live-streams/{liveStreamId}/thumbnail".replaceAll("\\{" + "liveStreamId" + "\\}",
                localVarApiClient.escapeString(liveStreamId.toString()));

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
    private okhttp3.Call deleteThumbnailValidateBeforeCall(String liveStreamId, final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter 'liveStreamId' is set
        if (liveStreamId == null) {
            throw new ApiException("Missing the required parameter 'liveStreamId' when calling deleteThumbnail");
        }

        okhttp3.Call localVarCall = deleteThumbnailCall(liveStreamId, _callback);
        return localVarCall;
    }

    /**
     * Delete a thumbnail
     *
     * Send the unique identifier for a live stream to delete its thumbnail.
     * 
     * @param liveStreamId
     *            The unique identifier of the live stream whose thumbnail you want to delete. (required)
     * 
     * @return LiveStream
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
     *                        <td>* X-RateLimit-Limit - The request limit per minute. <br>
     *                        * X-RateLimit-Remaining - The number of available requests left for the current time
     *                        window. <br>
     *                        * X-RateLimit-Retry-After - The number of seconds left until the current rate limit window
     *                        resets. <br>
     *                        </td>
     *                        </tr>
     *                        <tr>
     *                        <td>404</td>
     *                        <td>Not Found</td>
     *                        <td>* X-RateLimit-Limit - The request limit per minute. <br>
     *                        * X-RateLimit-Remaining - The number of available requests left for the current time
     *                        window. <br>
     *                        * X-RateLimit-Retry-After - The number of seconds left until the current rate limit window
     *                        resets. <br>
     *                        </td>
     *                        </tr>
     *                        <tr>
     *                        <td>429</td>
     *                        <td>Too Many Requests</td>
     *                        <td>* X-RateLimit-Limit - The request limit per minute. <br>
     *                        * X-RateLimit-Remaining - The number of available requests left for the current time
     *                        window. <br>
     *                        * X-RateLimit-Retry-After - The number of seconds left until the current rate limit window
     *                        resets. <br>
     *                        </td>
     *                        </tr>
     *                        </table>
     */
    public LiveStream deleteThumbnail(String liveStreamId) throws ApiException {
        ApiResponse<LiveStream> localVarResp = deleteThumbnailWithHttpInfo(liveStreamId);
        return localVarResp.getData();
    }

    /**
     * Delete a thumbnail
     *
     * Send the unique identifier for a live stream to delete its thumbnail.
     * 
     * @param liveStreamId
     *            The unique identifier of the live stream whose thumbnail you want to delete. (required)
     * 
     * @return ApiResponse&lt;LiveStream&gt;
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
     *                        <td>* X-RateLimit-Limit - The request limit per minute. <br>
     *                        * X-RateLimit-Remaining - The number of available requests left for the current time
     *                        window. <br>
     *                        * X-RateLimit-Retry-After - The number of seconds left until the current rate limit window
     *                        resets. <br>
     *                        </td>
     *                        </tr>
     *                        <tr>
     *                        <td>404</td>
     *                        <td>Not Found</td>
     *                        <td>* X-RateLimit-Limit - The request limit per minute. <br>
     *                        * X-RateLimit-Remaining - The number of available requests left for the current time
     *                        window. <br>
     *                        * X-RateLimit-Retry-After - The number of seconds left until the current rate limit window
     *                        resets. <br>
     *                        </td>
     *                        </tr>
     *                        <tr>
     *                        <td>429</td>
     *                        <td>Too Many Requests</td>
     *                        <td>* X-RateLimit-Limit - The request limit per minute. <br>
     *                        * X-RateLimit-Remaining - The number of available requests left for the current time
     *                        window. <br>
     *                        * X-RateLimit-Retry-After - The number of seconds left until the current rate limit window
     *                        resets. <br>
     *                        </td>
     *                        </tr>
     *                        </table>
     */
    public ApiResponse<LiveStream> deleteThumbnailWithHttpInfo(String liveStreamId) throws ApiException {
        okhttp3.Call localVarCall = deleteThumbnailValidateBeforeCall(liveStreamId, null);
        Type localVarReturnType = new TypeToken<LiveStream>() {
        }.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Delete a thumbnail (asynchronously) Send the unique identifier for a live stream to delete its thumbnail.
     * 
     * @param liveStreamId
     *            The unique identifier of the live stream whose thumbnail you want to delete. (required)
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
     *                        <td>* X-RateLimit-Limit - The request limit per minute. <br>
     *                        * X-RateLimit-Remaining - The number of available requests left for the current time
     *                        window. <br>
     *                        * X-RateLimit-Retry-After - The number of seconds left until the current rate limit window
     *                        resets. <br>
     *                        </td>
     *                        </tr>
     *                        <tr>
     *                        <td>404</td>
     *                        <td>Not Found</td>
     *                        <td>* X-RateLimit-Limit - The request limit per minute. <br>
     *                        * X-RateLimit-Remaining - The number of available requests left for the current time
     *                        window. <br>
     *                        * X-RateLimit-Retry-After - The number of seconds left until the current rate limit window
     *                        resets. <br>
     *                        </td>
     *                        </tr>
     *                        <tr>
     *                        <td>429</td>
     *                        <td>Too Many Requests</td>
     *                        <td>* X-RateLimit-Limit - The request limit per minute. <br>
     *                        * X-RateLimit-Remaining - The number of available requests left for the current time
     *                        window. <br>
     *                        * X-RateLimit-Retry-After - The number of seconds left until the current rate limit window
     *                        resets. <br>
     *                        </td>
     *                        </tr>
     *                        </table>
     */
    public okhttp3.Call deleteThumbnailAsync(String liveStreamId, final ApiCallback<LiveStream> _callback)
            throws ApiException {
        okhttp3.Call localVarCall = deleteThumbnailValidateBeforeCall(liveStreamId, _callback);
        Type localVarReturnType = new TypeToken<LiveStream>() {
        }.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

}
