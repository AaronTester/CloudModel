package com.aaron;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"org.aaron.service","com.aaron"})
@ComponentScan(basePackages = {"org.aaron.service","com.aaron"})
public class CloudbasicConsumerFeignHystrix80Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudbasicConsumerFeignHystrix80Application.class, args);
    }

}
