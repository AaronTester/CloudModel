package org.aaron;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @Description
 * @Author Aaron
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2020/12/27
 */
@SpringBootApplication
@EnableHystrixDashboard
public class ConsumerHystrixDashBoard9001 {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerHystrixDashBoard9001.class, args);
    }
}
