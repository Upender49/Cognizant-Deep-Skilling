package com.cognizant.orm_learn.model;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name="department")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="dp_id")
    private Integer id;

    @Column(name="dp_name")
    private String name;

    @OneToMany(mappedBy = "department")
    private Set<Employee> employees;

    public Set<Employee> getAllEmployees(){
        return employees;
    }
    public void setEmployees(Set<Employee> employees){
        this.employees = employees;
    }

    public Department() {
    }

    public Department(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
