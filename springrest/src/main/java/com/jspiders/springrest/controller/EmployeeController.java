package com.jspiders.springrest.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jspiders.springrest.pojo.EmployeePOJO;
import com.jspiders.springrest.responce.EmployeeResponce;
import com.jspiders.springrest.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
   private EmployeeService service;
	
	@PostMapping (path = "/add",
			consumes = {MediaType.APPLICATION_JSON_VALUE},
			produces = {MediaType.APPLICATION_JSON_VALUE})
			
			public ResponseEntity<EmployeeResponce> addEmployee(@RequestBody EmployeePOJO employee) {
		   EmployeePOJO pojo= service.addEmployee(employee);
		   if(pojo !=null) {
			   //success
	   return new ResponseEntity<EmployeeResponce>
                           (new EmployeeResponce("ok", "DATA  ADDED SUCCESSFULLY", pojo, null), HttpStatus.ACCEPTED);
			   
		   }
		      //failure
		   
        return new ResponseEntity<EmployeeResponce>
		                       (new EmployeeResponce("FAIL", "DATA NOT ADDED SUCCESSFULLY", null, null), HttpStatus.NOT_FOUND);
	}
	
	   @GetMapping (path = "/search", 
			   produces = {MediaType.APPLICATION_JSON_VALUE})
	   public ResponseEntity<EmployeeResponce> searchEmployee(@RequestParam int id){
		  EmployeePOJO pojo = service.serachEmplyee(id);
		  if(pojo !=null) {
			  //success
			  return new ResponseEntity<EmployeeResponce>
              (new EmployeeResponce("ok", "EMPLOYEE DATA FOUND", pojo, null), HttpStatus.FOUND);
  
		  }
		  return new ResponseEntity<EmployeeResponce>
          (new EmployeeResponce("FAIL", "EMPLOYEE DATA NOT FOUND",null, null), HttpStatus.NOT_FOUND);

	   }
	   
}		

