package org.example.springlearn.dao;

import org.example.springlearn.exception.EmployeeNotFoundException;
import org.example.springlearn.model.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;
import org.springframework.web.context.support.XmlWebApplicationContext;

import java.util.ArrayList;

@Repository
public class EmployeeDao {
    private static ArrayList<Employee> employees;
    public EmployeeDao(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("employee.xml");
        employees = applicationContext.getBean("employeeList", ArrayList.class);
    }
    public ArrayList<Employee> getAllEmployees(){
        return employees;
    }
    public void updateEmployee(Employee employee) throws EmployeeNotFoundException {
        for(int i=0; i<employees.size();i++){
            if(employees.get(i).getId() == employee.getId()){
                employees.set(i, employee);
                return ;
            }
        }
        throw new EmployeeNotFoundException();

    }
    public void deleteEmployee(int id) throws EmployeeNotFoundException {
        boolean removed = employees.removeIf(emp -> emp.getId()==id);
        if(!removed){
            throw new EmployeeNotFoundException();
        }
    }
}
