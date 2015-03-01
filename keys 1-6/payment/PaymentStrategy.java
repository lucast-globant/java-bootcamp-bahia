package topic1.payment;

import topic1.ShoppingCart;
import topic1.notifications.Subject;

public interface PaymentStrategy extends Subject{
	
	public void pay (ShoppingCart cart);

}
