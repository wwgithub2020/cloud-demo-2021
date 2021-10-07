package com.java.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Auther: adminWei
 * @Date: 2021/10/6 15:55
 * @Description: CloudAlibabaApplication
 * @Version 1.0.0
 */
@EnableDiscoveryClient
@SpringBootApplication
public class CloudAlibabaApplication {
    public static void main(String[] args) {
        SpringApplication.run(CloudAlibabaApplication.class, args);
    }
}
