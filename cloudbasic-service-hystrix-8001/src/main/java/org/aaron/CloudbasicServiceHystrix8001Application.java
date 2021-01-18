package org.aaron;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker
public class CloudbasicServiceHystrix8001Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudbasicServiceHystrix8001Application.class, args);
    }

}
