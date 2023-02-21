package jbdc_demo_connection;
import java.sql.*;
public class DemoJDBC {
	public static void main(String[] args) throws ClassNotFoundException {
		//TODO update port, user and password
		String dburl = "jdbc:mysql://localhost:3306/classicmodels"; //db is classicmodels
		String user = "root";
		String password = "password";
		System.out.println("-------- MySQL JDBC Connection Demo ------------");
		try {
			//Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection(dburl, user, password); //creates connection to our local db
			           String selectSQL = "Select * FROM employees"; //our sql query
			           Statement stmt = connection.createStatement(); //executes static sql queries and returns the result
			           ResultSet result =  stmt.executeQuery(selectSQL); //table of data representing the result of the query
			           //outputting the result
			         
			           while(result.next())
			           {//notice that these are correlated to the column names
			        	   //we pass in column names as strings
			              String EmployeeID  = result.getString("employeeNumber");//be sure to use appropriate data type of column
			              String fname = result.getString("firstName"); //for select * getString works
			              String lname  = result.getString("lastName");
			              System.out.println(EmployeeID +" | " + fname + "|"+ lname );
			           }
		
		 String delete = "DELETE FROM employees WHERE employeeNumber in(?)";
		 PreparedStatement ps = connection.prepareStatement(delete);
		 ps.setInt(1, 3);
		 int affectedRows = ps.executeUpdate();
		 System.out.println(affectedRows + " row(s) affected");
		 
//			String sqlQuery = "INSERT INTO EMPLOYEES (officeCode,firstName,lastName,email,extension,reportsTo,VacationHours,employeeNumber,jobTitle) VALUES (?,?,?,?,?,?,?,?,?)";
//		    PreparedStatement prepStmt = connection.prepareStatement(sqlQuery);
//			prepStmt.setInt(1, 6);
//			prepStmt.setString(2, "Jamil");
//			prepStmt.setString(3, "Fink");
//			prepStmt.setString(4, "JJ@gmail.com");
//			prepStmt.setString(5, "2759");
//			prepStmt.setInt(6, 1143);
//			prepStmt.setInt(7, 9);
//			prepStmt.setInt(8, 2334);
//			prepStmt.setString(9, "Manager");
//			int affectedRows = prepStmt.executeUpdate();
//			System.out.println("SET: "+affectedRows + " row(s) affected !!");
			
			String updateSQL = "update employees set firstName=? , lastName=? where employeeNumber=?"; //notice how we use question
			//marks for dummy values
			//question marks go where we would put values
//			PreparedStatement mystmt = connection.prepareStatement(updateSQL);
//			mystmt.setString(1, "Gary");
//			mystmt.setString(2, "Larson");
//			mystmt.setLong  (3, 1002);
//			mystmt.executeUpdate();//execute the changes
//			int affectedRows = mystmt.executeUpdate();
//			
//			System.out.println("UPDATE: " + affectedRows + " row(s) affected !!");
			result.close();
			stmt.close();
			connection.close();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
