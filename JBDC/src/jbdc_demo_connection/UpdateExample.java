package jbdc_demo_connection;

import java.sql.*;

public class UpdateExample {
	public static void main(String[] args) throws SQLException {
		String url = "jdbc:mysql://localhost:3306/classicmodels";
		final String USER = "root";
		final String PASS = "password";
		Connection conn = DriverManager.getConnection(url, USER, PASS);
		String SelectSQL = "SELECT * FROM employees WHERE officeCode " + " IN (?,?)";
		ResultSet result;
		PreparedStatement mystmt = conn.prepareStatement(SelectSQL);
		/*
		 * mystmt.setInt(1, 1); mystmt.setInt(2, 4); result = mystmt.executeQuery();
		 * while (result.next()) { String name = result.getString("firstName"); String
		 * officeCode = result.getString("officeCode"); System.out.println(name
		 * +" is in office code "+officeCode); }
		 * 
		 * String selectSQL2 = "SELECT * FROM orderdetails where ordernumber " +
		 * " In (?,?)"; mystmt = conn.prepareStatement(selectSQL2); mystmt.setInt(1,
		 * 10100); mystmt.setInt(2, 10102); result = mystmt.executeQuery(); while
		 * (result.next()) { String od = result.getString("productCode"); String on =
		 * result.getString("ordernumber");
		 * 
		 * System.out.println("Product Code" +od +" Order Number  "+on ); }
		 */
		String updateSQL = "UPDATE employees SET extension = ? WHERE " + "officeCode = ?";
		PreparedStatement upd = conn.prepareStatement(updateSQL);
		upd.setString(1, "x5698");
		upd.setInt(2, 2);
		int updatedRows = upd.executeUpdate();
		System.out.println("Number of updated rows " + updatedRows);

		String updatedRowVal = "Select * FROM employees WHERE " + "extension = ?";
		mystmt = conn.prepareStatement(updatedRowVal);
		mystmt.setString(1, "x5698");
		result = mystmt.executeQuery();
		while (result.next()) {
			String firstName = result.getString("firstName");
			String lastName = result.getString("lastName");
			System.out.println(firstName + " " + lastName);
		}
		String SelectSQL3 = "select * from employees where LENGTH(lastName)<?";
		PreparedStatement last = conn.prepareStatement(SelectSQL3);
		last.setInt(1, 5);
		last.executeQuery();
		ResultSet shown = last.executeQuery();
		while(shown.next()) {
			String lastName = shown.getString("lastName");
			System.out.println("Last names less than than 5 characters in length: "+ lastName);
		}
		   
		conn.close();
	}

}
