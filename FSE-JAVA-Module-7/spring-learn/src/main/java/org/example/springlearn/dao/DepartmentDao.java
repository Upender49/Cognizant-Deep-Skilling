package org.example.springlearn.dao;

import org.example.springlearn.model.Department;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class DepartmentDao {
    public static ArrayList<Department> departments;
    DepartmentDao(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("employee.xml");
        departments = applicationContext.getBean("departmentList", ArrayList.class);

    }
    public ArrayList<Department> getAllDepartments(){
        return departments;
    }
}
