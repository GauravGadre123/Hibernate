package com.techno.session5;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class Test {

	public static void main(String[] args) {

		Configuration cfg = new Configuration().configure("com/techno/session5/hbm.cfg.xml");
		SessionFactory buildSessionFactory = cfg.buildSessionFactory();
		Session session = buildSessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		Laptop laptop = new Laptop();
		laptop.setLaptopName("dell");
		

		Student student = new Student();
		student.setStudentName("ramesh");
		student.setLaptop(laptop);
		
		session.save(student);
		laptop.setStudent(student);
		
		
		transaction.commit();
		session.close();
		buildSessionFactory.close();

	}

}
