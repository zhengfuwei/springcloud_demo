package com.cdxt.springserviceribbon.controller;

import com.cdxt.springserviceribbon.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping("/client")
    public String test(@RequestParam String name) {
        return testService.hello( name );
    }
}
