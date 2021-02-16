# PlayersApi

All URIs are relative to *https://ws.api.video*

Method | HTTP request | Description
------------- | ------------- | -------------
[**delete**](PlayersApi.md#delete) | **DELETE** /players/{playerId} | Delete a player
[**deleteLogo**](PlayersApi.md#deleteLogo) | **DELETE** /players/{playerId}/logo | Delete logo
[**list**](PlayersApi.md#list) | **GET** /players | List all players
[**get**](PlayersApi.md#get) | **GET** /players/{playerId} | Show a player
[**update**](PlayersApi.md#update) | **PATCH** /players/{playerId} | Update a player
[**create**](PlayersApi.md#create) | **POST** /players | Create a player
[**uploadLogo**](PlayersApi.md#uploadLogo) | **POST** /players/{playerId}/logo | Upload a logo


<a name="delete"></a>
# **delete**
> delete(playerId)

Delete a player

Delete a player if you no longer need it. You can delete any player that you have the player ID for.

### Example
```java
// Import classes:
import video.api.client.ApiVideoClient;
import video.api.client.ApiException;
import video.api.client.models.*;
import video.api.client.api.PlayersApi;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiVideoClient client = new ApiVideoClient("YOUR_API_TOKEN");
    // if you rather like to use the sandbox environment:
    // ApiVideoClient client = new ApiVideoClient("YOU_SANDBOX_API_TOKEN", ApiVideoClient.Environment.SANDBOX);

    PlayersApi apiInstance = client.players();
    
    String playerId = "pl45d5vFFGrfdsdsd156dGhh"; // The unique identifier for the player you want to delete.

    try {
      apiInstance.delete(playerId);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlayersApi#delete");
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
 **playerId** | **String**| The unique identifier for the player you want to delete. |

### Return type


null (empty response body)

### Authorization

[API token](../README.md#api-token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.api.video+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | No Content |  -  |
**404** | Not Found |  -  |

<a name="deleteLogo"></a>
# **deleteLogo**
> Object deleteLogo(playerId)

Delete logo

### Example
```java
// Import classes:
import video.api.client.ApiVideoClient;
import video.api.client.ApiException;
import video.api.client.models.*;
import video.api.client.api.PlayersApi;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiVideoClient client = new ApiVideoClient("YOUR_API_TOKEN");
    // if you rather like to use the sandbox environment:
    // ApiVideoClient client = new ApiVideoClient("YOU_SANDBOX_API_TOKEN", ApiVideoClient.Environment.SANDBOX);

    PlayersApi apiInstance = client.players();
    
    String playerId = "pl14Db6oMJRH6SRVoOwORacK"; // The unique identifier for the player.

    try {
      Object result = apiInstance.deleteLogo(playerId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlayersApi#deleteLogo");
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
 **playerId** | **String**| The unique identifier for the player. |

### Return type


**Object**

### Authorization

[API token](../README.md#api-token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.api.video+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | No Content |  -  |
**404** | Not Found |  -  |

<a name="list"></a>
# **list**
> PlayersListResponse list().sortBy(sortBy).sortOrder(sortOrder).currentPage(currentPage).pageSize(pageSize).execute();

List all players

Retrieve a list of all the players you created, as well as details about each one.

### Example
```java
// Import classes:
import video.api.client.ApiVideoClient;
import video.api.client.ApiException;
import video.api.client.models.*;
import video.api.client.api.PlayersApi;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiVideoClient client = new ApiVideoClient("YOUR_API_TOKEN");
    // if you rather like to use the sandbox environment:
    // ApiVideoClient client = new ApiVideoClient("YOU_SANDBOX_API_TOKEN", ApiVideoClient.Environment.SANDBOX);

    PlayersApi apiInstance = client.players();
    
    String sortBy = "createdAt"; // createdAt is the time the player was created. updatedAt is the time the player was last updated. The time is presented in ISO-8601 format.
    String sortOrder = "asc"; // Allowed: asc, desc. Ascending for date and time means that earlier values precede later ones. Descending means that later values preced earlier ones.
    Integer currentPage = 1; // Choose the number of search results to return per page. Minimum value: 1
    Integer pageSize = 25; // Results per page. Allowed values 1-100, default is 25.

    try {
      Page<Player> result = apiInstance.list()
            .sortBy(sortBy)
            .sortOrder(sortOrder)
            .currentPage(currentPage)
            .pageSize(pageSize)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlayersApi#list");
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
 **sortBy** | **String**| createdAt is the time the player was created. updatedAt is the time the player was last updated. The time is presented in ISO-8601 format. | [optional] [enum: createdAt, updatedAt]
 **sortOrder** | **String**| Allowed: asc, desc. Ascending for date and time means that earlier values precede later ones. Descending means that later values preced earlier ones. | [optional] [enum: asc, desc]
 **currentPage** | **Integer**| Choose the number of search results to return per page. Minimum value: 1 | [optional] [default to 1]
 **pageSize** | **Integer**| Results per page. Allowed values 1-100, default is 25. | [optional] [default to 25]

### Return type

[**Page**](pagination.md)<[**Player**](Player.md)>


### Authorization

[API token](../README.md#api-token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.api.video+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Bad Request |  -  |

<a name="get"></a>
# **get**
> Player get(playerId)

Show a player

Use a player ID to retrieve details about the player and display it for viewers.

### Example
```java
// Import classes:
import video.api.client.ApiVideoClient;
import video.api.client.ApiException;
import video.api.client.models.*;
import video.api.client.api.PlayersApi;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiVideoClient client = new ApiVideoClient("YOUR_API_TOKEN");
    // if you rather like to use the sandbox environment:
    // ApiVideoClient client = new ApiVideoClient("YOU_SANDBOX_API_TOKEN", ApiVideoClient.Environment.SANDBOX);

    PlayersApi apiInstance = client.players();
    
    String playerId = "pl45d5vFFGrfdsdsd156dGhh"; // The unique identifier for the player you want to retrieve. 

    try {
      Player result = apiInstance.get(playerId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlayersApi#get");
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
 **playerId** | **String**| The unique identifier for the player you want to retrieve.  |

### Return type


[**Player**](Player.md)

### Authorization

[API token](../README.md#api-token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.api.video+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**404** | Not Found |  -  |

<a name="update"></a>
# **update**
> Player update(playerId, playerUpdatePayload)

Update a player

Use a player ID to update specific details for a player. NOTE: It may take up to 10 min before the new player configuration is available from our CDN.

### Example
```java
// Import classes:
import video.api.client.ApiVideoClient;
import video.api.client.ApiException;
import video.api.client.models.*;
import video.api.client.api.PlayersApi;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiVideoClient client = new ApiVideoClient("YOUR_API_TOKEN");
    // if you rather like to use the sandbox environment:
    // ApiVideoClient client = new ApiVideoClient("YOU_SANDBOX_API_TOKEN", ApiVideoClient.Environment.SANDBOX);

    PlayersApi apiInstance = client.players();
    
    String playerId = "pl45d5vFFGrfdsdsd156dGhh"; // The unique identifier for the player.
    PlayerUpdatePayload playerUpdatePayload = new PlayerUpdatePayload(); // 


    try {
      Player result = apiInstance.update(playerId, playerUpdatePayload);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlayersApi#update");
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
 **playerId** | **String**| The unique identifier for the player. |
 **playerUpdatePayload** | [**PlayerUpdatePayload**](PlayerUpdatePayload.md)|  |

### Return type


[**Player**](Player.md)

### Authorization

[API token](../README.md#api-token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.api.video+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**404** | Not Found |  -  |

<a name="create"></a>
# **create**
> Player create(playerCreationPayload)

Create a player

Create a player for your video, and customise it.

### Example
```java
// Import classes:
import video.api.client.ApiVideoClient;
import video.api.client.ApiException;
import video.api.client.models.*;
import video.api.client.api.PlayersApi;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiVideoClient client = new ApiVideoClient("YOUR_API_TOKEN");
    // if you rather like to use the sandbox environment:
    // ApiVideoClient client = new ApiVideoClient("YOU_SANDBOX_API_TOKEN", ApiVideoClient.Environment.SANDBOX);

    PlayersApi apiInstance = client.players();
    
    PlayerCreationPayload playerCreationPayload = new PlayerCreationPayload(); // 


    try {
      Player result = apiInstance.create(playerCreationPayload);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlayersApi#create");
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
 **playerCreationPayload** | [**PlayerCreationPayload**](PlayerCreationPayload.md)|  |

### Return type


[**Player**](Player.md)

### Authorization

[API token](../README.md#api-token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.api.video+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Created |  -  |

<a name="uploadLogo"></a>
# **uploadLogo**
> Player uploadLogo(playerId, file, link)

Upload a logo

The uploaded image maximum size should be 200x100 and its weight should be 200KB.  It will be scaled down to 30px height and converted to PNG to be displayed in the player.

### Example
```java
// Import classes:
import video.api.client.ApiVideoClient;
import video.api.client.ApiException;
import video.api.client.models.*;
import video.api.client.api.PlayersApi;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiVideoClient client = new ApiVideoClient("YOUR_API_TOKEN");
    // if you rather like to use the sandbox environment:
    // ApiVideoClient client = new ApiVideoClient("YOU_SANDBOX_API_TOKEN", ApiVideoClient.Environment.SANDBOX);

    PlayersApi apiInstance = client.players();
    
    String playerId = "pl14Db6oMJRH6SRVoOwORacK"; // The unique identifier for the player.
    File file = new File("/path/to/file"); // The name of the file you want to use for your logo.
    String link = "link_example"; // The path to the file you want to upload and use as a logo.

    try {
      Player result = apiInstance.uploadLogo(playerId, file, link);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlayersApi#uploadLogo");
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
 **playerId** | **String**| The unique identifier for the player. |
 **file** | **File**| The name of the file you want to use for your logo. |
 **link** | **String**| The path to the file you want to upload and use as a logo. |

### Return type


[**Player**](Player.md)

### Authorization

[API token](../README.md#api-token)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/vnd.api.video+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Created |  -  |
**400** | Bad Request |  -  |
**404** | Not Found |  -  |

