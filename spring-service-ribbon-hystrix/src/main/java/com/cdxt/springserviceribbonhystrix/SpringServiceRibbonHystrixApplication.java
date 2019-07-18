package com.cdxt.springserviceribbonhystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/***
 * 基于spring-cloud-ribbon的hystrix
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableHystrix
public class SpringServiceRibbonHystrixApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringServiceRibbonHystrixApplication.class, args);
    }

    //rest远程调用方式
    @Bean
    @LoadBalanced
    //开启客户端负载均衡策略
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
