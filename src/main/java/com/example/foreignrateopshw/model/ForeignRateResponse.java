package com.example.foreignrateopshw.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ForeignRateResponse {
    @JsonProperty("Date")
    private String date;
    @JsonProperty("USD/NTD")
    private String usdToNtd;
    @JsonProperty("RMB/NTD")
    private String rmbToNtd;
    @JsonProperty("EUR/USD")
    private String eurToUsd;
    @JsonProperty("USD/JPY")
    private String usdToJpy;
    @JsonProperty("GBP/USD")
    private String gbpToUsd;
    @JsonProperty("AUD/USD")
    private String audToUsd;
    @JsonProperty("USD/HKD")
    private String usdToHkd;
    @JsonProperty("USD/RMB")
    private String usdToRmb;
    @JsonProperty("USD/ZAR")
    private String usdToZar;
    @JsonProperty("NZD/USD")
    private String nzdToUsd;
}
