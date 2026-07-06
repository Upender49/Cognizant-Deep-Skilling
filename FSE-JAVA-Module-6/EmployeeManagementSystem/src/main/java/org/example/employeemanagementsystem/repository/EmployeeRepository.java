package org.example.employeemanagementsystem.repository;

import org.example.employeemanagementsystem.entity.Employee;
import org.example.employeemanagementsystem.entity.EmployeeDTO;
import org.example.employeemanagementsystem.projection.EmployeeNameEmailProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
    List<Employee> findByName(String name);
    List<Employee> findByEmailContaining(String email);
    List<Employee> findByNameStartingWith(String prefix);
    @Query(
            "SELECT e from Employee e where e.name =:name"
    )
    List<Employee> getEmployees(@Param("name") String name);
    List<Employee> findByEmail(String email);
    List<EmployeeNameEmailProjection> findBy();

    @Query("select new org.example.employeemanagementsystem.entity.EmployeeDTO(e.name,e.email) from Employee e")
    List<EmployeeDTO>getEmployeeData();
}
