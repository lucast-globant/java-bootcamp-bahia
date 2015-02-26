package Model;

import java.util.ArrayList;
import java.util.List;

import API.CartService;
import API.UserService;
import Model.paymentMethods.Cash;
import Model.paymentMethods.CreditCard;
import Model.paymentMethods.FinancialPayment;
import Model.paymentMethods.PaypalAccount;



public class CustomerAccount implements CustomerService {
	
	protected String userName;
	private CreditCard creditCard;
	private PaypalAccount paypal;
	/**
	 * money that has in his wallet   
	 */
	private Cash money;
	
	protected Cart myShoppingCart;
	
	protected List<CustomerService> friends;
	protected ProfilePhoto profilePhoto;

	
	public CustomerAccount(String username, CreditCard creditCard, PaypalAccount paypal, Cash money) {
		super();
		this.userName = username;
		this.creditCard = creditCard;
		this.paypal = paypal;
		this.money = money;
		this.myShoppingCart = new Cart(this);
		
		friends=new ArrayList<CustomerService>();
		profilePhoto=new ProfilePhoto();
	}
	
	/**
	 * a default account with 100$ in each paymentMethods
	 * @param username
	 */
	public CustomerAccount(String username) {
		super();
		this.userName = username;
		this.creditCard = new CreditCard(username, 0, "100.00");
		this.paypal = new PaypalAccount(username, "", "", "100.00");
		this.money = new Cash("100.00");
		this.myShoppingCart = new Cart(this);
		
		friends=new ArrayList<CustomerService>();
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

	@Override
	public void setPaypalAccount(PaypalAccount paypal) {
		this.paypal = paypal;
	}	
	
	@Override
	public Cart getCart() {
		return myShoppingCart;
	}


	@Override
	public void giveALike() {
		
		profilePhoto.addLike();
	}

	@Override
	public void uploadPerfilPhoto(String url) {
	
		profilePhoto.setPhoto(url);
	}

	@Override
	public void addFriend(CustomerService friend) {
	
		friends.add(friend);
	}

	@Override
	public List<CustomerService> friends() {
		return friends;
	}
	

}
