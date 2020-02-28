package repositoryTests;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.revature.entities.Employee;
import com.revature.repositories.EmployeeRepo;

@SpringBootTest
class EmployeeRepoTests {

	@Autowired
	EmployeeRepo er;
	
	@Test
	void findByUsername() {
		String username = "LGoodfellow";
		Employee employee = er.findByUsername(username);
		System.out.println(employee);
	}

}
