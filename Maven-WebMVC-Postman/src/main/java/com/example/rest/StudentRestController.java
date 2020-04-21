package com.example.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Student;

@RestController
@RequestMapping("/api")
public class StudentRestController {

	// define endpoint for "/students" - return list of students
	
	@GetMapping("/students")
	public List<Student> getStudents() {

		List<Student> theStudents = new ArrayList<>();
		
		theStudents.add(new Student("Bhanu", "Kiran"));
		theStudents.add(new Student("Surya", "Kartheek"));
		theStudents.add(new Student("Anil", "D"));		
			
		return theStudents;
	}
	
}
