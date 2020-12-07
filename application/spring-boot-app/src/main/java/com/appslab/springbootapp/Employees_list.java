package com.appslab.springbootapp;

public enum Employees_list {
    TEACHER ("Teacher"),
    PROGRAMMER ("Programmer"),
    DRIVER("Driver");


    protected final String name;

    Employees_list(String name){

        this.name=name;
    }

}
