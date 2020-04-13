package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Person {

	private String name = "bhanu";
	private int age = 22;
	private float height = 5.9f;
	private boolean isProgrammer = true;
	private Address address;
	
}
