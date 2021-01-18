package org.aaron;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CloudbasicService8003Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudbasicService8003Application.class, args);
    }

}
