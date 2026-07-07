package org.example.springlearn.controller;

import org.example.springlearn.model.Department;
import org.example.springlearn.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;
    @GetMapping("/departments")
    public ArrayList<Department> getAllDepartments(){
        return departmentService.getAllDepartments();
    }
}
