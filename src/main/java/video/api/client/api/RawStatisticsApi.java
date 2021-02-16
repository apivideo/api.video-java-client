/*
 * api.video Java API client
 * api.video is an API that encodes on the go to facilitate immediate playback, enhancing viewer streaming experiences across multiple devices and platforms. You can stream live or on-demand online videos within minutes.
 *
 * The version of the OpenAPI document: 1
 * Contact: ecosystem-team@api.video
 *
 * NOTE: This class is auto generated.
 * Do not edit the class manually.
 */

package video.api.client.api;

import com.google.gson.reflect.TypeToken;

import java.io.File;
import java.io.IOException;

import video.api.client.models.*;
import video.api.client.upload.*;
import video.api.client.*;

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

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    private okhttp3.Call getLiveStreamAnalyticsCall(String liveStreamId, String period, Integer currentPage,
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

        final String[] localVarAccepts = { "application/vnd.api.video+json" };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {

        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "bearerAuth" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams,
                localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames,
                _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getLiveStreamAnalyticsValidateBeforeCall(String liveStreamId, String period,
            Integer currentPage, Integer pageSize, final ApiCallback _callback) throws ApiException {

        // verify the required parameter 'liveStreamId' is set
        if (liveStreamId == null) {
            throw new ApiException("Missing the required parameter 'liveStreamId' when calling getLiveStreamAnalytics");
        }

        okhttp3.Call localVarCall = getLiveStreamAnalyticsCall(liveStreamId, period, currentPage, pageSize, _callback);
        return localVarCall;
    }

    private ApiResponse<RawStatisticsListLiveStreamAnalyticsResponse> getLiveStreamAnalyticsWithHttpInfo(
            String liveStreamId, String period, Integer currentPage, Integer pageSize) throws ApiException {
        okhttp3.Call localVarCall = getLiveStreamAnalyticsValidateBeforeCall(liveStreamId, period, currentPage,
                pageSize, null);
        Type localVarReturnType = new TypeToken<RawStatisticsListLiveStreamAnalyticsResponse>() {
        }.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public class APIgetLiveStreamAnalyticsRequest {
        private final String liveStreamId;
        private String period;
        private Integer currentPage;
        private Integer pageSize;

        private APIgetLiveStreamAnalyticsRequest(String liveStreamId) {
            this.liveStreamId = liveStreamId;
        }

        /**
         * Set period
         * 
         * @param period
         *            Period must have one of the following formats: - For a day : \&quot;2018-01-01\&quot;, - For a
         *            week: \&quot;2018-W01\&quot;, - For a month: \&quot;2018-01\&quot; - For a year:
         *            \&quot;2018\&quot; For a range period: - Date range: \&quot;2018-01-01/2018-01-15\&quot;
         *            (optional)
         * 
         * @return APIgetLiveStreamAnalyticsRequest
         */
        public APIgetLiveStreamAnalyticsRequest period(String period) {
            this.period = period;
            return this;
        }

        /**
         * Set currentPage
         * 
         * @param currentPage
         *            Choose the number of search results to return per page. Minimum value: 1 (optional, default to 1)
         * 
         * @return APIgetLiveStreamAnalyticsRequest
         */
        public APIgetLiveStreamAnalyticsRequest currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * Set pageSize
         * 
         * @param pageSize
         *            Results per page. Allowed values 1-100, default is 25. (optional, default to 25)
         * 
         * @return APIgetLiveStreamAnalyticsRequest
         */
        public APIgetLiveStreamAnalyticsRequest pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Build call for getLiveStreamAnalytics
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
            return getLiveStreamAnalyticsCall(liveStreamId, period, currentPage, pageSize, _callback);
        }

        /**
         * Execute getLiveStreamAnalytics request
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
            ApiResponse<RawStatisticsListLiveStreamAnalyticsResponse> localVarResp = getLiveStreamAnalyticsWithHttpInfo(
                    liveStreamId, period, currentPage, pageSize);
            return new Page<>(localVarResp.getData().getData(), localVarResp.getData().getPagination(), () -> {
                try {
                    return copy().currentPage((currentPage == null ? 1 : currentPage) + 1).execute();
                } catch (ApiException e) {
                    throw new RuntimeException(e);
                }
            }); //
        }

        private APIgetLiveStreamAnalyticsRequest copy() {
            APIgetLiveStreamAnalyticsRequest copy = new APIgetLiveStreamAnalyticsRequest(liveStreamId);
            copy.period(period);
            copy.currentPage(currentPage);
            copy.pageSize(pageSize);
            return copy;
        }

        /**
         * Execute getLiveStreamAnalytics request with HTTP info returned
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
            return getLiveStreamAnalyticsWithHttpInfo(liveStreamId, period, currentPage, pageSize);
        }

        /**
         * Execute getLiveStreamAnalytics request (asynchronously)
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
         * 
         *                        public okhttp3.Call executeAsync(final
         *                        ApiCallback<RawStatisticsListLiveStreamAnalyticsResponse> _callback) throws
         *                        ApiException { return getLiveStreamAnalyticsAsync(liveStreamId, period, currentPage,
         *                        pageSize, _callback); }
         */
    }

    /**
     * List live stream player sessions
     * 
     * @param liveStreamId
     *            The unique identifier for the live stream you want to retrieve analytics for. (required)
     * 
     * @return APIgetLiveStreamAnalyticsRequest
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
    public APIgetLiveStreamAnalyticsRequest getLiveStreamAnalytics(String liveStreamId) {
        return new APIgetLiveStreamAnalyticsRequest(liveStreamId);
    }

    private okhttp3.Call listPlayerSessionEventsCall(String sessionId, Integer currentPage, Integer pageSize,
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

        final String[] localVarAccepts = { "application/vnd.api.video+json" };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {

        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "bearerAuth" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams,
                localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames,
                _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call listPlayerSessionEventsValidateBeforeCall(String sessionId, Integer currentPage,
            Integer pageSize, final ApiCallback _callback) throws ApiException {

        // verify the required parameter 'sessionId' is set
        if (sessionId == null) {
            throw new ApiException("Missing the required parameter 'sessionId' when calling listPlayerSessionEvents");
        }

        okhttp3.Call localVarCall = listPlayerSessionEventsCall(sessionId, currentPage, pageSize, _callback);
        return localVarCall;
    }

    private ApiResponse<RawStatisticsListPlayerSessionEventsResponse> listPlayerSessionEventsWithHttpInfo(
            String sessionId, Integer currentPage, Integer pageSize) throws ApiException {
        okhttp3.Call localVarCall = listPlayerSessionEventsValidateBeforeCall(sessionId, currentPage, pageSize, null);
        Type localVarReturnType = new TypeToken<RawStatisticsListPlayerSessionEventsResponse>() {
        }.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public class APIlistPlayerSessionEventsRequest {
        private final String sessionId;
        private Integer currentPage;
        private Integer pageSize;

        private APIlistPlayerSessionEventsRequest(String sessionId) {
            this.sessionId = sessionId;
        }

        /**
         * Set currentPage
         * 
         * @param currentPage
         *            Choose the number of search results to return per page. Minimum value: 1 (optional, default to 1)
         * 
         * @return APIlistPlayerSessionEventsRequest
         */
        public APIlistPlayerSessionEventsRequest currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * Set pageSize
         * 
         * @param pageSize
         *            Results per page. Allowed values 1-100, default is 25. (optional, default to 25)
         * 
         * @return APIlistPlayerSessionEventsRequest
         */
        public APIlistPlayerSessionEventsRequest pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Build call for listPlayerSessionEvents
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
            return listPlayerSessionEventsCall(sessionId, currentPage, pageSize, _callback);
        }

        /**
         * Execute listPlayerSessionEvents request
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
            ApiResponse<RawStatisticsListPlayerSessionEventsResponse> localVarResp = listPlayerSessionEventsWithHttpInfo(
                    sessionId, currentPage, pageSize);
            return new Page<>(localVarResp.getData().getData(), localVarResp.getData().getPagination(), () -> {
                try {
                    return copy().currentPage((currentPage == null ? 1 : currentPage) + 1).execute();
                } catch (ApiException e) {
                    throw new RuntimeException(e);
                }
            }); //
        }

        private APIlistPlayerSessionEventsRequest copy() {
            APIlistPlayerSessionEventsRequest copy = new APIlistPlayerSessionEventsRequest(sessionId);
            copy.currentPage(currentPage);
            copy.pageSize(pageSize);
            return copy;
        }

        /**
         * Execute listPlayerSessionEvents request with HTTP info returned
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
            return listPlayerSessionEventsWithHttpInfo(sessionId, currentPage, pageSize);
        }

        /**
         * Execute listPlayerSessionEvents request (asynchronously)
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
         * 
         *                        public okhttp3.Call executeAsync(final
         *                        ApiCallback<RawStatisticsListPlayerSessionEventsResponse> _callback) throws
         *                        ApiException { return listPlayerSessionEventsAsync(sessionId, currentPage, pageSize,
         *                        _callback); }
         */
    }

    /**
     * List player session events Useful to track and measure video&#39;s engagement.
     * 
     * @param sessionId
     *            A unique identifier you can use to reference and track a session with. (required)
     * 
     * @return APIlistPlayerSessionEventsRequest
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
    public APIlistPlayerSessionEventsRequest listPlayerSessionEvents(String sessionId) {
        return new APIlistPlayerSessionEventsRequest(sessionId);
    }

    private okhttp3.Call listSessionsCall(String videoId, String period, List<String> metadata, Integer currentPage,
            Integer pageSize, final ApiCallback _callback) throws ApiException {
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
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "metadata", metadata));
        }

        if (currentPage != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("currentPage", currentPage));
        }

        if (pageSize != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("pageSize", pageSize));
        }

        final String[] localVarAccepts = { "application/vnd.api.video+json" };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {

        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "bearerAuth" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams,
                localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames,
                _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call listSessionsValidateBeforeCall(String videoId, String period, List<String> metadata,
            Integer currentPage, Integer pageSize, final ApiCallback _callback) throws ApiException {

        // verify the required parameter 'videoId' is set
        if (videoId == null) {
            throw new ApiException("Missing the required parameter 'videoId' when calling listSessions");
        }

        okhttp3.Call localVarCall = listSessionsCall(videoId, period, metadata, currentPage, pageSize, _callback);
        return localVarCall;
    }

    private ApiResponse<RawStatisticsListSessionsResponse> listSessionsWithHttpInfo(String videoId, String period,
            List<String> metadata, Integer currentPage, Integer pageSize) throws ApiException {
        okhttp3.Call localVarCall = listSessionsValidateBeforeCall(videoId, period, metadata, currentPage, pageSize,
                null);
        Type localVarReturnType = new TypeToken<RawStatisticsListSessionsResponse>() {
        }.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    public class APIlistSessionsRequest {
        private final String videoId;
        private String period;
        private List<String> metadata;
        private Integer currentPage;
        private Integer pageSize;

        private APIlistSessionsRequest(String videoId) {
            this.videoId = videoId;
        }

        /**
         * Set period
         * 
         * @param period
         *            Period must have one of the following formats: - For a day : 2018-01-01, - For a week: 2018-W01, -
         *            For a month: 2018-01 - For a year: 2018 For a range period: - Date range: 2018-01-01/2018-01-15
         *            (optional)
         * 
         * @return APIlistSessionsRequest
         */
        public APIlistSessionsRequest period(String period) {
            this.period = period;
            return this;
        }

        /**
         * Set metadata
         * 
         * @param metadata
         *            Metadata and Dynamic Metadata filter. Send an array of key value pairs you want to filter sessios
         *            with. (optional)
         * 
         * @return APIlistSessionsRequest
         */
        public APIlistSessionsRequest metadata(List<String> metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * Set currentPage
         * 
         * @param currentPage
         *            Choose the number of search results to return per page. Minimum value: 1 (optional, default to 1)
         * 
         * @return APIlistSessionsRequest
         */
        public APIlistSessionsRequest currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * Set pageSize
         * 
         * @param pageSize
         *            Results per page. Allowed values 1-100, default is 25. (optional, default to 25)
         * 
         * @return APIlistSessionsRequest
         */
        public APIlistSessionsRequest pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Build call for listSessions
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
            return listSessionsCall(videoId, period, metadata, currentPage, pageSize, _callback);
        }

        /**
         * Execute listSessions request
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
            ApiResponse<RawStatisticsListSessionsResponse> localVarResp = listSessionsWithHttpInfo(videoId, period,
                    metadata, currentPage, pageSize);
            return new Page<>(localVarResp.getData().getData(), localVarResp.getData().getPagination(), () -> {
                try {
                    return copy().currentPage((currentPage == null ? 1 : currentPage) + 1).execute();
                } catch (ApiException e) {
                    throw new RuntimeException(e);
                }
            }); //
        }

        private APIlistSessionsRequest copy() {
            APIlistSessionsRequest copy = new APIlistSessionsRequest(videoId);
            copy.period(period);
            copy.metadata(metadata);
            copy.currentPage(currentPage);
            copy.pageSize(pageSize);
            return copy;
        }

        /**
         * Execute listSessions request with HTTP info returned
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
            return listSessionsWithHttpInfo(videoId, period, metadata, currentPage, pageSize);
        }

        /**
         * Execute listSessions request (asynchronously)
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
         * 
         *                        public okhttp3.Call executeAsync(final ApiCallback<RawStatisticsListSessionsResponse>
         *                        _callback) throws ApiException { return listSessionsAsync(videoId, period, metadata,
         *                        currentPage, pageSize, _callback); }
         */
    }

    /**
     * List video player sessions Retrieve all available user sessions for a specific video.
     * 
     * @param videoId
     *            The unique identifier for the video you want to retrieve session information for. (required)
     * 
     * @return APIlistSessionsRequest
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
    public APIlistSessionsRequest listSessions(String videoId) {
        return new APIlistSessionsRequest(videoId);
    }
}
