package com.appslab.springbootapp.model;

import javax.persistence.*;

import java.util.Set;

@Entity
@Table(name = "Course")
public class Course {

    @Id
    String title;
    String startTime;
    String endTime;

    @ManyToMany(mappedBy = "courses",cascade = CascadeType.ALL)
    Set<Employee> employees;

    public Course(){

    }

    public Course(String title, String startTime, String endTime){
            this.title=title;
            this.startTime=startTime;
            this.endTime=endTime;
        }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }
}
