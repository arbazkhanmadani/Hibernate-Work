package com.spring.core.beens.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages="{com.spring.core.beens.javaconfig}")
public class JavaConfig {

	@Bean("google")
	public Company getCompanyGoogle(){
		
		Company com = new Company();
		com.setcId(1001);
		com.setcName("Google inc.");
		
		return com;
	}
	@Bean("microsoft")
	public Company getCompanyMicrosoft(){
		
		Company com = new Company();
		com.setcId(1001);
		com.setcName("Microsoft inc.");
		
		return com;
	}
	
}
