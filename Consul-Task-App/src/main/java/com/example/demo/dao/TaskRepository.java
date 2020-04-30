package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.example.demo.model.Task;

@Repository(value = "taskRepository")
@EnableTransactionManagement
public interface TaskRepository extends CrudRepository<Task,Integer> {

}
