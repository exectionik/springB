package com.appslab.springbootapp;


public class Employee {
    protected float salary;
    protected int bonus;
    Employees_list pracanti;

    public Employee(float salary,int bonus,Employees_list pracanti){

        this.pracanti=pracanti;
        this.salary=salary;
        this.bonus=bonus;

    }

    public float getSalary() {
        return salary;
    }

    public int getBonus() {
        return bonus;
    }

    public void getInfo() {
        System.out.println(pracanti.name + "'s salary is " + salary + " and bonus is " + bonus+ ".");
    }
}
