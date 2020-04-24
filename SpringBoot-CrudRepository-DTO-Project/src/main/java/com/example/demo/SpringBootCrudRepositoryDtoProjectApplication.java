package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entity.Project;
import com.example.demo.repo.ProjectRepository;
import com.example.demo.service.ProjectQueryServiceImpl;

@SpringBootApplication
public class SpringBootCrudRepositoryDtoProjectApplication implements CommandLineRunner{
	private ProjectRepository projectRepository;
	
	@Autowired
	public SpringBootCrudRepositoryDtoProjectApplication(ProjectRepository projectRepository) {
		super();
		this.projectRepository = projectRepository;
	}


	public static void main(String[] args) {
		SpringApplication.run(SpringBootCrudRepositoryDtoProjectApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		projectRepository.save(new Project("Line Follower", "Electronics", "Vishnu"));
		projectRepository.save(new Project("Project Management", "Computer Science", "Umesh"));
		projectRepository.save(new Project("Robot", "mchanical", "Jaisurya"));
		
		
	}
}
