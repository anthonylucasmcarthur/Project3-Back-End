package com.revature.app;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.revature.entities.Employee;
import com.revature.entities.Office;
import com.revature.repositories.EmployeeRepo;
import com.revature.services.OfficeService;

@SpringBootTest
class RideforceApplicationTests {

	@Autowired 
	OfficeService os; 
	
	@Autowired
	EmployeeRepo er;
	
	@Test //works 
	void getOffices() {
		List<Office> offices = os.getOffices(); 
			for (Office o : offices) {
			System.out.println(o);
			}
	}
	
	
	@Test
	void findByUsername() {
		String username = "LGoodfellow";
		Employee employee = er.findByUsername(username);
		System.out.println(employee);
	}
	
	@Test
	void findByIsDriver() {
		boolean isDriver = true;
		List<Employee> employees = er.findByIsDriver(isDriver);
		System.out.println(employees);
	}
	
	@Test
	void findByIsDriverAndOffice() {
		Office office = new Office(2,"11730 Plaza America Drive, Reston, VA 20190");
		boolean isDriver = true;
		List<Employee> employees = er.findByIsDriverAndOffice(isDriver, office);
		System.out.println(employees);
	}
	
}
