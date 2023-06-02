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

public class AdvancedAuthenticationApi {
    private ApiClient localVarApiClient;

    public AdvancedAuthenticationApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Constructor for AdvancedAuthenticationApi production environment where API key is not required.
     */
    public AdvancedAuthenticationApi() {
        this.localVarApiClient = new ApiClient(Environment.PRODUCTION.basePath);
    }

    /**
     * Constructor for AdvancedAuthenticationApi with custom API base path where API key is not required.
     * 
     * @param basePath
     *            the api base path. Expected Environment.PRODUCTION.basePath (default) or Environment.SANDBOX.basePath.
     */
    public AdvancedAuthenticationApi(String basePath) {
        this.localVarApiClient = new ApiClient(basePath);
    }

    /**
     * Constructor for AdvancedAuthenticationApi with custom API base path where API key is not required.
     * 
     * @param environment
     *            the target environment. Expected Environment.PRODUCTION (default) or Environment.SANDBOX.
     */
    public AdvancedAuthenticationApi(Environment environment) {
        this.localVarApiClient = new ApiClient(environment.basePath);
    }

    /**
     * Constructor for AdvancedAuthenticationApi with custom API base path
     * 
     * @param apiKey
     *            the api key to use to authenticate to the API
     * @param basePath
     *            the api base path. Expected Environment.PRODUCTION.basePath (default) or Environment.SANDBOX.basePath.
     */
    public AdvancedAuthenticationApi(String apiKey, String basePath) {
        this.localVarApiClient = new ApiClient(apiKey, basePath);
    }

    /**
     * Constructor for AdvancedAuthenticationApi with custom API base path
     * 
     * @param apiKey
     *            the api key to use to authenticate to the API
     * @param environment
     *            the target environment. Expected Environment.PRODUCTION (default) or Environment.SANDBOX.
     */
    public AdvancedAuthenticationApi(String apiKey, Environment environment) {
        this.localVarApiClient = new ApiClient(apiKey, environment.basePath);
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for authenticate
     * 
     * @param authenticatePayload
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
     *                        </table>
     */
    private okhttp3.Call authenticateCall(AuthenticatePayload authenticatePayload, final ApiCallback _callback)
            throws ApiException {
        Object localVarPostBody = authenticatePayload;

        // create path and map variables
        String localVarPath = "/auth/api-key";

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
    private okhttp3.Call authenticateValidateBeforeCall(AuthenticatePayload authenticatePayload,
            final ApiCallback _callback) throws ApiException {

        // verify the required parameter 'authenticatePayload' is set
        if (authenticatePayload == null) {
            throw new ApiException("Missing the required parameter 'authenticatePayload' when calling authenticate");
        }

        if (authenticatePayload.getApiKey() == null) {
            throw new ApiException(
                    "Missing the required parameter 'authenticatePayload.apiKey' when calling authenticate");
        }

        okhttp3.Call localVarCall = authenticateCall(authenticatePayload, _callback);
        return localVarCall;
    }

    /**
     * Get Bearer Token
     *
     * Returns a bearer token that can be used to authenticate other endpoint. You can find the tutorial on using the
     * disposable bearer token [here](https://docs.api.video/reference/disposable-bearer-token-authentication).
     * 
     * @param authenticatePayload
     *            (required)
     * 
     * @return AccessToken
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
     *                        </table>
     */
    public AccessToken authenticate(AuthenticatePayload authenticatePayload) throws ApiException {
        ApiResponse<AccessToken> localVarResp = authenticateWithHttpInfo(authenticatePayload);
        return localVarResp.getData();
    }

    /**
     * Get Bearer Token
     *
     * Returns a bearer token that can be used to authenticate other endpoint. You can find the tutorial on using the
     * disposable bearer token [here](https://docs.api.video/reference/disposable-bearer-token-authentication).
     * 
     * @param authenticatePayload
     *            (required)
     * 
     * @return ApiResponse&lt;AccessToken&gt;
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
     *                        </table>
     */
    public ApiResponse<AccessToken> authenticateWithHttpInfo(AuthenticatePayload authenticatePayload)
            throws ApiException {
        okhttp3.Call localVarCall = authenticateValidateBeforeCall(authenticatePayload, null);
        Type localVarReturnType = new TypeToken<AccessToken>() {
        }.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Bearer Token (asynchronously) Returns a bearer token that can be used to authenticate other endpoint. You can
     * find the tutorial on using the disposable bearer token
     * [here](https://docs.api.video/reference/disposable-bearer-token-authentication).
     * 
     * @param authenticatePayload
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
     *                        </table>
     */
    public okhttp3.Call authenticateAsync(AuthenticatePayload authenticatePayload,
            final ApiCallback<AccessToken> _callback) throws ApiException {
        okhttp3.Call localVarCall = authenticateValidateBeforeCall(authenticatePayload, _callback);
        Type localVarReturnType = new TypeToken<AccessToken>() {
        }.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    /**
     * Build call for refresh
     * 
     * @param refreshTokenPayload
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
     *                        </table>
     */
    private okhttp3.Call refreshCall(RefreshTokenPayload refreshTokenPayload, final ApiCallback _callback)
            throws ApiException {
        Object localVarPostBody = refreshTokenPayload;

        // create path and map variables
        String localVarPath = "/auth/refresh";

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
    private okhttp3.Call refreshValidateBeforeCall(RefreshTokenPayload refreshTokenPayload, final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter 'refreshTokenPayload' is set
        if (refreshTokenPayload == null) {
            throw new ApiException("Missing the required parameter 'refreshTokenPayload' when calling refresh");
        }

        if (refreshTokenPayload.getRefreshToken() == null) {
            throw new ApiException(
                    "Missing the required parameter 'refreshTokenPayload.refreshToken' when calling refresh");
        }

        okhttp3.Call localVarCall = refreshCall(refreshTokenPayload, _callback);
        return localVarCall;
    }

    /**
     * Refresh Bearer Token
     *
     * Accepts the old bearer token and returns a new bearer token that can be used to authenticate other endpoint. You
     * can find the tutorial on using the disposable bearer token
     * [here](https://docs.api.video/reference/disposable-bearer-token-authentication).
     * 
     * @param refreshTokenPayload
     *            (required)
     * 
     * @return AccessToken
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
     *                        </table>
     */
    public AccessToken refresh(RefreshTokenPayload refreshTokenPayload) throws ApiException {
        ApiResponse<AccessToken> localVarResp = refreshWithHttpInfo(refreshTokenPayload);
        return localVarResp.getData();
    }

    /**
     * Refresh Bearer Token
     *
     * Accepts the old bearer token and returns a new bearer token that can be used to authenticate other endpoint. You
     * can find the tutorial on using the disposable bearer token
     * [here](https://docs.api.video/reference/disposable-bearer-token-authentication).
     * 
     * @param refreshTokenPayload
     *            (required)
     * 
     * @return ApiResponse&lt;AccessToken&gt;
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
     *                        </table>
     */
    public ApiResponse<AccessToken> refreshWithHttpInfo(RefreshTokenPayload refreshTokenPayload) throws ApiException {
        okhttp3.Call localVarCall = refreshValidateBeforeCall(refreshTokenPayload, null);
        Type localVarReturnType = new TypeToken<AccessToken>() {
        }.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Refresh Bearer Token (asynchronously) Accepts the old bearer token and returns a new bearer token that can be
     * used to authenticate other endpoint. You can find the tutorial on using the disposable bearer token
     * [here](https://docs.api.video/reference/disposable-bearer-token-authentication).
     * 
     * @param refreshTokenPayload
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
     *                        </table>
     */
    public okhttp3.Call refreshAsync(RefreshTokenPayload refreshTokenPayload, final ApiCallback<AccessToken> _callback)
            throws ApiException {
        okhttp3.Call localVarCall = refreshValidateBeforeCall(refreshTokenPayload, _callback);
        Type localVarReturnType = new TypeToken<AccessToken>() {
        }.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

}
