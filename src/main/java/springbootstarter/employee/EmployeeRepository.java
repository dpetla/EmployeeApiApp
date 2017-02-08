package springbootstarter.employee;


import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

    List<Employee> findEmployeesByDepartment(String deptId);
}
