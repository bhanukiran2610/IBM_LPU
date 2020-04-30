package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.TaskRepository;
import com.example.demo.model.Task;


@Service(value="taskService")
public class TaskServiceImpl implements TaskService{
	private TaskRepository taskRepository;

	@Autowired
	public TaskServiceImpl(TaskRepository taskRepository) {
		super();
		this.taskRepository = taskRepository;
	}

	@Override
	public Iterable<Task> getALlTasks() {
		// TODO Auto-generated method stub
		return taskRepository.findAll();
	}

}
