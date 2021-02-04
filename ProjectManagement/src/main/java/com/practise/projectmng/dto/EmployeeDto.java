package com.practise.projectmng.dto;

import java.util.Date;
import java.util.HashMap;

public class EmployeeDto {

	private int employeeid;
	private String firstname;
	private String middlename;
	private String lastname;
	private String salary;
	private String address;
	private String experience;
	private Date date;
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getMiddlename() {
		return middlename;
	}
	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	@Override
	public String toString() {
		return "EmployeeDto [employeeid=" + employeeid + ", firstname=" + firstname + ", middlename=" + middlename
				+ ", lastname=" + lastname + ", salary=" + salary + ", address=" + address + ", experience="
				+ experience + ", date=" + date + "]";
	}
	
	
}
