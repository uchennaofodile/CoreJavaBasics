package com.perscholas.H2Demo;

import java.util.List;
import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.perscholas.model.Student;

public class App 
{
    public static void main( String[] args )
    {
    	SessionFactory factory = new Configuration().configure().buildSessionFactory();
    	Session session = factory.openSession();
    	Transaction t = session.beginTransaction();
    	Student student = new Student("Chris", "Rock", "chris.rock@mail.com");
     Student student1 = new Student("Will", "Smith", "will.smith@mail.com");
     Student student2 = new Student("John", "Cena", "john@mail.com");
          
       // save the student objects
         session.persist(student);
         session.persist(student1);
  
       session.persist(student2);
          // commit transaction
          t.commit();
    // ------------------ retrieve data from H2 database ----------------------  
        String hql = "SELECT s FROM Student s"; 
  	    Query query = session.createQuery(hql, null);
  	    List<Student> list  =  query.getResultList();
  	    
  	    for (Student stu : list) {
  	    	 System.out.println("Student Id: " +stu.getId() + " | First name: " + stu.getFirstName() +" | LastName: "+ stu.getLastName()  +" | Email: " + stu.getEmail() );

  	    }
    }
}



