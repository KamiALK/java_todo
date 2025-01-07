package com.example.application.services;


public class DeleteTaskUseCaseImpl implements DeleteTaskUseCase {
  private final TaskRepositoryPort taskRepository;
  public DeleteTaskUseCaseImpl(TaskRepositoryPort taskRepository) {
    this.taskRepositoryPort = TaskRepositoryPort;
  }
  @Override
  public boolean deleteTask(Long id) {
    return taskRepositoryPort.deleteById(id);
  }
}
