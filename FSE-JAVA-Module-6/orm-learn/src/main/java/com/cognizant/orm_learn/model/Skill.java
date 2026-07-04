package com.cognizant.orm_learn.model;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name="skill")
public class Skill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="sk_id")
    private Integer id;

    @Column(name="sk_name")
    private String name;
    @ManyToMany(mappedBy = "skillSet")
    Set<Employee> employees;
    public Skill() {
    }
    public Set<Employee> getEmployees(){
        return employees;
    }
    public void setEmployees(Set<Employee> employees){
        this.employees = employees;
    }
    public Skill(Integer id, String name) {
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
        return "Skill{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
