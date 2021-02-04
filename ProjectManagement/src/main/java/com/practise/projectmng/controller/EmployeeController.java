package com.practise.projectmng.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import com.practise.projectmng.dto.EmployeeDto;
import com.practise.projectmng.model.Employee;
import com.practise.projectmng.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	EmployeeService emplService;
	
	@PostMapping("/add")
	public ResponseEntity<?> addEmployee(@RequestBody EmployeeDto emplDto){
		return emplService.addEmployee(emplDto);
	}
	
	@PostMapping("/get")
	public ResponseEntity<?> getEmployees(){
		return emplService.getEmployees();
	}
	
	@PostMapping("/delete")
	public ResponseEntity<?> deleteEmployee(@RequestParam int employeeid){
		return emplService.deleteEmployee(employeeid);
	}
	
	@PostMapping("/update")
	public ResponseEntity<?> updateEmployee(@RequestBody EmployeeDto emplDto){
		return emplService.updateEmployee(emplDto);
	}
}