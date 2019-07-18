package com.cdxt.springservicefeignhystrix.controller;

import com.cdxt.springservicefeignhystrix.service.RemoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {

    @Autowired
    private RemoteService remoteService;

    @GetMapping("/test")
    public String sayCall(@RequestParam(value = "name")String name){
        return remoteService.calls(name);
    }
}
