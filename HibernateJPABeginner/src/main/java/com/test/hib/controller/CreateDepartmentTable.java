package com.test.hib.controller;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.test.hib.model.Department;

public class CreateDepartmentTable {
public static void main(String[] args) {
	SessionFactory factory = new Configuration().configure().buildSessionFactory();
	Session session =  factory.openSession();
	Transaction t = session.beginTransaction();
	Department d = new Department();
	t.commit();
	System.out.println("Successfully created department table");
	factory.close();
	session.close();
}
}
