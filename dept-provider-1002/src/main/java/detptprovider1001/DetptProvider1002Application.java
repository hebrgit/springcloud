package detptprovider1001;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author HEBO
 */
@SpringBootApplication
@MapperScan(value = "com.hebo.detptprovider1001.dao")
@EnableEurekaClient
public class DetptProvider1002Application {

    public static void main(String[] args) {
        SpringApplication.run(DetptProvider1002Application.class, args);
    }

}
