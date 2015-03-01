package topic1.payment;

import topic1.Counter;
import topic1.ShoppingCart;
import topic1.notifications.Mail;
import topic1.notifications.Observable;
import topic1.notifications.Observer;

public class PaypalPayment implements PaymentStrategy {
	
	private String email;
	private String password;
	
	public PaypalPayment(String email, String password) {
		this.email = email;
		this.password = password;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void pay (ShoppingCart cart) {
		double amount = cart.totalPrice(),
				discount = cart.cheapestItem().getPrice(),
				totalPay = amount;
		if (discount != amount) {
			totalPay -= discount;
		}
		doNotify (new Mail ("manager@mail","New Transaction was made","Payment code "+Counter.get()+"\n$"+totalPay+" has been paid by Paypal.\n"
				+"Detail: Total price: $"+amount+" with the cheapest product for free by Paypal payment."));
		System.out.println ("Payment code "+Counter.get());
		System.out.println ("$"+totalPay+" has been paid by Paypal.\n"
				+"Detail: Total price: $"+amount+" with the cheapest product for free by Paypal payment.");
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
