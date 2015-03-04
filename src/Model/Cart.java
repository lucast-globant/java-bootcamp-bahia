package model;

import java.util.ArrayList;
import java.util.List;

import api.CartService;
import model.mailingList.EmailSender;
import model.paymentMethods.FinancialPayment;


/**
 * @author Jordan
 * shopping cart
 */
public class Cart {

	protected List<Item> products;
	private User user;
	
	public Cart(User userAccount){
		products=new ArrayList<Item>();
		this.user=userAccount;
	}
	
	public void add(Product prod, int quantity){
		products.add(new Item(quantity, prod));
	}
	
	public Item removeLastItem(){
		Item last=products.remove(products.lastIndexOf(products));
		return last;
	}
	
	public List<Item> getItems(){
		return products;
	}
	
	public void cleanCart(){
		products=new ArrayList<Item>();
	}
	
	/**
	 * @param category
	 * @return all items that contains a product with that category
	 */
	public List<Item> getProductsByCategory(String category){
		ArrayList<Item> listByCategory=new ArrayList<Item>();
		for (Item item : products) {
			if (item.getProduct().getCategory().equals(category))
				listByCategory.add(item);
		}
		
		return listByCategory;
	}
	

	/**
	 * make the payment of one customer
	 * @param method available payment methods (CREDITCARD, PAYPAL, CASH) 
	 */
 	public Transaction checkout( FinancialPayment method){
		
	
		Transaction t=new Transaction(method, user);				
		
		return t;
	}

	public void removeItem(Item prod) {
		products.remove(prod);
		
	}
	
	public User getOwnerAccount(){
		return user;
	}
	
}
