package com.example.foreignrateopshw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HomeController {
    // 印出hello world
    @GetMapping("/")
    public String hello(Model model){
        model.addAttribute("title", "Hello World!");
        model.addAttribute("content", "hello world");
        return "hello";
    }
}
