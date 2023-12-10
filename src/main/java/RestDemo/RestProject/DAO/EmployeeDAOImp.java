package RestDemo.RestProject.DAO;

import RestDemo.RestProject.Entity.Employee;
import RestDemo.RestProject.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeDAOImp implements EmployeeDAO{
    @Autowired
    private EmployeeRepository employeeRepository;

    List<Employee> employees = new ArrayList<>();

    @Override
    public List<Employee> findAll() {
        employeeRepository.findAll().forEach(employees::add);
        return employees;
    }
}
