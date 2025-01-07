package com.example.application.usecases;
import com.example.domain.ports.in.CreateTaskUseCase;
import com.example.domain.ports.out.TaskRepositoryPort;


public class CreateTaskUseCaseImpl implements CreateTaskUseCase {
  private final TaskRepositoryPort taskRepository;
  public CreateTaskUseCaseImpl(TaskRepositoryPort taskRepository) {
    this.taskRepositoryPort = taskRepositoryPort;
  }
  @Override
  public Task createTask(Task task) {
    return taskRepositoryPort.save(task);
  }
}
