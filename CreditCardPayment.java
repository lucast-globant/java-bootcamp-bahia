package topic1.payment;

import topic1.ShoppingCart;

public class CreditCardPayment implements PaymentStrategy {
	
	private String name; 
	private String number;
	
	public CreditCardPayment(String name, String number) {
		super();
		this.name = name;
		this.number = number;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	//10% disccount in the amount
	public void pay (long paymentCod, ShoppingCart cart) {
		double amount = cart.totalPrice(),
				discount = (amount * 0.1),
				totalPay = amount - discount;
		System.out.println ("Payment code "+paymentCod);
		System.out.println ("$"+totalPay+" has been paid by Credit Card.\n"
				+"Detail: Total price: $"+amount+" less 10% of disccount by credit card payment.");
	}

}
