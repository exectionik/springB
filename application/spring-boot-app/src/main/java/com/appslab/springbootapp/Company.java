package com.appslab.springbootapp;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Company {
    @Id
    String name;
    public Company(String name){

    }

    public String getName() {
        return name;
    }

}
