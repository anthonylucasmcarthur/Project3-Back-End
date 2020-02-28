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
}
