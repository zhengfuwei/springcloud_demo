package com.cdxt.springservicefeignhystrix.service;

import com.cdxt.springservicefeignhystrix.hystrix.SchedualServiceHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
//feign的熔断机制 只需要在fallback 指定实体类 即可
@FeignClient(value = "spring-service-client",fallback = SchedualServiceHystric.class)//标注调用哪个服务名称
public interface RemoteService {
    /***
     * 远程调用的方法
     * @param name
     * @return
     */
    @GetMapping("/client")
    String calls(@RequestParam(value = "name") String name);
}
