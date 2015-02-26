package Model;

import java.util.ArrayList;
import java.util.List;

import API.CartService;
import Model.MailingList.EmailSender;
import Model.paymentMethods.FinancialPayment;


/**
 * @author Jordan
 * shopping cart
 */
public class Cart implements CartService{

	protected List<Item> products;
	private CustomerService userAccount;
	
	public Cart(CustomerService userAccount){
		products=new ArrayList<Item>();
		this.userAccount=userAccount;
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
	
	@Override
	/**
	 * make the payment of one customer
	 * @param method available payment methods (CREDITCARD, PAYPAL, CASH) 
	 * @param customer
	 */
 	public Transaction checkout( FinancialPayment method){
		
		
		//begin transaction
		Transaction t=new Transaction(method, userAccount);				

		EmailSender.getInstance().notifyToList("TRANSACTION_DONE"+"("+t.getId()+")");
		//end transaction
		
		return t;
	}
	
	@Override
	public void removeItem(Item prod) {
		products.remove(prod);
		
	}
	
	
}
