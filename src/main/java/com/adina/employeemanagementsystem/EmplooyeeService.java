package com.adina.employeemanagementsystem;



import java.util.List;
public interface EmplooyeeService {
    String createEmployee(Employee employee);
    List<Employee> getAllEmployees();
    boolean deleteEmployee(Long id);
}
