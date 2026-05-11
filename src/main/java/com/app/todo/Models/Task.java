package com.app.todo.Models;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Data
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private boolean completed;
    @CreationTimestamp
    @Column(name="created_at",nullable=false,updatable=false)
    private LocalDateTime createdAt;

}
