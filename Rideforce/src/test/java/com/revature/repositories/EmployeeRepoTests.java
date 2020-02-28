package com.revature.repositories;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.revature.entities.Employee;
import com.revature.entities.Office;
import com.revature.repositories.EmployeeRepo;

class EmployeeRepoTests {

	@Autowired
	EmployeeRepo er;
	
	
	
//	@Test
//	void CreateEmployee() {
//		Office office = new Office(5, "123 belaire dr");
//		Employee employee = new Employee(0, "email@gmail.com", "fname", "lname", "3034509042", "nnme", "password", "2376 E 125th Ct", true, true, true, false, office);
//		employee = er.createEmployee(employee);
//		System.out.println(employee);
//	}
	
	
	@Test
	void findById() {
		Employee e = er.findById(2).get();
		System.out.println(e);
	}
	
	
	@Test
	void findByUsername() {
		String username = "SJans";
		Employee employee = er.findByUsername(username);
		System.out.println(employee);
	}
	

}
