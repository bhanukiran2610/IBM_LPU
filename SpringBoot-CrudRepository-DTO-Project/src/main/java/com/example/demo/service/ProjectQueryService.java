package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.ProjectQueryDTO;

public interface ProjectQueryService {
	
	public ProjectQueryDTO getProject(Integer Id);
	
	public List getAllProjects();
}
