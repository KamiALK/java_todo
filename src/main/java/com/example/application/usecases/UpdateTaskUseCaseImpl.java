package com.example.application.services;


puiblic class UpdateTaskUseCaseImpl implements UpdateTaskUseCase {
  private final TaskRepositoryPort taskRepositoryPort;
  public UpdateTaskUseCaseImpl(TaskRepositoryPort taskRepositoryPort) {
    this.taskRepositoryPort = taskRepositoryPort;
  }
  @Override
  public Optional<Task> updateTask(Long id, Task updateTask) {
    return taskRepositoryPort.update(updateTask);
  }
}

