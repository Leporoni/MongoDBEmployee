package com.leporonitech.mongodbemployees.service;

import java.util.List;

import com.leporonitech.mongodbemployees.model.Employee;

public interface FuncionarioService {
	
	public List<Employee> listAll();
	
	public Employee getById(String id);
	
	public Employee create(Employee employee);
	
	public List<Employee> getEmployeeByAgeRange(Integer from, Integer at);

}
