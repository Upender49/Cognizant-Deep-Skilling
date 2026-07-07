package org.example.springlearn.controller;

import org.example.springlearn.exception.EmployeeNotFoundException;
import org.example.springlearn.model.Employee;
import org.example.springlearn.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @GetMapping("/employees")
    public ArrayList<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }
    @PutMapping("/employees")
    public void updateEmployee(@RequestBody Employee employee) throws EmployeeNotFoundException {
        employeeService.updateEmployee(employee);
    }
    @DeleteMapping("/employees/{id}")
    public void deleteEmployee(@PathVariable int id) throws EmployeeNotFoundException{
        employeeService.deleteEmployee(id);
    }
}
