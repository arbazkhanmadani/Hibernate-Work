package com.hib.tut.helper;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryProvider {

	private static SessionFactory sessF= null;
	
	public static SessionFactory getSession() {
		if(sessF==null) 
			 sessF = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory(); 
		
		return sessF;
	}
	
	public static boolean closeSession() {
		if(sessF.isOpen()){
			sessF.close();
			return true;
		}
		return false;
	}
	
}
