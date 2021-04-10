package com.techno.session8;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class Test {

	public static void main(String[] args) {

		Configuration cfg = new Configuration().configure("com/techno/session8/hbm.cfg.xml");
		SessionFactory buildSessionFactory = cfg.buildSessionFactory();
		Session session1 = buildSessionFactory.openSession();
		Transaction transaction1 = session1.beginTransaction();

		/* to save data */

		Student st = new Student();
		st.setName("ramesh");
		// session.save(st);

		Student student1 = session1.get(Student.class, 1);

		System.out.println(student1);

		transaction1.commit();
		session1.close();

		Session session2 = buildSessionFactory.openSession();
		Transaction transaction2 = session2.beginTransaction();

		Student student2 = session2.get(Student.class, 1);

		System.out.println(student2);

		transaction2.commit();
		session2.close();

		buildSessionFactory.close();

	}

}
