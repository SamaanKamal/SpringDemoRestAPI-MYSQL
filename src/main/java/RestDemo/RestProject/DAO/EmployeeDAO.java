package RestDemo.RestProject.DAO;

import RestDemo.RestProject.Entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAll();
}
