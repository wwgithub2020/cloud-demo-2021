package com.java.springboot.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther: adminWei
 * @Date: 2021/10/4 16:46
 * @Description: FeignConfig
 * @Version 1.0.0
 */
@Configuration
public class FeignConfig {
    @Bean
    public Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }
}
