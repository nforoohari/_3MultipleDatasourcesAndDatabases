package ir.digixo;

import ir.digixo.employee.entity.Employee;
import ir.digixo.employee.repository.EmployeeRepository;
import ir.digixo.product.entity.Product;
import ir.digixo.product.repository.ProductRepository;
import jakarta.persistence.EntityManager;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@SpringBootTest
class ApplicationTests {

	@Autowired
	private ProductRepository productRepository;
	@Autowired
	private EmployeeRepository employeeRepository;

	/*@Autowired
	@Qualifier("productEntityManagerFactory")
	private EntityManager entityManager;*/

	@Test
	void contextLoads() {
		Employee hasan1 = employeeRepository.save(new Employee("ff"));
		List<Employee> all = employeeRepository.findAll();
		all.forEach(System.out::println);

	}

	@Test
	void findById() {

		productRepository.save(new Product("sdsd","sdsd",new BigDecimal("1000")));

	/*	System.out.println(entityManager);

		Product product = entityManager.find(Product.class, 1l);
		System.out.println(product.getPrice());*/

	}

}
