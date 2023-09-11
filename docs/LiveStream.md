

# LiveStream

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**liveStreamId** | **String** | The unique identifier for the live stream. Live stream IDs begin with \&quot;li.\&quot; | 
**name** | **String** | The name of your live stream. |  [optional]
**streamKey** | **String** | The unique, private stream key that you use to begin streaming. |  [optional]
**_public** | **Boolean** | Whether your video can be viewed by everyone, or requires authentication to see it. A setting of false will require a unique token for each view. Learn more about the Private Video feature [here](https://docs.api.video/docs/private-videos). |  [optional]
**assets** | [**LiveStreamAssets**](LiveStreamAssets.md) |  |  [optional]
**playerId** | **String** | The unique identifier for the player. |  [optional]
**broadcasting** | **Boolean** | Whether or not you are broadcasting the live video you recorded for others to see. True means you are broadcasting to viewers, false means you are not. |  [optional]
**restreams** | [**List&lt;RestreamsResponseObject&gt;**](RestreamsResponseObject.md) | Returns the list of RTMP restream destinations. | 
**createdAt** | **OffsetDateTime** | When the player was created, presented in ISO-8601 format. |  [optional]
**updatedAt** | **OffsetDateTime** | When the player was last updated, presented in ISO-8601 format. |  [optional]


## Implemented Interfaces

* Serializable


