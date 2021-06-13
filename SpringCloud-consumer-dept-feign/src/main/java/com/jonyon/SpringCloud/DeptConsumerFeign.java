package com.jonyon.SpringCloud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableEurekaClient
// feign客户端注解,并指定要扫描的包以及配置接口DeptClientService
@EnableFeignClients(basePackages = {"com.jonyon.SpringCloud"})
public class DeptConsumerFeign {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumerFeign.class,args);
    }
}
