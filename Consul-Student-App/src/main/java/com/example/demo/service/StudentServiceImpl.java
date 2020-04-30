package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.StudentDao;
import com.example.demo.model.Student;


@Service
public class StudentServiceImpl implements StudentService {

	
	private StudentDao studentDao;
	
	@Autowired
	public StudentServiceImpl(StudentDao studentDao) {
		super();
		this.studentDao = studentDao;
	}

	@Override
	public Student addStudent(Student student) {
		// TODO Auto-generated method stub
		return studentDao.save(student);
	}

	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return (List<Student>)studentDao.findAll();
	}

	@Override
	public List<Student> getAllStudentBySchool(String name) {
		// TODO Auto-generated method stub
		return (List<Student>)studentDao.findByStudentSchool(name);
	}

	@Override
	public Student getStudentBySchoolAndRollNo(String name, int rollNo) {
		// TODO Auto-generated method stub
		return studentDao.findByStudentSchoolAndStudentRoll(name, rollNo).get();
	}

	@Override
	public Student getStudent(int rollNo) {
		// TODO Auto-generated method stub
		return studentDao.findById(rollNo).get();
	}

}
