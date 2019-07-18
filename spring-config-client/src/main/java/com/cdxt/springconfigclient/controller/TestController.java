package com.cdxt.springconfigclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("${foo}")
    String foo;

    @GetMapping("/client")
    public String test(){
        return "hello config client!!!"+foo;
    }
}
