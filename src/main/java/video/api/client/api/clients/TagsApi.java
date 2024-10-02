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

import video.api.client.api.models.ListTagsResponse;
import video.api.client.api.models.TooManyRequests;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import video.api.client.api.models.*;
import video.api.client.api.upload.*;
import video.api.client.api.*;

public class TagsApi {
    private ApiClient localVarApiClient;

    public TagsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Constructor for TagsApi production environment where API key is not required.
     */
    public TagsApi() {
        this.localVarApiClient = new ApiClient(Environment.PRODUCTION.basePath);
    }

    /**
     * Constructor for TagsApi with custom API base path where API key is not required.
     * 
     * @param basePath
     *            the api base path. Expected Environment.PRODUCTION.basePath (default) or Environment.SANDBOX.basePath.
     */
    public TagsApi(String basePath) {
        this.localVarApiClient = new ApiClient(basePath);
    }

    /**
     * Constructor for TagsApi with custom API base path where API key is not required.
     * 
     * @param environment
     *            the target environment. Expected Environment.PRODUCTION (default) or Environment.SANDBOX.
     */
    public TagsApi(Environment environment) {
        this.localVarApiClient = new ApiClient(environment.basePath);
    }

    /**
     * Constructor for TagsApi with custom API base path
     * 
     * @param apiKey
     *            the api key to use to authenticate to the API
     * @param basePath
     *            the api base path. Expected Environment.PRODUCTION.basePath (default) or Environment.SANDBOX.basePath.
     */
    public TagsApi(String apiKey, String basePath) {
        this.localVarApiClient = new ApiClient(apiKey, basePath);
    }

    /**
     * Constructor for TagsApi with custom API base path
     * 
     * @param apiKey
     *            the api key to use to authenticate to the API
     * @param environment
     *            the target environment. Expected Environment.PRODUCTION (default) or Environment.SANDBOX.
     */
    public TagsApi(String apiKey, Environment environment) {
        this.localVarApiClient = new ApiClient(apiKey, environment.basePath);
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    private okhttp3.Call listCall(String value, String sortBy, String sortOrder, Integer currentPage, Integer pageSize,
            final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/tags";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (value != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("value", value));
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
    private okhttp3.Call listValidateBeforeCall(String value, String sortBy, String sortOrder, Integer currentPage,
            Integer pageSize, final ApiCallback _callback) throws ApiException {

        okhttp3.Call localVarCall = listCall(value, sortBy, sortOrder, currentPage, pageSize, _callback);
        return localVarCall;
    }

    private ApiResponse<ListTagsResponse> listWithHttpInfo(String value, String sortBy, String sortOrder,
            Integer currentPage, Integer pageSize) throws ApiException {
        okhttp3.Call localVarCall = listValidateBeforeCall(value, sortBy, sortOrder, currentPage, pageSize, null);
        Type localVarReturnType = new TypeToken<ListTagsResponse>() {
        }.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call listAsync(String value, String sortBy, String sortOrder, Integer currentPage, Integer pageSize,
            final ApiCallback<ListTagsResponse> _callback) throws ApiException {
        okhttp3.Call localVarCall = listValidateBeforeCall(value, sortBy, sortOrder, currentPage, pageSize, _callback);
        Type localVarReturnType = new TypeToken<ListTagsResponse>() {
        }.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIlistRequest {
        private String value;
        private String sortBy;
        private String sortOrder;
        private Integer currentPage;
        private Integer pageSize;

        private APIlistRequest() {
        }

        /**
         * Set value
         * 
         * @param value
         *            Use this parameter to search for specific video tags. The API filters results even on partial
         *            values, and ignores accents, uppercase, and lowercase. (optional)
         * 
         * @return APIlistRequest
         */
        public APIlistRequest value(String value) {
            this.value = value;
            return this;
        }

        /**
         * Set sortBy
         * 
         * @param sortBy
         *            Use this parameter to choose which field the API will use to sort the response data. The default
         *            is &#x60;value&#x60;. These are the available fields to sort by: - &#x60;value&#x60;: Sorts the
         *            results based on tag values in alphabetic order. - &#x60;videoCount&#x60;: Sorts the results based
         *            on the number of times a video tag is used. (optional)
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
         *            Use this parameter to sort results. &#x60;asc&#x60; is ascending and sorts from A to Z.
         *            &#x60;desc&#x60; is descending and sorts from Z to A. (optional)
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
            return listCall(value, sortBy, sortOrder, currentPage, pageSize, _callback);
        }

        /**
         * Execute list request
         * 
         * @return ListTagsResponse
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
        public Page<ListTagsResponseData> execute() throws ApiException {
            ApiResponse<ListTagsResponse> localVarResp = listWithHttpInfo(value, sortBy, sortOrder, currentPage,
                    pageSize);
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
            copy.value(value);
            copy.sortBy(sortBy);
            copy.sortOrder(sortOrder);
            copy.currentPage(currentPage);
            copy.pageSize(pageSize);
            return copy;
        }

        /**
         * Execute list request with HTTP info returned
         * 
         * @return ApiResponse&lt;ListTagsResponse&gt;
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
        public ApiResponse<ListTagsResponse> executeWithHttpInfo() throws ApiException {
            return listWithHttpInfo(value, sortBy, sortOrder, currentPage, pageSize);
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
        public okhttp3.Call executeAsync(final ApiCallback<Page<ListTagsResponseData>> _callback) throws ApiException {
            ApiCallback<ListTagsResponse> apiCallback = new ApiCallback<ListTagsResponse>() {

                @Override
                public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
                    _callback.onFailure(e, statusCode, responseHeaders);
                }

                @Override
                public void onSuccess(ListTagsResponse result, int statusCode,
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
            return listAsync(value, sortBy, sortOrder, currentPage, pageSize, apiCallback);
        }
    }

    /**
     * List all video tags
     *
     * This endpoint enables you to search for video tags in a project and see how many videos are tagged with them. If
     * you do not define any query parameters, the endpoint lists all video tags and the numbers of times they are used
     * in a project.
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
}
