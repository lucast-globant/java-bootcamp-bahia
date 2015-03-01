package topic1.payment;

import topic1.Counter;
import topic1.ShoppingCart;
import topic1.notifications.Mail;
import topic1.notifications.Observable;
import topic1.notifications.Observer;

public class CreditCardPayment implements PaymentStrategy {
	
	private String name; 
	private String number;
	
	public CreditCardPayment(String name, String number) {
		super();
		this.name = name;
		this.number = number;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	//10% disccount in the amount
	public void pay (ShoppingCart cart) {
		double amount = cart.totalPrice(),
				discount = (amount * 0.1),
				totalPay = amount - discount;

		doNotify (new Mail ("manager@mail","New Transaction was made","Payment code "+Counter.get()+"\n$"+totalPay+" has been paid by Credit Card.\n"
				+"Detail: Total price: $"+amount+" less 10% of disccount by credit card payment."));

		System.out.println ("Payment code "+Counter.get());
		System.out.println ("$"+totalPay+" has been paid by Credit Card.\n"
				+"Detail: Total price: $"+amount+" less 10% of disccount by credit card payment.");	
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
