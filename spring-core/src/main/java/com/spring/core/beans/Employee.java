package com.spring.core.beans;

import java.util.Date;

public class Employee {

	private int empId;
	private String empName;
	private String designation;
	private String dateOfjoin;
	private int salary;
	
	public Employee(int empId, String empName, String designation, String dateOfjoin, int salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.designation = designation;
		this.dateOfjoin = dateOfjoin;
		this.salary = salary;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getDateOfjoin() {
		return dateOfjoin;
	}
	public void setDateOfjoin(String dateOfjoin) {
		this.dateOfjoin = dateOfjoin;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", designation=" + designation + ", dateOfjoin="
				+ dateOfjoin + ", salary=" + salary + "]";
	}
	
	
}
