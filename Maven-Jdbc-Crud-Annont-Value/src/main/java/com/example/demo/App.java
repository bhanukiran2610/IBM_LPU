package com.example.demo;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.demo.bean.ToDo;
import com.example.demo.repo.ToDoRepository;
import com.example.demo.repo.ToDoRepositoryImpl;
import com.example.demo.service.ToDoService;
import com.example.demo.service.ToDoServiceImpl;

public class App 
{

	
	
	
	public static void main( String[] args )
    {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		
		ToDoService service=context.getBean("toDoServiceImpl",ToDoServiceImpl.class);
		/*
		 * ToDo todo=context.getBean("toDo",ToDo.class);
		 * todo.setTodoID(UUID.randomUUID().toString());
		 * todo.setTodoName("randomly given"); todo=service.createToDo(todo);
		 */
		List<ToDo> list=service.toDosList();
		for(ToDo toDo: list) {
			System.out.println(toDo);
		}
		
		
    }
}
