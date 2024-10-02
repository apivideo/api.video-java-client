# TagsApi

All URIs are relative to *https://ws.api.video*

Method | HTTP request | Description
------------- | ------------- | -------------
[**list**](TagsApi.md#list) | **GET** /tags | List all video tags


<a name="list"></a>
# **list**
> ListTagsResponse list().value(value).sortBy(sortBy).sortOrder(sortOrder).currentPage(currentPage).pageSize(pageSize).execute()
> okhttp3.Call executeAsync(callback) 
> ApiResponse<ListTagsResponse> executeWithHttpInfo()

List all video tags

This endpoint enables you to search for video tags in a project and see how many videos are tagged with them. If you do not define any query parameters, the endpoint lists all video tags and the numbers of times they are used in a project.

### Example
```java
// Import classes:
import video.api.client.ApiVideoClient;
import video.api.client.api.ApiException;
import video.api.client.api.models.*;
import video.api.client.api.clients.TagsApi;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiVideoClient client = new ApiVideoClient();
    // if you rather like to use the sandbox environment:
    // ApiVideoClient client = new ApiVideoClient(Environment.SANDBOX);

    TagsApi apiInstance = client.tags();
    
    String value = "value_example"; // Use this parameter to search for specific video tags. The API filters results even on partial values, and ignores accents, uppercase, and lowercase. 
    String sortBy = "value"; // Use this parameter to choose which field the API will use to sort the response data. The default is `value`.  These are the available fields to sort by:  - `value`: Sorts the results based on tag values in alphabetic order. - `videoCount`: Sorts the results based on the number of times a video tag is used. 
    String sortOrder = "asc"; // Use this parameter to sort results. `asc` is ascending and sorts from A to Z. `desc` is descending and sorts from Z to A.
    Integer currentPage = 1; // Choose the number of search results to return per page. Minimum value: 1
    Integer pageSize = 25; // Results per page. Allowed values 1-100, default is 25.

    try {
      Page<ListTagsResponseData> result = apiInstance.list()
            .value(value)
            .sortBy(sortBy)
            .sortOrder(sortOrder)
            .currentPage(currentPage)
            .pageSize(pageSize)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TagsApi#list");
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
 **value** | **String**| Use this parameter to search for specific video tags. The API filters results even on partial values, and ignores accents, uppercase, and lowercase.  | [optional]
 **sortBy** | **String**| Use this parameter to choose which field the API will use to sort the response data. The default is &#x60;value&#x60;.  These are the available fields to sort by:  - &#x60;value&#x60;: Sorts the results based on tag values in alphabetic order. - &#x60;videoCount&#x60;: Sorts the results based on the number of times a video tag is used.  | [optional] [enum: value, videoCount]
 **sortOrder** | **String**| Use this parameter to sort results. &#x60;asc&#x60; is ascending and sorts from A to Z. &#x60;desc&#x60; is descending and sorts from Z to A. | [optional] [enum: asc, desc]
 **currentPage** | **Integer**| Choose the number of search results to return per page. Minimum value: 1 | [optional] [default to 1]
 **pageSize** | **Integer**| Results per page. Allowed values 1-100, default is 25. | [optional] [default to 25]

### Return type

[**Page**](pagination.md)<[**ListTagsResponseData**](ListTagsResponseData.md)>


### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  * X-RateLimit-Limit - The request limit per minute. <br>  * X-RateLimit-Remaining - The number of available requests left for the current time window. <br>  * X-RateLimit-Retry-After - The number of seconds left until the current rate limit window resets. <br>  |
**429** | Too Many Requests |  * X-RateLimit-Limit - The request limit per minute. <br>  * X-RateLimit-Remaining - The number of available requests left for the current time window. <br>  * X-RateLimit-Retry-After - The number of seconds left until the current rate limit window resets. <br>  |

