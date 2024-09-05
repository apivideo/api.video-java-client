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

import video.api.client.api.models.AnalyticsAggregatedMetricsResponse;
import video.api.client.api.models.AnalyticsMetricsBreakdownResponse;
import video.api.client.api.models.AnalyticsMetricsOverTimeResponse;
import video.api.client.api.models.AnalyticsPlays400Error;
import video.api.client.api.models.FilterBy2;
import java.time.OffsetDateTime;
import video.api.client.api.models.TooManyRequests;
import video.api.client.api.models.UnrecognizedRequestUrl;

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

    private okhttp3.Call getAggregatedMetricsCall(String metric, String aggregation, OffsetDateTime from,
            OffsetDateTime to, FilterBy2 filterBy, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/data/metrics/{metric}/{aggregation}"
                .replaceAll("\\{" + "metric" + "\\}", localVarApiClient.escapeString(metric.toString()))
                .replaceAll("\\{" + "aggregation" + "\\}", localVarApiClient.escapeString(aggregation.toString()));

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

        if (filterBy != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("filterBy", filterBy));
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
    private okhttp3.Call getAggregatedMetricsValidateBeforeCall(String metric, String aggregation, OffsetDateTime from,
            OffsetDateTime to, FilterBy2 filterBy, final ApiCallback _callback) throws ApiException {

        // verify the required parameter 'metric' is set
        if (metric == null) {
            throw new ApiException("Missing the required parameter 'metric' when calling getAggregatedMetrics");
        }

        // verify the required parameter 'aggregation' is set
        if (aggregation == null) {
            throw new ApiException("Missing the required parameter 'aggregation' when calling getAggregatedMetrics");
        }

        okhttp3.Call localVarCall = getAggregatedMetricsCall(metric, aggregation, from, to, filterBy, _callback);
        return localVarCall;
    }

    private ApiResponse<AnalyticsAggregatedMetricsResponse> getAggregatedMetricsWithHttpInfo(String metric,
            String aggregation, OffsetDateTime from, OffsetDateTime to, FilterBy2 filterBy) throws ApiException {
        okhttp3.Call localVarCall = getAggregatedMetricsValidateBeforeCall(metric, aggregation, from, to, filterBy,
                null);
        Type localVarReturnType = new TypeToken<AnalyticsAggregatedMetricsResponse>() {
        }.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getAggregatedMetricsAsync(String metric, String aggregation, OffsetDateTime from,
            OffsetDateTime to, FilterBy2 filterBy, final ApiCallback<AnalyticsAggregatedMetricsResponse> _callback)
            throws ApiException {
        okhttp3.Call localVarCall = getAggregatedMetricsValidateBeforeCall(metric, aggregation, from, to, filterBy,
                _callback);
        Type localVarReturnType = new TypeToken<AnalyticsAggregatedMetricsResponse>() {
        }.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIgetAggregatedMetricsRequest {
        private final String metric;
        private final String aggregation;
        private OffsetDateTime from;
        private OffsetDateTime to;
        private FilterBy2 filterBy;

        private APIgetAggregatedMetricsRequest(String metric, String aggregation) {
            this.metric = metric;
            this.aggregation = aggregation;
        }

        /**
         * Set from
         * 
         * @param from
         *            Use this query parameter to define the starting date-time of the period you want analytics for. -
         *            If you do not set a value for &#x60;from&#x60;, the default assigned value is 1 day ago, based on
         *            the &#x60;to&#x60; parameter. - The maximum value is 30 days ago. - The value you provide should
         *            follow the ATOM date-time format: &#x60;2024-02-05T00:00:00+01:00&#x60; - The API ignores this
         *            parameter when you call &#x60;/data/metrics/play/total&#x60;. (optional)
         * 
         * @return APIgetAggregatedMetricsRequest
         */
        public APIgetAggregatedMetricsRequest from(OffsetDateTime from) {
            this.from = from;
            return this;
        }

        /**
         * Set to
         * 
         * @param to
         *            Use this query parameter to define the ending date-time of the period you want analytics for. - If
         *            you do not set a value for &#x60;to&#x60;, the default assigned value is &#x60;now&#x60;. - The
         *            API ignores this parameter when you call &#x60;/data/metrics/play/total&#x60;. - The value for
         *            &#x60;to&#x60; is a non-inclusive value: the API returns data **before** the date-time that you
         *            set. (optional)
         * 
         * @return APIgetAggregatedMetricsRequest
         */
        public APIgetAggregatedMetricsRequest to(OffsetDateTime to) {
            this.to = to;
            return this;
        }

        /**
         * Set filterBy
         * 
         * @param filterBy
         *            Use this parameter to filter the API&#39;s response based on different data dimensions. You can
         *            serialize filters in your query to receive more detailed breakdowns of your analytics. - If you do
         *            not set a value for &#x60;filterBy&#x60;, the API returns the full dataset for your project. - The
         *            API only accepts the &#x60;mediaId&#x60; and &#x60;mediaType&#x60; filters when you call
         *            &#x60;/data/metrics/play/total&#x60; or &#x60;/data/buckets/play-total/media-id&#x60;. These are
         *            the available breakdown dimensions: - &#x60;mediaId&#x60;: Returns analytics based on the unique
         *            identifiers of a video or a live stream. - &#x60;mediaType&#x60;: Returns analytics based on the
         *            type of content. Possible values: &#x60;video&#x60; and &#x60;live-stream&#x60;. -
         *            &#x60;continent&#x60;: Returns analytics based on the viewers&#39; continent. The list of
         *            supported continents names are based on the [GeoNames public
         *            database](https://www.geonames.org/countries/). You must use the ISO-3166 alpha2 format, for
         *            example &#x60;EU&#x60;. Possible values are: &#x60;AS&#x60;, &#x60;AF&#x60;, &#x60;NA&#x60;,
         *            &#x60;SA&#x60;, &#x60;AN&#x60;, &#x60;EU&#x60;, &#x60;AZ&#x60;. - &#x60;country&#x60;: Returns
         *            analytics based on the viewers&#39; country. The list of supported country names are based on the
         *            [GeoNames public database](https://www.geonames.org/countries/). You must use the ISO-3166 alpha2
         *            format, for example &#x60;FR&#x60;. - &#x60;deviceType&#x60;: Returns analytics based on the type
         *            of device used by the viewers. Response values can include: &#x60;computer&#x60;,
         *            &#x60;phone&#x60;, &#x60;tablet&#x60;, &#x60;tv&#x60;, &#x60;console&#x60;, &#x60;wearable&#x60;,
         *            &#x60;unknown&#x60;. - &#x60;operatingSystem&#x60;: Returns analytics based on the operating
         *            system used by the viewers. Response values can include &#x60;windows&#x60;, &#x60;mac osx&#x60;,
         *            &#x60;android&#x60;, &#x60;ios&#x60;, &#x60;linux&#x60;. - &#x60;browser&#x60;: Returns analytics
         *            based on the browser used by the viewers. Response values can include &#x60;chrome&#x60;,
         *            &#x60;firefox&#x60;, &#x60;edge&#x60;, &#x60;opera&#x60;. - &#x60;tag&#x60;: Returns analytics for
         *            videos using this tag. This filter only accepts a single value and is case sensitive. Read more
         *            about tagging your videos [here](https://docs.api.video/vod/tags-metadata). (optional)
         * 
         * @return APIgetAggregatedMetricsRequest
         */
        public APIgetAggregatedMetricsRequest filterBy(FilterBy2 filterBy) {
            this.filterBy = filterBy;
            return this;
        }

        /**
         * Build call for getAggregatedMetrics
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
         *                        <td>400</td>
         *                        <td>Bad request error</td>
         *                        <td>* X-RateLimit-Limit - The request limit per minute. <br>
         *                        * X-RateLimit-Remaining - The number of available requests left for the current time
         *                        window. <br>
         *                        * X-RateLimit-Retry-After - The number of seconds left until the current rate limit
         *                        window resets. <br>
         *                        </td>
         *                        </tr>
         *                        <tr>
         *                        <td>404</td>
         *                        <td>Unrecognized request URL</td>
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
            return getAggregatedMetricsCall(metric, aggregation, from, to, filterBy, _callback);
        }

        /**
         * Execute getAggregatedMetrics request
         * 
         * @return AnalyticsAggregatedMetricsResponse
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
         *                        <td>400</td>
         *                        <td>Bad request error</td>
         *                        <td>* X-RateLimit-Limit - The request limit per minute. <br>
         *                        * X-RateLimit-Remaining - The number of available requests left for the current time
         *                        window. <br>
         *                        * X-RateLimit-Retry-After - The number of seconds left until the current rate limit
         *                        window resets. <br>
         *                        </td>
         *                        </tr>
         *                        <tr>
         *                        <td>404</td>
         *                        <td>Unrecognized request URL</td>
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
        public AnalyticsAggregatedMetricsResponse execute() throws ApiException {
            ApiResponse<AnalyticsAggregatedMetricsResponse> localVarResp = getAggregatedMetricsWithHttpInfo(metric,
                    aggregation, from, to, filterBy);
            return localVarResp.getData();
        }

        private APIgetAggregatedMetricsRequest copy() {
            APIgetAggregatedMetricsRequest copy = new APIgetAggregatedMetricsRequest(metric, aggregation);
            copy.from(from);
            copy.to(to);
            copy.filterBy(filterBy);
            return copy;
        }

        /**
         * Execute getAggregatedMetrics request with HTTP info returned
         * 
         * @return ApiResponse&lt;AnalyticsAggregatedMetricsResponse&gt;
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
         *                        <td>400</td>
         *                        <td>Bad request error</td>
         *                        <td>* X-RateLimit-Limit - The request limit per minute. <br>
         *                        * X-RateLimit-Remaining - The number of available requests left for the current time
         *                        window. <br>
         *                        * X-RateLimit-Retry-After - The number of seconds left until the current rate limit
         *                        window resets. <br>
         *                        </td>
         *                        </tr>
         *                        <tr>
         *                        <td>404</td>
         *                        <td>Unrecognized request URL</td>
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
        public ApiResponse<AnalyticsAggregatedMetricsResponse> executeWithHttpInfo() throws ApiException {
            return getAggregatedMetricsWithHttpInfo(metric, aggregation, from, to, filterBy);
        }

        /**
         * Execute getAggregatedMetrics request (asynchronously)
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
         *                        <td>400</td>
         *                        <td>Bad request error</td>
         *                        <td>* X-RateLimit-Limit - The request limit per minute. <br>
         *                        * X-RateLimit-Remaining - The number of available requests left for the current time
         *                        window. <br>
         *                        * X-RateLimit-Retry-After - The number of seconds left until the current rate limit
         *                        window resets. <br>
         *                        </td>
         *                        </tr>
         *                        <tr>
         *                        <td>404</td>
         *                        <td>Unrecognized request URL</td>
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
        public okhttp3.Call executeAsync(final ApiCallback<AnalyticsAggregatedMetricsResponse> _callback)
                throws ApiException {
            return getAggregatedMetricsAsync(metric, aggregation, from, to, filterBy, _callback);
        }

    }

    /**
     * Retrieve aggregated metrics
     *
     * Retrieve time-based and countable metrics like average watch time or the number of impressions over a certain
     * period of time.
     * 
     * @param metric
     *            Use this path parameter to select a metric that you want analytics for. - &#x60;play&#x60; is the
     *            number of times your content has been played. You can use the aggregations &#x60;count&#x60;,
     *            &#x60;rate&#x60;, and &#x60;total&#x60; with the &#x60;play&#x60; metric. - &#x60;start&#x60; is the
     *            number of times playback was started. You can use the aggregation &#x60;count&#x60; with this metric.
     *            - &#x60;end&#x60; is the number of times playback has ended with the content watch until the end. You
     *            can use the aggregation &#x60;count&#x60; with this metric. - &#x60;impression&#x60; is the number of
     *            times your content has been loaded and was ready for playback. You can use the aggregation
     *            &#x60;count&#x60; with this metric. - &#x60;impression-time&#x60; is the time in milliseconds that
     *            your content was loading for until the first video frame is displayed. You can use the aggregations
     *            &#x60;average&#x60; and &#x60;sum&#x60; with this metric. - &#x60;watch-time&#x60; is the cumulative
     *            time in seconds that the user has spent watching your content. You can use the aggregations
     *            &#x60;average&#x60; and &#x60;sum&#x60; with this metric. (required)
     * @param aggregation
     *            Use this path parameter to define a way of collecting data for the metric that you want analytics for.
     *            - &#x60;count&#x60; returns the overall number of events for the &#x60;play&#x60; metric. -
     *            &#x60;rate&#x60; returns the ratio that calculates the number of plays your content receives divided
     *            by its impressions. This aggregation can be used only with the &#x60;play&#x60; metric. -
     *            &#x60;total&#x60; calculates the total number of events for the &#x60;play&#x60; metric. -
     *            &#x60;average&#x60; calculates an average value for the selected metric. - &#x60;sum&#x60; adds up the
     *            total value of the select metric. (required)
     * 
     * @return APIgetAggregatedMetricsRequest
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
     *                        <td>Bad request error</td>
     *                        <td>* X-RateLimit-Limit - The request limit per minute. <br>
     *                        * X-RateLimit-Remaining - The number of available requests left for the current time
     *                        window. <br>
     *                        * X-RateLimit-Retry-After - The number of seconds left until the current rate limit window
     *                        resets. <br>
     *                        </td>
     *                        </tr>
     *                        <tr>
     *                        <td>404</td>
     *                        <td>Unrecognized request URL</td>
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
    public APIgetAggregatedMetricsRequest getAggregatedMetrics(String metric, String aggregation) {
        return new APIgetAggregatedMetricsRequest(metric, aggregation);
    }

    private okhttp3.Call getMetricsBreakdownCall(String metric, String breakdown, OffsetDateTime from,
            OffsetDateTime to, String sortBy, String sortOrder, FilterBy2 filterBy, Integer currentPage,
            Integer pageSize, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/data/buckets/{metric}/{breakdown}"
                .replaceAll("\\{" + "metric" + "\\}", localVarApiClient.escapeString(metric.toString()))
                .replaceAll("\\{" + "breakdown" + "\\}", localVarApiClient.escapeString(breakdown.toString()));

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

        if (sortBy != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("sortBy", sortBy));
        }

        if (sortOrder != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("sortOrder", sortOrder));
        }

        if (filterBy != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("filterBy", filterBy));
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
    private okhttp3.Call getMetricsBreakdownValidateBeforeCall(String metric, String breakdown, OffsetDateTime from,
            OffsetDateTime to, String sortBy, String sortOrder, FilterBy2 filterBy, Integer currentPage,
            Integer pageSize, final ApiCallback _callback) throws ApiException {

        // verify the required parameter 'metric' is set
        if (metric == null) {
            throw new ApiException("Missing the required parameter 'metric' when calling getMetricsBreakdown");
        }

        // verify the required parameter 'breakdown' is set
        if (breakdown == null) {
            throw new ApiException("Missing the required parameter 'breakdown' when calling getMetricsBreakdown");
        }

        okhttp3.Call localVarCall = getMetricsBreakdownCall(metric, breakdown, from, to, sortBy, sortOrder, filterBy,
                currentPage, pageSize, _callback);
        return localVarCall;
    }

    private ApiResponse<AnalyticsMetricsBreakdownResponse> getMetricsBreakdownWithHttpInfo(String metric,
            String breakdown, OffsetDateTime from, OffsetDateTime to, String sortBy, String sortOrder,
            FilterBy2 filterBy, Integer currentPage, Integer pageSize) throws ApiException {
        okhttp3.Call localVarCall = getMetricsBreakdownValidateBeforeCall(metric, breakdown, from, to, sortBy,
                sortOrder, filterBy, currentPage, pageSize, null);
        Type localVarReturnType = new TypeToken<AnalyticsMetricsBreakdownResponse>() {
        }.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getMetricsBreakdownAsync(String metric, String breakdown, OffsetDateTime from,
            OffsetDateTime to, String sortBy, String sortOrder, FilterBy2 filterBy, Integer currentPage,
            Integer pageSize, final ApiCallback<AnalyticsMetricsBreakdownResponse> _callback) throws ApiException {
        okhttp3.Call localVarCall = getMetricsBreakdownValidateBeforeCall(metric, breakdown, from, to, sortBy,
                sortOrder, filterBy, currentPage, pageSize, _callback);
        Type localVarReturnType = new TypeToken<AnalyticsMetricsBreakdownResponse>() {
        }.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIgetMetricsBreakdownRequest {
        private final String metric;
        private final String breakdown;
        private OffsetDateTime from;
        private OffsetDateTime to;
        private String sortBy;
        private String sortOrder;
        private FilterBy2 filterBy;
        private Integer currentPage;
        private Integer pageSize;

        private APIgetMetricsBreakdownRequest(String metric, String breakdown) {
            this.metric = metric;
            this.breakdown = breakdown;
        }

        /**
         * Set from
         * 
         * @param from
         *            Use this query parameter to define the starting date-time of the period you want analytics for. -
         *            If you do not set a value for &#x60;from&#x60;, the default assigned value is 1 day ago, based on
         *            the &#x60;to&#x60; parameter. - The maximum value is 30 days ago. - The value you provide should
         *            follow the ATOM date-time format: &#x60;2024-02-05T00:00:00+01:00&#x60; (optional)
         * 
         * @return APIgetMetricsBreakdownRequest
         */
        public APIgetMetricsBreakdownRequest from(OffsetDateTime from) {
            this.from = from;
            return this;
        }

        /**
         * Set to
         * 
         * @param to
         *            Use this query parameter to define the ending date-time of the period you want analytics for. - If
         *            you do not set a value for &#x60;to&#x60;, the default assigned value is &#x60;now&#x60;. - The
         *            value for &#x60;to&#x60; is a non-inclusive value: the API returns data **before** the date-time
         *            that you set. (optional)
         * 
         * @return APIgetMetricsBreakdownRequest
         */
        public APIgetMetricsBreakdownRequest to(OffsetDateTime to) {
            this.to = to;
            return this;
        }

        /**
         * Set sortBy
         * 
         * @param sortBy
         *            Use this parameter to choose which field the API will use to sort the analytics data. These are
         *            the available fields to sort by: - &#x60;metricValue&#x60;: Sorts the results based on the
         *            **metric** you selected in your request. - &#x60;dimensionValue&#x60;: Sorts the results based on
         *            the **dimension** you selected in your request. (optional)
         * 
         * @return APIgetMetricsBreakdownRequest
         */
        public APIgetMetricsBreakdownRequest sortBy(String sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /**
         * Set sortOrder
         * 
         * @param sortOrder
         *            Use this parameter to define the sort order of results. These are the available sort orders: -
         *            &#x60;asc&#x60;: Sorts the results in ascending order: &#x60;A to Z&#x60; and &#x60;0 to 9&#x60;.
         *            - &#x60;desc&#x60;: Sorts the results in descending order: &#x60;Z to A&#x60; and &#x60;9 to
         *            0&#x60;. (optional)
         * 
         * @return APIgetMetricsBreakdownRequest
         */
        public APIgetMetricsBreakdownRequest sortOrder(String sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * Set filterBy
         * 
         * @param filterBy
         *            Use this parameter to filter the API&#39;s response based on different data dimensions. You can
         *            serialize filters in your query to receive more detailed breakdowns of your analytics. - If you do
         *            not set a value for &#x60;filterBy&#x60;, the API returns the full dataset for your project. - The
         *            API only accepts the &#x60;mediaId&#x60; and &#x60;mediaType&#x60; filters when you call
         *            &#x60;/data/metrics/play/total&#x60; or &#x60;/data/buckets/play-total/media-id&#x60;. These are
         *            the available breakdown dimensions: - &#x60;mediaId&#x60;: Returns analytics based on the unique
         *            identifiers of a video or a live stream. - &#x60;mediaType&#x60;: Returns analytics based on the
         *            type of content. Possible values: &#x60;video&#x60; and &#x60;live-stream&#x60;. -
         *            &#x60;continent&#x60;: Returns analytics based on the viewers&#39; continent. The list of
         *            supported continents names are based on the [GeoNames public
         *            database](https://www.geonames.org/countries/). You must use the ISO-3166 alpha2 format, for
         *            example &#x60;EU&#x60;. Possible values are: &#x60;AS&#x60;, &#x60;AF&#x60;, &#x60;NA&#x60;,
         *            &#x60;SA&#x60;, &#x60;AN&#x60;, &#x60;EU&#x60;, &#x60;AZ&#x60;. - &#x60;country&#x60;: Returns
         *            analytics based on the viewers&#39; country. The list of supported country names are based on the
         *            [GeoNames public database](https://www.geonames.org/countries/). You must use the ISO-3166 alpha2
         *            format, for example &#x60;FR&#x60;. - &#x60;deviceType&#x60;: Returns analytics based on the type
         *            of device used by the viewers. Response values can include: &#x60;computer&#x60;,
         *            &#x60;phone&#x60;, &#x60;tablet&#x60;, &#x60;tv&#x60;, &#x60;console&#x60;, &#x60;wearable&#x60;,
         *            &#x60;unknown&#x60;. - &#x60;operatingSystem&#x60;: Returns analytics based on the operating
         *            system used by the viewers. Response values can include &#x60;windows&#x60;, &#x60;mac osx&#x60;,
         *            &#x60;android&#x60;, &#x60;ios&#x60;, &#x60;linux&#x60;. - &#x60;browser&#x60;: Returns analytics
         *            based on the browser used by the viewers. Response values can include &#x60;chrome&#x60;,
         *            &#x60;firefox&#x60;, &#x60;edge&#x60;, &#x60;opera&#x60;. - &#x60;tag&#x60;: Returns analytics for
         *            videos using this tag. This filter only accepts a single value and is case sensitive. Read more
         *            about tagging your videos [here](https://docs.api.video/vod/tags-metadata). (optional)
         * 
         * @return APIgetMetricsBreakdownRequest
         */
        public APIgetMetricsBreakdownRequest filterBy(FilterBy2 filterBy) {
            this.filterBy = filterBy;
            return this;
        }

        /**
         * Set currentPage
         * 
         * @param currentPage
         *            Choose the number of search results to return per page. Minimum value: 1 (optional, default to 1)
         * 
         * @return APIgetMetricsBreakdownRequest
         */
        public APIgetMetricsBreakdownRequest currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * Set pageSize
         * 
         * @param pageSize
         *            Results per page. Allowed values 1-100, default is 25. (optional, default to 25)
         * 
         * @return APIgetMetricsBreakdownRequest
         */
        public APIgetMetricsBreakdownRequest pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Build call for getMetricsBreakdown
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
         *                        <td>400</td>
         *                        <td>Bad request error</td>
         *                        <td>* X-RateLimit-Limit - The request limit per minute. <br>
         *                        * X-RateLimit-Remaining - The number of available requests left for the current time
         *                        window. <br>
         *                        * X-RateLimit-Retry-After - The number of seconds left until the current rate limit
         *                        window resets. <br>
         *                        </td>
         *                        </tr>
         *                        <tr>
         *                        <td>404</td>
         *                        <td>Unrecognized request URL</td>
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
            return getMetricsBreakdownCall(metric, breakdown, from, to, sortBy, sortOrder, filterBy, currentPage,
                    pageSize, _callback);
        }

        /**
         * Execute getMetricsBreakdown request
         * 
         * @return AnalyticsMetricsBreakdownResponse
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
         *                        <td>400</td>
         *                        <td>Bad request error</td>
         *                        <td>* X-RateLimit-Limit - The request limit per minute. <br>
         *                        * X-RateLimit-Remaining - The number of available requests left for the current time
         *                        window. <br>
         *                        * X-RateLimit-Retry-After - The number of seconds left until the current rate limit
         *                        window resets. <br>
         *                        </td>
         *                        </tr>
         *                        <tr>
         *                        <td>404</td>
         *                        <td>Unrecognized request URL</td>
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
        public Page<AnalyticsMetricsBreakdownResponseData> execute() throws ApiException {
            ApiResponse<AnalyticsMetricsBreakdownResponse> localVarResp = getMetricsBreakdownWithHttpInfo(metric,
                    breakdown, from, to, sortBy, sortOrder, filterBy, currentPage, pageSize);
            return new Page<>(localVarResp.getData().getData(), localVarResp.getData().getPagination(), () -> {
                try {
                    return copy().currentPage((currentPage == null ? 1 : currentPage) + 1).execute();
                } catch (ApiException e) {
                    throw new RuntimeException(e);
                }
            }); //
        }

        private APIgetMetricsBreakdownRequest copy() {
            APIgetMetricsBreakdownRequest copy = new APIgetMetricsBreakdownRequest(metric, breakdown);
            copy.from(from);
            copy.to(to);
            copy.sortBy(sortBy);
            copy.sortOrder(sortOrder);
            copy.filterBy(filterBy);
            copy.currentPage(currentPage);
            copy.pageSize(pageSize);
            return copy;
        }

        /**
         * Execute getMetricsBreakdown request with HTTP info returned
         * 
         * @return ApiResponse&lt;AnalyticsMetricsBreakdownResponse&gt;
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
         *                        <td>400</td>
         *                        <td>Bad request error</td>
         *                        <td>* X-RateLimit-Limit - The request limit per minute. <br>
         *                        * X-RateLimit-Remaining - The number of available requests left for the current time
         *                        window. <br>
         *                        * X-RateLimit-Retry-After - The number of seconds left until the current rate limit
         *                        window resets. <br>
         *                        </td>
         *                        </tr>
         *                        <tr>
         *                        <td>404</td>
         *                        <td>Unrecognized request URL</td>
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
        public ApiResponse<AnalyticsMetricsBreakdownResponse> executeWithHttpInfo() throws ApiException {
            return getMetricsBreakdownWithHttpInfo(metric, breakdown, from, to, sortBy, sortOrder, filterBy,
                    currentPage, pageSize);
        }

        /**
         * Execute getMetricsBreakdown request (asynchronously)
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
         *                        <td>400</td>
         *                        <td>Bad request error</td>
         *                        <td>* X-RateLimit-Limit - The request limit per minute. <br>
         *                        * X-RateLimit-Remaining - The number of available requests left for the current time
         *                        window. <br>
         *                        * X-RateLimit-Retry-After - The number of seconds left until the current rate limit
         *                        window resets. <br>
         *                        </td>
         *                        </tr>
         *                        <tr>
         *                        <td>404</td>
         *                        <td>Unrecognized request URL</td>
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
        public okhttp3.Call executeAsync(final ApiCallback<Page<AnalyticsMetricsBreakdownResponseData>> _callback)
                throws ApiException {
            ApiCallback<AnalyticsMetricsBreakdownResponse> apiCallback = new ApiCallback<AnalyticsMetricsBreakdownResponse>() {

                @Override
                public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
                    _callback.onFailure(e, statusCode, responseHeaders);
                }

                @Override
                public void onSuccess(AnalyticsMetricsBreakdownResponse result, int statusCode,
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
            return getMetricsBreakdownAsync(metric, breakdown, from, to, sortBy, sortOrder, filterBy, currentPage,
                    pageSize, apiCallback);
        }
    }

    /**
     * Retrieve metrics in a breakdown of dimensions
     *
     * Retrieve detailed analytics play-rate and number of impressions segmented by dimensions like country or device
     * type.
     * 
     * @param metric
     *            Use this path parameter to select a metric that you want analytics for. - &#x60;play&#x60; is the
     *            number of times your content has been played. - &#x60;play-rate&#x60; is the ratio that calculates the
     *            number of plays your content receives divided by its impressions. - &#x60;play-total&#x60; is the
     *            total number of times a specific content has been played. You can only use the &#x60;media-id&#x60;
     *            breakdown with this metric. - &#x60;start&#x60; is the number of times playback was started. -
     *            &#x60;end&#x60; is the number of times playback has ended with the content watch until the end. -
     *            &#x60;impression&#x60; is the number of times your content has been loaded and was ready for playback.
     *            (required)
     * @param breakdown
     *            Use this path parameter to define a dimension for segmenting analytics data. You must use
     *            &#x60;kebab-case&#x60; for path parameters. These are the available dimensions: -
     *            &#x60;media-id&#x60;: Returns analytics based on the unique identifiers of a video or a live stream. -
     *            &#x60;media-type&#x60;: Returns analytics based on the type of content. Possible values:
     *            &#x60;video&#x60; and &#x60;live-stream&#x60;. - &#x60;continent&#x60;: Returns analytics based on the
     *            viewers&#39; continent. The list of supported continents names are based on the [GeoNames public
     *            database](https://www.geonames.org/countries/). Possible values are: &#x60;AS&#x60;, &#x60;AF&#x60;,
     *            &#x60;NA&#x60;, &#x60;SA&#x60;, &#x60;AN&#x60;, &#x60;EU&#x60;, &#x60;AZ&#x60;. - &#x60;country&#x60;:
     *            Returns analytics based on the viewers&#39; country. The list of supported country names are based on
     *            the [GeoNames public database](https://www.geonames.org/countries/). - &#x60;device-type&#x60;:
     *            Returns analytics based on the type of device used by the viewers. Response values can include:
     *            &#x60;computer&#x60;, &#x60;phone&#x60;, &#x60;tablet&#x60;, &#x60;tv&#x60;, &#x60;console&#x60;,
     *            &#x60;wearable&#x60;, &#x60;unknown&#x60;. - &#x60;operating-system&#x60;: Returns analytics based on
     *            the operating system used by the viewers. Response values can include &#x60;windows&#x60;, &#x60;mac
     *            osx&#x60;, &#x60;android&#x60;, &#x60;ios&#x60;, &#x60;linux&#x60;. - &#x60;browser&#x60;: Returns
     *            analytics based on the browser used by the viewers. Response values can include &#x60;chrome&#x60;,
     *            &#x60;firefox&#x60;, &#x60;edge&#x60;, &#x60;opera&#x60;. (required)
     * 
     * @return APIgetMetricsBreakdownRequest
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
     *                        <td>Bad request error</td>
     *                        <td>* X-RateLimit-Limit - The request limit per minute. <br>
     *                        * X-RateLimit-Remaining - The number of available requests left for the current time
     *                        window. <br>
     *                        * X-RateLimit-Retry-After - The number of seconds left until the current rate limit window
     *                        resets. <br>
     *                        </td>
     *                        </tr>
     *                        <tr>
     *                        <td>404</td>
     *                        <td>Unrecognized request URL</td>
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
    public APIgetMetricsBreakdownRequest getMetricsBreakdown(String metric, String breakdown) {
        return new APIgetMetricsBreakdownRequest(metric, breakdown);
    }

    private okhttp3.Call getMetricsOverTimeCall(String metric, OffsetDateTime from, OffsetDateTime to, String interval,
            String sortBy, String sortOrder, FilterBy2 filterBy, Integer currentPage, Integer pageSize,
            final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/data/timeseries/{metric}".replaceAll("\\{" + "metric" + "\\}",
                localVarApiClient.escapeString(metric.toString()));

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

        if (interval != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("interval", interval));
        }

        if (sortBy != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("sortBy", sortBy));
        }

        if (sortOrder != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("sortOrder", sortOrder));
        }

        if (filterBy != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("filterBy", filterBy));
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
    private okhttp3.Call getMetricsOverTimeValidateBeforeCall(String metric, OffsetDateTime from, OffsetDateTime to,
            String interval, String sortBy, String sortOrder, FilterBy2 filterBy, Integer currentPage, Integer pageSize,
            final ApiCallback _callback) throws ApiException {

        // verify the required parameter 'metric' is set
        if (metric == null) {
            throw new ApiException("Missing the required parameter 'metric' when calling getMetricsOverTime");
        }

        okhttp3.Call localVarCall = getMetricsOverTimeCall(metric, from, to, interval, sortBy, sortOrder, filterBy,
                currentPage, pageSize, _callback);
        return localVarCall;
    }

    private ApiResponse<AnalyticsMetricsOverTimeResponse> getMetricsOverTimeWithHttpInfo(String metric,
            OffsetDateTime from, OffsetDateTime to, String interval, String sortBy, String sortOrder,
            FilterBy2 filterBy, Integer currentPage, Integer pageSize) throws ApiException {
        okhttp3.Call localVarCall = getMetricsOverTimeValidateBeforeCall(metric, from, to, interval, sortBy, sortOrder,
                filterBy, currentPage, pageSize, null);
        Type localVarReturnType = new TypeToken<AnalyticsMetricsOverTimeResponse>() {
        }.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getMetricsOverTimeAsync(String metric, OffsetDateTime from, OffsetDateTime to, String interval,
            String sortBy, String sortOrder, FilterBy2 filterBy, Integer currentPage, Integer pageSize,
            final ApiCallback<AnalyticsMetricsOverTimeResponse> _callback) throws ApiException {
        okhttp3.Call localVarCall = getMetricsOverTimeValidateBeforeCall(metric, from, to, interval, sortBy, sortOrder,
                filterBy, currentPage, pageSize, _callback);
        Type localVarReturnType = new TypeToken<AnalyticsMetricsOverTimeResponse>() {
        }.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIgetMetricsOverTimeRequest {
        private final String metric;
        private OffsetDateTime from;
        private OffsetDateTime to;
        private String interval;
        private String sortBy;
        private String sortOrder;
        private FilterBy2 filterBy;
        private Integer currentPage;
        private Integer pageSize;

        private APIgetMetricsOverTimeRequest(String metric) {
            this.metric = metric;
        }

        /**
         * Set from
         * 
         * @param from
         *            Use this query parameter to define the starting date-time of the period you want analytics for. -
         *            If you do not set a value for &#x60;from&#x60;, the default assigned value is 1 day ago, based on
         *            the &#x60;to&#x60; parameter. - The maximum value is 30 days ago. - The value you provide should
         *            follow the ATOM date-time format: &#x60;2024-02-05T00:00:00+01:00&#x60; (optional)
         * 
         * @return APIgetMetricsOverTimeRequest
         */
        public APIgetMetricsOverTimeRequest from(OffsetDateTime from) {
            this.from = from;
            return this;
        }

        /**
         * Set to
         * 
         * @param to
         *            Use this query parameter to define the ending date-time of the period you want analytics for. - If
         *            you do not set a value for &#x60;to&#x60;, the default assigned value is &#x60;now&#x60;. - The
         *            value for &#x60;to&#x60; is a non-inclusive value: the API returns data **before** the date-time
         *            that you set. (optional)
         * 
         * @return APIgetMetricsOverTimeRequest
         */
        public APIgetMetricsOverTimeRequest to(OffsetDateTime to) {
            this.to = to;
            return this;
        }

        /**
         * Set interval
         * 
         * @param interval
         *            Use this query parameter to define how granularity of the data. Possible values: &#x60;hour&#x60;,
         *            &#x60;day&#x60;. - Default: If no interval specified and the period (different between from and
         *            to) ≤ 2 days then hour, otherwise day. - If you do not set a value for &#x60;interval&#x60;, and
         *            the period you set using the &#x60;from&#x60; and &#x60;to&#x60; parameters is less than or equals
         *            to 2 days, then the default assigned value is &#x60;hour&#x60;. Otherwise the API sets it to
         *            &#x60;day&#x60;. (optional)
         * 
         * @return APIgetMetricsOverTimeRequest
         */
        public APIgetMetricsOverTimeRequest interval(String interval) {
            this.interval = interval;
            return this;
        }

        /**
         * Set sortBy
         * 
         * @param sortBy
         *            Use this parameter to choose which field the API will use to sort the analytics data. These are
         *            the available fields to sort by: - &#x60;metricValue&#x60;: Sorts the results based on the
         *            **metric** you selected in your request. - &#x60;emittedAt&#x60;: Sorts the results based on the
         *            **timestamp** of the event in ATOM date-time format. (optional)
         * 
         * @return APIgetMetricsOverTimeRequest
         */
        public APIgetMetricsOverTimeRequest sortBy(String sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /**
         * Set sortOrder
         * 
         * @param sortOrder
         *            Use this parameter to define the sort order of results. These are the available sort orders: -
         *            &#x60;asc&#x60;: Sorts the results in ascending order: &#x60;A to Z&#x60; and &#x60;0 to 9&#x60;.
         *            - &#x60;desc&#x60;: Sorts the results in descending order: &#x60;Z to A&#x60; and &#x60;9 to
         *            0&#x60;. (optional)
         * 
         * @return APIgetMetricsOverTimeRequest
         */
        public APIgetMetricsOverTimeRequest sortOrder(String sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * Set filterBy
         * 
         * @param filterBy
         *            Use this parameter to filter the API&#39;s response based on different data dimensions. You can
         *            serialize filters in your query to receive more detailed breakdowns of your analytics. - If you do
         *            not set a value for &#x60;filterBy&#x60;, the API returns the full dataset for your project. - The
         *            API only accepts the &#x60;mediaId&#x60; and &#x60;mediaType&#x60; filters when you call
         *            &#x60;/data/metrics/play/total&#x60; or &#x60;/data/buckets/play-total/media-id&#x60;. These are
         *            the available breakdown dimensions: - &#x60;mediaId&#x60;: Returns analytics based on the unique
         *            identifiers of a video or a live stream. - &#x60;mediaType&#x60;: Returns analytics based on the
         *            type of content. Possible values: &#x60;video&#x60; and &#x60;live-stream&#x60;. -
         *            &#x60;continent&#x60;: Returns analytics based on the viewers&#39; continent. The list of
         *            supported continents names are based on the [GeoNames public
         *            database](https://www.geonames.org/countries/). You must use the ISO-3166 alpha2 format, for
         *            example &#x60;EU&#x60;. Possible values are: &#x60;AS&#x60;, &#x60;AF&#x60;, &#x60;NA&#x60;,
         *            &#x60;SA&#x60;, &#x60;AN&#x60;, &#x60;EU&#x60;, &#x60;AZ&#x60;. - &#x60;country&#x60;: Returns
         *            analytics based on the viewers&#39; country. The list of supported country names are based on the
         *            [GeoNames public database](https://www.geonames.org/countries/). You must use the ISO-3166 alpha2
         *            format, for example &#x60;FR&#x60;. - &#x60;deviceType&#x60;: Returns analytics based on the type
         *            of device used by the viewers. Response values can include: &#x60;computer&#x60;,
         *            &#x60;phone&#x60;, &#x60;tablet&#x60;, &#x60;tv&#x60;, &#x60;console&#x60;, &#x60;wearable&#x60;,
         *            &#x60;unknown&#x60;. - &#x60;operatingSystem&#x60;: Returns analytics based on the operating
         *            system used by the viewers. Response values can include &#x60;windows&#x60;, &#x60;mac osx&#x60;,
         *            &#x60;android&#x60;, &#x60;ios&#x60;, &#x60;linux&#x60;. - &#x60;browser&#x60;: Returns analytics
         *            based on the browser used by the viewers. Response values can include &#x60;chrome&#x60;,
         *            &#x60;firefox&#x60;, &#x60;edge&#x60;, &#x60;opera&#x60;. - &#x60;tag&#x60;: Returns analytics for
         *            videos using this tag. This filter only accepts a single value and is case sensitive. Read more
         *            about tagging your videos [here](https://docs.api.video/vod/tags-metadata). (optional)
         * 
         * @return APIgetMetricsOverTimeRequest
         */
        public APIgetMetricsOverTimeRequest filterBy(FilterBy2 filterBy) {
            this.filterBy = filterBy;
            return this;
        }

        /**
         * Set currentPage
         * 
         * @param currentPage
         *            Choose the number of search results to return per page. Minimum value: 1 (optional, default to 1)
         * 
         * @return APIgetMetricsOverTimeRequest
         */
        public APIgetMetricsOverTimeRequest currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * Set pageSize
         * 
         * @param pageSize
         *            Results per page. Allowed values 1-100, default is 25. (optional, default to 25)
         * 
         * @return APIgetMetricsOverTimeRequest
         */
        public APIgetMetricsOverTimeRequest pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Build call for getMetricsOverTime
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
         *                        <td>400</td>
         *                        <td>Bad request error</td>
         *                        <td>* X-RateLimit-Limit - The request limit per minute. <br>
         *                        * X-RateLimit-Remaining - The number of available requests left for the current time
         *                        window. <br>
         *                        * X-RateLimit-Retry-After - The number of seconds left until the current rate limit
         *                        window resets. <br>
         *                        </td>
         *                        </tr>
         *                        <tr>
         *                        <td>404</td>
         *                        <td>Unrecognized request URL</td>
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
            return getMetricsOverTimeCall(metric, from, to, interval, sortBy, sortOrder, filterBy, currentPage,
                    pageSize, _callback);
        }

        /**
         * Execute getMetricsOverTime request
         * 
         * @return AnalyticsMetricsOverTimeResponse
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
         *                        <td>400</td>
         *                        <td>Bad request error</td>
         *                        <td>* X-RateLimit-Limit - The request limit per minute. <br>
         *                        * X-RateLimit-Remaining - The number of available requests left for the current time
         *                        window. <br>
         *                        * X-RateLimit-Retry-After - The number of seconds left until the current rate limit
         *                        window resets. <br>
         *                        </td>
         *                        </tr>
         *                        <tr>
         *                        <td>404</td>
         *                        <td>Unrecognized request URL</td>
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
        public Page<AnalyticsMetricsOverTimeResponseData> execute() throws ApiException {
            ApiResponse<AnalyticsMetricsOverTimeResponse> localVarResp = getMetricsOverTimeWithHttpInfo(metric, from,
                    to, interval, sortBy, sortOrder, filterBy, currentPage, pageSize);
            return new Page<>(localVarResp.getData().getData(), localVarResp.getData().getPagination(), () -> {
                try {
                    return copy().currentPage((currentPage == null ? 1 : currentPage) + 1).execute();
                } catch (ApiException e) {
                    throw new RuntimeException(e);
                }
            }); //
        }

        private APIgetMetricsOverTimeRequest copy() {
            APIgetMetricsOverTimeRequest copy = new APIgetMetricsOverTimeRequest(metric);
            copy.from(from);
            copy.to(to);
            copy.interval(interval);
            copy.sortBy(sortBy);
            copy.sortOrder(sortOrder);
            copy.filterBy(filterBy);
            copy.currentPage(currentPage);
            copy.pageSize(pageSize);
            return copy;
        }

        /**
         * Execute getMetricsOverTime request with HTTP info returned
         * 
         * @return ApiResponse&lt;AnalyticsMetricsOverTimeResponse&gt;
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
         *                        <td>400</td>
         *                        <td>Bad request error</td>
         *                        <td>* X-RateLimit-Limit - The request limit per minute. <br>
         *                        * X-RateLimit-Remaining - The number of available requests left for the current time
         *                        window. <br>
         *                        * X-RateLimit-Retry-After - The number of seconds left until the current rate limit
         *                        window resets. <br>
         *                        </td>
         *                        </tr>
         *                        <tr>
         *                        <td>404</td>
         *                        <td>Unrecognized request URL</td>
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
        public ApiResponse<AnalyticsMetricsOverTimeResponse> executeWithHttpInfo() throws ApiException {
            return getMetricsOverTimeWithHttpInfo(metric, from, to, interval, sortBy, sortOrder, filterBy, currentPage,
                    pageSize);
        }

        /**
         * Execute getMetricsOverTime request (asynchronously)
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
         *                        <td>400</td>
         *                        <td>Bad request error</td>
         *                        <td>* X-RateLimit-Limit - The request limit per minute. <br>
         *                        * X-RateLimit-Remaining - The number of available requests left for the current time
         *                        window. <br>
         *                        * X-RateLimit-Retry-After - The number of seconds left until the current rate limit
         *                        window resets. <br>
         *                        </td>
         *                        </tr>
         *                        <tr>
         *                        <td>404</td>
         *                        <td>Unrecognized request URL</td>
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
        public okhttp3.Call executeAsync(final ApiCallback<Page<AnalyticsMetricsOverTimeResponseData>> _callback)
                throws ApiException {
            ApiCallback<AnalyticsMetricsOverTimeResponse> apiCallback = new ApiCallback<AnalyticsMetricsOverTimeResponse>() {

                @Override
                public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
                    _callback.onFailure(e, statusCode, responseHeaders);
                }

                @Override
                public void onSuccess(AnalyticsMetricsOverTimeResponse result, int statusCode,
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
            return getMetricsOverTimeAsync(metric, from, to, interval, sortBy, sortOrder, filterBy, currentPage,
                    pageSize, apiCallback);
        }
    }

    /**
     * Retrieve metrics over time
     *
     * Retrieve countable metrics like the number of plays or impressions, grouped by the time at which they occurred
     * 
     * @param metric
     *            Use this path parameter to select a metric that you want analytics for. - &#x60;play&#x60; is the
     *            number of times your content has been played. - &#x60;play-rate&#x60; is the ratio that calculates the
     *            number of plays your content receives divided by its impressions. - &#x60;start&#x60; is the number of
     *            times playback was started. - &#x60;end&#x60; is the number of times playback has ended with the
     *            content watch until the end. - &#x60;impression&#x60; is the number of times your content has been
     *            loaded and was ready for playback. (required)
     * 
     * @return APIgetMetricsOverTimeRequest
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
     *                        <td>Bad request error</td>
     *                        <td>* X-RateLimit-Limit - The request limit per minute. <br>
     *                        * X-RateLimit-Remaining - The number of available requests left for the current time
     *                        window. <br>
     *                        * X-RateLimit-Retry-After - The number of seconds left until the current rate limit window
     *                        resets. <br>
     *                        </td>
     *                        </tr>
     *                        <tr>
     *                        <td>404</td>
     *                        <td>Unrecognized request URL</td>
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
    public APIgetMetricsOverTimeRequest getMetricsOverTime(String metric) {
        return new APIgetMetricsOverTimeRequest(metric);
    }
}
