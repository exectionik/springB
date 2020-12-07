package com.appslab.springbootapp;

public class Teacher extends Employee {
    public Teacher(float salary,int bonus){

        super(salary,bonus, Employees_list.TEACHER);
    }


}
