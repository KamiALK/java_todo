package com.example.application.services;



public class GetAditionalTaskInfoUseCaseImpl implements GetAditionalTaskInfoUseCase {
  private final ExternalServicePort externalServicePort;

  public GetAditionalTaskInfoUseCaseImpl(ExternalServicePort externalServicePort) {
    this.externalServicePort = externalServicePort;
  }

  @Override
  public AditionalTaskInfo getAditionalTaskInfo(Long id) {
    return externalServicePort.getAditionalTaskInfo(id);
  }
}
