package com.learning.demo.Repository;

import com.learning.demo.Entity.UserEntity;

import java.lang.reflect.Array;
import java.util.List;


public class UserRepository {

    private List<String> users = List.of(new String[]{"Tom", "jerry", "Dog"});

    public UserEntity saveUser(){
        System.out.println("Save user");
        return null;
    }


    public List<String> findAll(){
        return users;
    }



}
