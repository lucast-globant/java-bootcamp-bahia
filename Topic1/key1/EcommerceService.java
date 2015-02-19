package Topic1.key1;

import java.math.BigDecimal;
import java.util.List;

import Topic1.key3.Counter;
import Topic1.key6.MailingList;
import Topic1.key6.Notification;

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

	/**
	 * product and offers are treated like the same thing (offers are prodructs too)
	 *  because at checkout would be a mess if i need to search each item y is contained in a offer or not
	 */
	protected List<Product> productListOffer;
	
	protected MailingList mailingList;
		
	public enum payMethod {
		CREDITCARD, PAYPAL, CASH
	}
	
	

//----CONSTRUCTORS
	public EcommerceService(List<Product> productListOffer) {
		transactions=0;
		this.productListOffer = productListOffer;
		mailingList=new MailingList();
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
	public void checkout( payMethod method, CustomerAccount customer){
		BigDecimal total=new BigDecimal("0.00");
		Cart cart=customer.getMyShoppingCart();
		List<Item> products=cart.getItems();
		
		for (Item i : products) {
			total=total.add(i.getProduct().getPrice()).multiply(
					new BigDecimal(""+i.getQuantity()) );
		}
	
		switch (method) {
		case CREDITCARD:
			if(customer.getCreditCard()!=null && 
			 customer.getCreditCard().getBalance().compareTo(total)==1 )
				
				
				customer.getCreditCard().setBalance(
						""+customer.getCreditCard().getBalance().subtract(
								total.subtract( 
										//total menos el 10% discount
										enterPercentageDiscount(total, "0.1" )
								)));
			else
				System.out.println("creditcard error");
			System.out.println("ahora tengo "+customer.getCreditCard().getBalance()+" $");
			break;
			
		case PAYPAL:
			
			assert(customer.getPaypal()!=null);
			if(customer.getPaypal()!=null && 
					customer.getPaypal().getBalance().compareTo(total)==1 )
				
				//cheapest free
				customer.getPaypal().setBalance(
						""+customer.getPaypal().getBalance().subtract(
								total.subtract(cheapestProduct(cart).getPrice() ))
								);
			else{
				System.out.println("paypal error");
				break;
			}
			System.out.println("ahora tengo "+customer.getPaypal().getBalance()+" $");
			break;
			
		case CASH:
			if(customer.getMoney().compareTo(total)==1)//if has to pay the total
				customer.setMoney(
						""+customer.getMoney().subtract(
								total.subtract( 
										//90% of the most expensive item is free if the user pays by Cash.
										enterPercentageDiscount(
												mostExpensiveProduct(cart).getPrice(), "0.9" )
								)));
			else
				System.out.println("you dont have that money");
			System.out.println("ahora tengo "+customer.getMoney()+" $");
			break;
	
		default:
			//no deberia pasar
			System.out.println("invalid payment method");
			break;
		}
		
		//log transaction
		Counter.getCounterInstance().next();
		transactions=Counter.getCount();
		mailingList.setNotification(new Notification(Notification.TRANSACTION_DONE));
		System.out.println("transaction: "+transactions);
		//end transaction
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
	 * simply to a shortcut to enter discounts
	 * @param balance
	 * @param discount a float percentage in form as a String (10%=""+0.1)
	 * @return the final price
	 */
	private BigDecimal enterPercentageDiscount(BigDecimal balance,String discount){
	
		return //balance.subtract(
				balance.multiply(new BigDecimal(discount)) ;
		
	}
	
	private Product cheapestProduct(Cart myshoppingCart){

		if(myshoppingCart.getItems().size()>0){
			//declare and inicialization of return variable
			Product cheapest=myshoppingCart.getItems().get(0).getProduct();

			//search cheapest
			for (Item it : myshoppingCart.getItems()) {
				if(it.getProduct().getPrice().compareTo(cheapest.getPrice())==-1)
					cheapest=it.getProduct();
			}

			return cheapest;
		}

		//if no products
		return null;
	}

	private Product mostExpensiveProduct(Cart myshoppingCart) {

		if (myshoppingCart.getItems().size() > 0) {
			// declare and inicialization of return variable
			Product mep = myshoppingCart.getItems().get(0).getProduct();

			// search cheapest
			for (Item item : myshoppingCart.getItems()) {
				if (item.getPrice().compareTo(mep.getPrice()) == 1)
					mep = item.getProduct();
			}

			return mep;
		}

		// if no products
		return null;
	}
	
	

}


