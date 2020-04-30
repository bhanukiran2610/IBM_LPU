package com.example.demo.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.example.demo.model.Student;

@Repository
@EnableTransactionManagement
public interface StudentDao extends CrudRepository<Student, Integer> {
	
	@Query
	public Iterable<Student> findByStudentSchool(String name);
	public Optional<Student> findByStudentSchoolAndStudentRoll(String schoolName,int rollNo);
}
