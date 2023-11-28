package com.example.taskmanagerwebandmysql.service;

import com.example.taskmanagerwebandmysql.entities.Task;
import com.example.taskmanagerwebandmysql.entities.TaskStatusEnum;
import com.example.taskmanagerwebandmysql.repositories.TaskRepository;
import com.sun.source.util.TaskListener;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TaskService {
    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository){
        this.taskRepository = taskRepository;
    }

    public Task create(Task task){
        return taskRepository.save(task);
    }

    public List<Task> findAll(){
        List<Task> tasks = new ArrayList<>();
        taskRepository.findAll().forEach(tasks::add);

        return tasks;
    }

    public Optional<Task> findById(int id){
        return taskRepository.findById(id);
    }

    public Task update(Task taskToUpdate){
        return taskRepository.save(taskToUpdate);
    }

    public void delete(int id){
        taskRepository.deleteById(id);
    }
}
