package com.appslab.springbootapp;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class CompanyController {
    CompanyService servis;
    public CompanyController(CompanyService servis) {
        this.servis = servis;
    }


    @GetMapping("/company")

    public  void company(Company company){

        company=new Company("Peto");
        servis.saveCompany(company);

    }


}
