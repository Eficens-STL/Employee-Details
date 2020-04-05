package com.vs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vs.model.Employee;
import com.vs.services.EmployeeService;

@RestController
@CrossOrigin(origins="http://localhost:6700")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;

	
	@RequestMapping(method=RequestMethod.GET, value="/employees")
	public List<Employee> getEmployees(){
		return employeeService.getAllEmployees();
		
	}
	// Here I was getting Employee By Particular Id
	
	@GetMapping("/employee/{id}")
	public Employee getEmplById(@PathVariable("id") int eid) {
		return employeeService.getEmployeeById(eid);
	}
	
	@PostMapping("/employee")
	public Employee saveEmployee(@RequestBody Employee employee) {
		employeeService.saveorUpdate(employee);
		System.out.println("Values that are getting was"+employee);
		return employee;
	}
	
	@PutMapping("/employee")
	public Employee update(@RequestBody Employee employee) {
		 employeeService.saveorUpdate(employee);
		 return employee;
	}
	
	@DeleteMapping("/employee/{id}")
	public void delete(@PathVariable("id") int eid) {
		employeeService.delete(eid);
	}
	
}
