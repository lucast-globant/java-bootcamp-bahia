package Topic1.key1;

import java.util.List;

import Topic1.key6.IObserver;
import Topic1.key6.MailingList;
import Topic1.key6.EMail;


/**
 * @author Jordan
 * This page has the benefits below:
 * 10% by Credit Card. 
 * The cheapest item is for free when the user pay by Paypal.
 * 90% of the most expensive item is free if the user pays by Cash.
 */
public class EcommerceService {
	
	/**
	 * how many sales(as transactions) the site has made
	 */
	private int transactions;

	//notification messages (constants)
	private static final String PRICE_CHANGED="PRICE_CHANGED";
	private static final String TRANSACTION_DONE="TRANSACTION_DONE";
	private static final String PRODUCT_ADDED="PRODUCT_ADDED";
	
	
	/**
	 * product and offers are treated like the same thing (offers are prodructs too)
	 *  because at checkout would be a mess if i need to search each item y is contained in a offer or not
	 */
	protected List<Product> productListOffer;
	
	protected MailingList mailingList;
	
	

//----CONSTRUCTORS
	public EcommerceService(List<Product> productListOffer) {
		transactions=0;
		this.productListOffer = productListOffer;
		mailingList=new MailingList();
		
		IObserver ob=new EMail();
		mailingList.attach(ob);
		
	}

	
	
	//----------methods
	
	public Product searchProduct(String name){
		for (Product concreteProduct : productListOffer) {
			if(concreteProduct.getName().equals(name))
				return concreteProduct;
		}
		//if i cant find one
		System.out.println("item no found");
		return null;
	}
	

	/**
	 * make the payment of one customer
	 * @param method available payment methods (CREDITCARD, PAYPAL, CASH) 
	 * @param customer
	 */
 	public Transaction checkout( FinancialPayment method, CustomerAccount customer){
		
		
		//begin transaction
		Transaction t=new Transaction(method, customer);				
		
		transactions=t.getId();
		mailingList.notify(TRANSACTION_DONE+"("+transactions+")");
		//end transaction
		
		return t;
	}
	
	
	/**
	 * list an entire list of the products and offers
	 * @return
	 */
	public String listOffers(){
		StringBuffer list=new StringBuffer();
		for (Product product : productListOffer) {
			list.append(product.listMe());
		}
		System.out.println(list);
		return list.toString();
	}
	
	/**
	 * list only the products name and price, it doesnt list what offers contains
	 * @return
	 */
	public String listItems(){
		StringBuffer list=new StringBuffer();
		for (Product product : productListOffer) {
			list.append(product.getName()+"..."+product.getPrice()+"$\n");
		}
		System.out.println(list);
		return list.toString();
	}
	
	/**
	 * add product to the service stock
	 * @param product
	 */
	public void addProduct(Product product) {
		productListOffer.add(product);
		mailingList.notify(PRODUCT_ADDED+" :"+ product.getName());
	}
	
	public void changePrice(String prod, String price){
		Product p=searchProduct(prod);
		if(p!=null){
			String oldPrice=p.getPrice().toString();
			p.setPrice(price);
			mailingList.notify(PRICE_CHANGED+" ("+ oldPrice+" -> "+p.getPrice()+")");
		}			

	}



	public void addProductToCart(Product searchedProduct, int i, Cart myShoppingCart) {
		
		myShoppingCart.addToCart(searchedProduct, i);
	}
		
	

	
	

}


