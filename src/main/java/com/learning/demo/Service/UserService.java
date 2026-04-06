package com.learning.demo.Service;

import com.learning.demo.Repository.UserRepository;
import org.apache.catalina.User;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<String> getUsers() {
        return userRepository.findAll();
    }

    public List<String> getUser() {
        return List.of();
    }
}