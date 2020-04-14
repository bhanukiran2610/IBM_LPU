package com.example.demo.repo;

public class DataNotFoundException extends Exception {
	private static final long serialVersionUID = 1L;

	public DataNotFoundException()
	{
		super("Data not found");
	}

}
