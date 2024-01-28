package com.camelempproject.route.camelempproject;

import com.camelempproject.camelempproject.EmployeeService;
import com.camelempproject.camelempproject.Entity.camelempproject.Employee;
import com.camelempproject.processor.camelempproject.EmployeeProcessor;
import org.apache.camel.BeanInject;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;

@Component
public class MyFirstRoute extends RouteBuilder {
//    @Autowired
//    private EmployeeService service;

    @BeanInject
    private EmployeeProcessor processor;

    @Override
    public void configure() throws Exception {
//        restConfiguration().component("servlet").port(9090).host("localhost").bindingMode(RestBindingMode.json);

    /*   rest().get("/hello-world").produces(MediaType.APPLICATION_JSON_VALUE).route()
                .setBody(constant("Welcome to java techie")).endRest();
        rest().get("/getEmployees").produces(MediaType.APPLICATION_JSON_VALUE).route().setBody(() -> service.getEmployee())
                .endRest();

        rest().post("/addEmployee").consumes(MediaType.APPLICATION_JSON_VALUE).
                type(Employee.class).outType(Employee.class)
                .route().process(processor).endRest();*/

        from("rest:get:/getEmployees?produces=application/json")
                .outputType(Employee.class)
                .process(processor);



        from("rest:post:/addEmployee?consumes=application/json")
                .outputType(Employee.class)
                .process(processor);

    }
}

