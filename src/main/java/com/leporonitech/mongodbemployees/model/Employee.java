package com.leporonitech.mongodbemployees.model;

import java.math.BigDecimal;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class Employee {
	
	@Id
	private String id;
	
	private String name;
	
	private Integer age;
	
	private BigDecimal salary;
	
	private Employee boss;

}
