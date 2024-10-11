package com.microservice.department_service.controller;

import com.microservice.department_service.model.Department;
import com.microservice.department_service.repository.DepartmentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/department")
public class DepartmentController {


    private static final Logger logger = LoggerFactory.getLogger(DepartmentController.class) ;


    @Autowired
    private DepartmentRepository departmentRepository ;


    @GetMapping
    public ResponseEntity<List<Department>> find()
    {
        logger.info("find all department list");
        return departmentRepository.find() ;
    }


    @GetMapping("/{id}")
    public ResponseEntity<Department> find(@PathVariable ("id") int id)
    {
        logger.info("find by id : {}" , id );
        return departmentRepository.findById(id) ;
    }

    @PostMapping
    public ResponseEntity<Void> add(@RequestBody Department department)
    {
        logger.info("department add : {} " , department); // now this is the format of logger.info
        // so before this we went to zipkins in google and copied two commands from there
        // and run that in our compiler , which made zipkins server live ;

        // now in above line department will replace the placeholder {} , and this is the
        // format of logger .info , means if you want to print 4-5 variables , then place 4-5
        // placeholder in string inside logger.info and then these variables will
        // replace placeholders ;

        return departmentRepository.add(department) ;
    }



}
