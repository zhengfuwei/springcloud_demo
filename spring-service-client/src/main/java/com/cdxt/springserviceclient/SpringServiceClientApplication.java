package com.cdxt.springserviceclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/***
 * 微服务的客户端
 */
@EnableEurekaClient//开启eureka客户端
@SpringBootApplication
public class SpringServiceClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringServiceClientApplication.class, args);
    }

}
