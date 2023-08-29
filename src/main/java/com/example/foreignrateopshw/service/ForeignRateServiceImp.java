package com.example.foreignrateopshw.service;

import com.example.foreignrateopshw.model.ForeignRate;
import com.example.foreignrateopshw.model.ForeignRateResponse;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ForeignRateServiceImp implements ForeignRateService{
    public ForeignRateResponse getGovRateData(){
        // 每日外幣參考匯率api URL
        String apiUrl = "https://openapi.taifex.com.tw/v1/DailyForeignExchangeRates";

        // 建立RestTemplate
        RestTemplate template = new RestTemplate();
        // 發送 GET 請求並取得 API 回應
        ForeignRateResponse apiResponse = template.getForObject(apiUrl, ForeignRateResponse.class);

        return apiResponse;
    }
}
