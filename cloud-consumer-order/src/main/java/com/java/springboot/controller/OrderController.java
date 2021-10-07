package com.java.springboot.controller;

import com.java.springboot.common.CommonResult;
import com.java.springboot.model.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * @Auther: adminWei
 * @Date: 2021/10/3 15:49
 * @Description: OrderController
 * @Version 1.0.0
 */
@RestController
@Slf4j
public class OrderController {

    private static final String URL = "http://localhost:8002";

    @Autowired
    private RestTemplate restTemplate;

    @PostMapping("/consumer/payment/savePayment")
    public CommonResult<Payment> savePayment(@RequestBody Payment payment) {
        try {
            return restTemplate.postForObject(URL + "/payment/savePayment", payment, CommonResult.class);
        } catch (Exception e) {
            log.info("新增信息异常", e);
        }
        return new CommonResult<>(201, "新增信息失败", null);
    }

    @GetMapping("/consumer/payment/getPaymentById/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        try {
            return restTemplate.getForObject(URL + "/payment/getPaymentById/" + id, CommonResult.class);
        } catch (Exception e) {
            log.info("获取信息异常", e);
        }
        return new CommonResult<>(201, "获取信息失败", null);
    }

    @GetMapping("/consumer/payment/paymentZipkin")
    public String paymentZipkin() {
        String result = restTemplate.getForObject(URL + "payment/paymentZipkin", String.class);
        return  result;
    }
}
