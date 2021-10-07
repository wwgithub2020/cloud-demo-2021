package com.java.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Auther: adminWei
 * @Date: 2021/10/2 16:46
 * @Description: PaymentApplication
 * @Version 1.0.0
 */
@SpringBootApplication
@MapperScan("com.java.springboot.dao")
@EnableEurekaClient
public class PaymentApplication {
    public static void main(String[] args) {
        SpringApplication.run(PaymentApplication.class, args);
    }
}
