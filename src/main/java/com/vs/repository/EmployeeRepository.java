package com.vs.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.vs.model.Employee;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
	
//	@Query(" EID,FirstName,LastName,Email from eedtails where EID =1")
//	 List<Employee> getEmpIntial(int eid,String firstName,String lastName,String email);
	

}
