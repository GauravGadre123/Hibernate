package com.techno.session3;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

public class Test {

	public static void main(String[] args) {

		Configuration cfg = new Configuration().configure("com/techno/session2/hbm.cfg.xml");
		SessionFactory buildSessionFactory = cfg.buildSessionFactory();
		Session session = buildSessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		NativeQuery q = session.createSQLQuery("insert into student_details values(2,'ramesh')");
		int result = q.executeUpdate();
		System.out.println(result);
		transaction.commit();
		session.close();
		buildSessionFactory.close();

	}

}
