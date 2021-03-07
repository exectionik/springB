package com.appslab.springbootapp.repository;

import com.appslab.springbootapp.model.Company;
import com.appslab.springbootapp.model.Employee;
import org.springframework.data.repository.CrudRepository;

public interface CompanyRepository extends CrudRepository<Company, Employee> {

   
}
