

# LiveStreamCreationPayload

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Add a name for your live stream here. | 
**_public** | **Boolean** | Whether your video can be viewed by everyone, or requires authentication to see it. A setting of false will require a unique token for each view. Learn more about the Private Video feature [here](https://docs.api.video/delivery/video-privacy-access-management). |  [optional]
**playerId** | **String** | The unique identifier for the player. |  [optional]
**restreams** | [**List&lt;RestreamsRequestObject&gt;**](RestreamsRequestObject.md) | Use this parameter to add, edit, or remove &#x60;RTMPS&#x60; or &#x60;RTMP&#x60; services where you want to restream a live stream. The list can only contain up to 5 destinations. |  [optional]


## Implemented Interfaces

* Serializable
* DeepObject


