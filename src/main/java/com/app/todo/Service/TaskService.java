package com.app.todo.Service;

import com.app.todo.Models.Task;
import com.app.todo.Repository.TaskRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class TaskService {
    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Task> getAllTasks(){
        return taskRepository.findAll();
    }
    public Task createTask(String title){
        log.info("Creating a new task with title:{}",title);
        Task task = new Task();
        task.setTitle(title);
        task.setCompleted(false);
        taskRepository.save(task);
        log.info("New task completed successfully {}",task.getId());
        return task;
    }

    public Task updateTask(Long id ,String title){
        log.debug("Attempting to update task id {}",id);
        Task task = taskRepository.findById(id).orElseThrow(()->new RuntimeException("Task Not found"));
        task.setTitle(title);
        return taskRepository.save(task);

    }
}
