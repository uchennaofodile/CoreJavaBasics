package controller;

import java.util.List;
import java.util.ArrayList;
import daointerface.ItemDAO;
import model.Item;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import daointerface.ConnectionDAO;

public class ItemDAOImpl implements ItemDAO {

public ItemDAOImpl() throws ClassNotFoundException{};
Connection conn = ConnectionDAO.getConnection();
	
	@Override
	public List<Item> getAllItems() {
		List<Item> itemList = null;
		Item i;
		try {
			String getAll = "SELECT * FROM item;";
			PreparedStatement ps = conn.prepareStatement(getAll);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				i = new Item();
				i.setId(rs.getInt("id"));
				i.setName(rs.getString("name"));
				i.setPrice(rs.getDouble("price"));
				itemList = new ArrayList<>();
				itemList.add(i);	
			}
		}
		catch(SQLException ex) {
			  System.err.format("SQL State: %s\n%s", ex.getSQLState(), ex.getMessage());
		}
		return itemList;
	}

	@Override
	public boolean addItem(Item i) {
		try{String add = "INSERT INTO item (id, name, price) VALUES (?,?,?); ";
		PreparedStatement ps= conn.prepareStatement(add);
		ps.setInt(1,i.getId() );
		ps.setString(2, i.getName());
		ps.setDouble(3, i.getPrice());
		int rowsAffected = ps.executeUpdate();
		System.out.println(rowsAffected +" row(s) affected!!");
		
		}
		catch(SQLException ex) {
			  System.err.format("SQL State: %s\n%s", ex.getSQLState(), ex.getMessage());
		}
		return false;
	}

	@Override
	public boolean removeItemById(int id) {
		try{String delete = "DELETE FROM item WHERE id=?;";
		PreparedStatement ps = conn.prepareStatement(delete);
		ps.setInt(1,id);
		int rowsAffected = ps.executeUpdate();
		System.out.println(rowsAffected +" row(s) affected!!");
		}
		catch(SQLException ex) {
			 System.err.format("SQL State: %s\n%s", ex.getSQLState(), ex.getMessage());
		}
	return false;}

}
