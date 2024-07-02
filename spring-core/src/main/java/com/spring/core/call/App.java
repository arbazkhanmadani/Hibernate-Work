package com.spring.core.call;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.core.beens.annotationconfig.Customer;
import com.spring.core.beens.annotationconfig.ProductAutowire;
import com.spring.core.beens.annotationconfig.RetailerAutowireXML;
import com.spring.core.beens.javaconfig.Company;
import com.spring.core.beens.javaconfig.JavaConfig;
import com.spring.core.lifecycle.*;


public class App{
	
    public static void main( String[] args){
        
    	//================================XML CONFIG=====================================//
        
    	//ApplicationContext context = new ClassPathXmlApplicationContext("beans-configuration.xml");
        
        //Students s1 = context.getBean(Students.class);
        //System.out.println(s1.getClg().getclgCourseFee().get("CSE"));
        //System.out.println(s1);
        //s1.getClg().getclgCourseFee().forEach((k,v)->System.out.println(k+" | "+v));
        
        //Employee e = context.getBean("emp",Employee.class);
        //System.out.println(e);
        
    	/*ApplicationContext context = new ClassPathXmlApplicationContext("beans-configuration.xml");
      	Customer c = context.getBean(Customer.class);  
      	System.out.println(c);  
    	ProductAutowire pw = context.getBean(ProductAutowire.class);  
      	System.out.println(pw);  
       */
    
    	//================================LIFECYCLE METHODS=====================================//
        
    	//AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans-configuration.xml");
    	//AbstractApplicationContext=> this class contains this method which calls destroy().
    	/*context.registerShutdownHook();
    	LifeCycleByXML xml = context.getBean(LifeCycleByXML.class);
    	System.out.println(xml);
    	LifeCycleByInterface impl = context.getBean(LifeCycleByInterface.class);
    	LifeCycleByAnnotation impl1 = context.getBean(LifeCycleByAnnotation.class);
    	*/
    	
    	//RetailerAutowireXML ret = context.getBean(RetailerAutowireXML.class);
    	//System.out.println(ret);
    
    	//================================JAVA CONFIG=====================================//
    	ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        
    	Company google =  context.getBean("google",Company.class);
    	System.out.println(google);
    	Company micro =  context.getBean("microsoft",Company.class);
    	System.out.println(micro);
    	Company micro1 =  context.getBean("microsoft",Company.class);
    	System.out.println(micro1);
    	
    	System.out.println(micro.hashCode());
    	System.out.println(micro1.hashCode());
    	System.out.println(google.hashCode());
    	
    	
    	
    	
    }
}
