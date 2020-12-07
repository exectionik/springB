package com.appslab.springbootapp;
import com.appslab.springbootapp.Driver;
import com.appslab.springbootapp.Employee;
import com.appslab.springbootapp.Programmer;
import com.appslab.springbootapp.Teacher;

import java.util.*;



public class Main {


    public static void main(String[] args) {

        Teacher pady = new Teacher(4000,500);
        Programmer rem = new Programmer(8000,999);
        Driver vodic = new Driver(5000,88);


        vodic.getInfo();
        System.out.println();
        List<Employee> list = new ArrayList<>();
        Collections.addAll(list,pady,rem,vodic);
        list.forEach(n-> n.getInfo());
        EmployeeService info =new EmployeeServiceImpl() ;
        System.out.println(info.sumOfSalaries(list));
        System.out.println(info.sumOfBonuses(list));

    }
}