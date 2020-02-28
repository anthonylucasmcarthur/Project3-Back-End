package com.revature.JunitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.revature.entities.Employee;
import com.revature.repositories.CarRepo;
import com.revature.repositories.ConfigurationRepo;
import com.revature.repositories.EmployeeRepo;
import com.revature.repositories.OfficeRepo;

class BankEndTest {
	
	EmployeeRepo er;
	CarRepo cr;
	OfficeRepo or;
	ConfigurationRepo Cr;
	
	

	@Test
	void findByEmployee() {
		Employee employee=er.findByUsername("ROhr");
		System.out.println(employee);
		
		
	}

}
