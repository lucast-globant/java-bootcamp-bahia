package topic1;

import java.util.List;

public interface ShoppingCart {
	
	public void addItem (Item p);
	public void removeItem (Item p);
	public List<Item> items ();
	public Item mostExpensiveItem ();
	public Item cheapestItem();
	public double totalPrice (); 
	public String showItems ();

}
