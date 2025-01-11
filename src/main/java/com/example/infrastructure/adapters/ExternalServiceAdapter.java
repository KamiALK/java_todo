package com.example.infrastructure.adapters;

public class ExternalServiceAdapter implements ExternalServicePort {


  // https://jsonplaceholder.typicode.com/todos
  // https://jsonplaceholder.typicode.com/users/
  @Override
  public AditionalTaskInfo getAditionalTaskInfo(Long id) {
    return null;
  }


  private static class JsonPlaceholderAPI {
    // https://jsonplaceholder.typicode.com/todos
    // https://jsonplaceholder.typicode.com/users/
    private Long id;
    private Long userId;
    
  }
}
