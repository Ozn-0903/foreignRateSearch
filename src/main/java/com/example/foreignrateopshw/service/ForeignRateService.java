package com.example.foreignrateopshw.service;

import com.example.foreignrateopshw.model.ForeignRate;
import com.example.foreignrateopshw.model.ForeignRateResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


public interface ForeignRateService {
    // 取得每日外幣參考匯率api資料
    public ForeignRateResponse getGovRateData();


}
