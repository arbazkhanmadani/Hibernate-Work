package com.spring.core.beens.annotationconfig;

public class Retailer {

	private String SuppName;

	public Retailer(String suppName) {
		SuppName = suppName;
	}

	@Override
	public String toString() {
		return "Supplier [SuppName=" + SuppName + "]";
	}

	public String getSuppName() {
		return SuppName;
	}

	public void setSuppName(String suppName) {
		SuppName = suppName;
	}
}
