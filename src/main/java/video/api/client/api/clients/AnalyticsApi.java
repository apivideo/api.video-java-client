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

import video.api.client.api.models.AnalyticsPlays400Error;
import video.api.client.api.models.AnalyticsPlaysResponse;
import java.time.LocalDate;
import video.api.client.api.models.NotFound;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import video.api.client.api.models.*;
import video.api.client.api.upload.*;
import video.api.client.api.*;

public class AnalyticsApi {
    private ApiClient localVarApiClient;

    public AnalyticsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Constructor for AnalyticsApi production environment where API key is not required.
     */
    public AnalyticsApi() {
        this.localVarApiClient = new ApiClient(Environment.PRODUCTION.basePath);
    }

    /**
     * Constructor for AnalyticsApi with custom API base path where API key is not required.
     * 
     * @param basePath
     *            the api base path. Expected Environment.PRODUCTION.basePath (default) or Environment.SANDBOX.basePath.
     */
    public AnalyticsApi(String basePath) {
        this.localVarApiClient = new ApiClient(basePath);
    }

    /**
     * Constructor for AnalyticsApi with custom API base path where API key is not required.
     * 
     * @param environment
     *            the target environment. Expected Environment.PRODUCTION (default) or Environment.SANDBOX.
     */
    public AnalyticsApi(Environment environment) {
        this.localVarApiClient = new ApiClient(environment.basePath);
    }

    /**
     * Constructor for AnalyticsApi with custom API base path
     * 
     * @param apiKey
     *            the api key to use to authenticate to the API
     * @param basePath
     *            the api base path. Expected Environment.PRODUCTION.basePath (default) or Environment.SANDBOX.basePath.
     */
    public AnalyticsApi(String apiKey, String basePath) {
        this.localVarApiClient = new ApiClient(apiKey, basePath);
    }

    /**
     * Constructor for AnalyticsApi with custom API base path
     * 
     * @param apiKey
     *            the api key to use to authenticate to the API
     * @param environment
     *            the target environment. Expected Environment.PRODUCTION (default) or Environment.SANDBOX.
     */
    public AnalyticsApi(String apiKey, Environment environment) {
        this.localVarApiClient = new ApiClient(apiKey, environment.basePath);
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    private okhttp3.Call getLiveStreamsPlaysCall(LocalDate from, String dimension, LocalDate to, String filter,
            Integer currentPage, Integer pageSize, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/analytics/live-streams/plays";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (from != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("from", from));
        }

        if (to != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("to", to));
        }

        if (dimension != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("dimension", dimension));
        }

        if (filter != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("filter", filter));
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
    private okhttp3.Call getLiveStreamsPlaysValidateBeforeCall(LocalDate from, String dimension, LocalDate to,
            String filter, Integer currentPage, Integer pageSize, final ApiCallback _callback) throws ApiException {

        // verify the required parameter 'from' is set
        if (from == null) {
            throw new ApiException("Missing the required parameter 'from' when calling getLiveStreamsPlays");
        }

        // verify the required parameter 'dimension' is set
        if (dimension == null) {
            throw new ApiException("Missing the required parameter 'dimension' when calling getLiveStreamsPlays");
        }

        okhttp3.Call localVarCall = getLiveStreamsPlaysCall(from, dimension, to, filter, currentPage, pageSize,
                _callback);
        return localVarCall;
    }

    private ApiResponse<AnalyticsPlaysResponse> getLiveStreamsPlaysWithHttpInfo(LocalDate from, String dimension,
            LocalDate to, String filter, Integer currentPage, Integer pageSize) throws ApiException {
        okhttp3.Call localVarCall = getLiveStreamsPlaysValidateBeforeCall(from, dimension, to, filter, currentPage,
                pageSize, null);
        Type localVarReturnType = new TypeToken<AnalyticsPlaysResponse>() {
        }.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getLiveStreamsPlaysAsync(LocalDate from, String dimension, LocalDate to, String filter,
            Integer currentPage, Integer pageSize, final ApiCallback<AnalyticsPlaysResponse> _callback)
            throws ApiException {
        okhttp3.Call localVarCall = getLiveStreamsPlaysValidateBeforeCall(from, dimension, to, filter, currentPage,
                pageSize, _callback);
        Type localVarReturnType = new TypeToken<AnalyticsPlaysResponse>() {
        }.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIgetLiveStreamsPlaysRequest {
        private final LocalDate from;
        private final String dimension;
        private LocalDate to;
        private String filter;
        private Integer currentPage;
        private Integer pageSize;

        private APIgetLiveStreamsPlaysRequest(LocalDate from, String dimension) {
            this.from = from;
            this.dimension = dimension;
        }

        /**
         * Set to
         * 
         * @param to
         *            Use this optional query parameter to set the end date for the time period that you want analytics
         *            for. - If you do not specify a &#x60;to&#x60; date, the API returns analytics data starting from
         *            the &#x60;from&#x60; date up until today, and excluding today. - The date you set must be **within
         *            the last 30 days**. - The value you provide must follow the &#x60;YYYY-MM-DD&#x60; format.
         *            (optional)
         * 
         * @return APIgetLiveStreamsPlaysRequest
         */
        public APIgetLiveStreamsPlaysRequest to(LocalDate to) {
            this.to = to;
            return this;
        }

        /**
         * Set filter
         * 
         * @param filter
         *            Use this query parameter to filter your results to a specific live stream in a project that you
         *            want analytics for. You must use the &#x60;liveStreamId:&#x60; prefix when specifying a live
         *            stream ID. (optional)
         * 
         * @return APIgetLiveStreamsPlaysRequest
         */
        public APIgetLiveStreamsPlaysRequest filter(String filter) {
            this.filter = filter;
            return this;
        }

        /**
         * Set currentPage
         * 
         * @param currentPage
         *            Choose the number of search results to return per page. Minimum value: 1 (optional, default to 1)
         * 
         * @return APIgetLiveStreamsPlaysRequest
         */
        public APIgetLiveStreamsPlaysRequest currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * Set pageSize
         * 
         * @param pageSize
         *            Results per page. Allowed values 1-100, default is 25. (optional, default to 25)
         * 
         * @return APIgetLiveStreamsPlaysRequest
         */
        public APIgetLiveStreamsPlaysRequest pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Build call for getLiveStreamsPlays
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
         *                        <td>400</td>
         *                        <td>Bad request error</td>
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
            return getLiveStreamsPlaysCall(from, dimension, to, filter, currentPage, pageSize, _callback);
        }

        /**
         * Execute getLiveStreamsPlays request
         * 
         * @return AnalyticsPlaysResponse
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
         *                        <td>Bad request error</td>
         *                        <td>-</td>
         *                        </tr>
         *                        <tr>
         *                        <td>404</td>
         *                        <td>Not Found</td>
         *                        <td>-</td>
         *                        </tr>
         *                        </table>
         */
        public Page<AnalyticsData> execute() throws ApiException {
            ApiResponse<AnalyticsPlaysResponse> localVarResp = getLiveStreamsPlaysWithHttpInfo(from, dimension, to,
                    filter, currentPage, pageSize);
            return new Page<>(localVarResp.getData().getData(), localVarResp.getData().getPagination(), () -> {
                try {
                    return copy().currentPage((currentPage == null ? 1 : currentPage) + 1).execute();
                } catch (ApiException e) {
                    throw new RuntimeException(e);
                }
            }); //
        }

        private APIgetLiveStreamsPlaysRequest copy() {
            APIgetLiveStreamsPlaysRequest copy = new APIgetLiveStreamsPlaysRequest(from, dimension);
            copy.to(to);
            copy.filter(filter);
            copy.currentPage(currentPage);
            copy.pageSize(pageSize);
            return copy;
        }

        /**
         * Execute getLiveStreamsPlays request with HTTP info returned
         * 
         * @return ApiResponse&lt;AnalyticsPlaysResponse&gt;
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
         *                        <td>Bad request error</td>
         *                        <td>-</td>
         *                        </tr>
         *                        <tr>
         *                        <td>404</td>
         *                        <td>Not Found</td>
         *                        <td>-</td>
         *                        </tr>
         *                        </table>
         */
        public ApiResponse<AnalyticsPlaysResponse> executeWithHttpInfo() throws ApiException {
            return getLiveStreamsPlaysWithHttpInfo(from, dimension, to, filter, currentPage, pageSize);
        }

        /**
         * Execute getLiveStreamsPlays request (asynchronously)
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
         *                        <td>400</td>
         *                        <td>Bad request error</td>
         *                        <td>-</td>
         *                        </tr>
         *                        <tr>
         *                        <td>404</td>
         *                        <td>Not Found</td>
         *                        <td>-</td>
         *                        </tr>
         *                        </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Page<AnalyticsData>> _callback) throws ApiException {
            ApiCallback<AnalyticsPlaysResponse> apiCallback = new ApiCallback<AnalyticsPlaysResponse>() {

                @Override
                public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
                    _callback.onFailure(e, statusCode, responseHeaders);
                }

                @Override
                public void onSuccess(AnalyticsPlaysResponse result, int statusCode,
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
            return getLiveStreamsPlaysAsync(from, dimension, to, filter, currentPage, pageSize, apiCallback);
        }
    }

    /**
     * Get play events for live stream
     *
     * Retrieve filtered analytics about the number of plays for your live streams in a project.
     * 
     * @param from
     *            Use this query parameter to set the start date for the time period that you want analytics for. - The
     *            API returns analytics data including the day you set in &#x60;from&#x60;. - The date you set must be
     *            **within the last 30 days**. - The value you provide must follow the &#x60;YYYY-MM-DD&#x60; format.
     *            (required)
     * @param dimension
     *            Use this query parameter to define the dimension that you want analytics for. -
     *            &#x60;liveStreamId&#x60;: Returns analytics based on the public live stream identifiers. -
     *            &#x60;emittedAt&#x60;: Returns analytics based on the times of the play events. The API returns data
     *            in specific interval groups. When the date period you set in &#x60;from&#x60; and &#x60;to&#x60; is
     *            less than or equals to 2 days, the response for this dimension is grouped in hourly intervals.
     *            Otherwise, it is grouped in daily intervals. - &#x60;country&#x60;: Returns analytics based on the
     *            viewers&#39; country. The list of supported country names are based on the [GeoNames public
     *            database](https://www.geonames.org/countries/). - &#x60;deviceType&#x60;: Returns analytics based on
     *            the type of device used by the viewers during the play event. - &#x60;operatingSystem&#x60;: Returns
     *            analytics based on the operating system used by the viewers during the play event. -
     *            &#x60;browser&#x60;: Returns analytics based on the browser used by the viewers during the play event.
     *            (required)
     * 
     * @return APIgetLiveStreamsPlaysRequest
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
     *                        <td>Bad request error</td>
     *                        <td>-</td>
     *                        </tr>
     *                        <tr>
     *                        <td>404</td>
     *                        <td>Not Found</td>
     *                        <td>-</td>
     *                        </tr>
     *                        </table>
     */
    public APIgetLiveStreamsPlaysRequest getLiveStreamsPlays(LocalDate from, String dimension) {
        return new APIgetLiveStreamsPlaysRequest(from, dimension);
    }

    private okhttp3.Call getVideosPlaysCall(LocalDate from, String dimension, LocalDate to, String filter,
            Integer currentPage, Integer pageSize, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/analytics/videos/plays";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (from != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("from", from));
        }

        if (to != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("to", to));
        }

        if (dimension != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("dimension", dimension));
        }

        if (filter != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("filter", filter));
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
    private okhttp3.Call getVideosPlaysValidateBeforeCall(LocalDate from, String dimension, LocalDate to, String filter,
            Integer currentPage, Integer pageSize, final ApiCallback _callback) throws ApiException {

        // verify the required parameter 'from' is set
        if (from == null) {
            throw new ApiException("Missing the required parameter 'from' when calling getVideosPlays");
        }

        // verify the required parameter 'dimension' is set
        if (dimension == null) {
            throw new ApiException("Missing the required parameter 'dimension' when calling getVideosPlays");
        }

        okhttp3.Call localVarCall = getVideosPlaysCall(from, dimension, to, filter, currentPage, pageSize, _callback);
        return localVarCall;
    }

    private ApiResponse<AnalyticsPlaysResponse> getVideosPlaysWithHttpInfo(LocalDate from, String dimension,
            LocalDate to, String filter, Integer currentPage, Integer pageSize) throws ApiException {
        okhttp3.Call localVarCall = getVideosPlaysValidateBeforeCall(from, dimension, to, filter, currentPage, pageSize,
                null);
        Type localVarReturnType = new TypeToken<AnalyticsPlaysResponse>() {
        }.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getVideosPlaysAsync(LocalDate from, String dimension, LocalDate to, String filter,
            Integer currentPage, Integer pageSize, final ApiCallback<AnalyticsPlaysResponse> _callback)
            throws ApiException {
        okhttp3.Call localVarCall = getVideosPlaysValidateBeforeCall(from, dimension, to, filter, currentPage, pageSize,
                _callback);
        Type localVarReturnType = new TypeToken<AnalyticsPlaysResponse>() {
        }.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIgetVideosPlaysRequest {
        private final LocalDate from;
        private final String dimension;
        private LocalDate to;
        private String filter;
        private Integer currentPage;
        private Integer pageSize;

        private APIgetVideosPlaysRequest(LocalDate from, String dimension) {
            this.from = from;
            this.dimension = dimension;
        }

        /**
         * Set to
         * 
         * @param to
         *            Use this optional query parameter to set the end date for the time period that you want analytics
         *            for. - If you do not specify a &#x60;to&#x60; date, the API returns analytics data starting from
         *            the &#x60;from&#x60; date up until today, and excluding today. - The date you set must be **within
         *            the last 30 days**. - The value you provide must follow the &#x60;YYYY-MM-DD&#x60; format.
         *            (optional)
         * 
         * @return APIgetVideosPlaysRequest
         */
        public APIgetVideosPlaysRequest to(LocalDate to) {
            this.to = to;
            return this;
        }

        /**
         * Set filter
         * 
         * @param filter
         *            Use this query parameter to filter your results to a specific video in a project that you want
         *            analytics for. You must use the &#x60;videoId:&#x60; prefix when specifying a video ID. (optional)
         * 
         * @return APIgetVideosPlaysRequest
         */
        public APIgetVideosPlaysRequest filter(String filter) {
            this.filter = filter;
            return this;
        }

        /**
         * Set currentPage
         * 
         * @param currentPage
         *            Choose the number of search results to return per page. Minimum value: 1 (optional, default to 1)
         * 
         * @return APIgetVideosPlaysRequest
         */
        public APIgetVideosPlaysRequest currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * Set pageSize
         * 
         * @param pageSize
         *            Results per page. Allowed values 1-100, default is 25. (optional, default to 25)
         * 
         * @return APIgetVideosPlaysRequest
         */
        public APIgetVideosPlaysRequest pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Build call for getVideosPlays
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
         *                        <td>400</td>
         *                        <td>Bad request error</td>
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
            return getVideosPlaysCall(from, dimension, to, filter, currentPage, pageSize, _callback);
        }

        /**
         * Execute getVideosPlays request
         * 
         * @return AnalyticsPlaysResponse
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
         *                        <td>Bad request error</td>
         *                        <td>-</td>
         *                        </tr>
         *                        <tr>
         *                        <td>404</td>
         *                        <td>Not Found</td>
         *                        <td>-</td>
         *                        </tr>
         *                        </table>
         */
        public Page<AnalyticsData> execute() throws ApiException {
            ApiResponse<AnalyticsPlaysResponse> localVarResp = getVideosPlaysWithHttpInfo(from, dimension, to, filter,
                    currentPage, pageSize);
            return new Page<>(localVarResp.getData().getData(), localVarResp.getData().getPagination(), () -> {
                try {
                    return copy().currentPage((currentPage == null ? 1 : currentPage) + 1).execute();
                } catch (ApiException e) {
                    throw new RuntimeException(e);
                }
            }); //
        }

        private APIgetVideosPlaysRequest copy() {
            APIgetVideosPlaysRequest copy = new APIgetVideosPlaysRequest(from, dimension);
            copy.to(to);
            copy.filter(filter);
            copy.currentPage(currentPage);
            copy.pageSize(pageSize);
            return copy;
        }

        /**
         * Execute getVideosPlays request with HTTP info returned
         * 
         * @return ApiResponse&lt;AnalyticsPlaysResponse&gt;
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
         *                        <td>Bad request error</td>
         *                        <td>-</td>
         *                        </tr>
         *                        <tr>
         *                        <td>404</td>
         *                        <td>Not Found</td>
         *                        <td>-</td>
         *                        </tr>
         *                        </table>
         */
        public ApiResponse<AnalyticsPlaysResponse> executeWithHttpInfo() throws ApiException {
            return getVideosPlaysWithHttpInfo(from, dimension, to, filter, currentPage, pageSize);
        }

        /**
         * Execute getVideosPlays request (asynchronously)
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
         *                        <td>400</td>
         *                        <td>Bad request error</td>
         *                        <td>-</td>
         *                        </tr>
         *                        <tr>
         *                        <td>404</td>
         *                        <td>Not Found</td>
         *                        <td>-</td>
         *                        </tr>
         *                        </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Page<AnalyticsData>> _callback) throws ApiException {
            ApiCallback<AnalyticsPlaysResponse> apiCallback = new ApiCallback<AnalyticsPlaysResponse>() {

                @Override
                public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
                    _callback.onFailure(e, statusCode, responseHeaders);
                }

                @Override
                public void onSuccess(AnalyticsPlaysResponse result, int statusCode,
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
            return getVideosPlaysAsync(from, dimension, to, filter, currentPage, pageSize, apiCallback);
        }
    }

    /**
     * Get play events for video
     *
     * Retrieve filtered analytics about the number of plays for your videos in a project.
     * 
     * @param from
     *            Use this query parameter to set the start date for the time period that you want analytics for. - The
     *            API returns analytics data including the day you set in &#x60;from&#x60;. - The date you set must be
     *            **within the last 30 days**. - The value you provide must follow the &#x60;YYYY-MM-DD&#x60; format.
     *            (required)
     * @param dimension
     *            Use this query parameter to define the dimension that you want analytics for. - &#x60;videoId&#x60;:
     *            Returns analytics based on the public video identifiers. - &#x60;emittedAt&#x60;: Returns analytics
     *            based on the times of the play events. The API returns data in specific interval groups. When the date
     *            period you set in &#x60;from&#x60; and &#x60;to&#x60; is less than or equals to 2 days, the response
     *            for this dimension is grouped in hourly intervals. Otherwise, it is grouped in daily intervals. -
     *            &#x60;country&#x60;: Returns analytics based on the viewers&#39; country. The list of supported
     *            country names are based on the [GeoNames public database](https://www.geonames.org/countries/). -
     *            &#x60;deviceType&#x60;: Returns analytics based on the type of device used by the viewers during the
     *            play event. - &#x60;operatingSystem&#x60;: Returns analytics based on the operating system used by the
     *            viewers during the play event. - &#x60;browser&#x60;: Returns analytics based on the browser used by
     *            the viewers during the play event. (required)
     * 
     * @return APIgetVideosPlaysRequest
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
     *                        <td>Bad request error</td>
     *                        <td>-</td>
     *                        </tr>
     *                        <tr>
     *                        <td>404</td>
     *                        <td>Not Found</td>
     *                        <td>-</td>
     *                        </tr>
     *                        </table>
     */
    public APIgetVideosPlaysRequest getVideosPlays(LocalDate from, String dimension) {
        return new APIgetVideosPlaysRequest(from, dimension);
    }
}
