package model.paymentMethods;

import model.discounts.DiscountCreditCard;






public class CreditCard extends FinancialPayment{
	
	private String titularName;
	private int cardNumber;

	
	
	public CreditCard(String titularName, int cardNumber, String balance) {
		super();
		this.id=1;
		this.titularName = titularName;
		this.cardNumber = cardNumber;
		setBalance(balance);
		
		discount=new DiscountCreditCard(); //how will manage the discounts
	}
	
	
	
	public String getTitularName() {
		return titularName;
	}
	public void setTitularName(String titularName) {
		this.titularName = titularName;
	}
	public int getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}

	
	
	

}
