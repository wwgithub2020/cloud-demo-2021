package com.java.springboot.service.impl;

import com.java.springboot.dao.PaymentDao;
import com.java.springboot.model.Payment;
import com.java.springboot.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Auther: adminWei
 * @Date: 2021/10/2 17:32
 * @Description: PaymentServiceImpl
 * @Version 1.0.0
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentDao paymentDao;

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }

    @Override
    public int savePayment(Payment payment) {
        return paymentDao.savePayment(payment);
    }

}
