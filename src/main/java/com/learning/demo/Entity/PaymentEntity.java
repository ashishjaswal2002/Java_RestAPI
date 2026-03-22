package com.learning.demo.Entity;

import lombok.Data;

@Data
public class PaymentEntity {

    private Long id;
    private double paymentAmount;
    private String paymentCurrency;
    private String userEmail;

}