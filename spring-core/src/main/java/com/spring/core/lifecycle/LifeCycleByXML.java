package com.spring.core.lifecycle;

public class LifeCycleByXML {

	//if we wont make pojo of property it will throw exception.
	private String name;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public void init(){
		System.out.println("Init method by....XML");
	}
	public void destroy(){
		System.out.println("Destroy method by....XML");
	}
	
	@Override
	public String toString() {
		return "LifeCycleByXML [name=" + name + ", getName()=" + getName() + "]";
	}
}
