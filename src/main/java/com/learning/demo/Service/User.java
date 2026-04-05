package com.learning.demo.Service;


import com.learning.demo.Repository.OrderRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;

@Data

@Component
public class User {

    @Autowired
    OrderRepository order;
    public User(){
        System.out.println("Payment Done.....]");
    }

}
