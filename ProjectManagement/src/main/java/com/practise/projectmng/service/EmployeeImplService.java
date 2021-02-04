package com.practise.projectmng.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.practise.projectmng.dao.EmployeeRepository;
import com.practise.projectmng.dto.EmployeeDto;
import com.practise.projectmng.model.Employee;
import com.practise.projectmng.model.Response;

@Service
public class EmployeeImplService implements EmployeeService{

	@Autowired
	EmployeeRepository emplRepo;
	
	Response res = new Response();
	
	@Override
	public ResponseEntity<?> addEmployee(EmployeeDto emplDto) {
		
		HashMap<String, Object> inMap = new HashMap<String,  Object>();
		
		inMap.put("firstname", emplDto.getFirstname());
		inMap.put("middlename", emplDto.getMiddlename());
		inMap.put("lastname", emplDto.getLastname());
		
		String emplName = emplDto.getFirstname() +" " + emplDto.getMiddlename() +" " +emplDto.getLastname();
		
		ModelMapper modelMapper = new ModelMapper();
	
		Employee empl = modelMapper.map(emplDto , Employee.class);
		empl.setEmployeename(emplName);
		
		emplRepo.save(empl);
		
		LinkedHashMap<String ,  Object> outMap = new LinkedHashMap<String, Object>();
		
		outMap.put("employeename", inMap);
		outMap.put("salary" , empl.getSalary());
		outMap.put("address" , empl.getAddress());
		outMap.put("experience" , empl.getExperience());
		outMap.put("date", empl.getDate());
		return ResponseEntity.ok(res.addMap(outMap));
	}

	@Override
	public ResponseEntity<?> getEmployees() {
		
		
		List<Employee> listEmpl = emplRepo.findAll();
		
		List<Map<String,Object>> myList = new ArrayList<Map<String, Object>>();
		
		for(int i=0;i<listEmpl.size();i++) {
			
			String emplname = listEmpl.get(i).getEmployeename();
				
			String[] strsplit = emplname.split("\\s+");
			
			String firstname = strsplit[0];
			String middlename = strsplit[1];
			String lastname = strsplit[2];
			
			HashMap<String, Object> inMap = new HashMap<String,  Object>();
			
			inMap.put("firstname", firstname);
			inMap.put("middlename", middlename);
			inMap.put("lastname", lastname);
			
			LinkedHashMap<String ,  Object> outMap = new LinkedHashMap<String, Object>();
			
			outMap.put("employeename", inMap);
			outMap.put("salary" , listEmpl.get(i).getSalary());
			outMap.put("address" , listEmpl.get(i).getAddress());
			outMap.put("experience" , listEmpl.get(i).getExperience());
			myList.add(outMap);
			
		}
		
		return ResponseEntity.ok(res.getBooks(myList));
	}


	@Override
	public ResponseEntity<?> deleteEmployee(int employeeid) {
		emplRepo.deleteById(employeeid);
		return ResponseEntity.ok(res.deleteSingleBook(employeeid));
	}

	@Override
	public ResponseEntity<?> updateEmployee(EmployeeDto emplDto) {
HashMap<String, Object> inMap = new HashMap<String,  Object>();
		
		inMap.put("firstname", emplDto.getFirstname());
		inMap.put("middlename", emplDto.getMiddlename());
		inMap.put("lastname", emplDto.getLastname());
		
		String emplName = emplDto.getFirstname() +" " + emplDto.getMiddlename() +" " +emplDto.getLastname();
		
		ModelMapper modelMapper = new ModelMapper();
	
		Employee empl = modelMapper.map(emplDto , Employee.class);
		empl.setEmployeename(emplName);
		
		emplRepo.save(empl);
		
		LinkedHashMap<String ,  Object> outMap = new LinkedHashMap<String, Object>();
		
		outMap.put("employeename", inMap);
		outMap.put("salary" , empl.getSalary());
		outMap.put("address" , empl.getAddress());
		outMap.put("experience" , empl.getExperience());
		return ResponseEntity.ok(res.updateSingleBook(outMap));
	}

	
	

}
