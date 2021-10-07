package com.java.springboot.dao;

import com.java.springboot.model.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

/**
 * @Auther: adminWei
 * @Date: 2021/10/2 17:09
 * @Description: PaymentDao
 * @Version 1.0.0
 */
@Component
@Mapper
public interface PaymentDao {
    Payment getPaymentById(@Param("id") Long id);

    int savePayment(Payment payment);
}
