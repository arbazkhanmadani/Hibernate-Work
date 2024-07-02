package com.spring.core.beans;

import java.util.List;


public class Students {

	private int sId;
	private int age;
	private double fee;
	private String name;
	private List<String> skills;
	private College clg;
	
	public Students(){}
	public Students(int sId, int age, double fee, String name, List<String> skills, College clg) {
		super();
		this.sId = sId;
		this.age = age;
		this.fee = fee;
		this.name = name;
		this.skills = skills;
		this.clg = clg;
	}
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getSkills() {
		return skills;
	}
	public void setSkills(List<String> skills) {
		this.skills = skills;
	}
	public College getClg() {
		return clg;
	}
	public void setClg(College clg) {
		this.clg = clg;
	}
	@Override
	public String toString() {
		return "Students [sId=" + sId + ", age=" + age + ", fee=" + fee + ", name=" + name + ",\n skills=" + skills
				+ ",\n\n clg=" + clg + "]";
	}
	
	
	
}
