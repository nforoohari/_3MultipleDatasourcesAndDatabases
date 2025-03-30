package ir.digixo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.math.BigDecimal;
import ir.digixo.employee.entity.Employee;
import ir.digixo.product.entity.Product1;
import ir.digixo.product.entity.Product2;
import ir.digixo.employee.repository.EmployeeRepository;
import ir.digixo.product.repository.ProductRepository1;
import ir.digixo.product.repository.ProductRepository2;

@SpringBootTest
class ApplicationTests {

    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    private ProductRepository1 productRepository1;
    @Autowired
    private ProductRepository2 productRepository2;

    @Test
    void contextLoads() {
    }

    @Test
    void saveObjects() {
        employeeRepository.save(new Employee("nima"));
        productRepository1.save(new Product1("car", "new", new BigDecimal("1000")));
        productRepository2.save(new Product2("computer"));
    }
}
