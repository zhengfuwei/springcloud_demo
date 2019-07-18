package com.cdxt.springconfigclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringConfigClientApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringConfigClientApplication.class, args);
    }

}
