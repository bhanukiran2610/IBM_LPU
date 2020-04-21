package com.example;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;

public class PojoToJson {
	
	public static void main(String[] args) {
		Jsonb jsonb = JsonbBuilder.create();
		String result=jsonb.toJson(new Customer(1,"Bhanu","Kiran",true,new Address(),new String[3]));
		System.out.println(result);
		

	}
}
