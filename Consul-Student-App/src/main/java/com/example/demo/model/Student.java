package com.example.demo.model;

import javax.persistence.Column;
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
@NoArgsConstructor
@Getter
@Setter
@ToString
@Table(name="student")
public class Student {
	
	@Id
	@Column(name="student_roll")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int studentRoll;
	
	@Column(name="student_name")
	private String studentName;
	
	@Column(name="student_class")
	private int studentClass;
	
	@Column(name="student_school")
	private String studentSchool;

	public Student(String studentName, int studentClass, String studentSchool) {
		super();
		this.studentName = studentName;
		this.studentClass = studentClass;
		this.studentSchool = studentSchool;
	}
	
	
	

}
