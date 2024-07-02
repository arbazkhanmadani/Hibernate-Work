package com.spring.core.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class LifeCycleByAnnotation {

	//if we wont make pojo of property it will throw exception.
		private String name;
		
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
		
		/*
		 Note that both the @PostConstruct and @PreDestroy annotations are part of Java EE.
		 Since Java EE was deprecated in Java 9, and removed in Java 11
		 we have to add an additional dependency to use these annotations:->javax.annotation-api
		 */
		@PostConstruct
		public void init(){
			System.out.println("Init method by....Annotation");
		}
		@PreDestroy
		public void destroy(){
			System.out.println("Destroy method by....Annotation");
		}
		
		@Override
		public String toString() {
			return "LifeCycleByXML [name=" + name + ", getName()=" + getName() + "]";
		}

}
