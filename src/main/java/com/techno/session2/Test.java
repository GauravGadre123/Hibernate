package com.techno.session2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {

	
		Student st= new Student();
		st.setName("ganesh");
		
		StudentDao.save(st);
		

	}

}
