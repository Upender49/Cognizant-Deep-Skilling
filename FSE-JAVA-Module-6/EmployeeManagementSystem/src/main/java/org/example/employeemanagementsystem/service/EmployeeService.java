package org.example.employeemanagementsystem.service;

import org.example.employeemanagementsystem.entity.Employee;
import org.example.employeemanagementsystem.repository.EmployeeRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;
    public EmployeeService(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }
    public Employee save(Employee employee){
        return employeeRepository.save(employee);
    }
    public List<Employee> getAll(){
        return employeeRepository.findAll();
    }
    public Employee get(Long id){
        return employeeRepository.findById(id)
                .orElseThrow();
    }
    public void delete(Long id){
        employeeRepository.deleteById(id);
    }
    public Page<Employee> getEmployees(int page, int size){
        Pageable pageable = PageRequest.of(page,size,
                Sort.by("name"));
        return employeeRepository.findAll(pageable);
    }

}
