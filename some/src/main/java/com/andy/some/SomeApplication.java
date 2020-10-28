package com.andy.some;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by andy on 2017/10/16.
 */
@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class SomeApplication {

    @Value("${my.message}")
    private String message;

    @RequestMapping("/getsome")
    public String getSome() {
        //test测试
        return message;
    }


    public static void main(String[] args) {

        SpringApplication.run(SomeApplication.class, args);
    }



}
