package com.cdxt.springserviceclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    
    @Value("${server.port}")
    String port;

    @GetMapping("/client")
    public String test(@RequestParam(value = "name",defaultValue = "George")String name){
        return "hello :"+name+" I am from port :"+port;
    }
}
