package Topic1.key1;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CreditCard extends FinancialPayment{
	
	private String titularName;
	private int cardNumber;

	
	
	public CreditCard(String titularName, int cardNumber, String balance) {
		super();
		this.titularName = titularName;
		this.cardNumber = cardNumber;
		setBalance(balance);
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
