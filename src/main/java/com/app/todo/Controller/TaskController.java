package com.app.todo.Controller;
import com.app.todo.Models.Task;
import com.app.todo.Service.TaskService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = {"/todo/api"})
public class TaskController {


    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping(value = "/tasks")
    public List<Task> getAllTasks(){
        return taskService.getAllTasks();
    }

    @PostMapping(value="/create-tasks")
    public ResponseEntity<Map<String,Object>> createTasks(@RequestBody Map<String,String>body){
        String title = body.get("title");
        Task newTask = taskService.createTask(title);
        Map<String,Object> response = new HashMap<>();
        response.put("message","Task Created Successfully");
        response.put("data",newTask);

        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @PostMapping(value="/{id}/update-task")
    public ResponseEntity<Map<String,Object>>  updateTask(@PathVariable Long id,@RequestBody  String title){
      Task updateTask = taskService.updateTask(id,title);

      Map<String,Object> response = new HashMap<>();
      response.put("message","Task Updated Successfully");
      response.put("data",updateTask);
      return new ResponseEntity<>(response,HttpStatus.OK);

    }


    @PostMapping(value="/{id}/delete-task")
    public ResponseEntity<Map<String,Object>> deleteTask(@PathVariable Long id){
        Task deleteTask = taskService.deleteTask(id);
        Map<String,Object> response = new HashMap<>();
        response.put("message","Task Deleted Successfully");
        response.put("data",deleteTask);
        return new ResponseEntity<>(response,HttpStatus.OK);
    }




    }
