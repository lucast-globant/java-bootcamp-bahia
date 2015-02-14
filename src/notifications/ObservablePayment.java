package notifications;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import shoppingCart.ShoppingCart;

/*
 * This class is a copy of the 'Payment' class in package 'shoppingCart' that implements the Subject interface 
 * */
public abstract class ObservablePayment implements Subject {
	static int nextTransactionNumber = 1;
	int transactionNumber;
	Date date;
	String clientID;
	ShoppingCart shopCart;

	List<Observer> observers;

	public ObservablePayment() {
		observers = new ArrayList<Observer>();
		transactionNumber = nextTransactionNumber;
		nextTransactionNumber++;
		notifyChange();
	}

	@Override
	public void addObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyChange() {
		for (Observer actualObserver : observers) {
			actualObserver.update("A new transaction was made: "
					+ transactionNumber + "--- total: $"
					+ String.format("%.2f", shopCart.getTotal()));
		}
	}
}
