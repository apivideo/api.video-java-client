# UploadTokensApi

All URIs are relative to *https://ws.api.video*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createToken**](UploadTokensApi.md#createToken) | **POST** /upload-tokens | Generate an upload token
[**getToken**](UploadTokensApi.md#getToken) | **GET** /upload-tokens/{uploadToken} | Retrieve upload token
[**deleteToken**](UploadTokensApi.md#deleteToken) | **DELETE** /upload-tokens/{uploadToken} | Delete an upload token
[**list**](UploadTokensApi.md#list) | **GET** /upload-tokens | List all active upload tokens


<a name="createToken"></a>
# **createToken**
> UploadToken createToken(tokenCreationPayload)
> okhttp3.Call createTokenAsync(tokenCreationPayload, callback)
> ApiResponse<UploadToken> createTokenWithHttpInfo(tokenCreationPayload)

Generate an upload token

Generates an upload token that can be used to replace the API Key. More information can be found [here](https://docs.api.video/vod/delegated-upload-tokens)

### Example
```java
// Import classes:
import video.api.client.ApiVideoClient;
import video.api.client.api.ApiException;
import video.api.client.api.models.*;
import video.api.client.api.clients.UploadTokensApi;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiVideoClient client = new ApiVideoClient("YOUR_API_KEY");
    // if you rather like to use the sandbox environment:
    // ApiVideoClient client = new ApiVideoClient("YOUR_SANDBOX_API_KEY", Environment.SANDBOX);

    UploadTokensApi apiInstance = client.uploadTokens();
    
    TokenCreationPayload tokenCreationPayload = new TokenCreationPayload(); // 
    tokenCreationPayload.setTtl(); // Time in seconds that the token will be active. A value of 0 means that the token has no exipration date. The default is to have no expiration.


    try {
      UploadToken result = apiInstance.createToken(tokenCreationPayload);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UploadTokensApi#createToken");
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
 **tokenCreationPayload** | [**TokenCreationPayload**](TokenCreationPayload.md)|  |

### Return type


[**UploadToken**](UploadToken.md)

### Authorization

[API key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  * X-RateLimit-Limit - The request limit per minute. <br>  * X-RateLimit-Remaining - The number of available requests left for the current time window. <br>  * X-RateLimit-Retry-After - The number of seconds left until the current rate limit window resets. <br>  |
**400** | Bad Request |  * X-RateLimit-Limit - The request limit per minute. <br>  * X-RateLimit-Remaining - The number of available requests left for the current time window. <br>  * X-RateLimit-Retry-After - The number of seconds left until the current rate limit window resets. <br>  |
**429** | Too Many Requests |  * X-RateLimit-Limit - The request limit per minute. <br>  * X-RateLimit-Remaining - The number of available requests left for the current time window. <br>  * X-RateLimit-Retry-After - The number of seconds left until the current rate limit window resets. <br>  |

<a name="getToken"></a>
# **getToken**
> UploadToken getToken(uploadToken)
> okhttp3.Call getTokenAsync(uploadToken, callback)
> ApiResponse<UploadToken> getTokenWithHttpInfo(uploadToken)

Retrieve upload token

Retrieve details about a specific upload token by id.

### Example
```java
// Import classes:
import video.api.client.ApiVideoClient;
import video.api.client.api.ApiException;
import video.api.client.api.models.*;
import video.api.client.api.clients.UploadTokensApi;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiVideoClient client = new ApiVideoClient("YOUR_API_KEY");
    // if you rather like to use the sandbox environment:
    // ApiVideoClient client = new ApiVideoClient("YOUR_SANDBOX_API_KEY", Environment.SANDBOX);

    UploadTokensApi apiInstance = client.uploadTokens();
    
    String uploadToken = "to1tcmSFHeYY5KzyhOqVKMKb"; // The unique identifier for the token you want information about.

    try {
      UploadToken result = apiInstance.getToken(uploadToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UploadTokensApi#getToken");
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
 **uploadToken** | **String**| The unique identifier for the token you want information about. |

### Return type


[**UploadToken**](UploadToken.md)

### Authorization

[API key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  * X-RateLimit-Limit - The request limit per minute. <br>  * X-RateLimit-Remaining - The number of available requests left for the current time window. <br>  * X-RateLimit-Retry-After - The number of seconds left until the current rate limit window resets. <br>  |
**404** | Not Found |  * X-RateLimit-Limit - The request limit per minute. <br>  * X-RateLimit-Remaining - The number of available requests left for the current time window. <br>  * X-RateLimit-Retry-After - The number of seconds left until the current rate limit window resets. <br>  |
**429** | Too Many Requests |  * X-RateLimit-Limit - The request limit per minute. <br>  * X-RateLimit-Remaining - The number of available requests left for the current time window. <br>  * X-RateLimit-Retry-After - The number of seconds left until the current rate limit window resets. <br>  |

<a name="deleteToken"></a>
# **deleteToken**
> deleteToken(uploadToken)
> okhttp3.Call deleteTokenAsync(uploadToken, callback)
> ApiResponse<Void> deleteTokenWithHttpInfo(uploadToken)

Delete an upload token

Delete an existing upload token. This is especially useful for tokens you may have created that do not expire.

### Example
```java
// Import classes:
import video.api.client.ApiVideoClient;
import video.api.client.api.ApiException;
import video.api.client.api.models.*;
import video.api.client.api.clients.UploadTokensApi;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiVideoClient client = new ApiVideoClient("YOUR_API_KEY");
    // if you rather like to use the sandbox environment:
    // ApiVideoClient client = new ApiVideoClient("YOUR_SANDBOX_API_KEY", Environment.SANDBOX);

    UploadTokensApi apiInstance = client.uploadTokens();
    
    String uploadToken = "to1tcmSFHeYY5KzyhOqVKMKb"; // The unique identifier for the upload token you want to delete. Deleting a token will make it so the token can no longer be used for authentication.

    try {
      apiInstance.deleteToken(uploadToken);
    } catch (ApiException e) {
      System.err.println("Exception when calling UploadTokensApi#deleteToken");
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
 **uploadToken** | **String**| The unique identifier for the upload token you want to delete. Deleting a token will make it so the token can no longer be used for authentication. |

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
**204** | No Content |  * X-RateLimit-Limit - The request limit per minute. <br>  * X-RateLimit-Remaining - The number of available requests left for the current time window. <br>  * X-RateLimit-Retry-After - The number of seconds left until the current rate limit window resets. <br>  |
**404** | Not Found |  * X-RateLimit-Limit - The request limit per minute. <br>  * X-RateLimit-Remaining - The number of available requests left for the current time window. <br>  * X-RateLimit-Retry-After - The number of seconds left until the current rate limit window resets. <br>  |
**429** | Too Many Requests |  * X-RateLimit-Limit - The request limit per minute. <br>  * X-RateLimit-Remaining - The number of available requests left for the current time window. <br>  * X-RateLimit-Retry-After - The number of seconds left until the current rate limit window resets. <br>  |

<a name="list"></a>
# **list**
> TokenListResponse list().sortBy(sortBy).sortOrder(sortOrder).currentPage(currentPage).pageSize(pageSize).execute()
> okhttp3.Call executeAsync(callback) 
> ApiResponse<TokenListResponse> executeWithHttpInfo()

List all active upload tokens

Retrieve a list of all currently active delegated tokens.

### Example
```java
// Import classes:
import video.api.client.ApiVideoClient;
import video.api.client.api.ApiException;
import video.api.client.api.models.*;
import video.api.client.api.clients.UploadTokensApi;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiVideoClient client = new ApiVideoClient("YOUR_API_KEY");
    // if you rather like to use the sandbox environment:
    // ApiVideoClient client = new ApiVideoClient("YOUR_SANDBOX_API_KEY", Environment.SANDBOX);

    UploadTokensApi apiInstance = client.uploadTokens();
    
    String sortBy = "createdAt"; // Allowed: createdAt, ttl. You can use these to sort by when a token was created, or how much longer the token will be active (ttl - time to live). Date and time is presented in ATOM UTC format.
    String sortOrder = "asc"; // Allowed: asc, desc. Ascending is 0-9 or A-Z. Descending is 9-0 or Z-A.
    Integer currentPage = 1; // Choose the number of search results to return per page. Minimum value: 1
    Integer pageSize = 25; // Results per page. Allowed values 1-100, default is 25.

    try {
      Page<UploadToken> result = apiInstance.list()
            .sortBy(sortBy)
            .sortOrder(sortOrder)
            .currentPage(currentPage)
            .pageSize(pageSize)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UploadTokensApi#list");
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
 **sortBy** | **String**| Allowed: createdAt, ttl. You can use these to sort by when a token was created, or how much longer the token will be active (ttl - time to live). Date and time is presented in ATOM UTC format. | [optional] [enum: createdAt, ttl]
 **sortOrder** | **String**| Allowed: asc, desc. Ascending is 0-9 or A-Z. Descending is 9-0 or Z-A. | [optional] [enum: asc, desc]
 **currentPage** | **Integer**| Choose the number of search results to return per page. Minimum value: 1 | [optional] [default to 1]
 **pageSize** | **Integer**| Results per page. Allowed values 1-100, default is 25. | [optional] [default to 25]

### Return type

[**Page**](pagination.md)<[**UploadToken**](UploadToken.md)>


### Authorization

[API key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  * X-RateLimit-Limit - The request limit per minute. <br>  * X-RateLimit-Remaining - The number of available requests left for the current time window. <br>  * X-RateLimit-Retry-After - The number of seconds left until the current rate limit window resets. <br>  |
**429** | Too Many Requests |  * X-RateLimit-Limit - The request limit per minute. <br>  * X-RateLimit-Remaining - The number of available requests left for the current time window. <br>  * X-RateLimit-Retry-After - The number of seconds left until the current rate limit window resets. <br>  |

