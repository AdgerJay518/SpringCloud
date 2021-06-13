package com.jonyon.SpringCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class DeptConsumerDashBoard {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumerDashBoard.class,args);
    }
}
