package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bean.ToDo;
import com.example.demo.repo.ToDoRepository;

@Service
public class ToDoServiceImpl implements ToDoService {
	
	private ToDoRepository toDoRepository;

	@Autowired
	public ToDoServiceImpl(ToDoRepository toDoRepository) {
		super();
		this.toDoRepository = toDoRepository;
	}

	public ToDo createToDo(ToDo todo) {
		
		return toDoRepository.createToDo(todo);
	}
	public List<ToDo> toDosList(){
		return toDoRepository.toDosList();
	}

}
