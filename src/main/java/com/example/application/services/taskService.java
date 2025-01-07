package com.example.application.services;

import com.example.domain.models.Task;
import com.example.domain.ports.in.CreateTaskUseCase;
import com.example.domain.ports.in.DeleteTaskUseCase;
import com.example.domain.ports.in.GetAditionalTaskInfoUseCase;
import com.example.domain.ports.in.RetrieveTaskUseCase;
import com.example.domain.ports.in.UpdateTaskUseCase;

public class taskService implements CreateTaskUseCase, RetrieveTaskUseCase, UpdateTaskUseCase, DeleteTaskUseCase, GetAditionalTaskInfoUseCase {
  private final CreateTaskUseCase;
  private final RetrieveTaskUseCase;
  private final UpdateTaskUseCase;
  private final DeleteTaskUseCase;
  private final GetAditionalTaskInfoUseCase;


  public taskService(CreateTaskUseCase,RetrieveTaskUseCase,UpdateTaskUseCase,DeleteTaskUseCase,GetAditionalTaskInfoUseCase) {
    this.CreateTaskUseCase= CreateTaskUseCase;
    this.RetrieveTaskUseCase= RetrieveTaskUseCase;
    this.UpdateTaskUseCase= UpdateTaskUseCase;
    this.DeleteTaskUseCase= DeleteTaskUseCase;
    this.GetAditionalTaskInfoUseCase= GetAditionalTaskInfoUseCase;
    
  }






  @Override
  public Task createTask(Task task) {
    return CreateTaskUseCase.createTask(task);
  }

  @Override
  public Optional<Task> getTask(Long id) {
    return RetrieveTaskUseCase.getTask(id);
  }
  @Override
  public List<Task> getAllTasks() {
    return RetrieveTaskUseCase.getAllTasks();
  }
  @Override
  public Optional<Task> updateTask(Long id, Task updateTask) {
    return UpdateTaskUseCase.updateTask(id, updateTask);
  }
  @Override
  public boolean deleteTask(Long id) {
    return DeleteTaskUseCase.deleteTask(id);
  }
  @Override
  public AditionalTaskInfo getAditionalTaskInfo(Long id) {
    return GetAditionalTaskInfoUseCase.getAditionalTaskInfo(id);
  }
}
