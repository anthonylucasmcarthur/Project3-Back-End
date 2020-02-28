package com.revature.app;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.revature.entities.Office;
import com.revature.services.OfficeService;

@SpringBootTest
class RideforceApplicationTests {

	@Autowired 
	OfficeService os; 
	
	@Test //works 
	void getOffices() {
		List<Office> offices = os.getOffices(); 
			for (Office o : offices) {
			System.out.println(o);
	}
			
	}
	
	@Test //works
	void getOfficeById() {
		Office office = os.getOfficeById(2); 
		System.out.println(office);
		
		
	}
	
	@Test //works
	void addOffice() {
		Office office = new Office(0, "123 hong kong drive"); 
		os.addOffice(office); 
		System.out.println(office);
	}
	
	@Test //works 
	void updateOffice() {
		Office office = os.getOfficeById(5);
		office.setOffice_address("123 belaire dr");
		os.updateOffice(office); 
		System.out.println(office);
	}
			
	}

