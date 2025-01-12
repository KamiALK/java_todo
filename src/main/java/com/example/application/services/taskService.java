
package com.example.application.services;

import com.example.domain.models.Task;
import com.example.domain.models.AditionalTaskInfo;
import com.example.domain.ports.in.CreateTaskUseCase;
import com.example.domain.ports.in.DeleteTaskUseCase;
import com.example.domain.ports.in.GetAditionalTaskInfoUseCase;
import com.example.domain.ports.in.RetrieveTaskUseCase;
import com.example.domain.ports.in.UpdateTaskUseCase;

import java.util.List;
import java.util.Optional;

public class TaskService implements CreateTaskUseCase, RetrieveTaskUseCase, UpdateTaskUseCase, DeleteTaskUseCase, GetAditionalTaskInfoUseCase {
    
    private final CreateTaskUseCase createTaskUseCase;
    private final RetrieveTaskUseCase retrieveTaskUseCase;
    private final UpdateTaskUseCase updateTaskUseCase;
    private final DeleteTaskUseCase deleteTaskUseCase;
    private final GetAditionalTaskInfoUseCase getAditionalTaskInfoUseCase;

    public TaskService(CreateTaskUseCase createTaskUseCase, 
                       RetrieveTaskUseCase retrieveTaskUseCase, 
                       UpdateTaskUseCase updateTaskUseCase, 
                       DeleteTaskUseCase deleteTaskUseCase, 
                       GetAditionalTaskInfoUseCase getAditionalTaskInfoUseCase) {
        this.createTaskUseCase = createTaskUseCase;
        this.retrieveTaskUseCase = retrieveTaskUseCase;
        this.updateTaskUseCase = updateTaskUseCase;
        this.deleteTaskUseCase = deleteTaskUseCase;
        this.getAditionalTaskInfoUseCase = getAditionalTaskInfoUseCase;
    }

    @Override
    public Task createTask(Task task) {
        return createTaskUseCase.createTask(task);
    }

    @Override
    public Optional<Task> getTask(Long id) {
        return retrieveTaskUseCase.getTask(id);
    }

    @Override
    public List<Task> getAllTasks() {
        return retrieveTaskUseCase.getAllTasks();
    }

    @Override
    public Optional<Task> updateTask(Long id, Task updateTask) {
        return updateTaskUseCase.updateTask(id, updateTask);
    }

    @Override
    public boolean deleteTask(Long id) {
        return deleteTaskUseCase.deleteTask(id);
    }

    @Override
    public AditionalTaskInfo getAditionalTaskInfo(Long id) {
        return getAditionalTaskInfoUseCase.getAditionalTaskInfo(id);
    }
}
