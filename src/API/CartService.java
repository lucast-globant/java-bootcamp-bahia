package api;

import java.util.List;

import model.Cart;
import model.EcommerceService;
import model.User;
import model.Item;
import model.Product;
import model.Transaction;
import model.paymentMethods.FinancialPayment;


/**
 * @author Jordan
 * services that a shopping cart expose
 */
public interface CartService {
	
	
	public void addItem(String userName, Product idProduct, int quantity);
	
	public void removeItem(String userName, Item prod);
	
	public Cart getCart(String username);
	
	public void cleanCart(String username);
		
	public Transaction checkout(FinancialPayment method, String username); 
	
	public int transactionsDone();

	public void createCart(Cart cart);
	
		
	
}
