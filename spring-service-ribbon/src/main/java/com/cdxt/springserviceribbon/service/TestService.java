package com.cdxt.springserviceribbon.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class TestService {

    @Autowired
    private RestTemplate restTemplate;

    /***
     * 远程调用的方法
     * @param name
     * @return
     */
    public String hello(String name){
        return restTemplate.getForObject("http://SPRING-SERVICE-CLIENT/client?name="+name,String.class);
    }
}
