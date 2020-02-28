package com.revature.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.revature.entities.Employee;
import com.revature.entities.Office;

@Repository
public interface EmployeeRepo extends CrudRepository<Employee,Integer> {

	@Query("select e from employee e where e.user_name = ?1")
	public List<Employee> findByUsername(String username);
	
	@Query("select e from employee e where e.is_driver = ?1")
	public List<Employee> findByRole(boolean is_Driver);
	
	@Query("select e from employee e where e.is_driver = ?1 and e.office_id = ?2")
	public List<Employee> findByRoleAndOffice(boolean is_Driver, Office office);
}
