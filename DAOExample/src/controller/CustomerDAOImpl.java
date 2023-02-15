package controller;

import daointerface.CustomerDAO;
import model.Customer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import daointerface.ConnectionDAO;

public class CustomerDAOImpl extends ConnectionDAO implements CustomerDAO {

	public CustomerDAOImpl() throws ClassNotFoundException{};
	Connection conn = ConnectionDAO.getConnection();

	@Override
	public Customer getCustomerById(int id) {
		Customer c= null;
		try { 

			// Connection connection = ConnectionDAO.getConnection();
			String selectAll = "SELECT * FROM customer WHERE id=?;";
			PreparedStatement ps = conn.prepareStatement(selectAll);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				c= new Customer();
				c.setId(id);
				c.setEmail(rs.getString("email"));
				c.setFname(rs.getString("fname"));
				c.setLname(rs.getString("lname"));
				System.out.println(c.getFname()+" "+c.getLname());
			}

		} 
		catch (SQLException ex) {
			System.err.format("SQL State: %s\n%s", ex.getSQLState(), ex.getMessage());


		}
		return c;  
	}

	@Override
	public boolean addCustomer(Customer C) {
		// TODO Auto-generated method stub

		try {
			String addQuery = "Insert into customer  (id, email, fname, lname) VALUES (?,?,?,?)";
			PreparedStatement ps;
			ps = conn.prepareStatement(addQuery);
			ps.setInt(1, C.getID());
			ps.setString(2, C.getEmail());
			ps.setString(3, C.getFname());
			ps.setString(4, C.getLname());
			int rowsAffected = ps.executeUpdate();
			System.out.println(rowsAffected+ " row(s) affected!!");

		}

		catch(SQLException ex) {
			System.err.format("Sql State: %s%n%s", ex.getSQLState(), ex.getMessage());
		}
		return false;
	}

	@Override
	public boolean removeCustomerById(int id) {
		try{
			String removeQuery = "DELETE * FROM customer WHERE id = ?";
			PreparedStatement ps;
			ps = conn.prepareStatement(removeQuery);
			ps.setInt(1, id);
			int affectedRows = ps.executeUpdate();
			System.out.println(affectedRows + " row(>s) affected");

		}
		catch(SQLException ex) {
			System.err.format("Sql State: %s%n%s", ex.getSQLState());
		}

		return false;
	}

}
