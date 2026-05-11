package com.app.todo.Repository;

import com.app.todo.Models.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task,Long> {


}
