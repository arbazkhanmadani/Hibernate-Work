package com.spring.core.beens.annotationconfig;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ProductAutowire {

	@Value("2002")
	private int pId;
	@Value("AC")
	private String pName;

	//Stand alone collection injection
	@Value("#{pList}")
	private ArrayList pList;
	
	public ArrayList getpList() {
		return pList;
	}
	public void setpList(ArrayList pList) {
		this.pList = pList;
	}
	
	//@Qualifier("cutomer1") => Its used to map particular beans when there r so man beans in mxl config.
	@Autowired
	private Customer customer;
	//@Autowired
	//private Customer cus1;
		
	public ProductAutowire(int pId, String pName, ArrayList pList, Customer cus) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.pList = pList;
		this.customer = cus;
	}

	
	//Default Constructor is mandatory for Auto wiring.
	public ProductAutowire() {}
	
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public ProductAutowire(int pId, String pName) {
		super();
		this.pId = pId;
		this.pName = pName;
	}
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	
	@Override
	public String toString() {
		return "ProductAutowire [pId=" + pId + ", pName=" + pName + ", pList=" + pList + ", cus=" + customer + "]";
	}
	
}
