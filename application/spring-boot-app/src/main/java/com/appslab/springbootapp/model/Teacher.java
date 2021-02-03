package com.appslab.springbootapp.model;


import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Teacher")
    public class Teacher extends Employee {
        public Teacher(float salary,int bonus,Employees_list employees_list){

            super(salary,bonus, Employees_list.TEACHER);
        }


    }

