package com.example.repository;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.model.Employee;

@Repository
public class EmployeeRepository {
	
	@Autowired
	private List<Employee> employeeList;
	
	public List<Employee> getAllEmployeeList(){		
		
		return employeeList;
	}
	
	public Employee getEmployeeById(String id) {
		Employee findEmployee = null;
		for(Employee employee : employeeList) {
			if(id.equals(employee.getId())){
				findEmployee = employee;
				break;
			}
		}
		return findEmployee;
	}
	
	public List<Employee> getEmployeeWithParams(String firstName, String lastName){
		List<Employee> employeeParams = new ArrayList<>();
		for(Employee employee : employeeList) {
			if(employee.getFirstName().equals(firstName) &&
			   employee.getLastName().equals(lastName)) {
				employeeParams.add(employee);
			}
		}
		return employeeParams;
	}
	
	
	public Employee saveEmployee(Employee newEmployee){
		employeeList.add(newEmployee);
		return newEmployee;
	}
	
/*	public boolean deleteEmployeeById(String id) {
		Employee deleteEmployee = null;
		for(Employee employee : employeeList) {
			if(employee.getId().equals(id)) {
				deleteEmployee = employee;
			}
		}
		if(deleteEmployee != null) {
			employeeList.remove(deleteEmployee);
		}
		return true;
	}
*/	

	
	public boolean deleteEmployeeById(String id) {
		for(Employee employee : employeeList) {
			if(employee.getId().equals(id)) {
				employeeList.remove(employee);
				break;
			}
		}
		return true;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
