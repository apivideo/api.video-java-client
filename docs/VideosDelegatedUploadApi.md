# VideosDelegatedUploadApi

All URIs are relative to *https://ws.api.video*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteToken**](VideosDelegatedUploadApi.md#deleteToken) | **DELETE** /upload-tokens/{uploadToken} | Delete an upload token
[**listTokens**](VideosDelegatedUploadApi.md#listTokens) | **GET** /upload-tokens | List all active upload tokens.
[**getToken**](VideosDelegatedUploadApi.md#getToken) | **GET** /upload-tokens/{uploadToken} | Show upload token
[**upload**](VideosDelegatedUploadApi.md#upload) | **POST** /upload | Upload with an upload token
[**createToken**](VideosDelegatedUploadApi.md#createToken) | **POST** /upload-tokens | Generate an upload token


<a name="deleteToken"></a>
# **deleteToken**
> deleteToken(uploadToken)

Delete an upload token

Delete an existing upload token. This is especially useful for tokens you may have created that do not expire.

### Example
```java
// Import classes:
import video.api.client.ApiVideoClient;
import video.api.client.api.ApiException;
import video.api.client.api.models.*;
import video.api.client.api.clients.VideosDelegatedUploadApi;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiVideoClient client = new ApiVideoClient("YOUR_API_TOKEN");
    // if you rather like to use the sandbox environment:
    // ApiVideoClient client = new ApiVideoClient("YOU_SANDBOX_API_TOKEN", ApiVideoClient.Environment.SANDBOX);

    VideosDelegatedUploadApi apiInstance = client.videosDelegatedUpload();
    
    String uploadToken = "to1tcmSFHeYY5KzyhOqVKMKb"; // The unique identifier for the upload token you want to delete. Deleting a token will make it so the token can no longer be used for authentication.

    try {
      apiInstance.deleteToken(uploadToken);
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosDelegatedUploadApi#deleteToken");
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

[API token](../README.md#api-token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | No Content |  -  |
**404** | Not Found |  -  |

<a name="listTokens"></a>
# **listTokens**
> TokenListResponse listTokens().sortBy(sortBy).sortOrder(sortOrder).currentPage(currentPage).pageSize(pageSize).execute();

List all active upload tokens.

A delegated token is used to allow secure uploads without exposing your API key. Use this endpoint to retrieve a list of all currently active delegated tokens.

### Example
```java
// Import classes:
import video.api.client.ApiVideoClient;
import video.api.client.api.ApiException;
import video.api.client.api.models.*;
import video.api.client.api.clients.VideosDelegatedUploadApi;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiVideoClient client = new ApiVideoClient("YOUR_API_TOKEN");
    // if you rather like to use the sandbox environment:
    // ApiVideoClient client = new ApiVideoClient("YOU_SANDBOX_API_TOKEN", ApiVideoClient.Environment.SANDBOX);

    VideosDelegatedUploadApi apiInstance = client.videosDelegatedUpload();
    
    String sortBy = "ttl"; // Allowed: createdAt, ttl. You can use these to sort by when a token was created, or how much longer the token will be active (ttl - time to live). Date and time is presented in ISO-8601 format.
    String sortOrder = "asc"; // Allowed: asc, desc. Ascending is 0-9 or A-Z. Descending is 9-0 or Z-A.
    Integer currentPage = 1; // Choose the number of search results to return per page. Minimum value: 1
    Integer pageSize = 25; // Results per page. Allowed values 1-100, default is 25.

    try {
      Page<UploadToken> result = apiInstance.listTokens()
            .sortBy(sortBy)
            .sortOrder(sortOrder)
            .currentPage(currentPage)
            .pageSize(pageSize)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosDelegatedUploadApi#listTokens");
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

[API token](../README.md#api-token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="getToken"></a>
# **getToken**
> UploadToken getToken(uploadToken)

Show upload token

You can retrieve details about a specific upload token if you have the unique identifier for the upload token. Add it in the path of the endpoint. Details include time-to-live (ttl), when the token was created, and when it will expire.

### Example
```java
// Import classes:
import video.api.client.ApiVideoClient;
import video.api.client.api.ApiException;
import video.api.client.api.models.*;
import video.api.client.api.clients.VideosDelegatedUploadApi;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiVideoClient client = new ApiVideoClient("YOUR_API_TOKEN");
    // if you rather like to use the sandbox environment:
    // ApiVideoClient client = new ApiVideoClient("YOU_SANDBOX_API_TOKEN", ApiVideoClient.Environment.SANDBOX);

    VideosDelegatedUploadApi apiInstance = client.videosDelegatedUpload();
    
    String uploadToken = "to1tcmSFHeYY5KzyhOqVKMKb"; // The unique identifier for the token you want information about.

    try {
      UploadToken result = apiInstance.getToken(uploadToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosDelegatedUploadApi#getToken");
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
> Video upload(token, file)

Upload with an upload token

When given a token, anyone can upload a file to the URI `https://ws.api.video/upload?token=<tokenId>`.  Example with cURL:  ```curl $ curl  --request POST --url 'https://ws.api.video/upload?token=toXXX'  --header 'content-type: multipart/form-data'  -F file=@video.mp4 ```  Or in an HTML form, with a little JavaScript to convert the form into JSON: ```html <!--form for user interaction--> <form name=\"videoUploadForm\" >   <label for=video>Video:</label>   <input type=file name=source/><br/>   <input value=\"Submit\" type=\"submit\"> </form> <div></div> <!--JS takes the form data      uses FormData to turn the response into JSON.     then uses POST to upload the video file.     Update the token parameter in the url to your upload token.     --> <script>    var form = document.forms.namedItem(\"videoUploadForm\");     form.addEventListener('submit', function(ev) {   ev.preventDefault();      var oOutput = document.querySelector(\"div\"),          oData = new FormData(form);      var oReq = new XMLHttpRequest();         oReq.open(\"POST\", \"https://ws.api.video/upload?token=toXXX\", true);      oReq.send(oData);   oReq.onload = function(oEvent) {        if (oReq.status ==201) {          oOutput.innerHTML = \"Your video is uploaded!<br/>\"  + oReq.response;        } else {          oOutput.innerHTML = \"Error \" + oReq.status + \" occurred when trying to upload your file.<br />\";        }      };    }, false);  </script> ```   ### Dealing with large files  We have created a <a href='https://api.video/blog/tutorials/uploading-large-files-with-javascript'>tutorial</a> to walk through the steps required.

### Example
```java
// Import classes:
import video.api.client.ApiVideoClient;
import video.api.client.api.ApiException;
import video.api.client.api.models.*;
import video.api.client.api.clients.VideosDelegatedUploadApi;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiVideoClient client = new ApiVideoClient();
    // if you rather like to use the sandbox environment:
    // ApiVideoClient client = new ApiVideoClient(ApiVideoClient.BasePaths.SANDBOX);

    VideosDelegatedUploadApi apiInstance = client.videosDelegatedUpload();
    
    String token = "to1tcmSFHeYY5KzyhOqVKMKb"; // The unique identifier for the token you want to use to upload a video.
    File file = new File("/path/to/file"); // The path to the video you want to upload.

    try {
      Video result = apiInstance.upload(token, file);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosDelegatedUploadApi#upload");
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
 **token** | **String**| The unique identifier for the token you want to use to upload a video. |
 **file** | **File**| The path to the video you want to upload. |


### Upload chunks

Large files are broken into chunks for upload. You can control the size of the chunks using the `setUploadChunkSize()` of method of `ApiVideoClient` before uploading:

```java
apiVideoClient.setUploadChunkSize(50*1024*1024); // use 50MB chunks
apiVideoClient.videosDelegatedUpload().upload(token, file);
```

### Return type


[**Video**](Video.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Created |  -  |
**400** | Bad Request |  -  |

<a name="createToken"></a>
# **createToken**
> UploadToken createToken(tokenCreatePayload)

Generate an upload token

Use this endpoint to generate an upload token. You can use this token to authenticate video uploads while keeping your API key safe.

### Example
```java
// Import classes:
import video.api.client.ApiVideoClient;
import video.api.client.api.ApiException;
import video.api.client.api.models.*;
import video.api.client.api.clients.VideosDelegatedUploadApi;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiVideoClient client = new ApiVideoClient("YOUR_API_TOKEN");
    // if you rather like to use the sandbox environment:
    // ApiVideoClient client = new ApiVideoClient("YOU_SANDBOX_API_TOKEN", ApiVideoClient.Environment.SANDBOX);

    VideosDelegatedUploadApi apiInstance = client.videosDelegatedUpload();
    
    TokenCreatePayload tokenCreatePayload = new TokenCreatePayload(); // 
    tokenCreatePayload.setTtl(); // Time in seconds that the token will be active. A value of 0 means that the token has no exipration date. The default is to have no expiration.


    try {
      UploadToken result = apiInstance.createToken(tokenCreatePayload);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosDelegatedUploadApi#createToken");
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
 **tokenCreatePayload** | [**TokenCreatePayload**](TokenCreatePayload.md)|  | [optional]

### Return type


[**UploadToken**](UploadToken.md)

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

