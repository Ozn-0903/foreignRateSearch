package com.example.foreignrateopshw.controller;

import com.example.foreignrateopshw.model.ForeignRateResponse;
import com.example.foreignrateopshw.model.RateData;
import com.example.foreignrateopshw.service.ForeignRateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HomeController {
    @Autowired
    ForeignRateService service;

    // 印出hello world
    @GetMapping("/")
    public String hello(Model model){
        model.addAttribute("title", "Hello World!");
        model.addAttribute("content", "hello world");
        return "hello";
    }

    // 外幣匯率
    @GetMapping("/rateSetting")
    public String rateSetting(Model model) {
        // 取得每日外幣參考匯率api資料
        ForeignRateResponse govRate = service.getGovRateData();

        // 整理資料


        // 將參數塞入model
        model.addAttribute("date", govRate.getDate());


        return "foreignRate";
    }
}
