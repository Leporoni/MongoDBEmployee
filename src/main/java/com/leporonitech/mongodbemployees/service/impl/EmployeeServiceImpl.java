package com.leporonitech.mongodbemployees.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leporonitech.mongodbemployees.model.Employee;
import com.leporonitech.mongodbemployees.repository.EmployeeRepository;
import com.leporonitech.mongodbemployees.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public List<Employee> listAll() {		
		return this.employeeRepository.findAll();
	}

	@Override
	public Employee getById(String id) {
		return this.employeeRepository
				.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("Employee does note exist."));
	}

	@Override
	public Employee create(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getEmployeeByAgeRange(Integer from, Integer at) {
		// TODO Auto-generated method stub
		return null;
	}

}
