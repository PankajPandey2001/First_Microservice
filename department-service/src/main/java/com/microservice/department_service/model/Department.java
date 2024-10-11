package com.microservice.department_service.model;

import lombok.Data;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Data
@ToString
public class Department {

    private Long id ;

    private String name ;

    private List<Employee> employees = new ArrayList<>() ;
}
