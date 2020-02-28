package com.revature.app;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.controllers.OfficeController;
import com.revature.entities.Office;
import com.revature.services.OfficeService;

@SpringBootTest
@AutoConfigureMockMvc
class RideforceApplicationTests {
	
	@Autowired
	private MockMvc mvc;
	
	@MockBean
	OfficeService os;

	@Test
	public void testAddingBatch() throws Exception {
		
		String json = "{\"office_id\":100,\"office_address\":\"test address}";
		
		Office o = new Office();
//		o.setOffice_address("test address");
//		o.setOffice_id(100);
		
		Mockito.when(os.addOffice(o)).thenReturn(o);
		
		ResultActions rs = mvc.perform(post("/offices").contentType(MediaType.APPLICATION_JSON_VALUE).content(json));
		rs.andExpect(status().is2xxSuccessful());

	}

}
