package com.cdxt.springservicefeignhystrix.hystrix;

import com.cdxt.springservicefeignhystrix.service.RemoteService;
import org.springframework.stereotype.Component;

/***
 * feign 熔断机制处理
 */
@Component
public class SchedualServiceHystric implements RemoteService {
    @Override
    public String calls(String name) {
        return "hello,"+name+",sorry,remote service timeout error!";
    }
}
