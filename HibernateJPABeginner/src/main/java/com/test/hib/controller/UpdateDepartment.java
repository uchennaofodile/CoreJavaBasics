package com.test.hib.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.test.hib.model.Department;

public class UpdateDepartment {
public static void main(String[] args) {
	
	SessionFactory factory = new Configuration().configure().buildSessionFactory();
	Session session = factory.openSession();
	Transaction t = session.beginTransaction();
	Department d = new Department();
	d.setDepartment_id(3);
	d.setName("The Lucha Brothers");
	d.setState("Mexico City");
	session.merge(d);//copy the state of the given object to a persistent object 
	//with the same identifier
	/*Hibernate: 
    update
        DEPARTMENT 
    set
        name=?,
        state=? 
    where
        DEPARTMENT_ID=?*/
	session.getTransaction().commit();
	session.close();
	factory.close();
	
	
	
	
}

}
