package com.springboot.restapi.controller;

import com.springboot.restapi.dto.StudentDto;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("/student")
    public StudentDto getStudent(){
        return new StudentDto(4L,"John Doe","john@gmail.com");
    }

    @GetMapping("/student/{id}")
    public StudentDto getStudentById(){
        return new StudentDto(4L,"John Doe","john@gmail.com");
    }



}
