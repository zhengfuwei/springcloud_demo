package com.cdxt.springserviceribbonhystrix.service;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class TestService {

    @Autowired
    private RestTemplate restTemplate;
    //调用某个方法加上@HystrixCommand熔断注解即可
    @HystrixCommand(fallbackMethod = "hyHelloError")
    public String hello(String name){
        return restTemplate.getForObject("http://SPRING-SERVICE-CLIENT/client?name="+name,String.class);
    }

    /***
     * 熔断机制失败自动提示返回信息
     * @param name
     * @return
     */
    public String hyHelloError(String  name){
        return "hello,"+name+",sorry,remote service timeout error!";
    }
}
