package com.appslab.springbootapp.company_service;

import com.appslab.springbootapp.model.Company;
import com.appslab.springbootapp.repository.CompanyRepository;
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
