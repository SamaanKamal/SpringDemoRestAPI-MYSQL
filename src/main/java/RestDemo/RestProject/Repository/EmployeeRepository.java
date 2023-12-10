package RestDemo.RestProject.Repository;

import RestDemo.RestProject.Entity.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee,Integer> {
}
