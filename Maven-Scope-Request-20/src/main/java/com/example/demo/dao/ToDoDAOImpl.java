package com.example.demo.dao;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.model.ToDo;

@Repository("accountDAO")
public class ToDoDAOImpl implements ToDoDAO {
	
	
	private JdbcTemplate jdbcTemplate;
	private Logger logger=Logger.getLogger("AccountDAOImpl");
	@Autowired
	public ToDoDAOImpl(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}
	public ToDo createToDo(ToDo todo) {
		// TODO Auto-generated method stub
		String query="insert into account(toDoName,toDoId,toDoBy) values('"
				+todo.getName()+"','"
				+todo.getId()+"',"+todo.getCompletedBy()+")";
		
		jdbcTemplate.update(query);
		
		return todo;
	}

}
