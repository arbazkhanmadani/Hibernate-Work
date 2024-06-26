package com.hib.tut.entities;

import java.util.Set;

import javax.persistence.*;

@Entity
@Table
public class Employee {

	@Id
	private int eId;
	
	@Column
	private int eAge;
	
	@Column(name="name", length=100)
	private String eName;

	@Column(nullable=false)
	private double eSalary;

	@ManyToOne
	@JoinColumn(name="Dep_FId")
	private Department department;
	
	
	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eAge=" + eAge + ", eName=" + eName + ", eSalary=" + eSalary + ", department="
				+ department + "]";
	}

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public int geteAge() {
		return eAge;
	}

	public void seteAge(int eAge) {
		this.eAge = eAge;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public double geteSalary() {
		return eSalary;
	}

	public void seteSalary(double eSalary) {
		this.eSalary = eSalary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Employee(){}
	public Employee(int eId, int eAge, String eName, double eSalary, Department department) {
		super();
		this.eId = eId;
		this.eAge = eAge;
		this.eName = eName;
		this.eSalary = eSalary;
		this.department = department;
	}

}
