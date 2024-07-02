package com.spring.core.beans;

import java.util.Map;
import java.util.Set;

import org.springframework.context.annotation.Scope;

//@Scope("singleton") => Returns Single object for all call.
@Scope("prototype") //=> return multiple object for different call. 
public class College {

	private int clgCode;
	private String clgName;
	private Set<String> clgBranch;
	private Map<String, Integer> clgCourseFee; 
	
	public College(){}

	public College(int clgCode, String clgName, Set clgBranch, Map<String, Integer> clgCourseFee) {
		super();
		this.clgCode = clgCode;
		this.clgName = clgName;
		this.clgBranch = clgBranch;
		this.clgCourseFee = clgCourseFee;
	}

	public int getClgCode() {
		return clgCode;
	}

	public void setClgCode(int clgCode) {
		this.clgCode = clgCode;
	}

	public String getClgName() {
		return clgName;
	}

	public void setClgName(String clgName) {
		this.clgName = clgName;
	}

	public Set getClgBranch() {
		return clgBranch;
	}

	public void setClgBranch(Set clgBranch) {
		this.clgBranch = clgBranch;
	}

	public Map<String, Integer> getclgCourseFee() {
		return clgCourseFee;
	}

	public void setclgCourseFee(Map<String, Integer> clgCourseFee) {
		this.clgCourseFee = clgCourseFee;
	}

	@Override
	public String toString() {
		return "College [clgCode=" + clgCode + ", clgName=" + clgName + ",\n clgBrach=" + clgBranch + ",\n courseFee="
				+ clgCourseFee + "]";
	}	



}
