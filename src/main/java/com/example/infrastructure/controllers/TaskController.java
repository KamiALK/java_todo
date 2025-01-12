package com.example.infrastructure.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.ResponseEntity;


import com.example.application.services.TaskService;
import com.example.domain.models.Task;


@RESTController
@RequestMapping("/api/tasks")
public class TaskController {
  
  private final TaskService taskService;

  public TaskController(TaskService taskService) {
    this.taskService= taskService;
  }
  @PostMapping
  public ResponseEntity<Task> createTask(@RequestBody Task task) {
    Task taskCreated = taskService.createTask(task);
    // return ResponseEntity.ok(taskService.createTask(task));
    return new ResponseEntity<>(taskCreated, HttpStatus.CREATED);

  }
  @GetMapping("/{taskId}")
  public ResponseEntity<Task>getTask(Long taskId) {
    return taskService.getTaskById(taskId).map(task -> new ResponseEntity<>(task, HttpStatus.OK)).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
  }


  @GetMapping
  public ResponseEntity<List<Task>> getAllTasks() {
    List<Task> tasks = taskService.getAllTasks();
    return new ResponseEntity<>(tasks, HttpStatus.OK);

  }

  @PostMapping("/{taskId}")
  public ResponseEntity<Task> updateTask(@PathVariable Long taskId, @RequestBody Task updateTask) {
    return taskService.updateTask(taskId, updateTask)
    .map(task -> new ResponseEntity<>(task, HttpStatus.OK))
    .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
  }

  @DeleteMapping("/{taskId}")
  public ResponseEntity<Void> deleteTask(@PathVariable Long taskId) {
    if(taskService.deleteTask(taskId).isEmpty()) {
      return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    else{
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);

    }
  }
  @GetMapping("/{taskId}")
  public ResponseEntity<AditionalTaskInfo> getAditionalTaskInfo(@PathVariable Long taskId) {
    AditionalTaskInfo aditionalTaskInfo = taskService.getAditionalTaskInfo(taskId);
    return new ResponseEntity<>(aditionalTaskInfo, HttpStatus.OK);

  }










}



