package com.learning.demo.Service;

import com.learning.demo.DTO.PaymentRequest;
import com.learning.demo.DTO.PaymentResponse;
import com.learning.demo.Entity.PaymentEntity;
import com.learning.demo.Repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

  @Autowired
    PaymentRepository paymentRepository;
   public PaymentResponse getPaymentDetailsById(PaymentRequest internalReqObj){

       PaymentEntity paymentModel = paymentRepository.getPaymentById(internalReqObj);

       PaymentResponse paymentResponse = mapModelToResponse(paymentModel);

       return paymentResponse;


  }

  private PaymentResponse mapModelToResponse(PaymentEntity paymentEntity){
      PaymentResponse paymentResponse = new PaymentResponse();
      paymentResponse.setId(paymentEntity.getId());
      paymentResponse.setCurrency(paymentEntity.getPaymentCurrency());
      paymentResponse.setAmount(paymentEntity.getPaymentAmount());

      return paymentResponse;
  }

}
