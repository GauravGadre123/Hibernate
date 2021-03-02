package com.techno.session6;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {

		Configuration cfg = new Configuration().configure("com/techno/session6/hbm.cfg.xml");
		SessionFactory buildSessionFactory = cfg.buildSessionFactory();
		Session session = buildSessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		Laptop laptop1 = new Laptop();
		laptop1.setLaptopName("dell");
		

		Laptop laptop2 = new Laptop();
		laptop2.setLaptopName("hp");
		
		List<Laptop> laptops= new ArrayList<Laptop>();
		laptops.add(laptop1);
		laptops.add(laptop2);

		Student student = new Student();
		student.setStudentName("ramesh");
		student.setLaptops(laptops);
		

		laptop1.setStudent(student);

		laptop2.setStudent(student);
		
		session.save(student);
		
		
		
		
		transaction.commit();
		session.close();
		buildSessionFactory.close();

	}

}
