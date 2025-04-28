package com.otsi.test_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

    @GetMapping("/test")
    public String test(){
        return "Application is up and running...";
    }
}
