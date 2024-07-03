package com.adina.employeemanagementsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmpController {
    @Autowired
    private EmplooyeeService emplooyeeService;

    @GetMapping("employee")
    public List<Employee> getAllEmployee() {
        return emplooyeeService.getAllEmployees();
    }
    @PostMapping("addEmployee")
    public String addEmployee(@RequestBody Employee employee) {
        emplooyeeService.createEmployee(employee);
        return "Employee added";
    }
    @DeleteMapping("employee/{emp_id}")
    public String deleteEmployee(@PathVariable Long emp_id) {
        emplooyeeService.deleteEmployee(emp_id);
    return "Deleted Employee";
}
}

