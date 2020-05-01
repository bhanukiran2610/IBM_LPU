package com.example.demo.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.fallback.EmployeeFallBack;

@FeignClient(value="service-B", fallback = EmployeeFallBack.class)
public interface EmployeeClient {

	@RequestMapping("/api/employees/hi")
	public String callHi(@RequestParam String name);

}
