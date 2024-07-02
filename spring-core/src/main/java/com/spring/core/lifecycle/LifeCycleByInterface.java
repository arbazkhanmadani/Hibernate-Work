package com.spring.core.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class LifeCycleByInterface implements InitializingBean,DisposableBean {

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Init method by....InitializingBean");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("destroy method by....DisposableBean");
	}

}
