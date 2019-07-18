package com.cdxt.springservicefeignhystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/***
 * 基于feign 的hystrix （自带）
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableFeignClients
public class SpringServiceFeignHystrixApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringServiceFeignHystrixApplication.class, args);
    }

}
