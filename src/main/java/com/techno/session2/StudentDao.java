package com.techno.session2;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class StudentDao {

	public static boolean save(Student st) {

		SessionFactory sf = HibernateUtill.getSessionFactory();

		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();
		session.save(st);
		tx.commit();
		session.close();
		return true;
	}

	public static Student getStudent(int id) {

		SessionFactory sf = HibernateUtill.getSessionFactory();

		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();

		Student st = session.get(Student.class, id);
		tx.commit();
		session.close();
		return st;
	}

	public static boolean updateStudent(Student st) {
		SessionFactory sf = HibernateUtill.getSessionFactory();

		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();
		session.saveOrUpdate(st);
		tx.commit();
		session.close();
		return true;
	}

	public static boolean deleteStudent(Student st) {

		SessionFactory sf = HibernateUtill.getSessionFactory();

		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();
		session.delete(st);
		tx.commit();
		session.close();

		return true;
	}

}
