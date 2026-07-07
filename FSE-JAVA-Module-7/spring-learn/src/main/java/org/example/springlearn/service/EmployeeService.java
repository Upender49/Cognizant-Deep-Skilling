package org.example.springlearn.service;

import lombok.Setter;
import org.example.springlearn.dao.EmployeeDao;
import org.example.springlearn.exception.EmployeeNotFoundException;
import org.example.springlearn.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeDao employeeDao;
    @Transactional
    public ArrayList<Employee> getAllEmployees(){
        return employeeDao.getAllEmployees();
    }
    @Transactional
    public void updateEmployee(Employee employee) throws EmployeeNotFoundException {
        employeeDao.updateEmployee(employee);
    }
    @Transactional
    public void deleteEmployee(int id) throws EmployeeNotFoundException{
        employeeDao.deleteEmployee(id);
    }


}
