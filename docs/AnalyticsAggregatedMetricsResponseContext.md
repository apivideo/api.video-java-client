

# AnalyticsAggregatedMetricsResponseContext

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**metric** | [**MetricEnum**](#MetricEnum) | Returns the metric you selected. |  [optional]
**aggregation** | [**AggregationEnum**](#AggregationEnum) | Returns the aggregation you selected. |  [optional]
**timeframe** | [**AnalyticsAggregatedMetricsResponseContextTimeframe**](AnalyticsAggregatedMetricsResponseContextTimeframe.md) |  |  [optional]



## Enum: MetricEnum

Name | Value
---- | -----
PLAY | &quot;play&quot;
START | &quot;start&quot;
END | &quot;end&quot;
IMPRESSION | &quot;impression&quot;
IMPRESSION_TIME | &quot;impression-time&quot;
WATCH_TIME | &quot;watch-time&quot;



## Enum: AggregationEnum

Name | Value
---- | -----
COUNT | &quot;count&quot;
RATE | &quot;rate&quot;
TOTAL | &quot;total&quot;
AVERAGE | &quot;average&quot;
SUM | &quot;sum&quot;


## Implemented Interfaces

* Serializable
* DeepObject


