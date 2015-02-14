package shoppingCart;

import java.util.Date;

public abstract class Payment {
	static int nextTransactionNumber = 1;
	int transactionNumber;
	Date date;
	String clientID;
	ShoppingCart shopCart;
	
	public Payment(){
		transactionNumber = nextTransactionNumber;
		nextTransactionNumber++;
	}
	
	public abstract float applyDiscount();
	public abstract String toString();
	
	float totalPayment(){
		return shopCart.getTotal();
	}
}
