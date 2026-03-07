package com.springboot.restapi.service.impl;

import com.springboot.restapi.dto.StudentDto;

import com.springboot.restapi.entity.Student;
import com.springboot.restapi.repository.StudentRepository;
import com.springboot.restapi.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;
    @Override
    public List<StudentDto> getAllStudent() {
        List<Student> students = studentRepository.findAll();
        return students.stream()
                .map(student -> new StudentDto(student.getId(), student.getName(),student.getEmail())).toList();
    }
}
