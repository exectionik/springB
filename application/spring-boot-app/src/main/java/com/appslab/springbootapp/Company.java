package com.appslab.springbootapp;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Company {
    @Id
    private String name;
    
    public Company(){

    }
    public Company(String name){

        this.name=name;
    }

    public String getName() {

        return name;
    }

}
