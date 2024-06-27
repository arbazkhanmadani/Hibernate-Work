package com.hib.tut.entities;

import java.util.List;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table
public class Developer {

	@Id
	private int devId;
	
	@Column
	private int devAge;
	
	@Column(name="name", length=100)
	private String devName;

	@Column(nullable=false)
	private double devSalary;

	/*
	 *In @ManyToMany => we can't use "mappedBy".
	*/
	@ManyToMany(fetch=FetchType.EAGER,cascade=CascadeType.ALL)
	private List<Project> project;

	
	public Developer(){}


	@Override
	public String toString() {
		return "Developer [devId=" + devId + ", devAge=" + devAge + ", devName=" + devName + ", devSalary=" + devSalary
				+ ", project=" + project + "]";
	}


	public int getDevId() {
		return devId;
	}


	public void setDevId(int devId) {
		this.devId = devId;
	}


	public int getDevAge() {
		return devAge;
	}


	public void setDevAge(int devAge) {
		this.devAge = devAge;
	}


	public String getDevName() {
		return devName;
	}


	public void setDevName(String devName) {
		this.devName = devName;
	}


	public double getDevSalary() {
		return devSalary;
	}


	public void setDevSalary(double devSalary) {
		this.devSalary = devSalary;
	}


	public List<Project> getProject() {
		return project;
	}


	public void setProject(List<Project> s2) {
		this.project = s2;
	}


	public Developer(int devId, int devAge, String devName, double devSalary, List<Project> project) {
		super();
		this.devId = devId;
		this.devAge = devAge;
		this.devName = devName;
		this.devSalary = devSalary;
		this.project = project;
	}
}
