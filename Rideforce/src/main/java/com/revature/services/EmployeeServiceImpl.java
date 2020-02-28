package com.revature.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.revature.entities.Employee;
import com.revature.entities.Office;
import com.revature.repositories.EmployeeRepo;

@Component
@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeRepo er;

	@Override
	public List<Employee> getEmployees() {
		return (List<Employee>) er.findAll();
	}

	@Override
	public Employee getEmployeeById(int id) {
		return er.findById(id).get();
	}

	@Override
	public List<Employee> getEmployeeByUsername(String username) {
		return er.findByUsername(username);
	}

	@Override
	public List<Employee> getEmployeeByRole(boolean isDriver) {
		return er.findByRole(isDriver);
	}

	@Override
	public List<Employee> getEmployeeByRoleAndOffice(boolean isDriver, Office office) {
		return er.findByRoleAndOffice(isDriver, office);
	}

	@Override
	public Employee addEmployee(Employee employee) {
		return er.save(employee);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		return er.save(employee);
	}

	@Override
	public boolean deleteEmployee(Employee employee) {
		er.delete(employee);
		return true;
	}

	@Override
	public List<Employee> getActiveDrivers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee loginEmployee(String username, String password) {
		Employee e = er.findByUsername(username).get(0);
		
		if (e.getPassword().equals(password)) {
			return e;
		}else {
			return null;
		}
		
	}

}
