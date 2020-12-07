package com.appslab.springbootapp;

import com.appslab.springbootapp.Employee;
import com.appslab.springbootapp.Employees_list;

import java.util.List;

public interface EmployeeService
{
    float sumOfSalaries(List <Employee> list);
    int sumOfBonuses(List <Employee> list);
    int writeNumber();
}
