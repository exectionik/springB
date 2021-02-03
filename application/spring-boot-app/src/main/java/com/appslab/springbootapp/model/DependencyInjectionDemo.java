package com.appslab.springbootapp.model;

import com.appslab.springbootapp.services.EmployeeService;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
    public class DependencyInjectionDemo {
        EmployeeService servis;

        float sum(List <Employee> list){
            return servis.sumOfBonuses(list)+servis.sumOfSalaries(list);

        }


    }

