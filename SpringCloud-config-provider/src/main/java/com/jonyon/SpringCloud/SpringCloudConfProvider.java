package com.jonyon.SpringCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringCloudConfProvider {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConfProvider.class,args);
    }
}
