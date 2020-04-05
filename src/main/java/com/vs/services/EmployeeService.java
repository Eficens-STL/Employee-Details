package com.vs.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vs.model.Employee;
import com.vs.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
//Here we need to create one array list then we need to add object of employee to that
//	list
	
	public List<Employee> getAllEmployees(){
		// Here we are adding a regular single objects of employee to a Arraylist
		List<Employee> employees = new ArrayList<Employee>();
		
		// from Employeee Repository data will come that data need to be add in this employees
		 employeeRepository.findAll().forEach(employees1 ->employees.add(employees1));
		 return employees;
	}
	//Getting data by Particular Id For Particular id we send the Entity Object
	public Employee getEmployeeById(int eid){
		 return employeeRepository.findById(eid).get();
	}
	
	// Saving the Employee List
	public void saveorUpdate(Employee employee) {
		employeeRepository.save(employee);
	}
	
	// Deleting The Employee Data
	public void delete(int eid) {
		employeeRepository.deleteById(eid);
	}
	
	//Updating The Employee Data
	
	public void update(Employee employees, int eid) {
		employeeRepository.save(employees);
	}

	
	

	

}
