package runner;

import controller.BookDaoImpl;
import controller.CustomerDAOImpl;
import controller.ItemDAOImpl;
import daointerface.BookDao;
import model.Books;
import model.Customer;
import model.Item;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AccessBook {
  public static void main(String[] args) {

       //creating object
       BookDao bookDao = new BookDaoImpl();
       System.out.println("--------- inserting book records ----------");
     
       ArrayList<Books> BookList = new ArrayList<Books>();

       Books b1 = new Books();
       b1.setIsbn(120);
       b1.setBookName("Java Book");
       BookList.add(b1);

       Books b2 = new Books();
       b2.setIsbn(300);
       b2.setBookName("Python Book");
       BookList.add(b2);
       
       Books b3 = new Books();
       b3.setIsbn(365);
       b3.setBookName("JavaScript Book");
       BookList.add(b3);

       Books b4 = new Books();
       b4.setIsbn(256);
       b4.setBookName("SQL Book");
       BookList.add(b4);

       bookDao.saveBook(BookList);
       
       System.out.println( " ====== Display list of all books ====");
       try {
          for (Books cc : bookDao.getAllBooks()) {
            int ISBN = cc.getIsbn();
              String BookName = cc.getBookName();
              System.out.println("======================");
              System.out.println("ISBN Number : " + ISBN + " and Book name: " + BookName);

          }
       } catch (ClassNotFoundException e) {
          e.printStackTrace();
       } catch (SQLException e) {
          e.printStackTrace();
       }

       
       System.out.println("----Book information is updating -----");
       Books Bookupdating = new Books();
       Bookupdating.setIsbn(3);
       Bookupdating.setBookName("Algorithms Book");
       boolean result = bookDao.updateBook(Bookupdating, 3);
       System.out.println(result);
       
       boolean a = bookDao.deleteBook(4); // 4 is a id of book
       if(a == true) {
              System.out.println("Record is deleted");
       }
       else
       {
              System.out.println("Record is not deleted");
       }
	  
	  try {
		CustomerDAOImpl cdi = new CustomerDAOImpl();
		 
		 //Insert some customers into the Customer database:
		/* boolean added = cdi.addCustomer(new Customer(1, "gm@gmail.com","Grant", "Moser"));
		 System.out.println(added);
		 added =cdi.addCustomer(new Customer(2, "is@gmail.com","Isil", "Avunduk"));
		 System.out.println(added);
		 Customer c = cdi.getCustomerById(1);
		 System.out.println(c.getFname()+ " "+c.getLname());
		 boolean removed = cdi.removeCustomerById(2);
		 System.out.println(removed);*/
		 //Create items:
		 ItemDAOImpl idi = new ItemDAOImpl();
		 Item item1 = new Item(1, "Socks",2.99);
		 Item item2 = new Item(2, "Shirts", 5.99);
		 Item item3 = new Item(3, "Books", 30.00);
		 boolean added = idi.addItem(item1);
		 System.out.println(added);
		 added = idi.addItem(item2);
		 System.out.println(added);
		 added = idi.addItem(item3);
		 System.out.println(added);
		 List<Item> items = idi.getAllItems();
		 for (Item item: items) {
			 System.out.println(item.getName()+" "+item.getPrice());
		 }
		 boolean deleted = idi.removeItemById(3);
		 System.out.println(deleted);
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
	 
  }



}
