package API;

import java.util.List;

import Model.Item;
import Model.Product;
import Model.Transaction;
import Model.paymentMethods.FinancialPayment;

/**
 * @author Jordan
 * services that a shopping cart expose
 */
public interface CartService {

	public void add(Product prod, int quantity);
	
	public Item removeLastItem();
	
	public void removeItem(Item prod);
	
	public List<Item> getItems();
	
	public void cleanCart();
		
	public Transaction checkout(FinancialPayment method); 
			
	
}
