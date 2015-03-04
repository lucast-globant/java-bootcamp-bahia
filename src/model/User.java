package model;

import java.util.ArrayList;
import java.util.List;

import model.paymentMethods.Cash;
import model.paymentMethods.CreditCard;
import model.paymentMethods.FinancialPayment;
import model.paymentMethods.PaypalAccount;




public class User {
	
	protected String userName;
	private CreditCard creditCard;
	private PaypalAccount paypal;
	/**
	 * money that has in his wallet   
	 */
	private Cash money;
	
	protected Cart myShoppingCart;
	
	protected List<User> friends;
	protected ProfilePhoto profilePhoto;

	
	public User(String username, CreditCard creditCard, PaypalAccount paypal, Cash money) {
		super();
		this.userName = username;
		this.creditCard = creditCard;
		this.paypal = paypal;
		this.money = money;
		this.myShoppingCart = new Cart(this);
		
		friends=new ArrayList<User>();
		profilePhoto=new ProfilePhoto();
	}
	
	/**
	 * a default account with 100$ in each paymentMethods
	 * @param username
	 */
	public User(String username) {
		super();
		this.userName = username;
		this.creditCard = new CreditCard(username, 0, "100.00");
		this.paypal = new PaypalAccount(username, "", "", "100.00");
		this.money = new Cash("100.00");
		this.myShoppingCart = new Cart(this);
		
		friends=new ArrayList<User>();
	}



	public String getUserName() {
		return userName;
	}

	public void setName(String name) {
		this.userName = name;
	}

	public CreditCard getCreditCard() {
		return creditCard;
	}

	public void setCreditCard(CreditCard creditCard) {
		this.creditCard = creditCard;
	}
	
	public Cash getCash() {
		return money;
	}

	public void addCash(Cash money) {
		this.money.getBalance().add(money.getBalance()); 
	}

	public FinancialPayment getPaypalAccount() {
		return paypal;
	}

	public void setPaypalAccount(PaypalAccount paypal) {
		this.paypal = paypal;
	}	
	

	public Cart getCart() {
		return myShoppingCart;
	}


	public void giveALike() {
		
		profilePhoto.addLike();
	}


	public void uploadPerfilPhoto(String url) {
	
		profilePhoto.setPhoto(url);
	}

	public void addFriend(User friend) {
	
		friends.add(friend);
	}


	public List<User> friends() {
		return friends;
	}
	

}
