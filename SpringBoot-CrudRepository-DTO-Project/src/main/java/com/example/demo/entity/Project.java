package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@Table(name = "project_name")
public class Project {
	
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private int id;
	 private String name;
	 private String description;
	 private String agentName;
	public Project(String name, String description, String agentName) {
		super();
		this.name = name;
		this.description = description;
		this.agentName = agentName;
	}
	 
	 

}
