package com.practise.projectmng.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practise.projectmng.dto.EmployeeDto;
import com.practise.projectmng.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

		
}
