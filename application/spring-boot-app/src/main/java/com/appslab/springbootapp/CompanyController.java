package com.appslab.springbootapp;

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
    Company company(){
    Company meno = new Company("Fero");
    servis.saveCompany(meno);
    return meno;
    }

}
