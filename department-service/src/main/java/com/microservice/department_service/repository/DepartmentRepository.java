package com.microservice.department_service.repository;

import brave.Response;
import com.microservice.department_service.model.Department;
import org.apache.http.protocol.HTTP;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class DepartmentRepository {



    private List<Department>  list = new ArrayList<>() ;


     public ResponseEntity<Void> add(Department department)
     {
         list.add(department) ;

         return ResponseEntity.noContent().build();
     }


     public ResponseEntity<Department> findById(int id)
     {
         for(Department department : list)
         {
            if(department.getId() == id)
                return ResponseEntity.ok(department) ;
         }


         return ResponseEntity.status(HttpStatus.NOT_FOUND).build() ;
     }

     public ResponseEntity<List<Department> >find()
     {
         return ResponseEntity.ok(list) ;
     }
}
