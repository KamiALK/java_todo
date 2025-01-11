package com.example.infrastructure.repositories;

import com.example.domain.models.Task;
import com.example.infrastructure.entities.TaskEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaTaskRepository extends JpaTaskRepository<TaskEntity, Long> {


}

