package com.microservice.employee_service.repository;

import com.microservice.employee_service.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository

public class EmployeeRepository {


    private List<Employee> list = new ArrayList<>() ;


    public void add(Employee employee)
    {
        list.add(employee) ;

    }


    public Employee findById(long id)
    {
        for(Employee employee : list)
        {
            if( employee.getId() == id)
                return  employee ;
        }


        return null ;
    }


    public List<Employee> find()
    {
        return list ;

    }
}
