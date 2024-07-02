package com.spring.core.beens.javaconfig;

import org.springframework.context.annotation.Scope;


@Scope("prototype")
public class Company {

	private int cId;
	private String cName;
	
	public Company(){};
	public Company(int cId, String cName) {
		super();
		this.cId = cId;
		this.cName = cName;
	}
	@Override
	public String toString() {
		return "Company [cId=" + cId + ", cName=" + cName + "]";
	}
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
}
