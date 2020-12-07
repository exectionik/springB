package com.appslab.springbootapp;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
@Component
public class DependencyInjectionDemo {
    EmployeeService servis;


    public DependencyInjectionDemo( EmployeeService servis){
        this.servis=servis;

        List <Employee> list= new ArrayList<>();
        Collections.addAll(list, new Driver(51000,5), new Teacher(6000,88),new Programmer(500,5));
        System.out.println(sum(list));
        System.out.println(servis.writeNumber());
    }
    float sum(List <Employee> list){
        return servis.sumOfBonuses(list)+servis.sumOfSalaries(list);

    }


}
