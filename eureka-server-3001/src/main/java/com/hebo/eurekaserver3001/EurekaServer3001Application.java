package com.hebo.eurekaserver3001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author HEBO
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer3001Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer3001Application.class,args);
    }
}
