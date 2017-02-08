package springbootstarter.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;


    // GET Method handlers
    // Get the list of all employees
    @RequestMapping("/employees")
    public Iterable<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    // Get the list of all employees of one department
    @RequestMapping("/depts/{deptId}/employees")
    public Iterable<Employee> getEmployeesByDept(@PathVariable String deptId) {
        return employeeService.getEmployeesByDept(deptId);
    }

    // Get employee of a specific id
    @RequestMapping("/depts/{deptId}/employees/{id}")
    public Employee getEmployee(@PathVariable String id) {
        return employeeService.getEmployee(id);
    }

    //POST Method handler
    @RequestMapping(method = RequestMethod.POST, value = "/depts/{deptId}/employees")
    public void addEmployee(@RequestBody Employee employee, @PathVariable String deptId) {
        employee.setDepartment(deptId);
        employeeService.addEmployee(employee);
    }

    //PUT Method handler
    @RequestMapping(method = RequestMethod.PUT, value = "/depts/{deptId}/employees/{id}")
    public void updateEmployee(@RequestBody Employee employee, @PathVariable String deptId) {
        employee.setDepartment(deptId);
        employeeService.updateEmployee(employee);
    }

    //DELETE Method handler
    @RequestMapping(method = RequestMethod.DELETE, value = "/depts/{deptId}/employees/{id}")
    public void updateEmployee(@PathVariable String id) {
        employeeService.deleteEmployee(id);
    }
}
