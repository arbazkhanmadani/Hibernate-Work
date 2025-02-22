package com.hib.tut.entities;

import java.util.Set;

import javax.persistence.*;

@Entity
@Table
public class Department {

	@Id
	private int depId;
	
	@Column
	private String depDesignation;
	
	private String depRole;

	
	
	/*
	 * In Foreign key Table we have to map ForiegnKey column to here => mappedBy="employee"
	 *@jointColumn => we can't use in mapped Entity.
	 * mappedBy="department" => For removing extra primary and foreign key mapping Table.
	 * */
	@OneToMany(mappedBy="department",cascade=CascadeType.ALL)
	private Set<Employee> employee;

	
	public Department(){}

	public int getDepId() {
		return depId;
	}

	public void setDepId(int depId) {
		this.depId = depId;
	}

	public String getDepDesignation() {
		return depDesignation;
	}

	public void setDepDesignation(String depDesignation) {
		this.depDesignation = depDesignation;
	}

	public String getDepRole() {
		return depRole;
	}

	public void setDepRole(String depRole) {
		this.depRole = depRole;
	}

	public Set<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(Set<Employee> employee) {
		this.employee =  employee;
	}

	public Department(int depId, String depDesignation, String depRole) {
		super();
		this.depId = depId;
		this.depDesignation = depDesignation;
		this.depRole = depRole;
	}
	public Department(int depId, String depDesignation, String depRole, Employee employee) {
		super();
		this.depId = depId;
		this.depDesignation = depDesignation;
		this.depRole = depRole;
		//this.employee = employee;
	}

	@Override
	public String toString() {
		return "Department [depId=" + depId + ", depDesignation=" + depDesignation + ", depRole=" + depRole
				+ "]";
	}
	
	}
