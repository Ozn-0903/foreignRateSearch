package com.example.foreignrateopshw.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ForeignRate {
    // 資料日期
    @JsonProperty("date")
    String date;

    // 匯率資料
    @JsonProperty("rateData")
    RateData rateData;
}
