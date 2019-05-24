package com.hebo.deptconsumer2000;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author HEBO
 */
@SpringBootApplication
@EnableEurekaClient
public class DeptConsumer2000Application {

    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer2000Application.class, args);
    }

}
