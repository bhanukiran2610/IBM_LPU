package com.example.demo.repo;

import java.util.List;

import com.example.demo.bean.ToDo;

public interface ToDoRepository {
	
	public ToDo createToDo(ToDo todo);
	public List<ToDo> toDosList();

}
