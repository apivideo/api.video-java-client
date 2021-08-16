# RawStatisticsApi

All URIs are relative to *https://ws.api.video*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listLiveStreamSessions**](RawStatisticsApi.md#listLiveStreamSessions) | **GET** /analytics/live-streams/{liveStreamId} | List live stream player sessions
[**listSessionEvents**](RawStatisticsApi.md#listSessionEvents) | **GET** /analytics/sessions/{sessionId}/events | List player session events
[**listVideoSessions**](RawStatisticsApi.md#listVideoSessions) | **GET** /analytics/videos/{videoId} | List video player sessions


<a name="listLiveStreamSessions"></a>
# **listLiveStreamSessions**
> RawStatisticsListLiveStreamAnalyticsResponse listLiveStreamSessions(liveStreamId).period(period).currentPage(currentPage).pageSize(pageSize).execute();

List live stream player sessions

### Example
```java
// Import classes:
import video.api.client.ApiVideoClient;
import video.api.client.api.ApiException;
import video.api.client.api.models.*;
import video.api.client.api.clients.RawStatisticsApi;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiVideoClient client = new ApiVideoClient("YOUR_API_TOKEN");
    // if you rather like to use the sandbox environment:
    // ApiVideoClient client = new ApiVideoClient("YOU_SANDBOX_API_TOKEN", ApiVideoClient.Environment.SANDBOX);

    RawStatisticsApi apiInstance = client.rawStatistics();
    
    String liveStreamId = "vi4k0jvEUuaTdRAEjQ4Jfrgz"; // The unique identifier for the live stream you want to retrieve analytics for.
    String period = "2019-01-01"; // Period must have one of the following formats:  - For a day : \"2018-01-01\", - For a week: \"2018-W01\", - For a month: \"2018-01\" - For a year: \"2018\"  For a range period: -  Date range: \"2018-01-01/2018-01-15\" 
    Integer currentPage = 1; // Choose the number of search results to return per page. Minimum value: 1
    Integer pageSize = 25; // Results per page. Allowed values 1-100, default is 25.

    try {
      Page<LiveStreamSession> result = apiInstance.listLiveStreamSessions(liveStreamId)
            .period(period)
            .currentPage(currentPage)
            .pageSize(pageSize)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RawStatisticsApi#listLiveStreamSessions");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getMessage());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **liveStreamId** | **String**| The unique identifier for the live stream you want to retrieve analytics for. |
 **period** | **String**| Period must have one of the following formats:  - For a day : \&quot;2018-01-01\&quot;, - For a week: \&quot;2018-W01\&quot;, - For a month: \&quot;2018-01\&quot; - For a year: \&quot;2018\&quot;  For a range period: -  Date range: \&quot;2018-01-01/2018-01-15\&quot;  | [optional]
 **currentPage** | **Integer**| Choose the number of search results to return per page. Minimum value: 1 | [optional] [default to 1]
 **pageSize** | **Integer**| Results per page. Allowed values 1-100, default is 25. | [optional] [default to 25]

### Return type

[**Page**](pagination.md)<[**LiveStreamSession**](LiveStreamSession.md)>


### Authorization

[API token](../README.md#api-token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**404** | Not Found |  -  |

<a name="listSessionEvents"></a>
# **listSessionEvents**
> RawStatisticsListPlayerSessionEventsResponse listSessionEvents(sessionId).currentPage(currentPage).pageSize(pageSize).execute();

List player session events

Useful to track and measure video's engagement.

### Example
```java
// Import classes:
import video.api.client.ApiVideoClient;
import video.api.client.api.ApiException;
import video.api.client.api.models.*;
import video.api.client.api.clients.RawStatisticsApi;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiVideoClient client = new ApiVideoClient("YOUR_API_TOKEN");
    // if you rather like to use the sandbox environment:
    // ApiVideoClient client = new ApiVideoClient("YOU_SANDBOX_API_TOKEN", ApiVideoClient.Environment.SANDBOX);

    RawStatisticsApi apiInstance = client.rawStatistics();
    
    String sessionId = "psEmFwGQUAXR2lFHj5nDOpy"; // A unique identifier you can use to reference and track a session with.
    Integer currentPage = 1; // Choose the number of search results to return per page. Minimum value: 1
    Integer pageSize = 25; // Results per page. Allowed values 1-100, default is 25.

    try {
      Page<PlayerSessionEvent> result = apiInstance.listSessionEvents(sessionId)
            .currentPage(currentPage)
            .pageSize(pageSize)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RawStatisticsApi#listSessionEvents");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getMessage());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **String**| A unique identifier you can use to reference and track a session with. |
 **currentPage** | **Integer**| Choose the number of search results to return per page. Minimum value: 1 | [optional] [default to 1]
 **pageSize** | **Integer**| Results per page. Allowed values 1-100, default is 25. | [optional] [default to 25]

### Return type

[**Page**](pagination.md)<[**PlayerSessionEvent**](PlayerSessionEvent.md)>


### Authorization

[API token](../README.md#api-token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**404** | Not Found |  -  |

<a name="listVideoSessions"></a>
# **listVideoSessions**
> RawStatisticsListSessionsResponse listVideoSessions(videoId).period(period).metadata(metadata).currentPage(currentPage).pageSize(pageSize).execute();

List video player sessions

Retrieve all available user sessions for a specific video. Tutorials that use the [analytics endpoint](https://api.video/blog/endpoints/analytics).

### Example
```java
// Import classes:
import video.api.client.ApiVideoClient;
import video.api.client.api.ApiException;
import video.api.client.api.models.*;
import video.api.client.api.clients.RawStatisticsApi;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiVideoClient client = new ApiVideoClient("YOUR_API_TOKEN");
    // if you rather like to use the sandbox environment:
    // ApiVideoClient client = new ApiVideoClient("YOU_SANDBOX_API_TOKEN", ApiVideoClient.Environment.SANDBOX);

    RawStatisticsApi apiInstance = client.rawStatistics();
    
    String videoId = "vi4k0jvEUuaTdRAEjQ4Prklg"; // The unique identifier for the video you want to retrieve session information for.
    String period = "period_example"; // Period must have one of the following formats:  - For a day : 2018-01-01, - For a week: 2018-W01, - For a month: 2018-01 - For a year: 2018  For a range period: -  Date range: 2018-01-01/2018-01-15 
    Map<String, String> metadata = new HashMap(); // Metadata and Dynamic Metadata filter. Send an array of key value pairs you want to filter sessios with.
    Integer currentPage = 1; // Choose the number of search results to return per page. Minimum value: 1
    Integer pageSize = 25; // Results per page. Allowed values 1-100, default is 25.

    try {
      Page<VideoSession> result = apiInstance.listVideoSessions(videoId)
            .period(period)
            .metadata(metadata)
            .currentPage(currentPage)
            .pageSize(pageSize)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RawStatisticsApi#listVideoSessions");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getMessage());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **videoId** | **String**| The unique identifier for the video you want to retrieve session information for. |
 **period** | **String**| Period must have one of the following formats:  - For a day : 2018-01-01, - For a week: 2018-W01, - For a month: 2018-01 - For a year: 2018  For a range period: -  Date range: 2018-01-01/2018-01-15  | [optional]
 **metadata** | [**Map&lt;String, String&gt;**](String.md)| Metadata and Dynamic Metadata filter. Send an array of key value pairs you want to filter sessios with. | [optional]
 **currentPage** | **Integer**| Choose the number of search results to return per page. Minimum value: 1 | [optional] [default to 1]
 **pageSize** | **Integer**| Results per page. Allowed values 1-100, default is 25. | [optional] [default to 25]

### Return type

[**Page**](pagination.md)<[**VideoSession**](VideoSession.md)>


### Authorization

[API token](../README.md#api-token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**404** | Not Found |  -  |

