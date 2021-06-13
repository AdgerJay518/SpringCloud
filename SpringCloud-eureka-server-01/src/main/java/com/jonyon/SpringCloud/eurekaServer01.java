package com.jonyon.SpringCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class eurekaServer01 {
    public static void main(String[] args) {
        SpringApplication.run(eurekaServer01.class,args);
    }
}
