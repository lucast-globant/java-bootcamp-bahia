package shoppingCart;

import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class Payment {
	protected static AtomicInteger nextTransactionNumber = new AtomicInteger(0);
	protected int transactionNumber;
	protected Date date;
	protected String clientID;
	protected ShoppingCart shopCart;
	
	public Payment(){
		transactionNumber = nextTransactionNumber.incrementAndGet();
	}
	
	public abstract float applyDiscount();
	public abstract String toString();
	
	public float totalPayment(){
		return shopCart.getTotal();
	}
	
	public ShoppingCart getCart(){
		return this.shopCart;
	}
}
