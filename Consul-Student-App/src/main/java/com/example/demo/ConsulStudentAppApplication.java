package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import com.example.demo.dao.StudentDao;
import com.example.demo.model.Student;

@SpringBootApplication
@EnableDiscoveryClient
public class ConsulStudentAppApplication implements CommandLineRunner{
	@Autowired
	private StudentDao studentDao;
	
	public static void main(String[] args) {
		SpringApplication.run(ConsulStudentAppApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
	studentDao.save(new Student("bhanu", 1, "abc"));
	studentDao.save(new Student("kartheek", 2, "pqr"));
	studentDao.save(new Student("Anil", 3, "xyz"));
	
	}

}
