package com.spring.core.beens.annotationconfig;

public class RetailerAutowireXML {

	private Retailer retailer;
	
	public RetailerAutowireXML(Retailer retailer) {
		this.retailer = retailer;
	}

	public Retailer getRretailer() {
		return retailer;
	}

	public void setRetailer(Retailer retailer) {
		this.retailer = retailer;
	}

	@Override
	public String toString() {
		return "RetailerAutowireXML [retailer=" + retailer + "]";
	}

}
