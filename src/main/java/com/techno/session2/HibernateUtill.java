package com.techno.session2;

import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;

public class HibernateUtill {

	    
	 private static SessionFactory sessionFactory = null;
	 
	    public static SessionFactory getSessionFactory() {
	        if (sessionFactory == null) {
	        	sessionFactory = new Configuration().configure("com/techno/session2/hbm.cfg.xml").buildSessionFactory();
	        	 return sessionFactory;
	        }
	 
	        return sessionFactory;
	    }
	
}
