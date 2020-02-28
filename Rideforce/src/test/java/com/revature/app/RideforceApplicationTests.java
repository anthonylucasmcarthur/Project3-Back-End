package com.revature.app;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.revature.entities.Car;
import com.revature.entities.Configuration;
import com.revature.entities.Employee;
import com.revature.entities.Office;
import com.revature.repositories.CarRepo;
import com.revature.repositories.ConfigurationRepo;
import com.revature.repositories.EmployeeRepo;
import com.revature.services.OfficeService;

@SpringBootTest
class RideforceApplicationTests {

	@Autowired 
	OfficeService os; 
	
	@Autowired
	EmployeeRepo er;
	
	@Autowired
	CarRepo cr;
	
	@Autowired
	ConfigurationRepo c;
	
	@Test //works 
	void getOffices() {
		List<Office> offices = os.getOffices(); 
			for (Office o : offices) {
			System.out.println(o);
			}
	}
	
	
	@Test // works
	void findByUsername() {
		String username = "LGoodfellow";
		Employee employee = er.findByUsername(username);
		System.out.println(employee);
	}
	
	@Test // works
	void findByIsDriver() {
		boolean isDriver = true;
		List<Employee> employees = er.findByIsDriver(isDriver);
		System.out.println(employees);
	}
	
	@Test // works
	void findByIsDriverAndOffice() {
		Office office = new Office(1,"496 High Street, Morgantown, WV 26506");
//		Office office = new Office(2,"11730 Plaza America Drive, Reston, VA 20190");
		boolean isDriver = true;
		List<Employee> employees = er.findByIsDriverAndOffice(isDriver, office);
		System.out.println(employees);
	}
	
	@Test // works
	void findByEmployee() {
		String username = "MCrilly";
		Employee employee = er.findByUsername(username);
		List<Car> cars = cr.findByEmployee(employee);
		System.out.println(cars);
	}
	
	@Test // works
	void findByLabel() {
		String label = "API_KEY";
		Configuration config = c.findByLabel(label);
		System.out.println(config);
	}
	
	
	
	
	
	@Test
	void deleteEmployee() { 
		Employee employee = er.findById(11);
		System.out.println(employee);
		er.delete(employee);
	}
	
	
	
	@Test
	void deleteCar() {
		Car car = cr.findById(17);
		cr.delete(car);
	}
	
	
	
}
