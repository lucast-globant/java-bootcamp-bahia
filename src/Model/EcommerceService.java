package Model;

import java.util.ArrayList;
import java.util.List;

import Model.MailingList.EMailAccount;
import Model.MailingList.IObserver;
import Model.MailingList.EmailSender;
import Model.paymentMethods.FinancialPayment;



/**
 * @author Jordan
 * This page has the benefits below:
 * 10% by Credit Card. 
 * The cheapest item is for free when the user pay by Paypal.
 * 90% of the most expensive item is free if the user pays by Cash.
 */
public class EcommerceService{
	
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
	
	protected EmailSender mailingList;

	private List<FinancialPayment> acceptedPaymentMethod;
	
	

//----CONSTRUCTORS
	public EcommerceService(List<Product> productListOffer) {
		transactions=0;
		this.productListOffer = productListOffer;
		mailingList=EmailSender.getInstance();
		
		IObserver ob=new EMailAccount();
		mailingList.attachToList(ob);
		
	}
	
	
	/**
	 * Ecommerce with an empty stock
	 */
	public EcommerceService() {
		transactions=0;
		this.productListOffer = new ArrayList<Product>();
		mailingList=EmailSender.getInstance();
		
		IObserver ob=new EMailAccount();
		mailingList.attachToList(ob);
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
		mailingList.notifyToList(PRODUCT_ADDED+" :"+ product.getName());
	}
	
	public void changePrice(String prod, String price){
		Product p=searchProduct(prod);
		if(p!=null){
			String oldPrice=p.getPrice().toString();
			p.setPrice(price);
			mailingList.notifyToList(PRICE_CHANGED+" ("+ oldPrice+" -> "+p.getPrice()+")");
		}			

	}



	public void addProductToCart(Product searchedProduct, int i, Cart myShoppingCart) {
		
		myShoppingCart.add(searchedProduct, i);
	}

	public List<Product> getProducts() {
		
		return productListOffer;
	}


	
	/**
	 * add a payment method to this ecommerce accepted payments
	 * @param mypayment
	 */
	public void addPaymentMethod(FinancialPayment mypayment) {
		
		acceptedPaymentMethod.add(mypayment);
	}


	public boolean accept(FinancialPayment mypayment) {

		//compare mypayment's id with all other ids in the paymentmethods list
		for (FinancialPayment financialPayment : acceptedPaymentMethod) {
			if(financialPayment.getId()==mypayment.getId())
				return true;
		}
		return false;

	}
		
	

	
	

}


