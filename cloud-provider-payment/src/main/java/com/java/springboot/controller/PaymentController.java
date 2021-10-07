package com.java.springboot.controller;

import com.java.springboot.common.CommonResult;
import com.java.springboot.model.Payment;
import com.java.springboot.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

/**
 * @Auther: adminWei
 * @Date: 2021/10/2 17:37
 * @Description: PaymentController
 * @Version 1.0.0
 */
@RestController
@Slf4j
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @GetMapping("/payment/getPaymentById/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
       try {
           Payment payment = paymentService.getPaymentById(id);
           if (!Objects.equals(null, payment)) {
               return new CommonResult(200, "获取信息成功", payment);
           }
       } catch (Exception e) {
           log.error("获取信息异常", e);
       }
       return new CommonResult(201, "获取信息失败", null);
    }

    @PostMapping("/payment/savePayment")
    public CommonResult<Payment> savePayment(@RequestBody Payment payment) {
        try {
            return new CommonResult(200, "新增信息成功", paymentService.savePayment(payment));
        } catch (Exception e) {
            log.info("新增信息异常", e);
        }
        return new CommonResult(201, "新增信息失败");
    }

    @GetMapping("/payment/paymentZipkin")
    public String paymentZipkin() {
        return "测试zipkin链路追踪数据-2021";
    }
}
