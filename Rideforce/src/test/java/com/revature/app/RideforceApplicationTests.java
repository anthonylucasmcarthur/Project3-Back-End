package com.revature.app;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.revature.entities.Car;
import com.revature.entities.Employee;
import com.revature.services.CarService;
import com.revature.services.EmployeeService;

@SpringBootTest
class RideforceApplicationTests {


	@Autowired
	CarService cs;
	
	@Autowired
	EmployeeService er;
	
	@Test   // passed
	void getCarsTest() {
		List<Car> car = cs.getCars();
		    for (Car c:car) {
		    	System.out.println(c);
		    }
		
	}

	@Test //passed
	void getCarByIdTest() {
		int id =1;
		Car car = cs.getCarById(id);
		System.out.println(car);
		
	}
	@Test //passed
	void getCarByEmployeeIdTest() {
		int employeeId=3;
		Car car = cs.getCarByEmployeeId(employeeId);
		System.out.println();
	}
	@Test //passed
	void addCarTest() {
		Employee employee = er.getEmployeeById(5);
		Car car = new Car();
		car.setCar_id(0);
		car.setAvailable_seats(3);
		car.setCar_year(2020);
		car.setColor("Red");
		car.setEmployee(employee);
		car.setMake("BMW");
		car.setModel("4");
		cs.addCar(car);
		
	}
	@Test
	void updateCarTest() {
		Employee employee = er.getEmployeeById(5);
		Car car = new Car();
		car.setCar_id(0);
		car.setAvailable_seats(3);
		car.setCar_year(2019);
		car.setColor("Red");
		car.setEmployee(employee);
		car.setMake("BMW");
		car.setModel("4");
		cs.updateCar(car);
		
	}
	@Test //passed
	void deleteCarTest() {
		Car car= new Car();
		car.setCar_id(12);
		
		cs.deleteCar(car);
	}
}
