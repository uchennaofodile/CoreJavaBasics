package daointerface;
import java.util.*;
import model.Item;


public interface ItemDAO {
	List<Item> getAllItems();
	boolean addItem(Item i);
	boolean removeItemById(int id);

}
