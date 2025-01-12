package com.example.domain.ports.out;
import java.util.List;
import java.util.Optional;


// vamos ha hacerlo
import com.example.domain.models.Task;
public interface ExternalServicePot {
  Task save(Task task);
  Optional<Task> findById(Long id);
  List<Task> findAll();
  Optional<Task> updateTask(Task task);
  boolean deleteById(Long id);
}
