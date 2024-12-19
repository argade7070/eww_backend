package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="worker_details")
public class Worker {
 
	public Worker() {}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name="worker_iD")
	private long workerId;
	
	@Column(name ="worker_name")
	private String workerName;
	
	@Column(name="address")
	private String address;
	
	@Column(name="salary")
	private double salary;

	public Worker(long workerId, String workerName, String address, double salary) {
		super();
		this.workerId = workerId;
		this.workerName = workerName;
		this.address = address;
		this.salary = salary;
	}

	public long getWorkerId() {
		return workerId;
	}

	public void setWorkerId(long workerId) {
		this.workerId = workerId;
	}

	public String getWorkerName() {
		return workerName;
	}

	public void setWorkerName(String workerName) {
		this.workerName = workerName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
