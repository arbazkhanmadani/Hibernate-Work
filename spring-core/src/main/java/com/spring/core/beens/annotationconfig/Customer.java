package com.spring.core.beens.annotationconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.*;

@Component("customer")
public class Customer {

	@Value("100")
	private int cusID;
	@Value("Sarfaraz Khan")
	private String cusName;
	
	@Value("#{T(java.lang.Math).max(2,3)}")
	private int maxVal;
	
	@Value("#{(10>4)}")
	private boolean bool;
	
	public int getMaxVal() {
		return maxVal;
	}
	public void setMaxVal(int maxVal) {
		this.maxVal = maxVal;
	}
	public boolean isBool() {
		return bool;
	}
	public void setBool(boolean bool) {
		this.bool = bool;
	}
	public int getCusID() {
		return cusID;
	}
	public void setCusID(int cusID) {
		this.cusID = cusID;
	}
	public String getCusName() {
		return cusName;
	}
	public void setCusName(String cusName) {
		this.cusName = cusName;
	}
	
	@Override
	public String toString() {
		return "Customer [cusID=" + cusID + ", cusName=" + cusName + ", maxVal=" + maxVal + ", bool=" + bool + "]";
	}
	
}
