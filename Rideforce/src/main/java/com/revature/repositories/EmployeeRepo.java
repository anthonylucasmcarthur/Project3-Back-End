package com.revature.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.revature.entities.Employee;
import com.revature.entities.Office;

@Repository
public interface EmployeeRepo extends CrudRepository<Employee,Integer> {
	
	public Employee findByUsername(String username);
//	
//	@Query("select all from employee")
//	public List<Employee> findByIsDriver(boolean isDriver);
//	
//	//@Query("select e from employee e where e.is_driver = ?1 and e.office_id = ?2")
//	//public List<Employee> findByIsDriverAndOffice(boolean is_Driver, Office office);
}
