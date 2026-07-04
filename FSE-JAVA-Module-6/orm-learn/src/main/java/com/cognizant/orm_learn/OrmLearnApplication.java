package com.cognizant.orm_learn;

import com.cognizant.orm_learn.model.Country;
import com.cognizant.orm_learn.model.Department;
import com.cognizant.orm_learn.model.Employee;
import com.cognizant.orm_learn.model.Skill;
import com.cognizant.orm_learn.repository.StockRepository;
import com.cognizant.orm_learn.service.CountryService;
import com.cognizant.orm_learn.service.DepartmentService;
import com.cognizant.orm_learn.service.EmployeeService;
import com.cognizant.orm_learn.service.SkillService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

import static com.cognizant.orm_learn.OrmLearnApplication.testGetEmployee;
import static org.hibernate.sql.ast.SqlTreeCreationLogger.LOGGER;

@SpringBootApplication
public class OrmLearnApplication implements CommandLineRunner {
    @Autowired
    private StockRepository stockRepository;
    private static EmployeeService employeeService;
    private static DepartmentService departmentService;
    private static SkillService skillService;

    public static void main(String[] args) {

        ApplicationContext applicationContext = SpringApplication.run(OrmLearnApplication.class, args);
        employeeService = applicationContext.getBean(EmployeeService.class);
        departmentService = applicationContext.getBean(DepartmentService.class);
        skillService = applicationContext.getBean(SkillService.class);
        //testGetEmployee();
        //testAddEmployee();
       // testUpdateEmployee();
       // testGetDepartment();
        //testAddSkillToEmployee();
        testGetAllPermanentEmployees();
    }
    private static void testGetAllPermanentEmployees(){
        List<Employee> employees = employeeService.getAllPermanentEmployees();
        System.out.println(employees);
        employees.forEach( e -> System.out.println(e.getSkillSet()));
    }
    private static void testAddSkillToEmployee(){
        Employee employee = employeeService.get(2);
        Skill skill = skillService.get(3);
        employee.getSkillSet().add(skill);
        employeeService.save(employee);
        System.out.println(employee);
    }
    
    public static void testGetDepartment(){
        Department department = departmentService.get(1);
        System.out.println(department);
        Set<Employee> employees = department.getAllEmployees();
        System.out.println(employees);
    }
    public static void testGetEmployee() {

        Employee employee = employeeService.get(1);
        System.out.println(employee);
        System.out.println(employee.getDepartment());
        System.out.println(employee.getSkillSet());
    }
    private static void testAddEmployee() {

        Employee employee = new Employee();


        employee.setName("Umesh");

        employee.setSalary(80000.0);

        employee.setPermanent(true);


        employee.setDateOfBirth(
                java.sql.Date.valueOf("2004-01-01")
        );


        Department department =
                departmentService.get(1);


        employee.setDepartment(department);


        employeeService.save(employee);


        System.out.println(employee);

    }
    private static void testUpdateEmployee(){


        Employee employee =
                employeeService.get(1);


        Department department =
                departmentService.get(2);


        employee.setDepartment(department);


        employeeService.save(employee);


        System.out.println(employee);

    }


    @Override
    public void run(String... args) {
//		1
//		stockRepository.findByCodeAndDateBetween(
//				"FB",
//				LocalDate.of(2019,9,1),
//				LocalDate.of(2019,9,30)
//		).forEach(System.out::println);
//		2
//		stockRepository.findByCodeAndCloseGreaterThan("GOOGL",new BigDecimal("1250"))
//				.forEach(System.out::println);
//		3
//		stockRepository.findTop3ByOrderByVolumeDesc().forEach(System.out::println);

//		Hands on 4
    }


}
