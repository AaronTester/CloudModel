package org.aaron;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

/**
 * @Description
 * @Author Aaron
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2020/12/27
 */
@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class ZuulService9999 {
    public static void main(String[] args) {
        SpringApplication.run(ZuulService9999.class, args);
    }
}
