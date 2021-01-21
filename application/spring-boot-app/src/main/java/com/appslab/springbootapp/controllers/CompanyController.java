package com.appslab.springbootapp.controllers;

import com.appslab.springbootapp.company_service.CompanyService;
import com.appslab.springbootapp.model.Address;
import com.appslab.springbootapp.model.Company;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class CompanyController {
    CompanyService servis;

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


}
