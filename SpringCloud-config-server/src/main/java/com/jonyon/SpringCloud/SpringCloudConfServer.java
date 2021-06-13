package com.jonyon.SpringCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author 吴政杰
 */
@SpringBootApplication
@EnableConfigServer// 开启spring cloud config server服务
public class SpringCloudConfServer {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConfServer.class,args);
    }
}
