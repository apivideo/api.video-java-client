# api.video java API client

api.video is an API that encodes on the go to facilitate immediate playback, enhancing viewer streaming experiences across multiple devices and platforms. You can stream live or on-demand online videos within minutes.




## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven/Gradle

## Installation

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>video.api</groupId>
  <artifactId>java-api-client</artifactId>
  <version>1.0.1</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "video.api:java-api-client:1.0.1"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/java-api-client-1.0.1.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import video.api.client.ApiVideoClient;
import video.api.client.api.ApiException;
import video.api.client.api.models.*;

public class Example {
  public static void main(String[] args) {
    ApiVideoClient apiVideoClient = new ApiVideoClient("YOUR_API_TOKEN");
    // if you rather like to use the sandbox environment:
    // ApiVideoClient apiVideoClient = new ApiVideoClient("YOU_SANDBOX_API_TOKEN", ApiVideoClient.Environments.SANDBOX);

    File myVideoFile = new File("my-video.mp4");

    try {
        Video video = apiVideoClient.videos().create(new VideoCreatePayload().title("my video"));
        video = apiVideoClient.videos().upload(video.getVideoId(), myVideoFile);
        System.out.println(video);
    } catch (ApiException e) {
        System.err.println("Exception when calling AccountApi#get");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getMessage());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://ws.api.video*


### CaptionsApi


#### Retrieve an instance of CaptionsApi:
```java
ApiVideoClient apiVideoClient = new ApiVideoClient("YOUR_API_TOKEN");
CaptionsApi captions = client.captions()
```

#### Endpoints

Method | HTTP request | Description
------------- | ------------- | -------------
[**delete**](docs/CaptionsApi.md#delete) | **DELETE** /videos/{videoId}/captions/{language} | Delete a caption
[**list**](docs/CaptionsApi.md#list) | **GET** /videos/{videoId}/captions | List video captions
[**get**](docs/CaptionsApi.md#get) | **GET** /videos/{videoId}/captions/{language} | Show a caption
[**update**](docs/CaptionsApi.md#update) | **PATCH** /videos/{videoId}/captions/{language} | Update caption
[**upload**](docs/CaptionsApi.md#upload) | **POST** /videos/{videoId}/captions/{language} | Upload a caption


### ChaptersApi


#### Retrieve an instance of ChaptersApi:
```java
ApiVideoClient apiVideoClient = new ApiVideoClient("YOUR_API_TOKEN");
ChaptersApi chapters = client.chapters()
```

#### Endpoints

Method | HTTP request | Description
------------- | ------------- | -------------
[**delete**](docs/ChaptersApi.md#delete) | **DELETE** /videos/{videoId}/chapters/{language} | Delete a chapter
[**list**](docs/ChaptersApi.md#list) | **GET** /videos/{videoId}/chapters | List video chapters
[**get**](docs/ChaptersApi.md#get) | **GET** /videos/{videoId}/chapters/{language} | Show a chapter
[**upload**](docs/ChaptersApi.md#upload) | **POST** /videos/{videoId}/chapters/{language} | Upload a chapter


### LiveStreamsApi


#### Retrieve an instance of LiveStreamsApi:
```java
ApiVideoClient apiVideoClient = new ApiVideoClient("YOUR_API_TOKEN");
LiveStreamsApi liveStreams = client.liveStreams()
```

#### Endpoints

Method | HTTP request | Description
------------- | ------------- | -------------
[**delete**](docs/LiveStreamsApi.md#delete) | **DELETE** /live-streams/{liveStreamId} | Delete a live stream
[**deleteThumbnail**](docs/LiveStreamsApi.md#deleteThumbnail) | **DELETE** /live-streams/{liveStreamId}/thumbnail | Delete a thumbnail
[**list**](docs/LiveStreamsApi.md#list) | **GET** /live-streams | List all live streams
[**get**](docs/LiveStreamsApi.md#get) | **GET** /live-streams/{liveStreamId} | Show live stream
[**update**](docs/LiveStreamsApi.md#update) | **PATCH** /live-streams/{liveStreamId} | Update a live stream
[**create**](docs/LiveStreamsApi.md#create) | **POST** /live-streams | Create live stream
[**uploadThumbnail**](docs/LiveStreamsApi.md#uploadThumbnail) | **POST** /live-streams/{liveStreamId}/thumbnail | Upload a thumbnail


### PlayerThemesApi


#### Retrieve an instance of PlayerThemesApi:
```java
ApiVideoClient apiVideoClient = new ApiVideoClient("YOUR_API_TOKEN");
PlayerThemesApi playerThemes = client.playerThemes()
```

#### Endpoints

Method | HTTP request | Description
------------- | ------------- | -------------
[**delete**](docs/PlayerThemesApi.md#delete) | **DELETE** /players/{playerId} | Delete a player
[**deleteLogo**](docs/PlayerThemesApi.md#deleteLogo) | **DELETE** /players/{playerId}/logo | Delete logo
[**list**](docs/PlayerThemesApi.md#list) | **GET** /players | List all players
[**get**](docs/PlayerThemesApi.md#get) | **GET** /players/{playerId} | Show a player
[**update**](docs/PlayerThemesApi.md#update) | **PATCH** /players/{playerId} | Update a player
[**create**](docs/PlayerThemesApi.md#create) | **POST** /players | Create a player
[**uploadLogo**](docs/PlayerThemesApi.md#uploadLogo) | **POST** /players/{playerId}/logo | Upload a logo


### RawStatisticsApi


#### Retrieve an instance of RawStatisticsApi:
```java
ApiVideoClient apiVideoClient = new ApiVideoClient("YOUR_API_TOKEN");
RawStatisticsApi rawStatistics = client.rawStatistics()
```

#### Endpoints

Method | HTTP request | Description
------------- | ------------- | -------------
[**listLiveStreamSessions**](docs/RawStatisticsApi.md#listLiveStreamSessions) | **GET** /analytics/live-streams/{liveStreamId} | List live stream player sessions
[**listSessionEvents**](docs/RawStatisticsApi.md#listSessionEvents) | **GET** /analytics/sessions/{sessionId}/events | List player session events
[**listVideoSessions**](docs/RawStatisticsApi.md#listVideoSessions) | **GET** /analytics/videos/{videoId} | List video player sessions


### UploadTokensApi


#### Retrieve an instance of UploadTokensApi:
```java
ApiVideoClient apiVideoClient = new ApiVideoClient("YOUR_API_TOKEN");
UploadTokensApi uploadTokens = client.uploadTokens()
```

#### Endpoints

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteToken**](docs/UploadTokensApi.md#deleteToken) | **DELETE** /upload-tokens/{uploadToken} | Delete an upload token
[**list**](docs/UploadTokensApi.md#list) | **GET** /upload-tokens | List all active upload tokens.
[**getToken**](docs/UploadTokensApi.md#getToken) | **GET** /upload-tokens/{uploadToken} | Show upload token
[**createToken**](docs/UploadTokensApi.md#createToken) | **POST** /upload-tokens | Generate an upload token


### VideosApi


#### Retrieve an instance of VideosApi:
```java
ApiVideoClient apiVideoClient = new ApiVideoClient("YOUR_API_TOKEN");
VideosApi videos = client.videos()
```

#### Endpoints

Method | HTTP request | Description
------------- | ------------- | -------------
[**delete**](docs/VideosApi.md#delete) | **DELETE** /videos/{videoId} | Delete a video
[**get**](docs/VideosApi.md#get) | **GET** /videos/{videoId} | Show a video
[**getStatus**](docs/VideosApi.md#getStatus) | **GET** /videos/{videoId}/status | Show video status
[**list**](docs/VideosApi.md#list) | **GET** /videos | List all videos
[**update**](docs/VideosApi.md#update) | **PATCH** /videos/{videoId} | Update a video
[**pickThumbnail**](docs/VideosApi.md#pickThumbnail) | **PATCH** /videos/{videoId}/thumbnail | Pick a thumbnail
[**uploadWithUploadToken**](docs/VideosApi.md#uploadWithUploadToken) | **POST** /upload | Upload with an upload token
[**create**](docs/VideosApi.md#create) | **POST** /videos | Create a video
[**upload**](docs/VideosApi.md#upload) | **POST** /videos/{videoId}/source | Upload a video
[**uploadThumbnail**](docs/VideosApi.md#uploadThumbnail) | **POST** /videos/{videoId}/thumbnail | Upload a thumbnail


### WebhooksApi


#### Retrieve an instance of WebhooksApi:
```java
ApiVideoClient apiVideoClient = new ApiVideoClient("YOUR_API_TOKEN");
WebhooksApi webhooks = client.webhooks()
```

#### Endpoints

Method | HTTP request | Description
------------- | ------------- | -------------
[**delete**](docs/WebhooksApi.md#delete) | **DELETE** /webhooks/{webhookId} | Delete a Webhook
[**get**](docs/WebhooksApi.md#get) | **GET** /webhooks/{webhookId} | Show Webhook details
[**list**](docs/WebhooksApi.md#list) | **GET** /webhooks | List all webhooks
[**create**](docs/WebhooksApi.md#create) | **POST** /webhooks | Create Webhook



## Documentation for Models

 - [AccessToken](docs/AccessToken.md)
 - [Account](docs/Account.md)
 - [AccountQuota](docs/AccountQuota.md)
 - [AuthenticatePayload](docs/AuthenticatePayload.md)
 - [BadRequest](docs/BadRequest.md)
 - [BytesRange](docs/BytesRange.md)
 - [CaptionsListResponse](docs/CaptionsListResponse.md)
 - [CaptionsUpdatePayload](docs/CaptionsUpdatePayload.md)
 - [Chapter](docs/Chapter.md)
 - [ChaptersListResponse](docs/ChaptersListResponse.md)
 - [Link](docs/Link.md)
 - [LiveStream](docs/LiveStream.md)
 - [LiveStreamAssets](docs/LiveStreamAssets.md)
 - [LiveStreamCreatePayload](docs/LiveStreamCreatePayload.md)
 - [LiveStreamListResponse](docs/LiveStreamListResponse.md)
 - [LiveStreamSession](docs/LiveStreamSession.md)
 - [LiveStreamSessionClient](docs/LiveStreamSessionClient.md)
 - [LiveStreamSessionDevice](docs/LiveStreamSessionDevice.md)
 - [LiveStreamSessionLocation](docs/LiveStreamSessionLocation.md)
 - [LiveStreamSessionReferrer](docs/LiveStreamSessionReferrer.md)
 - [LiveStreamSessionSession](docs/LiveStreamSessionSession.md)
 - [LiveStreamUpdatePayload](docs/LiveStreamUpdatePayload.md)
 - [Metadata](docs/Metadata.md)
 - [NotFound](docs/NotFound.md)
 - [Pagination](docs/Pagination.md)
 - [PaginationLink](docs/PaginationLink.md)
 - [Player](docs/Player.md)
 - [PlayerAllOf](docs/PlayerAllOf.md)
 - [PlayerAllOfAssets](docs/PlayerAllOfAssets.md)
 - [PlayerCreationPayload](docs/PlayerCreationPayload.md)
 - [PlayerSessionEvent](docs/PlayerSessionEvent.md)
 - [PlayerUpdatePayload](docs/PlayerUpdatePayload.md)
 - [Playerinput](docs/Playerinput.md)
 - [PlayersListResponse](docs/PlayersListResponse.md)
 - [Quality](docs/Quality.md)
 - [RawStatisticsListLiveStreamAnalyticsResponse](docs/RawStatisticsListLiveStreamAnalyticsResponse.md)
 - [RawStatisticsListPlayerSessionEventsResponse](docs/RawStatisticsListPlayerSessionEventsResponse.md)
 - [RawStatisticsListSessionsResponse](docs/RawStatisticsListSessionsResponse.md)
 - [RefreshTokenPayload](docs/RefreshTokenPayload.md)
 - [Subtitle](docs/Subtitle.md)
 - [TokenCreatePayload](docs/TokenCreatePayload.md)
 - [TokenListResponse](docs/TokenListResponse.md)
 - [UploadToken](docs/UploadToken.md)
 - [Video](docs/Video.md)
 - [VideoAssets](docs/VideoAssets.md)
 - [VideoCreatePayload](docs/VideoCreatePayload.md)
 - [VideoSession](docs/VideoSession.md)
 - [VideoSessionClient](docs/VideoSessionClient.md)
 - [VideoSessionDevice](docs/VideoSessionDevice.md)
 - [VideoSessionLocation](docs/VideoSessionLocation.md)
 - [VideoSessionOs](docs/VideoSessionOs.md)
 - [VideoSessionReferrer](docs/VideoSessionReferrer.md)
 - [VideoSessionSession](docs/VideoSessionSession.md)
 - [VideoSource](docs/VideoSource.md)
 - [VideoSourceLiveStream](docs/VideoSourceLiveStream.md)
 - [VideoSourceLiveStreamLink](docs/VideoSourceLiveStreamLink.md)
 - [VideoThumbnailPickPayload](docs/VideoThumbnailPickPayload.md)
 - [VideoUpdatePayload](docs/VideoUpdatePayload.md)
 - [VideosListResponse](docs/VideosListResponse.md)
 - [Videostatus](docs/Videostatus.md)
 - [VideostatusEncoding](docs/VideostatusEncoding.md)
 - [VideostatusEncodingMetadata](docs/VideostatusEncodingMetadata.md)
 - [VideostatusIngest](docs/VideostatusIngest.md)
 - [Webhook](docs/Webhook.md)
 - [WebhooksCreatePayload](docs/WebhooksCreatePayload.md)
 - [WebhooksListResponse](docs/WebhooksListResponse.md)


## Documentation for Authorization

### API token

Most endpoints required to be authenticated using the API token mechanism described in our [documentation](https://docs.api.video/reference#authentication).
The access token generation mechanism is automatically handled by the client. All you have to do is provide an API token when instantiating the ApiVideoClient:
```java
ApiVideoClient apiVideoClient = new ApiVideoClient("YOUR_API_TOKEN");
```

### Public endpoints

Some endpoints don't require authentication. These one can be called with an ApiVideoClient instantiated without API token:
```java
ApiVideoClient apiVideoClient = new ApiVideoClient();
```

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



