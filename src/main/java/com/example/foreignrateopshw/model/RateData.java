package com.example.foreignrateopshw.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class RateData {
    //賣出幣別
    @JsonProperty("sellCcy")
    String sellCcy;

    //買入幣別
    @JsonProperty("buyCcy")
    String buyCcy;

    //匯率
    @JsonProperty("rate")
    String rate;

    //匯率上限設定
    @JsonProperty("maxRate")
    String maxRate;

    //匯率下限設定
    @JsonProperty("minRate")
    String minRate;
}
