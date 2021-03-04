package com.techno.session1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {

		Configuration cfg = new Configuration().configure("com/techno/session1/hbm.cfg.xml");
		SessionFactory buildSessionFactory = cfg.buildSessionFactory();
		Session session = buildSessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		/*  to save data 
		
		Student st = new Student();
		st.setName("ram");
		session.save(st);
		 */
		
		
       /*  to update data
		
		Student st = new Student();
		st.setId(2);
		st.setName("ramesh");
		session.save(st);
		 
		 */
		
        /* to delete data
		
		Student st = new Student();
		st.setId(2);
		st.setName("ram");
		session.delete(st);
		
		*/
		
	     /* to get data from id     */
	      
		Student student = session.get(Student.class,1 );
        System.out.println("get called = "+student);
        
        Student student1 = session.load(Student.class,1 );
        System.out.println("loading called = "+ student1);
      
		  
        transaction.commit();

	}

}
