package com.java.springboot.service;

import com.java.springboot.model.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @Auther: adminWei
 * @Date: 2021/10/2 17:32
 * @Description: PaymentService
 * @Version 1.0.0
 */
public interface PaymentService {
    Payment getPaymentById(@Param("id") Long id);

    int savePayment(Payment payment);
}
