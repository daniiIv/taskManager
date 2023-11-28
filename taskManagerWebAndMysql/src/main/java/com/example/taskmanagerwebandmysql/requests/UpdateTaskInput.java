package com.example.taskmanagerwebandmysql.requests;

import com.example.taskmanagerwebandmysql.entities.TaskStatusEnum;

import java.time.LocalDateTime;
import java.util.Date;

public record UpdateTaskInput(String name, String description, TaskStatusEnum status, LocalDateTime dueDate) {

}
