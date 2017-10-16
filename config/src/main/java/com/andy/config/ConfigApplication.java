package com.andy.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by dell on 2017/10/16.
 */
@SpringBootApplication
@EnableConfigServer //开启配置服务的支持
@EnableEurekaClient //开启作为Eureka Server的客户端的支持
public class ConfigApplication {

    public static void main(String[] args){

        SpringApplication.run(ConfigApplication.class, args);
    }

}
