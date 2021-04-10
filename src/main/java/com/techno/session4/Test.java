package com.techno.session4;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class Test {

	public static void main(String[] args) {

		Configuration cfg = new Configuration().configure("com/techno/session4/hbm.cfg.xml");
		SessionFactory buildSessionFactory = cfg.buildSessionFactory();
		Session session = buildSessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		/* to save data
		  
	 	Student st= new Student();
	 	st.setName("ramesh");
		session.save(st);
		
		*/
		  
		/* to update data
		  
	 	Student st= new Student();
	 	st.setId(1);
	 	st.setName("ramesh");
		session.saveOrUpdate(st);
			
		*/
		
		/* update data using HQL
		Query q = session.createQuery("update Student set name=:name where id=:id ");
	    q.setParameter("id", 1);
	    q.setParameter("name", "gajanan");
		int result = q.executeUpdate();
		*/
		

		/* get all data using HQL
		 
		Query q = session.createQuery("from Student");

		List<Student> list = q.getResultList();
		for (Student st : list)
			System.out.println(st);
	    */
		

		/* get delete data using HQL
		Query q = session.createQuery("delete from Student where id=:id ");
	      q.setParameter("id", 2);
		int result = q.executeUpdate();
		
			System.out.println(result);
	    */
	    

		transaction.commit();
		session.close();
		buildSessionFactory.close();

	}

}
