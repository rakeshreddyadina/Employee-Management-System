package com.adina.employeemanagementsystem;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Controller
@Service
public class EmplooyeeServiceImpl implements EmplooyeeService {
    @Autowired
    private EmpRepository empRepository;
    List<Employee> employees = new ArrayList<Employee>();
    @Override
    public String createEmployee(Employee employee) {
        empRepository.save(employee);
        return "Employee created";
    }

    @Override
    public List<Employee> getAllEmployees() {
        return empRepository.findAll();
    }

    @Override
    public boolean deleteEmployee(Long emp_id) {
        empRepository.delete(empRepository.getReferenceById(emp_id));
        return true;
    }
}
