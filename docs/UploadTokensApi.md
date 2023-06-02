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

Generate an upload token

Generates an upload token that can be used to replace the API Key. More information can be found [here](https://docs.api.video/reference/upload-tokens)

### Example
```java
import video.api.client.ApiVideoClient;
import video.api.client.api.ApiException;
import video.api.client.api.models.*;
import video.api.client.api.clients.UploadTokensApi;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiVideoClient client = new ApiVideoClient("YOUR_API_KEY");
    // if you rather like to use the sandbox environment:
    // ApiVideoClient client = new ApiVideoClient("YOUR_SANDBOX_API_KEY", ApiVideoClient.Environment.SANDBOX);

    UploadTokensApi apiInstance = client.uploadTokens();
    
    TokenCreationPayload tokenCreationPayload = new TokenCreationPayload(); // 
    tokenCreationPayload.setTtl(); // Time in seconds that the token will be active. A value of 0 means that the token has no expiration date. The default is to have no expiration.


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
**200** | Success |  -  |
**400** | Bad Request |  -  |

<a name="getToken"></a>
# **getToken**
> UploadToken getToken(uploadToken)

Retrieve upload token

Retrieve details about a specific upload token by id.

### Example
```java
import video.api.client.ApiVideoClient;
import video.api.client.api.ApiException;
import video.api.client.api.models.*;
import video.api.client.api.clients.UploadTokensApi;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiVideoClient client = new ApiVideoClient("YOUR_API_KEY");
    // if you rather like to use the sandbox environment:
    // ApiVideoClient client = new ApiVideoClient("YOUR_SANDBOX_API_KEY", ApiVideoClient.Environment.SANDBOX);

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
**200** | Success |  -  |
**404** | Not Found |  -  |

<a name="deleteToken"></a>
# **deleteToken**
> deleteToken(uploadToken)

Delete an upload token

Delete an existing upload token. This is especially useful for tokens you may have created that do not expire.

### Example
```java
import video.api.client.ApiVideoClient;
import video.api.client.api.ApiException;
import video.api.client.api.models.*;
import video.api.client.api.clients.UploadTokensApi;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiVideoClient client = new ApiVideoClient("YOUR_API_KEY");
    // if you rather like to use the sandbox environment:
    // ApiVideoClient client = new ApiVideoClient("YOUR_SANDBOX_API_KEY", ApiVideoClient.Environment.SANDBOX);

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
**204** | No Content |  -  |
**404** | Not Found |  -  |

<a name="list"></a>
# **list**
> TokenListResponse list().sortBy(sortBy).sortOrder(sortOrder).currentPage(currentPage).pageSize(pageSize).execute();

List all active upload tokens

Retrieve a list of all currently active delegated tokens.

### Example
```java
import video.api.client.ApiVideoClient;
import video.api.client.api.ApiException;
import video.api.client.api.models.*;
import video.api.client.api.clients.UploadTokensApi;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiVideoClient client = new ApiVideoClient("YOUR_API_KEY");
    // if you rather like to use the sandbox environment:
    // ApiVideoClient client = new ApiVideoClient("YOUR_SANDBOX_API_KEY", ApiVideoClient.Environment.SANDBOX);

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
 **sortBy** | **String**| Allowed: createdAt, ttl. You can use these to sort by when a token was created, or how much longer the token will be active (ttl - time to live). Date and time is presented in ISO-8601 format. | [optional] [enum: createdAt, ttl]
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
**200** | Success |  -  |

