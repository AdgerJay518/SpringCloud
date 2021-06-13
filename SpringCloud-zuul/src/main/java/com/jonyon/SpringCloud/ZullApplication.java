package com.jonyon.SpringCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy//开启zuul
public class ZullApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZullApplication.class,args);
    }
}
