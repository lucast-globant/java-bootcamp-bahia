package topic1.payment;

import topic1.Counter;
import topic1.ShoppingCart;
import topic1.notifications.Mail;
import topic1.notifications.Observable;
import topic1.notifications.Observer;

public class CashPayment implements PaymentStrategy {

	//90% discount in the most expensive product
	public void pay (ShoppingCart cart) {
		double amount = cart.totalPrice(),
				discount = (0.9 * cart.mostExpensiveItem().getPrice()),
				totalPay = amount - discount;
		System.out.println ("Payment code "+ Counter.get());
		System.out.println ("$"+totalPay+" has been paid in cash.\n"
				+"Detail: Total price: $"+amount+" with the 90% of most expensive product discount in cash payments.");
		
		doNotify (new Mail ("manager@mail","New Transaction was made","Payment code "+Counter.get()+"\n$"+totalPay+" with the 90% of most expensive product discount in cash payments."));
	}

	public void addObserver(Observer o) {
		Observable.getItemObservers().add(o);
	}

	public void removeObserver(Observer o) {
		Observable.getItemObservers().remove(o);		
	}

	public void doNotify(Mail mail) {
		for (Observer o: Observable.getItemObservers()) {
			if (o != null) {
				o.update(mail);
			}
		}
	}


}
