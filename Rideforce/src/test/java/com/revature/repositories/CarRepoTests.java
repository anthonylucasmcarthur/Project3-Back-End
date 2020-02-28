package com.revature.repositories;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.revature.entities.Car;
import com.revature.entities.Employee;

class CarRepoTests {

	EmployeeRepo er;
	CarRepo cr;
	
	@Test
	void findCarByEmployee() {
		Employee employee = er.findByUsername("LGoodfellow");
		List<Car> cars = cr.findByEmployee(employee);
		System.out.println(cars);
	}

}
