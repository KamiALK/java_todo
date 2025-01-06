package com.example.domain.ports.in;
import com.example.domain.models.Task;

//secundarios
import java.util.List;
import java.util.Optional;

public interface RetrieveTaskUseCase {
  Optional<Task> getTask(Long id);
  List<Task>getAllTasks();
}
