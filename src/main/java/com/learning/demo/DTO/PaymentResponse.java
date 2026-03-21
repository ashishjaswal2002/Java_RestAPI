package com.learning.demo.DTO;

import lombok.Data;

@Data
public class PaymentResponse {
    private long id;
    private double amount;
    private String currency;

}
