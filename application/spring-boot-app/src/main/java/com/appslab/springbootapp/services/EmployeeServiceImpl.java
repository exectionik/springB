package com.appslab.springbootapp.services;

import com.appslab.springbootapp.model.Employee;
import com.appslab.springbootapp.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class EmployeeServiceImpl implements EmployeeService {
    EmployeeRepository repp;
    public EmployeeServiceImpl(EmployeeRepository repp){
        this.repp=repp;
    }

    @Override

    public float sumOfSalaries(List<Employee> list) {
        return (float) list.stream().mapToDouble(Employee::getSalary).sum();

    }

    @Override

    public int sumOfBonuses(List<Employee> list) {
        return list.stream().mapToInt(Employee::getBonus).sum();
    }

    @Override
    public void saveEmployee(Employee employee) {
        repp.save(employee);
    }
}