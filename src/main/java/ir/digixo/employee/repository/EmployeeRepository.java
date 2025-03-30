package ir.digixo.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ir.digixo.employee.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
