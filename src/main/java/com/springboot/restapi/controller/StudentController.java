package com.springboot.restapi.controller;


import com.springboot.restapi.entity.Student;
import com.springboot.restapi.repository.StudentRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    private  final StudentRepository studentRepository;

    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @GetMapping("/students")
    public List<Student> getStudent(){
        return studentRepository.findAll();
    }




}
