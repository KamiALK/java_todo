package com.example.infrastructure.repositories;

import com.example.domain.models.Task;
import com.example.domain.ports.out.TaskRepositoryPort;


public class JpaTaskRepositoryAdapter implements TaskRepositoryPort {
   private final JpaTaskRepository jpaTaskRepository;
  public JpaTaskRepositoryAdapter(JpaTaskRepository jpaTaskRepository){
    this.jpaTaskRepositor= jpaTaskRepository;
  }



  @Override
  public Task save(Task task) {

    TaskEntity taskEntity = TaskEntity.fromDomainModel(task);
    TaskEntity savedTaskEntity = jpaTaskRepository.save(taskEntity);  
    return savedTaskEntity.toDomainModel();

    return jpaTaskRepository.save(TaskEntity.fromDomainModel(task));
  }


  @Override
  public Optional<Task> findById(Long id) {
    return jpaTaskRepository.findById(id).map(TaskEntity::toDomainModel);
  }

  @Override
  public List<Task> findAll() {
    return jpaTaskRepository.findAll().stream()
        .map(TaskEntity::toDomainModel)
        .collect(Collectors.toList());
  }

  @override
  public Optional<Task> update(Task task) {

    if(jpaTaskRepository.existsById(task.getId())) {
      TaskEntity taskEntity = TaskEntity.fromDomainModel(task);
      TaskEntity updatedTaskEntity = jpaTaskRepository.save(taskEntity);
      return Optional.of(updateTaskEntity.toDomainModel(updatedTaskEntity));

    return Optional.empty();
    }
  }
  
  @override
  public Optional<Task> deleteById(Long id) {
    if(jpaTaskRepository.existsById(id)) {
      jpaTaskRepository.deleteById(id);
      return true;
    }
    return false;
  }

  
}
