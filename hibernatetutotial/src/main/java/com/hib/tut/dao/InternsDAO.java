package com.hib.tut.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hib.tut.entities.Interns;
import com.hib.tut.entities.Students;
import com.hib.tut.helper.SessionFactoryProvider;

public class InternsDAO {

	public static void save(Interns i) {

		Session sf = SessionFactoryProvider.getSession().openSession();
    	Transaction tx =  sf.beginTransaction();
    	
    	sf.save(i);	
    	tx.commit();
    	
    	sf.close();
    	//SessionFactoryProvider.closeSession();
    
	}
	
}
