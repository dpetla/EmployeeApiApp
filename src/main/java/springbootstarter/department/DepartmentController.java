package springbootstarter.department;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;


    // GET Method handlers
    @RequestMapping("/depts")
    public Iterable<Department> getAllDepartments() { return departmentService.getAllDepartments(); }

    @RequestMapping("/depts/{id}")
    public Department getDepartment(@PathVariable String id) {
        return departmentService.getDepartment(id);
    }

    //POST Method handler
    @RequestMapping(method = RequestMethod.POST, value="/depts")
    public void addDepartment(@RequestBody Department department) {
        departmentService.addDepartment(department);
    }

    //PUT Method handler
    @RequestMapping(method = RequestMethod.PUT, value="/depts/{id}")
    public void updateDepartment(@RequestBody Department department, @PathVariable String id) {
        departmentService.updateDepartment(department);
    }

    //DELETE Method handler
    @RequestMapping(method = RequestMethod.DELETE, value="/depts/{id}")
    public void updateDepartment(@PathVariable String id) {
        departmentService.deleteDepartment(id);
    }
}
