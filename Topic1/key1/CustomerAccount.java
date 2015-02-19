package Topic1.key1;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

import Topic1.key1.EcommerceService.payMethod;

public class CustomerAccount {
	
	
	protected String name;
	private CreditCard creditCard;
	private PaypalAccount paypal;
	/**
	 * money that has in his wallet   
	 */
	private BigDecimal money;
	
	protected Cart myShoppingCart;

	
	public CustomerAccount(String name, String money) {
		super();
		this.name = name;
		this.money = new BigDecimal(money).setScale(2, RoundingMode.UP);
		this.myShoppingCart = new Cart();
	}

	
	public CustomerAccount(String name, CreditCard creditCard, PaypalAccount paypal, String money) {
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
	 * @param category
	 * @return all items that contains a product with that category
	 */
	public List<Item> getProductsByCategory(String category){
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
	public void checkout(payMethod method, EcommerceService where){
		assert(method==payMethod.PAYPAL || method==payMethod.CREDITCARD || method==payMethod.CASH);
		 where.checkout(method, this);		
		
	}
	
	

}
