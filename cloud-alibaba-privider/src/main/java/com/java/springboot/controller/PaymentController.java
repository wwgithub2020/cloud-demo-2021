package com.java.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: adminWei
 * @Date: 2021/10/6 16:00
 * @Description: PaymentController
 * @Version 1.0.0
 */
@RestController
public class PaymentController {
    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/payment/nacos/getPaymentById/{id}")
    public String getPaymentById(@PathVariable("id") Long id) {
        return "nacos registry, serverPort：" + serverPort + "\t id" + id;
    }
}
