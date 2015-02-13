package topic1;

import java.util.List;

import topic1.mailist.Notification;
import topic1.payment.PaymentStrategy;

public interface ShoppingCart {
	
	public Notification addItem (Item p);
	public void removeItem (Item p);
	public List<Item> items ();
	public Item mostExpensiveItem ();
	public Item cheapestItem();
	public double totalPrice (); 
	public Notification pay (PaymentStrategy paymentMethod);
	public String showItems ();

}
