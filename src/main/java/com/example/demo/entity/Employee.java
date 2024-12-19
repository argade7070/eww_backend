package com.example.demo.entity;

import jakarta.persistence.Column;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="new_table")

public class Employee {

	public Employee() {}
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY) 
//@Column(name="employee_id")
private int empoyeeId ;


@Column(name="employee_name")
private String employeeName;

@Column(name="employee_address")
private String employeeAddress;

@Column(name="employee_salary")
private String employeeSalary;

public Employee(int empoyeeId, String employeeName, String employeeAddress, String employeeSalary) {
	super();
	this.empoyeeId = empoyeeId;
	this.employeeName = employeeName;
	this.employeeAddress = employeeAddress;
	this.employeeSalary = employeeSalary;
}



public int getEmpoyeeId() {
	return empoyeeId;
}

public void setEmpoyeeId(int empoyeeId) {
	this.empoyeeId = empoyeeId;
}

public String getEmployeeName() {
	return employeeName;
}

public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
}

public String getEmployeeAddress() {
	return employeeAddress;
}

public void setEmployeeAddress(String employeeAddress) {
	this.employeeAddress = employeeAddress;
}

public String getEmployeeSalary() {
	return employeeSalary;
}

public void setEmployeeSalary(String employeeSalary) {
	this.employeeSalary = employeeSalary;
}




}
