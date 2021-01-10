package com.appslab.springbootapp;

import org.springframework.stereotype.Service;

@Service

public class CompanyServiceImpl implements CompanyService {
    CompanyRepository rep;

    public CompanyServiceImpl(CompanyRepository rep) {
        this.rep = rep;
    }

    @Override
    public void saveCompany(Company company) {

        rep.save(company);
    }
}
