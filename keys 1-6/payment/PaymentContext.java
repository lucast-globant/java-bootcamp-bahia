package topic1.payment;

import topic1.ShoppingCart;

public class PaymentContext {
	
	private PaymentStrategy strategy; 
	
	public PaymentContext (PaymentStrategy strategy) {
		this.strategy = strategy;
	}
	
	public void executeStrategy (ShoppingCart cart) {
		strategy.pay(cart);
	}

}
