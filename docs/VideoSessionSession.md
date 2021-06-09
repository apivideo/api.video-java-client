

# VideoSessionSession

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sessionId** | **String** | The unique identifier for the session that you can use to track what happens during it. |  [optional]
**loadedAt** | **OffsetDateTime** | When the video session started, presented in ISO-8601 format. |  [optional]
**endedAt** | **OffsetDateTime** | When the video session ended, presented in ISO-8601 format. |  [optional]
**metadata** | [**List&lt;Metadata&gt;**](Metadata.md) | A list of key value pairs that you use to provide metadata for your video. These pairs can be made dynamic, allowing you to segment your audience. You can also just use the pairs as another way to tag and categorize your videos. |  [optional]


## Implemented Interfaces

* Serializable


