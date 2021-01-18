package com.aaron;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CloudbasicConsumer80Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudbasicConsumer80Application.class, args);
    }

}
