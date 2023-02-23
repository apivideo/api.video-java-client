# VideosApi

All URIs are relative to *https://ws.api.video*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](VideosApi.md#create) | **POST** /videos | Create a video
[**upload**](VideosApi.md#upload) | **POST** /videos/{videoId}/source | Upload a video
[**uploadWithUploadToken**](VideosApi.md#uploadWithUploadToken) | **POST** /upload | Upload with an upload token
[**get**](VideosApi.md#get) | **GET** /videos/{videoId} | Retrieve a video
[**update**](VideosApi.md#update) | **PATCH** /videos/{videoId} | Update a video
[**delete**](VideosApi.md#delete) | **DELETE** /videos/{videoId} | Delete a video
[**list**](VideosApi.md#list) | **GET** /videos | List all videos
[**uploadThumbnail**](VideosApi.md#uploadThumbnail) | **POST** /videos/{videoId}/thumbnail | Upload a thumbnail
[**pickThumbnail**](VideosApi.md#pickThumbnail) | **PATCH** /videos/{videoId}/thumbnail | Pick a thumbnail
[**getStatus**](VideosApi.md#getStatus) | **GET** /videos/{videoId}/status | Retrieve video status


<a name="create"></a>
# **create**
> Video create(videoCreationPayload)

Create a video

We have tutorials on: * [Creating and uploading videos](https://api.video/blog/tutorials/video-upload-tutorial) * [Uploading large videos](https://api.video/blog/tutorials/video-upload-tutorial-large-videos) * [Using tags with videos](https://api.video/blog/tutorials/video-tagging-best-practices) * [Private videos](https://api.video/blog/tutorials/tutorial-private-videos) * [Using Dynamic Metadata](https://api.video/blog/tutorials/dynamic-metadata)  * Full list of [tutorials](https://api.video/blog/endpoints/video-create) that demonstrate this endpoint. 

### Example
```java
import video.api.client.ApiVideoClient;
import video.api.client.api.ApiException;
import video.api.client.api.models.*;
import video.api.client.api.clients.VideosApi;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiVideoClient client = new ApiVideoClient("YOUR_API_KEY");
    // if you rather like to use the sandbox environment:
    // ApiVideoClient client = new ApiVideoClient("YOUR_SANDBOX_API_KEY", ApiVideoClient.Environment.SANDBOX);

    VideosApi apiInstance = client.videos();
    
    VideoCreationPayload videoCreationPayload = new VideoCreationPayload(); // video to create
    videoCreationPayload.setTitle("Maths video"); // The title of your new video.
    videoCreationPayload.setDescription("A video about string theory."); // A brief description of your video.
    videoCreationPayload.setSource("https://www.myvideo.url.com/video.mp4"); // If you add a video already on the web, this is where you enter the url for the video.
    videoCreationPayload.setPublic(true); // Whether your video can be viewed by everyone, or requires authentication to see it. A setting of false will require a unique token for each view.
    videoCreationPayload.setPanoramic(false); // Indicates if your video is a 360/immersive video.
    videoCreationPayload.setMp4Support(true); // Enables mp4 version in addition to streamed version.
    videoCreationPayload.setPlayerId("pl45KFKdlddgk654dspkze"); // The unique identification number for your video player.
    videoCreationPayload.setTags(Arrays.asList("maths", "string theory", "video")); // A list of tags you want to use to describe your video.
    videoCreationPayload.setMetadata(Collections.<Metadata>emptyList()); // A list of key value pairs that you use to provide metadata for your video. These pairs can be made dynamic, allowing you to segment your audience. You can also just use the pairs as another way to tag and categorize your videos.


    try {
      Video result = apiInstance.create(videoCreationPayload);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosApi#create");
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
 **videoCreationPayload** | [**VideoCreationPayload**](VideoCreationPayload.md)| video to create |

### Return type


[**Video**](Video.md)

### Authorization

[API key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Created |  -  |
**202** | Accepted |  -  |
**400** | Bad Request |  -  |

<a name="upload"></a>
# **upload**
> Video upload(videoId, file)

Upload a video

To upload a video to the videoId you created. You can only upload your video to the videoId once.



We offer 2 types of upload: 

* Regular upload 

* Progressive upload

The latter allows you to split a video source into X chunks and send those chunks independently (concurrently or sequentially). The 2 main goals for our users are to

  * allow the upload of video sources > 200 MiB (200 MiB = the max. allowed file size for regular upload)

  * allow to send a video source "progressively", i.e., before before knowing the total size of the video.

  Once all chunks have been sent, they are reaggregated to one source file. The video source is considered as "completely sent" when the "last" chunk is sent (i.e., the chunk that "completes" the upload).



### Example
```java
import video.api.client.ApiVideoClient;
import video.api.client.api.ApiException;
import video.api.client.api.models.*;
import video.api.client.api.clients.VideosApi;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiVideoClient client = new ApiVideoClient("YOUR_API_KEY");
    // if you rather like to use the sandbox environment:
    // ApiVideoClient client = new ApiVideoClient("YOUR_SANDBOX_API_KEY", ApiVideoClient.Environment.SANDBOX);

    VideosApi apiInstance = client.videos();

    String videoId = "vi4k0jvEUuaTdRAEjQ4Jfrgz"; // Enter the videoId you want to use to upload your video.
    File file = new File("/path/to/file"); // The path to the video you would like to upload. The path must be local. If you want to use a video from an online source, you must use the "/videos" endpoint and add the "source" parameter when you create a new video.

    try {
      Video result = apiInstance.upload(videoId, file);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosApi#upload");
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
 **videoId** | **String**| Enter the videoId you want to use to upload your video. |
 **file** | **File**| The path to the video you would like to upload. The path must be local. If you want to use a video from an online source, you must use the \\\&quot;/videos\\\&quot; endpoint and add the \\\&quot;source\\\&quot; parameter when you create a new video. |


### Upload chunks

Large files are broken into chunks for upload. You can control the size of the chunks using the `setUploadChunkSize()` of method of `ApiVideoClient` before uploading:

```java
apiVideoClient.setUploadChunkSize(50*1024*1024); // use 50MB chunks
apiVideoClient.videos().upload(videoId, file);
```

### Progressive uploads

Progressive uploads make it possible to upload a video source "progressively," i.e., before knowing the total size of the video. This is done by sending chunks of the video source file sequentially.
The last chunk is sent by calling a different method, so api.video knows that it is time to reassemble the different chunks that were received.

```java
String videoId = "vi4k0jvEUuaTdRAEjQ4Jfrgz"; // Enter the videoId you want to use to upload your video.;

UploadProgressiveSession session = apiVideoClient.createUploadProgressiveSession(videoId)

session.uploadPart(new File("sample.mp4.part1"));
session.uploadPart(new File("sample.mp4.part2"));
// ...
Video result = session.uploadLastPart(new File("sample.mp4.partn"));
```


### Return type


[**Video**](Video.md)

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

<a name="uploadWithUploadToken"></a>
# **uploadWithUploadToken**
> Video uploadWithUploadToken(token, file)

Upload with an upload token

This method allows you to send a video using an upload token. Upload tokens are especially useful when the upload is done from the client side. If you want to upload a video from your server-side application, you'd better use the [standard upload method](#upload).

### Example
```java
// Import classes:
import video.api.client.ApiVideoClient;
import video.api.client.api.ApiException;
import video.api.client.api.models.*;
import video.api.client.api.clients.VideosApi;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiVideoClient client = new ApiVideoClient();
    // if you rather like to use the sandbox environment:
    // ApiVideoClient client = new ApiVideoClient(Environment.SANDBOX);

    VideosApi apiInstance = client.videos();
    
    String token = "to1tcmSFHeYY5KzyhOqVKMKb"; // The unique identifier for the token you want to use to upload a video.
    File file = new File("/path/to/file"); // The path to the video you want to upload.

    try {
      Video result = apiInstance.uploadWithUploadToken(token, file);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosApi#uploadWithUploadToken");
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
apiVideoClient.videos().uploadWithUploadToken(token, file);
```

### Progressive uploads

Progressive uploads make it possible to upload a video source "progressively," i.e., before knowing the total size of the video. This is done by sending chunks of the video source file sequentially.
The last chunk is sent by calling a different method, so api.video knows that it is time to reassemble the different chunks that were received.

```java
String token = "to1tcmSFHeYY5KzyhOqVKMKb"; // The unique identifier for the token you want to use to upload a video.;

UploadWithUploadTokenProgressiveSession session = apiVideoClient.createUploadWithUploadTokenProgressiveSession(token)

session.uploadPart(new File("sample.mp4.part1"));
session.uploadPart(new File("sample.mp4.part2"));
// ...
Video result = session.uploadLastPart(new File("sample.mp4.partn"));
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

<a name="get"></a>
# **get**
> Video get(videoId)

Retrieve a video

This call provides the same information provided on video creation. For private videos, it will generate a unique token url. Use this to retrieve any details you need about a video, or set up a private viewing URL.

### Example
```java
import video.api.client.ApiVideoClient;
import video.api.client.api.ApiException;
import video.api.client.api.models.*;
import video.api.client.api.clients.VideosApi;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiVideoClient client = new ApiVideoClient("YOUR_API_KEY");
    // if you rather like to use the sandbox environment:
    // ApiVideoClient client = new ApiVideoClient("YOUR_SANDBOX_API_KEY", ApiVideoClient.Environment.SANDBOX);

    VideosApi apiInstance = client.videos();
    
    String videoId = "videoId_example"; // The unique identifier for the video you want details about.

    try {
      Video result = apiInstance.get(videoId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosApi#get");
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
 **videoId** | **String**| The unique identifier for the video you want details about. |

### Return type


[**Video**](Video.md)

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

<a name="update"></a>
# **update**
> Video update(videoId, videoUpdatePayload)

Update a video

Updates the parameters associated with your video. The video you are updating is determined by the video ID you provide. 



NOTE: If you are updating an array, you must provide the entire array as what you provide here overwrites what is in the system rather than appending to it.



### Example
```java
import video.api.client.ApiVideoClient;
import video.api.client.api.ApiException;
import video.api.client.api.models.*;
import video.api.client.api.clients.VideosApi;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiVideoClient client = new ApiVideoClient("YOUR_API_KEY");
    // if you rather like to use the sandbox environment:
    // ApiVideoClient client = new ApiVideoClient("YOUR_SANDBOX_API_KEY", ApiVideoClient.Environment.SANDBOX);

    VideosApi apiInstance = client.videos();
    
    String videoId = "vi4k0jvEUuaTdRAEjQ4Jfrgz"; // The video ID for the video you want to delete.
    VideoUpdatePayload videoUpdatePayload = new VideoUpdatePayload(); // 
    videoUpdatePayload.setPlayerId("pl4k0jvEUuaTdRAEjQ4Jfrgz"); // The unique ID for the player you want to associate with your video.
    videoUpdatePayload.setTitle("null"); // The title you want to use for your video.
    videoUpdatePayload.setDescription("A film about good books."); // A brief description of the video.
    videoUpdatePayload.setPublic(true); // Whether the video is publicly available or not. False means it is set to private.
    videoUpdatePayload.setPanoramic(false); // Whether the video is a 360 degree or immersive video.
    videoUpdatePayload.setMp4Support(true); // Whether the player supports the mp4 format.
    videoUpdatePayload.setTags(Arrays.asList("maths", "string theory", "video")); // A list of terms or words you want to tag the video with. Make sure the list includes all the tags you want as whatever you send in this list will overwrite the existing list for the video.
    videoUpdatePayload.setMetadata(Collections.<Metadata>emptyList()); // A list (array) of dictionaries where each dictionary contains a key value pair that describes the video. As with tags, you must send the complete list of metadata you want as whatever you send here will overwrite the existing metadata for the video.


    try {
      Video result = apiInstance.update(videoId, videoUpdatePayload);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosApi#update");
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
 **videoId** | **String**| The video ID for the video you want to delete. |
 **videoUpdatePayload** | [**VideoUpdatePayload**](VideoUpdatePayload.md)|  |

### Return type


[**Video**](Video.md)

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
**404** | Not Found |  -  |

<a name="delete"></a>
# **delete**
> delete(videoId)

Delete a video

If you do not need a video any longer, you can send a request to delete it. All you need is the videoId.

### Example
```java
import video.api.client.ApiVideoClient;
import video.api.client.api.ApiException;
import video.api.client.api.models.*;
import video.api.client.api.clients.VideosApi;
import java.util.*;
  
public class Example {
  public static void main(String[] args) {
    ApiVideoClient client = new ApiVideoClient("YOUR_API_KEY");
    // if you rather like to use the sandbox environment:
    // ApiVideoClient client = new ApiVideoClient("YOUR_SANDBOX_API_KEY", ApiVideoClient.Environment.SANDBOX);
    
    VideosApi apiInstance = client.videos();
    
    String videoId = "vi4k0jvEUuaTdRAEjQ4Jfrgz"; // The video ID for the video you want to delete.
    
    try {
      apiInstance.delete(videoId);
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosApi#delete");
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
 **videoId** | **String**| The video ID for the video you want to delete. |

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
> VideosListResponse list().title(title).tags(tags).metadata(metadata).description(description).liveStreamId(liveStreamId).sortBy(sortBy).sortOrder(sortOrder).currentPage(currentPage).pageSize(pageSize).execute();

List all videos

This method returns a list of your videos (with all their details). With no parameters added, the API returns the first page of all videos. You can filter videos using the parameters described below.

### Example
```java
ApiVideoClient client = new ApiVideoClient("YOUR_API_KEY");
VideosApi videosApi = client.videos();

// list all videos (all pages)
Page<Video> videosPages = videosApi.list().execute();
videosPages.forEach(videosPage -> videosPage.getItems().forEach(video ->
    System.out.println(video.getVideoId())
));

// list videos that have all the given tags (only first results page)
List<Video> videosWithTags = videosApi.list()
    .tags(Arrays.asList("tag1", "tag2"))
    .execute()
    .getItems();

// list videos that have all the given metadata values (only first results page)
List<Video> videosWithMetadata = videosApi.list()
    .metadata(Map.of("key1", "value1", "key2", "value2"))
    .execute()
    .getItems();
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **title** | **String**| The title of a specific video you want to find. The search will match exactly to what term you provide and return any videos that contain the same term as part of their titles. | [optional]
 **tags** | [**List&lt;String&gt;**](String.md)| A tag is a category you create and apply to videos. You can search for videos with particular tags by listing one or more here. Only videos that have all the tags you list will be returned. | [optional]
 **metadata** | [**Map&lt;String, String&gt;**](String.md)| Videos can be tagged with metadata tags in key:value pairs. You can search for videos with specific key value pairs using this parameter. [Dynamic Metadata](https://api.video/blog/endpoints/dynamic-metadata) allows you to define a key that allows any value pair. | [optional]
 **description** | **String**| If you described a video with a term or sentence, you can add it here to return videos containing this string. | [optional]
 **liveStreamId** | **String**| If you know the ID for a live stream, you can retrieve the stream by adding the ID for it here. | [optional]
 **sortBy** | **String**| Allowed: publishedAt, title. You can search by the time videos were published at, or by title. | [optional]
 **sortOrder** | **String**| Allowed: asc, desc. asc is ascending and sorts from A to Z. desc is descending and sorts from Z to A. | [optional]
 **currentPage** | **Integer**| Choose the number of search results to return per page. Minimum value: 1 | [optional] [default to 1]
 **pageSize** | **Integer**| Results per page. Allowed values 1-100, default is 25. | [optional] [default to 25]

### Return type

[**Page**](pagination.md)<[**Video**](Video.md)>


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

<a name="uploadThumbnail"></a>
# **uploadThumbnail**
> Video uploadThumbnail(videoId, file)

Upload a thumbnail

The thumbnail is the poster that appears in the player window before video playback begins.



This endpoint allows you to upload an image for the thumbnail.



To select a still frame from the video using a time stamp, use the [dedicated method](#pickThumbnail) to pick a time in the video.



Note: There may be a short delay before the new thumbnail is delivered to our CDN.

### Example
```java
import video.api.client.ApiVideoClient;
import video.api.client.api.ApiException;
import video.api.client.api.models.*;
import video.api.client.api.clients.VideosApi;
import java.util.*;

public class Example {
 public static void main(String[] args) {
   ApiVideoClient client = new ApiVideoClient("YOUR_API_KEY");
   // if you rather like to use the sandbox environment:
   // ApiVideoClient client = new ApiVideoClient("YOUR_SANDBOX_API_KEY", ApiVideoClient.Environment.SANDBOX);

   VideosApi apiInstance = client.videos();

   String videoId = "videoId_example"; // Unique identifier of the chosen video 
   File file = new File("/path/to/file"); // The image to be added as a thumbnail.

   try {
     Video result = apiInstance.uploadThumbnail(videoId, file);
     System.out.println(result);
   } catch (ApiException e) {
     System.err.println("Exception when calling VideosApi#uploadThumbnail");
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
 **videoId** | **String**| Unique identifier of the chosen video  |
 **file** | **File**| The image to be added as a thumbnail. The mime type should be image/jpeg, image/png or image/webp. The max allowed size is 8 MiB. |

### Return type


[**Video**](Video.md)

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
**404** | Not Found |  -  |

<a name="pickThumbnail"></a>
# **pickThumbnail**
> Video pickThumbnail(videoId, videoThumbnailPickPayload)

Pick a thumbnail

Pick a thumbnail from the given time code. 



If you'd like to upload an image for your thumbnail, use the dedicated [method](#uploadThumbnail). 



There may be a short delay for the thumbnail to update.



### Example
```java
import video.api.client.ApiVideoClient;
import video.api.client.api.ApiException;
import video.api.client.api.models.*;
import video.api.client.api.clients.VideosApi;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiVideoClient client = new ApiVideoClient("YOUR_API_KEY");
    // if you rather like to use the sandbox environment:
    // ApiVideoClient client = new ApiVideoClient("YOUR_SANDBOX_API_KEY", ApiVideoClient.Environment.SANDBOX);

    VideosApi apiInstance = client.videos();
    
    String videoId = "vi4k0jvEUuaTdRAEjQ4Jfrgz"; // Unique identifier of the video you want to add a thumbnail to, where you use a section of your video as the thumbnail.
    VideoThumbnailPickPayload videoThumbnailPickPayload = new VideoThumbnailPickPayload(); // 
    videoThumbnailPickPayload.setTimecode("null"); // Frame in video to be used as a placeholder before the video plays.
Example: &amp;#39;&amp;quot;00:01:00.000&amp;quot; for 1 minute into the video.&amp;#39;
Valid Patterns:
&amp;quot;hh:mm:ss.ms&amp;quot;
&amp;quot;hh:mm:ss:frameNumber&amp;quot;
&amp;quot;124&amp;quot; (integer value is reported as seconds)
If selection is out of range, &amp;quot;00:00:00.00&amp;quot; will be chosen.


    try {
      Video result = apiInstance.pickThumbnail(videoId, videoThumbnailPickPayload);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosApi#pickThumbnail");
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
 **videoId** | **String**| Unique identifier of the video you want to add a thumbnail to, where you use a section of your video as the thumbnail. |
 **videoThumbnailPickPayload** | [**VideoThumbnailPickPayload**](VideoThumbnailPickPayload.md)|  |

### Return type


[**Video**](Video.md)

### Authorization

[API key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**404** | Not Found |  -  |

<a name="getStatus"></a>
# **getStatus**
> VideoStatus getStatus(videoId)

Retrieve video status

This method provides upload status &amp; encoding status to determine when the video is uploaded or ready to playback. Once encoding is completed, the response also lists the available stream qualities.

### Example
```java
import video.api.client.ApiVideoClient;
import video.api.client.api.ApiException;
import video.api.client.api.models.*;
import video.api.client.api.clients.VideosApi;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiVideoClient client = new ApiVideoClient("YOUR_API_KEY");
    // if you rather like to use the sandbox environment:
    // ApiVideoClient client = new ApiVideoClient("YOUR_SANDBOX_API_KEY", ApiVideoClient.Environment.SANDBOX);

    VideosApi apiInstance = client.videos();
    
    String videoId = "vi4k0jvEUuaTdRAEjQ4Jfrgz"; // The unique identifier for the video you want the status for.

    try {
      VideoStatus result = apiInstance.getStatus(videoId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosApi#getStatus");
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
 **videoId** | **String**| The unique identifier for the video you want the status for. |

### Return type


[**VideoStatus**](VideoStatus.md)

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

