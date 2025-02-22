package com.hib.tut.entities;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="students")
@Cacheable
//It works on HQL=======
@NamedQueries(
		{
			@NamedQuery(
				name="FindByCollege",
				query="from Students where college=:cn"
				
			)
		}
)
public class Students {

	@Id
	private int rollNo;
	
	@Column
	private int age;
	
	@Column(name="name", nullable=false, length=100)
	private String name;

	@Column(nullable=false)
	private String college;
	
	@Column(nullable=false)
	private double fee;

	//cascade=CascadeType.ALL => The Entity Mapped to It Automatically-> SAVED,UPDATE,DELETE and SELECT.
	@OneToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinColumn(name="IntId")
	private Interns interns;
	

	public Interns getInterns() {
		return interns;
	}

	public void setInterns(Interns interns) {
		this.interns = interns;
	}

	public Students(int rollNo, int age, String name, String college, double fee, Interns interns) {
		super();
		this.rollNo = rollNo;
		this.age = age;
		this.name = name;
		this.college = college;
		this.fee = fee;
		this.interns = interns;
	}

	public Students(int rollNo, int age, String name, String college, double fee) {
		this.rollNo = rollNo;
		this.age = age;
		this.name = name;
		this.college = college;
		this.fee = fee;
	}
	
	public Students(){}
	
	@Override
	public String toString() {
		return "Students [rollNo=" + rollNo + ", age=" + age + ", name=" + name + ", college=" + college + ", fee="
				+ fee + ", interns=" + interns + "]";
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

		
}
