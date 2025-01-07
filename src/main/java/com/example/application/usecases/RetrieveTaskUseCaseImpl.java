package com.example.application.services;



public class RetrieveTaskUseCaseImpl implements RetrieveTaskUseCase {
  private final TaskRepositoryPort taskRepository;
  public RetrieveTaskUseCaseImpl(TaskRepositoryPort taskRepository) {
    this.taskRepositoryPort = TaskRepositoryPort;
  }


  @Override
  public List<Task> getAllTasks() {
    return taskRepositoryPort.findAll();
  }
  @Override
  public Optional<Task> getTask(Long id) {
    return taskRepositoryPort.findById(id);
  }
}
