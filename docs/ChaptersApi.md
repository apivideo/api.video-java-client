# ChaptersApi

All URIs are relative to *https://ws.api.video*

Method | HTTP request | Description
------------- | ------------- | -------------
[**delete**](ChaptersApi.md#delete) | **DELETE** /videos/{videoId}/chapters/{language} | Delete a chapter
[**list**](ChaptersApi.md#list) | **GET** /videos/{videoId}/chapters | List video chapters
[**get**](ChaptersApi.md#get) | **GET** /videos/{videoId}/chapters/{language} | Show a chapter
[**upload**](ChaptersApi.md#upload) | **POST** /videos/{videoId}/chapters/{language} | Upload a chapter


<a name="delete"></a>
# **delete**
> delete(videoId, language)

Delete a chapter

### Example
```java
// Import classes:
import video.api.client.ApiVideoClient;
import video.api.client.api.ApiException;
import video.api.client.api.models.*;
import video.api.client.api.clients.ChaptersApi;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiVideoClient client = new ApiVideoClient("YOUR_API_TOKEN");
    // if you rather like to use the sandbox environment:
    // ApiVideoClient client = new ApiVideoClient("YOU_SANDBOX_API_TOKEN", ApiVideoClient.Environment.SANDBOX);

    ChaptersApi apiInstance = client.chapters();
    
    String videoId = "vi4k0jvEUuaTdRAEjQ4Jfrgz"; // The unique identifier for the video you want to delete a chapter from. 
    String language = "en"; // A valid [BCP 47](https://github.com/libyal/libfwnt/wiki/Language-Code-identifiers) language representation.

    try {
      apiInstance.delete(videoId, language);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChaptersApi#delete");
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
 **videoId** | **String**| The unique identifier for the video you want to delete a chapter from.  |
 **language** | **String**| A valid [BCP 47](https://github.com/libyal/libfwnt/wiki/Language-Code-identifiers) language representation. |

### Return type


null (empty response body)

### Authorization

[API token](../README.md#api-token)

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
> ChaptersListResponse list(videoId).currentPage(currentPage).pageSize(pageSize).execute();

List video chapters

Retrieve a list of all chapters for a specified video.

### Example
```java
// Import classes:
import video.api.client.ApiVideoClient;
import video.api.client.api.ApiException;
import video.api.client.api.models.*;
import video.api.client.api.clients.ChaptersApi;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiVideoClient client = new ApiVideoClient("YOUR_API_TOKEN");
    // if you rather like to use the sandbox environment:
    // ApiVideoClient client = new ApiVideoClient("YOU_SANDBOX_API_TOKEN", ApiVideoClient.Environment.SANDBOX);

    ChaptersApi apiInstance = client.chapters();
    
    String videoId = "vi4k0jvEUuaTdRAEjQ4Jfrgz"; // The unique identifier for the video you want to retrieve a list of chapters for.
    Integer currentPage = 1; // Choose the number of search results to return per page. Minimum value: 1
    Integer pageSize = 25; // Results per page. Allowed values 1-100, default is 25.

    try {
      Page<Chapter> result = apiInstance.list(videoId)
            .currentPage(currentPage)
            .pageSize(pageSize)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChaptersApi#list");
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
 **videoId** | **String**| The unique identifier for the video you want to retrieve a list of chapters for. |
 **currentPage** | **Integer**| Choose the number of search results to return per page. Minimum value: 1 | [optional] [default to 1]
 **pageSize** | **Integer**| Results per page. Allowed values 1-100, default is 25. | [optional] [default to 25]

### Return type

[**Page**](pagination.md)<[**Chapter**](Chapter.md)>


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

<a name="get"></a>
# **get**
> Chapter get(videoId, language)

Show a chapter

### Example
```java
// Import classes:
import video.api.client.ApiVideoClient;
import video.api.client.api.ApiException;
import video.api.client.api.models.*;
import video.api.client.api.clients.ChaptersApi;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiVideoClient client = new ApiVideoClient("YOUR_API_TOKEN");
    // if you rather like to use the sandbox environment:
    // ApiVideoClient client = new ApiVideoClient("YOU_SANDBOX_API_TOKEN", ApiVideoClient.Environment.SANDBOX);

    ChaptersApi apiInstance = client.chapters();
    
    String videoId = "vi4k0jvEUuaTdRAEjQ4Jfrgz"; // The unique identifier for the video you want to show a chapter for.
    String language = "en"; // A valid [BCP 47](https://github.com/libyal/libfwnt/wiki/Language-Code-identifiers) language representation.

    try {
      Chapter result = apiInstance.get(videoId, language);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChaptersApi#get");
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
 **videoId** | **String**| The unique identifier for the video you want to show a chapter for. |
 **language** | **String**| A valid [BCP 47](https://github.com/libyal/libfwnt/wiki/Language-Code-identifiers) language representation. |

### Return type


[**Chapter**](Chapter.md)

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

<a name="upload"></a>
# **upload**
> Chapter upload(videoId, language, file)

Upload a chapter

Chapters help break the video into sections. Read our [tutorial](https://api.video/blog/tutorials/adding-chapters-to-your-videos) for more details.

### Example
```java
// Import classes:
import video.api.client.ApiVideoClient;
import video.api.client.api.ApiException;
import video.api.client.api.models.*;
import video.api.client.api.clients.ChaptersApi;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiVideoClient client = new ApiVideoClient("YOUR_API_TOKEN");
    // if you rather like to use the sandbox environment:
    // ApiVideoClient client = new ApiVideoClient("YOU_SANDBOX_API_TOKEN", ApiVideoClient.Environment.SANDBOX);

    ChaptersApi apiInstance = client.chapters();
    
    String videoId = "vi4k0jvEUuaTdRAEjQ4Jfrgz"; // The unique identifier for the video you want to upload a chapter for.
    String language = "en"; // A valid [BCP 47](https://github.com/libyal/libfwnt/wiki/Language-Code-identifiers) language representation.
    File file = new File("/path/to/file"); // The VTT file describing the chapters you want to upload.

    try {
      Chapter result = apiInstance.upload(videoId, language, file);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChaptersApi#upload");
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
 **videoId** | **String**| The unique identifier for the video you want to upload a chapter for. |
 **language** | **String**| A valid [BCP 47](https://github.com/libyal/libfwnt/wiki/Language-Code-identifiers) language representation. |
 **file** | **File**| The VTT file describing the chapters you want to upload. |

### Return type


[**Chapter**](Chapter.md)

### Authorization

[API token](../README.md#api-token)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Bad Request |  -  |
**404** | Not Found |  -  |

