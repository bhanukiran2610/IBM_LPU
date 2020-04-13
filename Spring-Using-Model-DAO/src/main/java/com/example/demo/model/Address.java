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
public class Address {

	private int streetNo = 14;
	private String streetName = "GandhiNagar";
	private String city = "Somala";
	private String country = "India";
}
