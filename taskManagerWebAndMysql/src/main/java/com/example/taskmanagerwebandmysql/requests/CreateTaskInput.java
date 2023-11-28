package com.example.taskmanagerwebandmysql.requests;

import com.example.taskmanagerwebandmysql.entities.Task;
import com.example.taskmanagerwebandmysql.entities.TaskStatusEnum;

import java.time.LocalDateTime;
import java.util.Date;

public record CreateTaskInput(String name, String description,
                              TaskStatusEnum status, LocalDateTime dueDate) {

    public Task toTask(){
        Task task = new Task();

        task.setName(name);
        task.setDescription(description);
        task.setStatus(status);
        task.setDueDate(dueDate);

        return task;
    }

}
