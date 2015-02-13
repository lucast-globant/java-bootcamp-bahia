package Topic1.key1;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

import Topic1.key1.EcommerceWebPage.payMethod;

public class Customer {
	
	
	protected String name;
	private CreditCard creditCard;
	private PaypalAccount paypal;
	/**
	 * money that has in his wallet   
	 */
	private BigDecimal money;
	
	protected Cart myShoppingCart;

	
	public Customer(String name, String money) {
		super();
		this.name = name;
		this.money = new BigDecimal(money).setScale(2, RoundingMode.UP);
		this.myShoppingCart = new Cart();
	}

	
	public Customer(String name, CreditCard creditCard, PaypalAccount paypal, String money) {
		super();
		this.name = name;
		this.creditCard = creditCard;
		this.paypal = paypal;
		this.money = new BigDecimal(money).setScale(2, RoundingMode.UP);;
		this.myShoppingCart = new Cart();
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CreditCard getCreditCard() {
		return creditCard;
	}

	public void setCreditCard(CreditCard creditCard) {
		this.creditCard = creditCard;
	}
	
	public BigDecimal getMoney() {
		return money;
	}

	public void setMoney(String money) {
		this.money = new BigDecimal(money).setScale(2, RoundingMode.UP);
	}

	public PaypalAccount getPaypal() {
		return paypal;
	}

	public void setPaypal(PaypalAccount paypal) {
		this.paypal = paypal;
	}
	
	

	public Cart getMyShoppingCart() {
		return myShoppingCart;
	}


	public void setMyShoppingCart(Cart myShoppingCart) {
		this.myShoppingCart = myShoppingCart;
	}


	/**
	 * adds products to my cart
	 * @param prod desireable product
	 * @param quantity quantity of that product
	 */
	public void addProduct(Product prod, int quantity){
		myShoppingCart.addToCart(prod, quantity);
	}
	
	/**
	 * @param category
	 * @return all items that contains a product with that category
	 */
	public ArrayList<Item> getProductsByCategory(String category){
		ArrayList<Item> listByCategory=new ArrayList<Item>();
		for (Item item : myShoppingCart.getItems()) {
			if (item.getProduct().getCategory().equals(category))
				listByCategory.add(item);
		}
		
		return listByCategory;
	}
	
	/**
	 * pay the products in my cart
	 * @param method how'll you pay? CASH, PAYPAL or CREDITCARD 
	 * @param where where you will buy this products?
	 */
	public void checkout(payMethod method, EcommerceWebPage where){
		assert(method==payMethod.PAYPAL || method==payMethod.CREDITCARD || method==payMethod.CASH);
		 where.checkout(method, this);		
		
	}
	
	

}
