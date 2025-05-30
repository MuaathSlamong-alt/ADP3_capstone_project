/*
File name:  PaymentFactory.java
Author:     Talia Smuts
Student Number:    221126082
*/

package com.college.factory;

import com.college.domain.Payment;

public class PaymentFactory {
    public static Payment createPayment(
            int paymentId,
            String paymentAmount,
            String paymentMethod,
            String paymentStatus,
            String paymentDate
    ) {
        return new Payment.Builder()
                .setPaymentId(paymentId)
                .setPaymentAmount(paymentAmount)
                .setPaymentMethod(paymentMethod)
                .setPaymentStatus(paymentStatus)
                .setPaymentDate(paymentDate)
                .build();
    }

}
