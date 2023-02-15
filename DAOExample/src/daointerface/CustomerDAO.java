package daointerface;
import model.Customer;
import java.util.*;

public interface CustomerDAO {
	//List<Customer> getCustomers();
Customer getCustomerById(int id);
boolean addCustomer(Customer C);
boolean removeCustomerById(int id);

	
	
}
