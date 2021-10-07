package com.java.springboot.service;

import com.java.springboot.common.CommonResult;
import com.java.springboot.model.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Auther: adminWei
 * @Date: 2021/10/4 11:11
 * @Description: PaymentFeignService
 * @Version 1.0.0
 */
@Component
// 指定远程调用的微服务名称
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {
    @GetMapping("/payment/getPaymentById/{id}")
    CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);
}
