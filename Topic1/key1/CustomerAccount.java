package Topic1.key1;



public class CustomerAccount {
	
	
	protected String name;
	private CreditCard creditCard;
	private PaypalAccount paypal;
	/**
	 * money that has in his wallet   
	 */
	private Cash money;
	
	protected Cart myShoppingCart;

	
	public CustomerAccount(String name, CreditCard creditCard, PaypalAccount paypal, Cash money) {
		super();
		this.name = name;
		this.creditCard = creditCard;
		this.paypal = paypal;
		this.money = money;
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
	
	public Cash getMoney() {
		return money;
	}

	public void setMoney(Cash money) {
		this.money = money;
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


	

}
