package com.perscholas.UserTestDemo;

import java.util.List;

import com.perscholas.model.User;
import com.perscholas.model.UserDAO;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    
       User u1 = new User("uo1@gmail.com", "Uchenna Ofodile", "123", "742 Evergreen Terrace", "FL", "78926");
       User u2 = new User("uo2@gmail.com", "Mike", "123", "742 Evergreen Terrace", "FL", "78926");
       User u3 =  new User("obi@gmail.com", "Obi Ofodile", "123", "742 Evergreen Terrace", "FL", "78926");
       UserDAO dao = new UserDAO();
       dao.saveUser(u1);
       dao.saveUser(u2);
       dao.saveUser(u3);
   
       
    }
}
