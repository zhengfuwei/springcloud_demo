package com.cdxt.springservicefeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("spring-service-client")//标注调用哪个服务名称
public interface RemoteService {

    @GetMapping("/client")
    String calls(@RequestParam(value = "name")String name);
}
