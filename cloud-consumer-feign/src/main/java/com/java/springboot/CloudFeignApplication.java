package com.java.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Auther: adminWei
 * @Date: 2021/10/4 11:07
 * @Description: CloudFeignApplication
 * @Version 1.0.0
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class CloudFeignApplication {
    public static void main(String[] args) {
        SpringApplication.run(CloudFeignApplication.class, args);
    }
}
