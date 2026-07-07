package org.example.springlearn.service;


import org.example.springlearn.dao.DepartmentDao;
import org.example.springlearn.model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

@Service
public class DepartmentService {
    @Autowired
    private DepartmentDao departmentDao;
    @Transactional
    public ArrayList<Department> getAllDepartments(){
        return departmentDao.getAllDepartments();
    }
}
