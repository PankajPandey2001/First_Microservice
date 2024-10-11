package com.microservice.employee_service.controller;


import com.microservice.employee_service.model.Employee;
import com.microservice.employee_service.repository.EmployeeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private static final Logger logger = LoggerFactory.getLogger(EmployeeController.class) ;







    @Autowired
    private EmployeeRepository employeeRepository ;


    @GetMapping
    public List<Employee> find()
    {
        logger.info("find all employee list");
        return employeeRepository.find() ;
    }


    @GetMapping("/{id}")
    public Employee find(@PathVariable("id") int id)
    {
        logger.info("find by id : {}" , id );
        return employeeRepository.findById(id) ;
    }

    @PostMapping
    public void add(@RequestBody Employee employee)
    {
        logger.info("department add : {} " , employee); // now this is the format of logger.info
        // so before this we went to zipkins in google and copied two commands from there
        // and run that in our compiler , which made zipkins server live ;

        // now in above line department will replace the placeholder {} , and this is the
        // format of logger .info , means if you want to print 4-5 variables , then place 4-5
        // placeholder in string inside logger.info and then these variables will
        // replace placeholders ;

        employeeRepository.add(employee) ;
    }


}
