package com.appslab.springbootapp.controllers;

import com.appslab.springbootapp.model.Address;
import com.appslab.springbootapp.model.Company;
import com.appslab.springbootapp.services.CompanyService;
import com.appslab.springbootapp.services.EmployeeService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class CompanyController {
    CompanyService servis;
    EmployeeService service;

    public CompanyController(CompanyService servis) {

        this.servis = servis;

    }


    @GetMapping("/company")

    public  void company(){

        Company company=new Company("Peto");
        Address address=new Address("kriva","00252","cadca","uzbekistan");
        company.setAddress(address);
        servis.saveCompany(company);

    }
    @PostMapping("/employees")
    void newEmployee(@RequestBody Company newEmployee) {

        servis.saveCompany(newEmployee);
    }
    @PostMapping("/employee")
    public void newEmployees(@RequestBody Company company) {

        servis.saveCompany(company);

    }

    }

