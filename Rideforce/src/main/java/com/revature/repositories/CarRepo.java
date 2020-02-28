package com.revature.repositories;


import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.revature.entities.Car;

@Repository
public interface CarRepo extends CrudRepository<Car,Integer>{

	@Query("select c from car c WHERE c.employee_id = ?1")
	public List<Car> findByEmployeeId(int employee_id);
}
