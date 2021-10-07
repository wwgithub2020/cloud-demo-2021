package com.java.springboot.controller;

import com.java.springboot.common.CommonResult;
import com.java.springboot.model.Payment;
import com.java.springboot.service.PaymentFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: adminWei
 * @Date: 2021/10/4 15:53
 * @Description: OrderFeignController
 * @Version 1.0.0
 */
@RestController
@Slf4j
public class OrderFeignController {
    @Autowired
    private PaymentFeignService paymentFeignService;

    @GetMapping("/payment/getPaymentById/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        try {
            return paymentFeignService.getPaymentById(id);
        } catch (Exception e) {
            log.info("获取信息异常", e);
        }
        return new CommonResult<>(201, "获取信息失败", null);
    }
}
