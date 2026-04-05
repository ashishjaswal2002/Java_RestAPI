package com.learning.demo.Repository;


import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy

public class OrderRepository {

    public OrderRepository(){
        System.out.println("Payment intialized");
    }


}
