package com.test.hib.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.test.hib.model.Department;

public class FindingDepartment {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		int department_id = 3;
		Department d = session.getReference(Department.class, department_id);
//		Hibernate: 
//		    select
//		        d1_0.DEPARTMENT_ID,
//		        d1_0.name,
//		        d1_0.state 
//		    from
//		        DEPARTMENT d1_0 
//		    where
//		        d1_0.DEPARTMENT_ID=?
		System.out.println("Name: "+ d.getName());
		System.out.println("State: "+ d.getState());
		t.commit();
		factory.close();
		session.close();

	}

}
