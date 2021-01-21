package com.appslab.springbootapp.repository;

import com.appslab.springbootapp.model.Company;
import org.springframework.data.repository.CrudRepository;

public interface CompanyRepository extends CrudRepository<Company, String> {

   
}
