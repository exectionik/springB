package com.appslab.springbootapp.model;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import javax.persistence.*;
import java.util.Set;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "Employees_list"
)
@JsonSubTypes({
        @JsonSubTypes.Type(value = Driver.class, name = "Driver"),
        @JsonSubTypes.Type(value = Programmer.class, name = "Programmer"),
        @JsonSubTypes.Type(value = Teacher.class, name = "Teacher")
})
@Entity
@Table(name = "Employee")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="Employees_list",
        discriminatorType = DiscriminatorType.STRING)

public class Employee  {

    @Enumerated(EnumType.STRING)
    @Column(name = "Employees_list", nullable = false, insertable = false, updatable = false)
    Employees_list employees_list;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "employeeStudents",
            joinColumns = @JoinColumn(name = "employee_id"),
            inverseJoinColumns = @JoinColumn(name = "course_title"))

    Set<Course> courses;


    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    long id;
    protected float salary;
    protected int bonus;

    @JoinColumn(name = "company_id", nullable = false,insertable = false, updatable = false)
    @ManyToOne(targetEntity = Company.class, fetch = FetchType.EAGER)
    private Company company;

    @Column(name = "company_id")
    private Long companyId;
    public Company getCompany() {
        return company;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Employee(float salary, int bonus, Employees_list employees_list){
        this.employees_list= employees_list;
        this.salary=salary;
        this.bonus=bonus;

    }
    public Employee(){

    }
    public float getSalary() {
        return salary;
    }

    public int getBonus() {
        return bonus;
    }


    public void setSalary(float salary) {
        this.salary = salary;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public Employees_list getEmployees_list() {
        return employees_list;
    }

    public void setEmployees_list(Employees_list employees_list) {
        this.employees_list = employees_list;
    }

    public Set<Course> getCourses() {
        return courses;
    }

    public void setCourses(Set<Course> courses) {
        this.courses = courses;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


}