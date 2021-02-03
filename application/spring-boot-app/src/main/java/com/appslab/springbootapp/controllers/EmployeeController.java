package com.appslab.springbootapp.controllers;


import com.appslab.springbootapp.model.Employee;
import com.appslab.springbootapp.services.EmployeeService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping
public class EmployeeController {
    EmployeeService service;
    public EmployeeController(EmployeeService service) {
        this.service=service;

    }

    @PostMapping("/employee")
    public void newEmployees(@RequestBody Employee employee) {
        service.saveEmployee(employee);
    }
}
