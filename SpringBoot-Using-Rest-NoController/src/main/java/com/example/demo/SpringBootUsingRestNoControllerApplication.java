package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repo.ImageRepository;

@SpringBootApplication
public class SpringBootUsingRestNoControllerApplication {
	private ImageRepository imageRepository;
	

	public SpringBootUsingRestNoControllerApplication(ImageRepository imageRepository) {
		super();
		this.imageRepository = imageRepository;
	}


	public static void main(String[] args) {
		SpringApplication.run(SpringBootUsingRestNoControllerApplication.class, args);
	}

}
