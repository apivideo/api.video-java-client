

# Webhook

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**webhookId** | **String** | A unique identifier of the webhook you subscribed to. |  [optional]
**createdAt** | **OffsetDateTime** | The time and date when you created this webhook subscription, in ATOM UTC format. |  [optional]
**events** | **List&lt;String&gt;** | A list of events that you subscribed to. When these events occur, the API triggers a webhook call to the URL you provided. |  [optional]
**url** | **String** | The URL where the API sends the webhook. |  [optional]
**signatureSecret** | **String** | A secret key for the webhook you subscribed to. You can use it to verify the origin of the webhook call that you receive. |  [optional]


## Implemented Interfaces

* Serializable
* DeepObject


