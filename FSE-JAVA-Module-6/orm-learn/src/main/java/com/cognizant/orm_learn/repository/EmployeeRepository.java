package com.cognizant.orm_learn.repository;

import com.cognizant.orm_learn.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeRepository
        extends JpaRepository<Employee,Integer> {
    @Query(
            """
    select e from Employee e 
    left join fetch e.department
    left join fetch e.skillSet
    where e.permanent = true 
"""
    )
    List<Employee> getAllPermanentEmployees();
}
