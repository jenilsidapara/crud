package com.practise.projectmng.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.http.ResponseEntity;

import com.practise.projectmng.dao.EmployeeRepository;
import com.practise.projectmng.dto.EmployeeDto;
import com.practise.projectmng.model.Employee;

public interface EmployeeService {

	ResponseEntity<?> addEmployee(EmployeeDto emplDto);

	ResponseEntity<?> getEmployees();
	
	ResponseEntity<?> deleteEmployee(int employeeid);

	ResponseEntity<?> updateEmployee(EmployeeDto emplDto);

	

}
