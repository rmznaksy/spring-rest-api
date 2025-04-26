package com.example.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.model.Employee;

@Configuration
public class AppConfig {
	
	@Bean
	public List<Employee> employeeList(){
		List<Employee> employeeList = new ArrayList<>();
		
		employeeList.add(new Employee("1", "Ramazan", "AKSOY"));
		employeeList.add(new Employee("2", "Yağmur", "AKSOY"));
		employeeList.add(new Employee("3", "Fatih", "AKSOY"));
		employeeList.add(new Employee("4", "Mustafa", "AKSOY"));
		employeeList.add(new Employee("5", "Ahsen", "AKSOY"));
		
		return employeeList;
	}
	
}
