package com.cdxt.springserviceribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/***
 * 微服务远程调用（rest_ribbon）
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class SpringServiceRibbonApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringServiceRibbonApplication.class, args);
    }

    //rest远程调用方式
    @Bean
    @LoadBalanced //开启客户端负载均衡策略
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
