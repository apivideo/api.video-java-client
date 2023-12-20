# LiveStreamsApi

All URIs are relative to *https://ws.api.video*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](LiveStreamsApi.md#create) | **POST** /live-streams | Create live stream
[**get**](LiveStreamsApi.md#get) | **GET** /live-streams/{liveStreamId} | Retrieve live stream
[**update**](LiveStreamsApi.md#update) | **PATCH** /live-streams/{liveStreamId} | Update a live stream
[**delete**](LiveStreamsApi.md#delete) | **DELETE** /live-streams/{liveStreamId} | Delete a live stream
[**list**](LiveStreamsApi.md#list) | **GET** /live-streams | List all live streams
[**uploadThumbnail**](LiveStreamsApi.md#uploadThumbnail) | **POST** /live-streams/{liveStreamId}/thumbnail | Upload a thumbnail
[**deleteThumbnail**](LiveStreamsApi.md#deleteThumbnail) | **DELETE** /live-streams/{liveStreamId}/thumbnail | Delete a thumbnail


<a name="create"></a>
# **create**
> LiveStream create(liveStreamCreationPayload)

Create live stream

Creates a livestream object.

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
    ApiVideoClient client = new ApiVideoClient("YOUR_API_KEY");
    // if you rather like to use the sandbox environment:
    // ApiVideoClient client = new ApiVideoClient("YOUR_SANDBOX_API_KEY", Environment.SANDBOX);

    LiveStreamsApi apiInstance = client.liveStreams();
    
    LiveStreamCreationPayload liveStreamCreationPayload = new LiveStreamCreationPayload(); // 
    liveStreamCreationPayload.setName("My Live Stream Video"); // Add a name for your live stream here.
    liveStreamCreationPayload.setPublic(); // Whether your video can be viewed by everyone, or requires authentication to see it. A setting of false will require a unique token for each view. Learn more about the Private Video feature [here](https://docs.api.video/delivery-analytics/video-privacy-access-management).
    liveStreamCreationPayload.setPlayerId("pl4f4ferf5erfr5zed4fsdd"); // The unique identifier for the player.
    liveStreamCreationPayload.setRestreams(Collections.<RestreamsRequestObject>emptyList()); // Use this parameter to add, edit, or remove RTMP services where you want to restream a live stream. The list can only contain up to 5 destinations.


    try {
      LiveStream result = apiInstance.create(liveStreamCreationPayload);
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
 **liveStreamCreationPayload** | [**LiveStreamCreationPayload**](LiveStreamCreationPayload.md)|  |

### Return type


[**LiveStream**](LiveStream.md)

### Authorization

[API key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Bad Request |  -  |

<a name="get"></a>
# **get**
> LiveStream get(liveStreamId)

Retrieve live stream

Get a livestream by id.

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
    ApiVideoClient client = new ApiVideoClient("YOUR_API_KEY");
    // if you rather like to use the sandbox environment:
    // ApiVideoClient client = new ApiVideoClient("YOUR_SANDBOX_API_KEY", Environment.SANDBOX);

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

[API key](../README.md#api-key)

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

Updates the livestream object.

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
    ApiVideoClient client = new ApiVideoClient("YOUR_API_KEY");
    // if you rather like to use the sandbox environment:
    // ApiVideoClient client = new ApiVideoClient("YOUR_SANDBOX_API_KEY", Environment.SANDBOX);

    LiveStreamsApi apiInstance = client.liveStreams();
    
    String liveStreamId = "li400mYKSgQ6xs7taUeSaEKr"; // The unique ID for the live stream that you want to update information for such as player details.
    LiveStreamUpdatePayload liveStreamUpdatePayload = new LiveStreamUpdatePayload(); // 
    liveStreamUpdatePayload.setName("My Live Stream Video"); // The name you want to use for your live stream.
    liveStreamUpdatePayload.setPublic(); // Whether your video can be viewed by everyone, or requires authentication to see it. A setting of false will require a unique token for each view. Learn more about the Private Video feature [here](https://docs.api.video/delivery-analytics/video-privacy-access-management).
    liveStreamUpdatePayload.setPlayerId("pl45KFKdlddgk654dspkze"); // The unique ID for the player associated with a live stream that you want to update.
    liveStreamUpdatePayload.setRestreams(Collections.<RestreamsRequestObject>emptyList()); // Use this parameter to add, edit, or remove RTMP services where you want to restream a live stream. The list can only contain up to 5 destinations. This operation updates all restream destinations in the same request. If you do not want to modify an existing restream destination, you need to include it in your request, otherwise it is removed.


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
 **liveStreamId** | **String**| The unique ID for the live stream that you want to update information for such as player details. |
 **liveStreamUpdatePayload** | [**LiveStreamUpdatePayload**](LiveStreamUpdatePayload.md)|  |

### Return type


[**LiveStream**](LiveStream.md)

### Authorization

[API key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Bad Request |  -  |

<a name="delete"></a>
# **delete**
> delete(liveStreamId)

Delete a live stream

If you do not need a live stream any longer, you can send a request to delete it. All you need is the liveStreamId.

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
    ApiVideoClient client = new ApiVideoClient("YOUR_API_KEY");
    // if you rather like to use the sandbox environment:
    // ApiVideoClient client = new ApiVideoClient("YOUR_SANDBOX_API_KEY", Environment.SANDBOX);

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

[API key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | No Content |  -  |

<a name="list"></a>
# **list**
> LiveStreamListResponse list().streamKey(streamKey).name(name).sortBy(sortBy).sortOrder(sortOrder).currentPage(currentPage).pageSize(pageSize).execute();

List all live streams

Get the list of livestreams on the workspace.

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
    ApiVideoClient client = new ApiVideoClient("YOUR_API_KEY");
    // if you rather like to use the sandbox environment:
    // ApiVideoClient client = new ApiVideoClient("YOUR_SANDBOX_API_KEY", Environment.SANDBOX);

    LiveStreamsApi apiInstance = client.liveStreams();
    
    String streamKey = "dw-dew8-q6w9-k67w-1ws8"; // The unique stream key that allows you to stream videos.
    String name = "My Video"; // You can filter live streams by their name or a part of their name.
    String sortBy = "name"; // Enables you to sort live stream results. Allowed attributes: `name`, `createdAt`, `updatedAt`. `name` - the name of the live stream. `createdAt` - the time a live stream was created. `updatedAt` - the time a live stream was last updated.  When using `createdAt` or `updatedAt`, the API sorts the results based on the ISO-8601 time format. 
    String sortOrder = "asc"; // Allowed: asc, desc. Ascending for date and time means that earlier values precede later ones. Descending means that later values preced earlier ones. For title, it is 0-9 and A-Z ascending and Z-A, 9-0 descending.
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
 **sortBy** | **String**| Enables you to sort live stream results. Allowed attributes: &#x60;name&#x60;, &#x60;createdAt&#x60;, &#x60;updatedAt&#x60;. &#x60;name&#x60; - the name of the live stream. &#x60;createdAt&#x60; - the time a live stream was created. &#x60;updatedAt&#x60; - the time a live stream was last updated.  When using &#x60;createdAt&#x60; or &#x60;updatedAt&#x60;, the API sorts the results based on the ISO-8601 time format.  | [optional] [enum: name, createdAt, updatedAt]
 **sortOrder** | **String**| Allowed: asc, desc. Ascending for date and time means that earlier values precede later ones. Descending means that later values preced earlier ones. For title, it is 0-9 and A-Z ascending and Z-A, 9-0 descending. | [optional] [enum: asc, desc]
 **currentPage** | **Integer**| Choose the number of search results to return per page. Minimum value: 1 | [optional] [default to 1]
 **pageSize** | **Integer**| Results per page. Allowed values 1-100, default is 25. | [optional] [default to 25]

### Return type

[**Page**](pagination.md)<[**LiveStream**](LiveStream.md)>


### Authorization

[API key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="uploadThumbnail"></a>
# **uploadThumbnail**
> LiveStream uploadThumbnail(liveStreamId, file)

Upload a thumbnail

Upload the thumbnail for the livestream.

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
    ApiVideoClient client = new ApiVideoClient("YOUR_API_KEY");
    // if you rather like to use the sandbox environment:
    // ApiVideoClient client = new ApiVideoClient("YOUR_SANDBOX_API_KEY", Environment.SANDBOX);

    LiveStreamsApi apiInstance = client.liveStreams();
    
    String liveStreamId = "vi4k0jvEUuaTdRAEjQ4Jfrgz"; // The unique ID for the live stream you want to upload.
    File file = new File("/path/to/file"); // The image to be added as a thumbnail. The mime type should be image/jpeg, image/png or image/webp. The max allowed size is 8 MiB.

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
 **file** | **File**| The image to be added as a thumbnail. The mime type should be image/jpeg, image/png or image/webp. The max allowed size is 8 MiB. |

### Return type


[**LiveStream**](LiveStream.md)

### Authorization

[API key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Created |  -  |
**400** | Bad Request |  -  |
**404** | Not Found |  -  |

<a name="deleteThumbnail"></a>
# **deleteThumbnail**
> LiveStream deleteThumbnail(liveStreamId)

Delete a thumbnail

Send the unique identifier for a live stream to delete its thumbnail.

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
    ApiVideoClient client = new ApiVideoClient("YOUR_API_KEY");
    // if you rather like to use the sandbox environment:
    // ApiVideoClient client = new ApiVideoClient("YOUR_SANDBOX_API_KEY", Environment.SANDBOX);

    LiveStreamsApi apiInstance = client.liveStreams();
    
    String liveStreamId = "li400mYKSgQ6xs7taUeSaEKr"; // The unique identifier of the live stream whose thumbnail you want to delete.

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
 **liveStreamId** | **String**| The unique identifier of the live stream whose thumbnail you want to delete. |

### Return type


[**LiveStream**](LiveStream.md)

### Authorization

[API key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**404** | Not Found |  -  |

