package com.example.domain.ports.in;

import com.example.domain.models.Task;

public interface DeleteTaskUseCase {
  boolean deleteTask(Long id);
}
