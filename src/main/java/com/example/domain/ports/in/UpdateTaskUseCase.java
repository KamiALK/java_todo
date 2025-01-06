package com.example.domain.ports.in;



public interface UpdateTaskUseCase {
  Optional <Task> updateTask(Long id, Task updateTask);


}
