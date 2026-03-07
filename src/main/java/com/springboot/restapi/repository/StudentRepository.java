package com.springboot.restapi.repository;

import com.springboot.restapi.entity.Student;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface StudentRepository extends JpaRepository <Student,Long> {

}
