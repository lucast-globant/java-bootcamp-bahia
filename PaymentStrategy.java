package topic1.payment;

import topic1.ShoppingCart;

public interface PaymentStrategy {
	
	public void pay (long paymentCod, ShoppingCart cart);

}
