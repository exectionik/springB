package com.appslab.springbootapp;

import org.springframework.stereotype.Component;

@Component
public class trieda   {


public trieda(EmployeeService servis2){

    System.out.println(servis2.writeNumber());
}
}
