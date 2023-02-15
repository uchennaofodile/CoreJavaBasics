package com.test.hib.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.test.hib.model.Department;

public class DeleteDepartment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		Department d = new Department();
		d.setDepartment_id(4);
		session.remove(d);
		//Hibernate: 
//	    delete 
//	    from
//	        DEPARTMENT 
//	    where
//	        DEPARTMENT_ID=?
		t.commit();
		session.close();
		factory.close();
		
		
	}

}
