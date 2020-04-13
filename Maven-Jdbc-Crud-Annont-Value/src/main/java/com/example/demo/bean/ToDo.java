package com.example.demo.bean;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Component
public class ToDo {
	//@Value("123456")
	private String todoID;
	//@Value(randomnames.com)
	private String todoName;

	

}
