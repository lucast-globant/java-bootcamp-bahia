package model.paymentMethods;

import java.math.BigDecimal;
import java.math.RoundingMode;

import model.discounts.Discount;



/**
 * @author Jordan
 * an abstraction to a variety of payment methods, like paypal or creditcard
 */
public abstract class FinancialPayment {
	protected int id;
	protected Discount discount;
	private BigDecimal balance;
	
	public BigDecimal getBalance() {
		return balance.setScale(2, RoundingMode.UP);
	}
	
	/**
	 * this is a tricky part, just enter a float as a String( like 1.1=""+1.1 )
	 * @param amount a float number as a String 
	 */
	public void setBalance(String amount) {
		this.balance = new BigDecimal(amount);

	}
	
	public int getId(){
		return id;
	}
	
	public Discount getDiscount(){
		return discount;
	}


}
