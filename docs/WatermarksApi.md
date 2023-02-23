# WatermarksApi

All URIs are relative to *https://ws.api.video*

Method | HTTP request | Description
------------- | ------------- | -------------
[**upload**](WatermarksApi.md#upload) | **POST** /watermarks | Upload a watermark
[**delete**](WatermarksApi.md#delete) | **DELETE** /watermarks/{watermarkId} | Delete a watermark
[**list**](WatermarksApi.md#list) | **GET** /watermarks | List all watermarks


<a name="upload"></a>
# **upload**
> Watermark upload(file)

Upload a watermark

Create a new watermark by uploading a `JPG` or a `PNG` image. A watermark is a static image, directly burnt into a video. After you have created your watermark, you can define its placement and aspect when you [create a video](https://docs.api.video/reference/post-video).

### Example
```java
import video.api.client.ApiVideoClient;
import video.api.client.api.ApiException;
import video.api.client.api.models.*;
import video.api.client.api.clients.WatermarksApi;
import java.util.*;

public class Example {
 public static void main(String[] args) {
   ApiVideoClient client = new ApiVideoClient("YOUR_API_KEY");
   // if you rather like to use the sandbox environment:
   // ApiVideoClient client = new ApiVideoClient("YOUR_SANDBOX_API_KEY", ApiVideoClient.Environment.SANDBOX);

   WatermarksApi watermarkApi = apiClient.watermarks();

   File file = new File("/path/to/file"); // The watermark image.

   try {
     Watermark result = watermarkApi.upload(file);
     System.out.println(result);
   } catch (ApiException e) {
     System.err.println("Exception when calling WatermarksApi#upload");
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
 **file** | **File**| The &#x60;.jpg&#x60; or &#x60;.png&#x60; image to be added as a watermark. |

### Return type


[**Watermark**](Watermark.md)

### Authorization

[API key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Bad Request |  -  |

<a name="delete"></a>
# **delete**
> delete(watermarkId)

Delete a watermark

Delete a watermark. A watermark is a static image, directly burnt-into a video.

### Example
```java
// Import classes:
import video.api.client.ApiVideoClient;
import video.api.client.api.ApiException;
import video.api.client.api.models.*;
import video.api.client.api.clients.WatermarksApi;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiVideoClient client = new ApiVideoClient("YOUR_API_KEY");
    // if you rather like to use the sandbox environment:
    // ApiVideoClient client = new ApiVideoClient("YOUR_SANDBOX_API_KEY", Environment.SANDBOX);

    WatermarksApi apiInstance = client.watermarks();
    
    String watermarkId = "watermark_1BWr2L5MTQwxGkuxKjzh6i"; // The watermark ID for the watermark you want to delete.

    try {
      apiInstance.delete(watermarkId);
    } catch (ApiException e) {
      System.err.println("Exception when calling WatermarksApi#delete");
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
 **watermarkId** | **String**| The watermark ID for the watermark you want to delete. |

### Return type


null (empty response body)

### Authorization

[API key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | No Content |  -  |
**404** | Not Found |  -  |

<a name="list"></a>
# **list**
> WatermarksListResponse list().sortBy(sortBy).sortOrder(sortOrder).currentPage(currentPage).pageSize(pageSize).execute();

List all watermarks

List all watermarks. A watermark is a static image, directly burnt into a video. After you have created your watermark, you can define its placement and aspect when you [create a video](https://docs.api.video/reference/post-video).

### Example
```java
// Import classes:
import video.api.client.ApiVideoClient;
import video.api.client.api.ApiException;
import video.api.client.api.models.*;
import video.api.client.api.clients.WatermarksApi;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiVideoClient client = new ApiVideoClient("YOUR_API_KEY");
    // if you rather like to use the sandbox environment:
    // ApiVideoClient client = new ApiVideoClient("YOUR_SANDBOX_API_KEY", Environment.SANDBOX);

    WatermarksApi apiInstance = client.watermarks();
    
    String sortBy = "createdAt"; // Allowed: createdAt. You can search by the time watermark were created at.
    String sortOrder = "asc"; // Allowed: asc, desc. asc is ascending and sorts from A to Z. desc is descending and sorts from Z to A.
    Integer currentPage = 1; // Choose the number of search results to return per page. Minimum value: 1
    Integer pageSize = 25; // Results per page. Allowed values 1-100, default is 25.

    try {
      Page<Watermark> result = apiInstance.list()
            .sortBy(sortBy)
            .sortOrder(sortOrder)
            .currentPage(currentPage)
            .pageSize(pageSize)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WatermarksApi#list");
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
 **sortBy** | **String**| Allowed: createdAt. You can search by the time watermark were created at. | [optional]
 **sortOrder** | **String**| Allowed: asc, desc. asc is ascending and sorts from A to Z. desc is descending and sorts from Z to A. | [optional]
 **currentPage** | **Integer**| Choose the number of search results to return per page. Minimum value: 1 | [optional] [default to 1]
 **pageSize** | **Integer**| Results per page. Allowed values 1-100, default is 25. | [optional] [default to 25]

### Return type

[**Page**](pagination.md)<[**Watermark**](Watermark.md)>


### Authorization

[API key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Bad Request |  -  |

