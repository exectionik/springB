package com.appslab.springbootapp.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Driver")
    public class Driver extends Employee {
        public Driver(float salary,int bonus,Employees_list employees_list){

            super(salary,bonus,Employees_list.DRIVER);
        }

    }

