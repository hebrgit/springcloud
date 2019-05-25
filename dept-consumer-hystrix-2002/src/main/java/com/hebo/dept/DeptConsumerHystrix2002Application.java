package com.hebo.dept;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author HEBO
 */
@SpringBootApplication(scanBasePackages = {"com.hebo.springcloudapi.service","com.hebo.dept.controller"})
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.hebo.springcloudapi.service"})
@EnableHystrix
public class DeptConsumerHystrix2002Application {

    public static void main(String[] args) {
        SpringApplication.run(DeptConsumerHystrix2002Application.class, args);
    }

}
