package com.example.demo.fallback;

import org.springframework.stereotype.Component;

import com.example.demo.client.EmployeeClient;

@Component
public class EmployeeFallBack implements EmployeeClient {
	@Override
	public String callHi(String name) {
		// TODO Auto-generated method stub
		return "<p>Currently, the service is unavailable :-( <p>";
	}

}
