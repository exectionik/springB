package com.appslab.springbootapp.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Programmer")
    public class Programmer extends Employee {

        public Programmer(float salary,int bonus,Employees_list employees_list) {

            super(salary,bonus, Employees_list.PROGRAMMER);
        }

    }

