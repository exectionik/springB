package com.appslab.springbootapp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping
public class EmployeeController {
    EmployeeService service;
    public EmployeeController(EmployeeService service) {
        this.service=service;

    }

        @RequestMapping("/hello")
        String home() {
            return "Hello Spring Boot";
        }
        @RequestMapping("/sumofsalary")
        Float sumofsalary(){
            List<Employee> list= new ArrayList<>();
            Collections.addAll(list, new Driver(51000,5), new Teacher(6000,88),new Programmer(500,5));
            return service.sumOfSalaries(list);
        }
        @RequestMapping("/sumofbonuses")
        int sumofbonuses(){
            List<Employee> list= new ArrayList<>();
            Collections.addAll(list, new Driver(51000,5), new Teacher(6000,88),new Programmer(500,5));
            return service.sumOfBonuses(list);
        }
}
