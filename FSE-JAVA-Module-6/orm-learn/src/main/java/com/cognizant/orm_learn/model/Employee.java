package com.cognizant.orm_learn.model;

import jakarta.persistence.*;
import org.apache.catalina.util.Introspection;

import java.util.Date;
import java.util.Set;

@Entity
@Table(name="employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="em_id")
    private Integer id;

    @Column(name="em_name")
    private String name;

    @Column(name="em_salary")
    private Double salary;

    @Column(name="em_permanent")
    private Boolean permanent;

    @Column(name="em_date_of_birth")
    private Date dateOfBirth;

    @ManyToOne
    @JoinColumn(name = "em_dp_id")
    private Department department;
    @ManyToMany()
    @JoinTable(
            name = "employee_skill",
            joinColumns =
            @JoinColumn(name="es_em_id"),

            inverseJoinColumns =
            @JoinColumn(name="es_sk_id")
    )
    private Set<Skill> skillSet;
    public Employee() {
    }

    public Employee(Integer id, String name, Double salary, Boolean permanent, Date dateOfBirth) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.permanent = permanent;
        this.dateOfBirth = dateOfBirth;
    }
    public Set<Skill> getSkillSet(){
        return skillSet;
    }
    public void setSkillSet(Set<Skill> skillSet){
        this.skillSet = skillSet;
    }
    public Department getDepartment(){
        return department;
    }
    public void setDepartment(Department department) {
        this.department = department;
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

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Boolean getPermanent() {
        return permanent;
    }

    public void setPermanent(Boolean permanent) {
        this.permanent = permanent;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", permanent=" + permanent +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
