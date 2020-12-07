package com.appslab.springbootapp;

public class Driver extends Employee {
    public Driver(float salary,int bonus){

        super(salary,bonus, Employees_list.DRIVER);
    }
}
