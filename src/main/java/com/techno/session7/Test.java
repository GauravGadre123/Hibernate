package com.techno.session7;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
 
		Configuration cfg = new Configuration().configure("com/techno/session7/hbm.cfg.xml");
		SessionFactory buildSessionFactory = cfg.buildSessionFactory();
		Session session = buildSessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		Student st1 = new Student();
		st1.setStudentName("ramesh");

		Student st2 = new Student();
		st2.setStudentName("ganesh");

		Laptop l1 = new Laptop();
		l1.setLaptopName("dell");

		Laptop l2 = new Laptop();
		l2.setLaptopName("hp");

		List<Student> list1 = new ArrayList<Student>();
		list1.add(st1);
		list1.add(st2);

		List<Laptop> list2 = new ArrayList<Laptop>();
		list2.add(l1);
		list2.add(l2);

		st1.setLaptops(list2);

		st2.setLaptops(list2);

		l1.setStudent(list1);

		l2.setStudent(list1);

		session.save(st1);
		session.save(st2);
		
	

		transaction.commit();
		session.close();
		buildSessionFactory.close();

	}

}
