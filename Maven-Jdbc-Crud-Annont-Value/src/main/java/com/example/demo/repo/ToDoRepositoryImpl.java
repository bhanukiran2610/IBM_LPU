package com.example.demo.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.bean.ToDo;



@Repository
public class ToDoRepositoryImpl implements ToDoRepository {
	//property level injection
	
	private DataSource dataSource;
	@Autowired
	public ToDoRepositoryImpl(DataSource dataSource) throws SQLException {
		super();
		logger.log(Level.INFO, "connecting to MySql database");
		connection=dataSource.getConnection();
		logger.log(Level.INFO, "successfully connected");
		this.dataSource = dataSource;
	}

	private Connection connection=null;;
	
	private static Logger logger=Logger.getLogger("ToDoRepositoryImpl");

	public ToDo createToDo(ToDo todo) {
		try {
			
			PreparedStatement pStatement=connection.prepareStatement("insert into todo values(?,?)");
			pStatement.setString(1, todo.getTodoID());
			pStatement.setString(2, todo.getTodoName());
			pStatement.executeUpdate();
			logger.log(Level.INFO, "insertion has been successfully done");
		} catch (Exception e) {
			logger.log(Level.SEVERE, "unable to connect db");
			e.printStackTrace();
			
		}
			return todo;
		}
	
	
	
	public List<ToDo> toDosList() {
		try {
			connection = dataSource.getConnection();
			PreparedStatement stSelectAll = connection.prepareStatement("SELECT * FROM todo");
			ResultSet rs = stSelectAll.executeQuery();
			List<ToDo> toDos = new ArrayList<ToDo>();
			while (rs.next()) {
				toDos.add(new ToDo(rs.getString(1), rs.getString(2)));
			}
			return toDos;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}

	}
	}
	
