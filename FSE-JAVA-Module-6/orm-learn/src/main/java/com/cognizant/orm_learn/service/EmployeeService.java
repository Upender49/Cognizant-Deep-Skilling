package com.cognizant.orm_learn.service;

import com.cognizant.orm_learn.model.Employee;
import com.cognizant.orm_learn.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    @Transactional
    public Employee get(Integer id){
        return employeeRepository.findById(id).get();
    }
    @Transactional
    public void save(Employee employee){
        employeeRepository.save(employee);
    }
    @Transactional
    public List<Employee> getAllPermanentEmployees(){
        return employeeRepository.getAllPermanentEmployees();
    }
    @Transactional
    public Double getAverageSalary(int id){
        return employeeRepository.getEmployeeAvgSal(id);
    }

    @Transactional
    public List<Employee> getAllEmployeesNative(){
        return employeeRepository.getAllEmployeesNative();
    }
}
