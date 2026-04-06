package com.learning.demo.Controller;


import com.learning.demo.Repository.UserRepository;
import com.learning.demo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UseController
{


    private final UserService userService;



    public UseController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<String> getUsers(){
        return  userService.getUser();
    }
}
