package com.springboot.restapi.service;

import com.springboot.restapi.dto.StudentDto;

import java.util.List;

public interface StudentService {

    List<StudentDto> getAllStudent();

}
