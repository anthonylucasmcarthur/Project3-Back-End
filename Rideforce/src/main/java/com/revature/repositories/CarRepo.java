package com.revature.repositories;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.revature.entities.Car;
import com.revature.entities.Employee;

@Repository
public interface CarRepo extends CrudRepository<Car,Integer>{
	
	public Car findByEmployee(Employee employee);
	
	public Car findById(int id);
}
