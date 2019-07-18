package com.cdxt.springconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer//开启服务器
public class SpringConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringConfigServerApplication.class, args);
    }

}
