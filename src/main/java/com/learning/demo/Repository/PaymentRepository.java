package com.learning.demo.Repository;

import com.learning.demo.DTO.PaymentRequest;
import com.learning.demo.Entity.PaymentEntity;
import org.springframework.stereotype.Repository;

@Repository
public class PaymentRepository {

     public PaymentEntity getPaymentById(PaymentRequest request){
         PaymentEntity paymentModel = exectueQuery(request);
         return paymentModel;
     }

    private PaymentEntity exectueQuery(PaymentRequest request){
        PaymentEntity payment =  new PaymentEntity();
        payment.setId(request.getPaymentId());
        payment.setPaymentCurrency("INR");
        payment.setPaymentAmount(100.00);
        return payment;
    }

}
