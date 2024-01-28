package com.camelempproject.camelempproject;


import com.camelempproject.camelempproject.Entity.camelempproject.Employee;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Component
public class EmployeeService {

    private static List<Employee> empList = new ArrayList<>();

    @PostConstruct
    public void initDB(){
        empList.add(new Employee(12,"Rajesh","rajesh@gmail.com"));
        empList.add(new Employee(13,"Khanna","khanna@gmail.com"));
        empList.add(new Employee(14,"Sai","gubala@gmail.com"));
        empList.add(new Employee(15,"Aravaind","kjjhag@gmail.com"));

    }
    public Employee addEmployee(Employee employee) {
        //return studentRepo.save(student);
        empList.add(employee);
        return employee;
    }
    public List<Employee> getEmployee() {

        return empList;
    }



}

