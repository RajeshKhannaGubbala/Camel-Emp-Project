package com.camelempproject.camelempproject.Entity.camelempproject;

import org.springframework.boot.autoconfigure.domain.EntityScan;

public class Employee {
    private int EmpId ;
    private String Name;
    private String EmailId;

    public Employee(int empId, String name, String emailId) {
        EmpId = empId;
        Name = name;
        EmailId = emailId;
    }

    public int getEmpId() {
        return EmpId;
    }

    public void setEmpId(int empId) {
        EmpId = empId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmailId() {
        return EmailId;
    }

    public void setEmailId(String emailId) {
        EmailId = emailId;
    }

}
