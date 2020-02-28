package com.revature.app;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.revature.entities.Car;
import com.revature.entities.Employee;
import com.revature.entities.Office;
import com.revature.services.CarService;
import com.revature.services.ConfigurationService;
import com.revature.services.EmployeeService;
import com.revature.services.OfficeService;

@SpringBootTest
class RideforceApplicationTests {


	// CarServices Tests
	@Autowired
	CarService cs;
	
	@Autowired
	EmployeeService er;
	
	@Autowired
	ConfigurationService confs;
	
	@Autowired
	EmployeeService es;
	
	@Autowired
	OfficeService os;
	
	
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
	
	@Test
	void getConfigurationByLabelTest() {
		String label ="API_KEY";
		this.confs.getConfigurationByLabel(label);
	}
	
	@Test    // passed
	void getEmployeesTest() {
		List<Employee> emp = es.getEmployees();
	    for (Employee c:emp) {
	    	System.out.println(c);
	    }
	}
	@Test  //passed
	void getEmployeeByIdTest() {
		int id = 4;
		es.getEmployeeById(id);
	}
	@Test  //passed
	void getEmployeeByUsernameTest() {
		String username="LGoodfellow";
		es.getEmployeeByUsername(username);
	}
	@Test  //passed
	void getEmployeeByRoleTest() {
		boolean isDriver =true ;
		
		es.getEmployeeByRole(isDriver);
	}
	@Test
	void getEmployeeByRoleAndOfficeTest() {
		boolean isDriver =true ;
		Office office = os.getOfficeById(1);
		es.getEmployeeByRoleAndOffice(isDriver, office);
		
	}
	
	
}
