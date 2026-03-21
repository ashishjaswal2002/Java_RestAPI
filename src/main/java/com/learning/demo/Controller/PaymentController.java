package com.learning.demo.Controller;

import com.learning.demo.DTO.PaymentRequest;
import com.learning.demo.DTO.PaymentResponse;
import com.learning.demo.Entity.PaymentEntity;
import com.learning.demo.Service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/payments")

public class PaymentController {

    @Autowired
    PaymentService paymentService;

    @GetMapping("/{id}")
    public ResponseEntity<PaymentResponse> getPaymentById(@PathVariable Long id){

        PaymentRequest internalReqObj = new PaymentRequest();
        internalReqObj.setPaymentId(id);

        PaymentResponse payment  = paymentService.getPaymentDetailsById(internalReqObj);

        return ResponseEntity.ok(payment);


    }


}
