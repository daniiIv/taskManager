package com.example.taskmanagerwebandmysql.repositories;

import com.example.taskmanagerwebandmysql.entities.Task;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends CrudRepository<Task, Integer> {
}
