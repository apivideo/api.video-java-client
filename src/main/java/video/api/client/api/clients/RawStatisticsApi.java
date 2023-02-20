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

public class RawStatisticsApi {
    private ApiClient localVarApiClient;

    public RawStatisticsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Constructor for RawStatisticsApi production environment where API key is not required.
     */
    public RawStatisticsApi() {
        this.localVarApiClient = new ApiClient(Environment.PRODUCTION.basePath);
    }

    /**
     * Constructor for RawStatisticsApi with custom API base path where API key is not required.
     * 
     * @param basePath
     *            the api base path. Expected Environment.PRODUCTION.basePath (default) or Environment.SANDBOX.basePath.
     */
    public RawStatisticsApi(String basePath) {
        this.localVarApiClient = new ApiClient(basePath);
    }

    /**
     * Constructor for RawStatisticsApi with custom API base path where API key is not required.
     * 
     * @param environment
     *            the target environment. Expected Environment.PRODUCTION (default) or Environment.SANDBOX.
     */
    public RawStatisticsApi(Environment environment) {
        this.localVarApiClient = new ApiClient(environment.basePath);
    }

    /**
     * Constructor for RawStatisticsApi with custom API base path
     * 
     * @param apiKey
     *            the api key to use to authenticate to the API
     * @param basePath
     *            the api base path. Expected Environment.PRODUCTION.basePath (default) or Environment.SANDBOX.basePath.
     */
    public RawStatisticsApi(String apiKey, String basePath) {
        this.localVarApiClient = new ApiClient(apiKey, basePath);
    }

    /**
     * Constructor for RawStatisticsApi with custom API base path
     * 
     * @param apiKey
     *            the api key to use to authenticate to the API
     * @param environment
     *            the target environment. Expected Environment.PRODUCTION (default) or Environment.SANDBOX.
     */
    public RawStatisticsApi(String apiKey, Environment environment) {
        this.localVarApiClient = new ApiClient(apiKey, environment.basePath);
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    private okhttp3.Call listLiveStreamSessionsCall(String liveStreamId, String period, Integer currentPage,
            Integer pageSize, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/analytics/live-streams/{liveStreamId}".replaceAll("\\{" + "liveStreamId" + "\\}",
                localVarApiClient.escapeString(liveStreamId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (period != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("period", period));
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
    private okhttp3.Call listLiveStreamSessionsValidateBeforeCall(String liveStreamId, String period,
            Integer currentPage, Integer pageSize, final ApiCallback _callback) throws ApiException {

        // verify the required parameter 'liveStreamId' is set
        if (liveStreamId == null) {
            throw new ApiException("Missing the required parameter 'liveStreamId' when calling listLiveStreamSessions");
        }

        // verify the required parameter 'period' is set
        if (period == null) {
            throw new ApiException("Missing the required parameter 'period' when calling listLiveStreamSessions");
        }

        okhttp3.Call localVarCall = listLiveStreamSessionsCall(liveStreamId, period, currentPage, pageSize, _callback);
        return localVarCall;
    }

    private ApiResponse<RawStatisticsListLiveStreamAnalyticsResponse> listLiveStreamSessionsWithHttpInfo(
            String liveStreamId, String period, Integer currentPage, Integer pageSize) throws ApiException {
        okhttp3.Call localVarCall = listLiveStreamSessionsValidateBeforeCall(liveStreamId, period, currentPage,
                pageSize, null);
        Type localVarReturnType = new TypeToken<RawStatisticsListLiveStreamAnalyticsResponse>() {
        }.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call listLiveStreamSessionsAsync(String liveStreamId, String period, Integer currentPage,
            Integer pageSize, final ApiCallback<RawStatisticsListLiveStreamAnalyticsResponse> _callback)
            throws ApiException {
        okhttp3.Call localVarCall = listLiveStreamSessionsValidateBeforeCall(liveStreamId, period, currentPage,
                pageSize, _callback);
        Type localVarReturnType = new TypeToken<RawStatisticsListLiveStreamAnalyticsResponse>() {
        }.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIlistLiveStreamSessionsRequest {
        private final String liveStreamId;
        private final String period;
        private Integer currentPage;
        private Integer pageSize;

        private APIlistLiveStreamSessionsRequest(String liveStreamId, String period) {
            this.liveStreamId = liveStreamId;
            this.period = period;
        }

        /**
         * Set currentPage
         * 
         * @param currentPage
         *            Choose the number of search results to return per page. Minimum value: 1 (optional, default to 1)
         * 
         * @return APIlistLiveStreamSessionsRequest
         */
        public APIlistLiveStreamSessionsRequest currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * Set pageSize
         * 
         * @param pageSize
         *            Results per page. Allowed values 1-100, default is 25. (optional, default to 25)
         * 
         * @return APIlistLiveStreamSessionsRequest
         */
        public APIlistLiveStreamSessionsRequest pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Build call for listLiveStreamSessions
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
            return listLiveStreamSessionsCall(liveStreamId, period, currentPage, pageSize, _callback);
        }

        /**
         * Execute listLiveStreamSessions request
         * 
         * @return RawStatisticsListLiveStreamAnalyticsResponse
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
        public Page<LiveStreamSession> execute() throws ApiException {
            ApiResponse<RawStatisticsListLiveStreamAnalyticsResponse> localVarResp = listLiveStreamSessionsWithHttpInfo(
                    liveStreamId, period, currentPage, pageSize);
            return new Page<>(localVarResp.getData().getData(), localVarResp.getData().getPagination(), () -> {
                try {
                    return copy().currentPage((currentPage == null ? 1 : currentPage) + 1).execute();
                } catch (ApiException e) {
                    throw new RuntimeException(e);
                }
            }); //
        }

        private APIlistLiveStreamSessionsRequest copy() {
            APIlistLiveStreamSessionsRequest copy = new APIlistLiveStreamSessionsRequest(liveStreamId, period);
            copy.currentPage(currentPage);
            copy.pageSize(pageSize);
            return copy;
        }

        /**
         * Execute listLiveStreamSessions request with HTTP info returned
         * 
         * @return ApiResponse&lt;RawStatisticsListLiveStreamAnalyticsResponse&gt;
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
        public ApiResponse<RawStatisticsListLiveStreamAnalyticsResponse> executeWithHttpInfo() throws ApiException {
            return listLiveStreamSessionsWithHttpInfo(liveStreamId, period, currentPage, pageSize);
        }

        /**
         * Execute listLiveStreamSessions request (asynchronously)
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
        public okhttp3.Call executeAsync(final ApiCallback<Page<LiveStreamSession>> _callback) throws ApiException {
            ApiCallback<RawStatisticsListLiveStreamAnalyticsResponse> apiCallback = new ApiCallback<RawStatisticsListLiveStreamAnalyticsResponse>() {

                @Override
                public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
                    _callback.onFailure(e, statusCode, responseHeaders);
                }

                @Override
                public void onSuccess(RawStatisticsListLiveStreamAnalyticsResponse result, int statusCode,
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
            return listLiveStreamSessionsAsync(liveStreamId, period, currentPage, pageSize, apiCallback);
        }
    }

    /**
     * List live stream player sessions
     *
     * 
     * @param liveStreamId
     *            The unique identifier for the live stream you want to retrieve analytics for. (required)
     * @param period
     *            Period must have one of the following formats: - For a day : \&quot;2018-01-01\&quot;, - For a week:
     *            \&quot;2018-W01\&quot;, - For a month: \&quot;2018-01\&quot; - For a year: \&quot;2018\&quot; For a
     *            range period: - Date range: \&quot;2018-01-01/2018-01-15\&quot; (required)
     * 
     * @return APIlistLiveStreamSessionsRequest
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
    public APIlistLiveStreamSessionsRequest listLiveStreamSessions(String liveStreamId, String period) {
        return new APIlistLiveStreamSessionsRequest(liveStreamId, period);
    }

    private okhttp3.Call listSessionEventsCall(String sessionId, Integer currentPage, Integer pageSize,
            final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/analytics/sessions/{sessionId}/events".replaceAll("\\{" + "sessionId" + "\\}",
                localVarApiClient.escapeString(sessionId.toString()));

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
    private okhttp3.Call listSessionEventsValidateBeforeCall(String sessionId, Integer currentPage, Integer pageSize,
            final ApiCallback _callback) throws ApiException {

        // verify the required parameter 'sessionId' is set
        if (sessionId == null) {
            throw new ApiException("Missing the required parameter 'sessionId' when calling listSessionEvents");
        }

        okhttp3.Call localVarCall = listSessionEventsCall(sessionId, currentPage, pageSize, _callback);
        return localVarCall;
    }

    private ApiResponse<RawStatisticsListPlayerSessionEventsResponse> listSessionEventsWithHttpInfo(String sessionId,
            Integer currentPage, Integer pageSize) throws ApiException {
        okhttp3.Call localVarCall = listSessionEventsValidateBeforeCall(sessionId, currentPage, pageSize, null);
        Type localVarReturnType = new TypeToken<RawStatisticsListPlayerSessionEventsResponse>() {
        }.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call listSessionEventsAsync(String sessionId, Integer currentPage, Integer pageSize,
            final ApiCallback<RawStatisticsListPlayerSessionEventsResponse> _callback) throws ApiException {
        okhttp3.Call localVarCall = listSessionEventsValidateBeforeCall(sessionId, currentPage, pageSize, _callback);
        Type localVarReturnType = new TypeToken<RawStatisticsListPlayerSessionEventsResponse>() {
        }.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIlistSessionEventsRequest {
        private final String sessionId;
        private Integer currentPage;
        private Integer pageSize;

        private APIlistSessionEventsRequest(String sessionId) {
            this.sessionId = sessionId;
        }

        /**
         * Set currentPage
         * 
         * @param currentPage
         *            Choose the number of search results to return per page. Minimum value: 1 (optional, default to 1)
         * 
         * @return APIlistSessionEventsRequest
         */
        public APIlistSessionEventsRequest currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * Set pageSize
         * 
         * @param pageSize
         *            Results per page. Allowed values 1-100, default is 25. (optional, default to 25)
         * 
         * @return APIlistSessionEventsRequest
         */
        public APIlistSessionEventsRequest pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Build call for listSessionEvents
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
            return listSessionEventsCall(sessionId, currentPage, pageSize, _callback);
        }

        /**
         * Execute listSessionEvents request
         * 
         * @return RawStatisticsListPlayerSessionEventsResponse
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
        public Page<PlayerSessionEvent> execute() throws ApiException {
            ApiResponse<RawStatisticsListPlayerSessionEventsResponse> localVarResp = listSessionEventsWithHttpInfo(
                    sessionId, currentPage, pageSize);
            return new Page<>(localVarResp.getData().getData(), localVarResp.getData().getPagination(), () -> {
                try {
                    return copy().currentPage((currentPage == null ? 1 : currentPage) + 1).execute();
                } catch (ApiException e) {
                    throw new RuntimeException(e);
                }
            }); //
        }

        private APIlistSessionEventsRequest copy() {
            APIlistSessionEventsRequest copy = new APIlistSessionEventsRequest(sessionId);
            copy.currentPage(currentPage);
            copy.pageSize(pageSize);
            return copy;
        }

        /**
         * Execute listSessionEvents request with HTTP info returned
         * 
         * @return ApiResponse&lt;RawStatisticsListPlayerSessionEventsResponse&gt;
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
        public ApiResponse<RawStatisticsListPlayerSessionEventsResponse> executeWithHttpInfo() throws ApiException {
            return listSessionEventsWithHttpInfo(sessionId, currentPage, pageSize);
        }

        /**
         * Execute listSessionEvents request (asynchronously)
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
        public okhttp3.Call executeAsync(final ApiCallback<Page<PlayerSessionEvent>> _callback) throws ApiException {
            ApiCallback<RawStatisticsListPlayerSessionEventsResponse> apiCallback = new ApiCallback<RawStatisticsListPlayerSessionEventsResponse>() {

                @Override
                public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
                    _callback.onFailure(e, statusCode, responseHeaders);
                }

                @Override
                public void onSuccess(RawStatisticsListPlayerSessionEventsResponse result, int statusCode,
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
            return listSessionEventsAsync(sessionId, currentPage, pageSize, apiCallback);
        }
    }

    /**
     * List player session events
     *
     * Useful to track and measure video&#39;s engagement.
     * 
     * @param sessionId
     *            A unique identifier you can use to reference and track a session with. (required)
     * 
     * @return APIlistSessionEventsRequest
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
    public APIlistSessionEventsRequest listSessionEvents(String sessionId) {
        return new APIlistSessionEventsRequest(sessionId);
    }

    private okhttp3.Call listVideoSessionsCall(String videoId, String period, Map<String, String> metadata,
            Integer currentPage, Integer pageSize, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/analytics/videos/{videoId}".replaceAll("\\{" + "videoId" + "\\}",
                localVarApiClient.escapeString(videoId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (period != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("period", period));
        }

        if (metadata != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("metadata", metadata));
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
    private okhttp3.Call listVideoSessionsValidateBeforeCall(String videoId, String period,
            Map<String, String> metadata, Integer currentPage, Integer pageSize, final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter 'videoId' is set
        if (videoId == null) {
            throw new ApiException("Missing the required parameter 'videoId' when calling listVideoSessions");
        }

        // verify the required parameter 'period' is set
        if (period == null) {
            throw new ApiException("Missing the required parameter 'period' when calling listVideoSessions");
        }

        okhttp3.Call localVarCall = listVideoSessionsCall(videoId, period, metadata, currentPage, pageSize, _callback);
        return localVarCall;
    }

    private ApiResponse<RawStatisticsListSessionsResponse> listVideoSessionsWithHttpInfo(String videoId, String period,
            Map<String, String> metadata, Integer currentPage, Integer pageSize) throws ApiException {
        okhttp3.Call localVarCall = listVideoSessionsValidateBeforeCall(videoId, period, metadata, currentPage,
                pageSize, null);
        Type localVarReturnType = new TypeToken<RawStatisticsListSessionsResponse>() {
        }.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call listVideoSessionsAsync(String videoId, String period, Map<String, String> metadata,
            Integer currentPage, Integer pageSize, final ApiCallback<RawStatisticsListSessionsResponse> _callback)
            throws ApiException {
        okhttp3.Call localVarCall = listVideoSessionsValidateBeforeCall(videoId, period, metadata, currentPage,
                pageSize, _callback);
        Type localVarReturnType = new TypeToken<RawStatisticsListSessionsResponse>() {
        }.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIlistVideoSessionsRequest {
        private final String videoId;
        private final String period;
        private Map<String, String> metadata;
        private Integer currentPage;
        private Integer pageSize;

        private APIlistVideoSessionsRequest(String videoId, String period) {
            this.videoId = videoId;
            this.period = period;
        }

        /**
         * Set metadata
         * 
         * @param metadata
         *            Metadata and [Dynamic Metadata](https://api.video/blog/endpoints/dynamic-metadata) filter. Send an
         *            array of key value pairs you want to filter sessios with. (optional)
         * 
         * @return APIlistVideoSessionsRequest
         */
        public APIlistVideoSessionsRequest metadata(Map<String, String> metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * Set currentPage
         * 
         * @param currentPage
         *            Choose the number of search results to return per page. Minimum value: 1 (optional, default to 1)
         * 
         * @return APIlistVideoSessionsRequest
         */
        public APIlistVideoSessionsRequest currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * Set pageSize
         * 
         * @param pageSize
         *            Results per page. Allowed values 1-100, default is 25. (optional, default to 25)
         * 
         * @return APIlistVideoSessionsRequest
         */
        public APIlistVideoSessionsRequest pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Build call for listVideoSessions
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
            return listVideoSessionsCall(videoId, period, metadata, currentPage, pageSize, _callback);
        }

        /**
         * Execute listVideoSessions request
         * 
         * @return RawStatisticsListSessionsResponse
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
        public Page<VideoSession> execute() throws ApiException {
            ApiResponse<RawStatisticsListSessionsResponse> localVarResp = listVideoSessionsWithHttpInfo(videoId, period,
                    metadata, currentPage, pageSize);
            return new Page<>(localVarResp.getData().getData(), localVarResp.getData().getPagination(), () -> {
                try {
                    return copy().currentPage((currentPage == null ? 1 : currentPage) + 1).execute();
                } catch (ApiException e) {
                    throw new RuntimeException(e);
                }
            }); //
        }

        private APIlistVideoSessionsRequest copy() {
            APIlistVideoSessionsRequest copy = new APIlistVideoSessionsRequest(videoId, period);
            copy.metadata(metadata);
            copy.currentPage(currentPage);
            copy.pageSize(pageSize);
            return copy;
        }

        /**
         * Execute listVideoSessions request with HTTP info returned
         * 
         * @return ApiResponse&lt;RawStatisticsListSessionsResponse&gt;
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
        public ApiResponse<RawStatisticsListSessionsResponse> executeWithHttpInfo() throws ApiException {
            return listVideoSessionsWithHttpInfo(videoId, period, metadata, currentPage, pageSize);
        }

        /**
         * Execute listVideoSessions request (asynchronously)
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
        public okhttp3.Call executeAsync(final ApiCallback<Page<VideoSession>> _callback) throws ApiException {
            ApiCallback<RawStatisticsListSessionsResponse> apiCallback = new ApiCallback<RawStatisticsListSessionsResponse>() {

                @Override
                public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
                    _callback.onFailure(e, statusCode, responseHeaders);
                }

                @Override
                public void onSuccess(RawStatisticsListSessionsResponse result, int statusCode,
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
            return listVideoSessionsAsync(videoId, period, metadata, currentPage, pageSize, apiCallback);
        }
    }

    /**
     * List video player sessions
     *
     * Retrieve all available user sessions for a specific video. Tutorials that use the [analytics
     * endpoint](https://api.video/blog/endpoints/analytics).
     * 
     * @param videoId
     *            The unique identifier for the video you want to retrieve session information for. (required)
     * @param period
     *            Period must have one of the following formats: - For a day : 2018-01-01, - For a week: 2018-W01, - For
     *            a month: 2018-01 - For a year: 2018 For a range period: - Date range: 2018-01-01/2018-01-15 (required)
     * 
     * @return APIlistVideoSessionsRequest
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
    public APIlistVideoSessionsRequest listVideoSessions(String videoId, String period) {
        return new APIlistVideoSessionsRequest(videoId, period);
    }
}
