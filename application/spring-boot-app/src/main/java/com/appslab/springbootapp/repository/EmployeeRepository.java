package com.appslab.springbootapp.repository;

import com.appslab.springbootapp.model.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
}
