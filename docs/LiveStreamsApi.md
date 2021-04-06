# LiveStreamsApi

All URIs are relative to *https://ws.api.video*

Method | HTTP request | Description
------------- | ------------- | -------------
[**delete**](LiveStreamsApi.md#delete) | **DELETE** /live-streams/{liveStreamId} | Delete a live stream
[**deleteThumbnail**](LiveStreamsApi.md#deleteThumbnail) | **DELETE** /live-streams/{liveStreamId}/thumbnail | Delete a thumbnail
[**list**](LiveStreamsApi.md#list) | **GET** /live-streams | List all live streams
[**get**](LiveStreamsApi.md#get) | **GET** /live-streams/{liveStreamId} | Show live stream
[**update**](LiveStreamsApi.md#update) | **PATCH** /live-streams/{liveStreamId} | Update a live stream
[**create**](LiveStreamsApi.md#create) | **POST** /live-streams | Create live stream
[**uploadThumbnail**](LiveStreamsApi.md#uploadThumbnail) | **POST** /live-streams/{liveStreamId}/thumbnail | Upload a thumbnail


<a name="delete"></a>
# **delete**
> delete(liveStreamId)

Delete a live stream

### Example
```java
// Import classes:
import video.api.client.ApiVideoClient;
import video.api.client.api.ApiException;
import video.api.client.api.models.*;
import video.api.client.api.clients.LiveStreamsApi;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiVideoClient client = new ApiVideoClient("YOUR_API_TOKEN");
    // if you rather like to use the sandbox environment:
    // ApiVideoClient client = new ApiVideoClient("YOU_SANDBOX_API_TOKEN", ApiVideoClient.Environment.SANDBOX);

    LiveStreamsApi apiInstance = client.liveStreams();
    
    String liveStreamId = "li400mYKSgQ6xs7taUeSaEKr"; // The unique ID for the live stream that you want to remove.

    try {
      apiInstance.delete(liveStreamId);
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveStreamsApi#delete");
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
 **liveStreamId** | **String**| The unique ID for the live stream that you want to remove. |

### Return type


null (empty response body)

### Authorization

[API token](../README.md#api-token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | No Content |  -  |

<a name="deleteThumbnail"></a>
# **deleteThumbnail**
> LiveStream deleteThumbnail(liveStreamId)

Delete a thumbnail

Send the unique identifier for a live stream to delete it from the system.

### Example
```java
// Import classes:
import video.api.client.ApiVideoClient;
import video.api.client.api.ApiException;
import video.api.client.api.models.*;
import video.api.client.api.clients.LiveStreamsApi;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiVideoClient client = new ApiVideoClient("YOUR_API_TOKEN");
    // if you rather like to use the sandbox environment:
    // ApiVideoClient client = new ApiVideoClient("YOU_SANDBOX_API_TOKEN", ApiVideoClient.Environment.SANDBOX);

    LiveStreamsApi apiInstance = client.liveStreams();
    
    String liveStreamId = "li400mYKSgQ6xs7taUeSaEKr"; // The unique identifier for the live stream you want to delete. 

    try {
      LiveStream result = apiInstance.deleteThumbnail(liveStreamId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveStreamsApi#deleteThumbnail");
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
 **liveStreamId** | **String**| The unique identifier for the live stream you want to delete.  |

### Return type


[**LiveStream**](LiveStream.md)

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

<a name="list"></a>
# **list**
> LiveStreamListResponse list().streamKey(streamKey).name(name).sortBy(sortBy).sortOrder(sortOrder).currentPage(currentPage).pageSize(pageSize).execute();

List all live streams

With no parameters added to the url, this will return all livestreams. Query by name or key to limit the list.

### Example
```java
// Import classes:
import video.api.client.ApiVideoClient;
import video.api.client.api.ApiException;
import video.api.client.api.models.*;
import video.api.client.api.clients.LiveStreamsApi;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiVideoClient client = new ApiVideoClient("YOUR_API_TOKEN");
    // if you rather like to use the sandbox environment:
    // ApiVideoClient client = new ApiVideoClient("YOU_SANDBOX_API_TOKEN", ApiVideoClient.Environment.SANDBOX);

    LiveStreamsApi apiInstance = client.liveStreams();
    
    String streamKey = "30087931-229e-42cf-b5f9-e91bcc1f7332"; // The unique stream key that allows you to stream videos.
    String name = "My Video"; // You can filter live streams by their name or a part of their name.
    String sortBy = "createdAt"; // Allowed: createdAt, publishedAt, name. createdAt - the time a livestream was created using the specified streamKey. publishedAt - the time a livestream was published using the specified streamKey. name - the name of the livestream. If you choose one of the time based options, the time is presented in ISO-8601 format.
    String sortOrder = "desc"; // Allowed: asc, desc. Ascending for date and time means that earlier values precede later ones. Descending means that later values preced earlier ones. For title, it is 0-9 and A-Z ascending and Z-A, 9-0 descending.
    Integer currentPage = 1; // Choose the number of search results to return per page. Minimum value: 1
    Integer pageSize = 25; // Results per page. Allowed values 1-100, default is 25.

    try {
      Page<LiveStream> result = apiInstance.list()
            .streamKey(streamKey)
            .name(name)
            .sortBy(sortBy)
            .sortOrder(sortOrder)
            .currentPage(currentPage)
            .pageSize(pageSize)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveStreamsApi#list");
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
 **streamKey** | **String**| The unique stream key that allows you to stream videos. | [optional]
 **name** | **String**| You can filter live streams by their name or a part of their name. | [optional]
 **sortBy** | **String**| Allowed: createdAt, publishedAt, name. createdAt - the time a livestream was created using the specified streamKey. publishedAt - the time a livestream was published using the specified streamKey. name - the name of the livestream. If you choose one of the time based options, the time is presented in ISO-8601 format. | [optional]
 **sortOrder** | **String**| Allowed: asc, desc. Ascending for date and time means that earlier values precede later ones. Descending means that later values preced earlier ones. For title, it is 0-9 and A-Z ascending and Z-A, 9-0 descending. | [optional] [enum: asc, desc]
 **currentPage** | **Integer**| Choose the number of search results to return per page. Minimum value: 1 | [optional] [default to 1]
 **pageSize** | **Integer**| Results per page. Allowed values 1-100, default is 25. | [optional] [default to 25]

### Return type

[**Page**](pagination.md)<[**LiveStream**](LiveStream.md)>


### Authorization

[API token](../README.md#api-token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="get"></a>
# **get**
> LiveStream get(liveStreamId)

Show live stream

Supply a LivestreamId, and you'll get all the details for streaming into, and watching the livestream.

### Example
```java
// Import classes:
import video.api.client.ApiVideoClient;
import video.api.client.api.ApiException;
import video.api.client.api.models.*;
import video.api.client.api.clients.LiveStreamsApi;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiVideoClient client = new ApiVideoClient("YOUR_API_TOKEN");
    // if you rather like to use the sandbox environment:
    // ApiVideoClient client = new ApiVideoClient("YOU_SANDBOX_API_TOKEN", ApiVideoClient.Environment.SANDBOX);

    LiveStreamsApi apiInstance = client.liveStreams();
    
    String liveStreamId = "li400mYKSgQ6xs7taUeSaEKr"; // The unique ID for the live stream you want to watch.

    try {
      LiveStream result = apiInstance.get(liveStreamId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveStreamsApi#get");
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
 **liveStreamId** | **String**| The unique ID for the live stream you want to watch. |

### Return type


[**LiveStream**](LiveStream.md)

### Authorization

[API token](../README.md#api-token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="update"></a>
# **update**
> LiveStream update(liveStreamId, liveStreamUpdatePayload)

Update a live stream

Use this endpoint to update the player, or to turn recording on/off (saving a copy of the livestream). NOTE: If the livestream is actively streaming, changing the recording status will only affect the NEXT stream.    The public=false 'private livestream' is available as a BETA feature, and should be limited to livestreams of 3,000 viewers or fewer.

### Example
```java
// Import classes:
import video.api.client.ApiVideoClient;
import video.api.client.api.ApiException;
import video.api.client.api.models.*;
import video.api.client.api.clients.LiveStreamsApi;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiVideoClient client = new ApiVideoClient("YOUR_API_TOKEN");
    // if you rather like to use the sandbox environment:
    // ApiVideoClient client = new ApiVideoClient("YOU_SANDBOX_API_TOKEN", ApiVideoClient.Environment.SANDBOX);

    LiveStreamsApi apiInstance = client.liveStreams();
    
    String liveStreamId = "li400mYKSgQ6xs7taUeSaEKr"; // The unique ID for the live stream that you want to update information for such as player details, or whether you want the recording on or off.
    LiveStreamUpdatePayload liveStreamUpdatePayload = new LiveStreamUpdatePayload(); // 
    liveStreamUpdatePayload.setName("My Live Stream Video"); // The name you want to use for your live stream.
    liveStreamUpdatePayload.setPublic(); // BETA FEATURE Please limit all public &#x3D; false (&quot;private&quot;) livestreams to 3,000 users.
Whether your video can be viewed by everyone, or requires authentication to see it. A setting of false will require a unique token for each view.
    liveStreamUpdatePayload.setRecord(true); // Use this to indicate whether you want the recording on or off. On is true, off is false.
    liveStreamUpdatePayload.setPlayerId("pl45KFKdlddgk654dspkze"); // The unique ID for the player associated with a live stream that you want to update.


    try {
      LiveStream result = apiInstance.update(liveStreamId, liveStreamUpdatePayload);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveStreamsApi#update");
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
 **liveStreamId** | **String**| The unique ID for the live stream that you want to update information for such as player details, or whether you want the recording on or off. |
 **liveStreamUpdatePayload** | [**LiveStreamUpdatePayload**](LiveStreamUpdatePayload.md)|  | [optional]

### Return type


[**LiveStream**](LiveStream.md)

### Authorization

[API token](../README.md#api-token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Bad Request |  -  |

<a name="create"></a>
# **create**
> LiveStream create(liveStreamCreatePayload)

Create live stream

A live stream will give you the 'connection point' to RTMP your video stream to api.video. It will also give you the details for viewers to watch the same livestream.  The public=false 'private livestream' is available as a BETA feature, and should be limited to livestreams of 3,000 viewers or fewer.  See our [Live Stream Tutorial](https://api.video/blog/tutorials/live-stream-tutorial) for a walkthrough of this API with OBS. Your RTMP endpoint for the livestream is rtmp://broadcast.api.video/s/{streamKey}

### Example
```java
// Import classes:
import video.api.client.ApiVideoClient;
import video.api.client.api.ApiException;
import video.api.client.api.models.*;
import video.api.client.api.clients.LiveStreamsApi;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiVideoClient client = new ApiVideoClient("YOUR_API_TOKEN");
    // if you rather like to use the sandbox environment:
    // ApiVideoClient client = new ApiVideoClient("YOU_SANDBOX_API_TOKEN", ApiVideoClient.Environment.SANDBOX);

    LiveStreamsApi apiInstance = client.liveStreams();
    
    LiveStreamCreatePayload liveStreamCreatePayload = new LiveStreamCreatePayload(); // 
    liveStreamCreatePayload.setName("My Live Stream Video"); // Add a name for your live stream here.
    liveStreamCreatePayload.setRecord(true); // Whether you are recording or not. True for record, false for not record.
    liveStreamCreatePayload.setPublic(); // BETA FEATURE Please limit all public &#x3D; false (&quot;private&quot;) livestreams to 3,000 users. Whether your video can be viewed by everyone, or requires authentication to see it. A setting of false will require a unique token for each view.
    liveStreamCreatePayload.setPlayerId("pl4f4ferf5erfr5zed4fsdd"); // The unique identifier for the player.


    try {
      LiveStream result = apiInstance.create(liveStreamCreatePayload);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveStreamsApi#create");
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
 **liveStreamCreatePayload** | [**LiveStreamCreatePayload**](LiveStreamCreatePayload.md)|  | [optional]

### Return type


[**LiveStream**](LiveStream.md)

### Authorization

[API token](../README.md#api-token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Bad Request |  -  |

<a name="uploadThumbnail"></a>
# **uploadThumbnail**
> LiveStream uploadThumbnail(liveStreamId, file)

Upload a thumbnail

Upload an image to use as a backdrop for your livestream.

### Example
```java
// Import classes:
import video.api.client.ApiVideoClient;
import video.api.client.api.ApiException;
import video.api.client.api.models.*;
import video.api.client.api.clients.LiveStreamsApi;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiVideoClient client = new ApiVideoClient("YOUR_API_TOKEN");
    // if you rather like to use the sandbox environment:
    // ApiVideoClient client = new ApiVideoClient("YOU_SANDBOX_API_TOKEN", ApiVideoClient.Environment.SANDBOX);

    LiveStreamsApi apiInstance = client.liveStreams();
    
    String liveStreamId = "vi4k0jvEUuaTdRAEjQ4Jfrgz"; // The unique ID for the live stream you want to upload.
    File file = new File("/path/to/file"); // The image to be added as a thumbnail.

    try {
      LiveStream result = apiInstance.uploadThumbnail(liveStreamId, file);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveStreamsApi#uploadThumbnail");
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
 **liveStreamId** | **String**| The unique ID for the live stream you want to upload. |
 **file** | **File**| The image to be added as a thumbnail. |

### Return type


[**LiveStream**](LiveStream.md)

### Authorization

[API token](../README.md#api-token)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Created |  -  |
**400** | Bad Request |  -  |
**404** | Not Found |  -  |

