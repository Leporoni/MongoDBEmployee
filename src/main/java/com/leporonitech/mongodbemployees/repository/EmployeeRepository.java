package com.leporonitech.mongodbemployees.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.leporonitech.mongodbemployees.model.Employee;

public interface EmployeeRepository extends MongoRepository<Employee, String> {

}
