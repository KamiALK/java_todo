
package com.example.infrastructure.config;


import com.example.application.services.taskService;
import com.example.domain.ports.out.TaskRepositoryPort;
import com.example.domain.ports.in.GetAditionalTaskInfoUseCase;
import com.example.domain.ports.out.ExternalServicePort;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

@configuration
public class ApplicationConfig {
  @Bean
  public TaskService TaskService(TaskRepositoryPort taskRepositoryPort, GetAditionalTaskInfoUseCase getAditionalTaskInfoUseCase) {
    return new TaskService(
      new CreateTaskUseCaseImpl(taskRepositoryPort),
      new RetrieveTaskUseCaseImpl(taskRepositoryPort),
      // new UpdateTaskUseCAseImpl(taskRepositoryPort),
      new DeleteTaskUseCaseImpl(taskRepositoryPort),
      new GetAditionalTaskInfoUseCaseImpl(taskRepositoryPort)
      getAditionalTaskInfoUseCase
    );
  }

  @Bean
  public TaskRepositoryPort taskRepositoryPort(JpaTaskRepositoryAdapter jpaTaskRepositoryAdapter) {
    return new JpaTaskRepositoryAdapter();
  }

  @Bean
  public GetAditionalTaskInfoUseCase getAditionalTaskInfoUseCase(ExternalServicePort externalServicePort) {
    return new GetAditionalTaskInfoUseCaseImpl(externalServicePort);

  }
  @Bean
  public ExternalServicePort externalServicePort() {
    return new ExternalServiceAdapter();
  }
