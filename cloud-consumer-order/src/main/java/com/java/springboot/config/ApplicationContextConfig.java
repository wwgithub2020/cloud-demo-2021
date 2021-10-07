package com.java.springboot.config;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @Auther: adminWei
 * @Date: 2021/10/3 15:46
 * @Description: ApplicationContextConfig
 * @Version 1.0.0
 */
@SpringBootConfiguration
public class ApplicationContextConfig {
    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
