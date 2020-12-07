package com.appslab.springbootapp;

import com.appslab.springbootapp.Employee;
import org.springframework.stereotype.Service;
import org.w3c.dom.ls.LSOutput;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService {
    int number = 0;
    @Override
    public int writeNumber(){
        return ++number;
    }
    @Override
    public float sumOfSalaries(List<Employee> list) {
        return (float) list.stream().mapToDouble(n -> n.getSalary()).sum();

    }

    @Override
    public int sumOfBonuses(List<Employee> list) {
        return list.stream().mapToInt(n -> n.getBonus()).sum();
    }
}
