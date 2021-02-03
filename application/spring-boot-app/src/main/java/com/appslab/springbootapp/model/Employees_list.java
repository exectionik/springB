package com.appslab.springbootapp.model;

public enum Employees_list {
    TEACHER ("Teacher"),
    PROGRAMMER ("Programmer"),
    DRIVER("Driver");


    protected final String name;

    Employees_list(String name){

        this.name=name;
    }

    public String getName() {
        return name;
    }

}

