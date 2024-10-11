package com.microservice.employee_service.model;



public class Employee {

    private Long id ;

    private String name ;

    private Long department_Id ;


    private int age ;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getDepartment_Id() {
        return department_Id;
    }

    public void setDepartment_Id(Long department_Id) {
        this.department_Id = department_Id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
