package com.springcloud.deptconsumerfegin2001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author HEBO
 */
@SpringBootApplication
@EnableFeignClients(basePackages = {"com.hebo.springcloudapi.service"})
public class DeptConsumerFegin2001Application {

    public static void main(String[] args) {
        SpringApplication.run(DeptConsumerFegin2001Application.class, args);
    }

}
