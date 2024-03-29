package com.camelempproject.processor.camelempproject;

import com.camelempproject.camelempproject.EmployeeService;
import com.camelempproject.camelempproject.Entity.camelempproject.Employee;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeProcessor implements Processor {

    @Autowired
    private EmployeeService service;

    @Override
    public void process(Exchange exchange) throws Exception {
        service.addEmployee(exchange.getIn().getBody(Employee.class));
//        service.getEmployee();
    }

}