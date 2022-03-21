

# VideoStatusIngestReceivedParts

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**parts** | **List&lt;Integer&gt;** | The parts that are have been uploaded, ordered. For example, if part 2 was sent before part 1, and both have been uploaded, the output will be [1, 2]. |  [optional]
**total** | **Integer** | Contains the number of expected parts. The total will be listed as \&quot;null\&quot; until the total number of parts is known. |  [optional]


## Implemented Interfaces

* Serializable


