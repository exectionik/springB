package com.appslab.springbootapp.services;

import com.appslab.springbootapp.model.Employee;

import java.util.List;

public interface EmployeeService
    {
        float sumOfSalaries(List<Employee> list);
        int sumOfBonuses(List <Employee> list);
        void saveEmployee(Employee employee);
    }

