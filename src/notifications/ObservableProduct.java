package notifications;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/*
 * This class is a copy of the 'Product' class in package 'shoppingCart' that implements the Subject interface 
 * */
public class ObservableProduct implements Subject {
	List<Observer> observers;
	private int code, category;
	private String name, description;
	private float price;
	private boolean isUnit;
	private static AtomicInteger nextCode = new AtomicInteger(0);

	public ObservableProduct(String name, float price, boolean isUnit) {
		observers = new ArrayList<Observer>();
		this.name = name;
		this.price = price;
		this.isUnit = isUnit;
		this.code = nextCode.incrementAndGet();
		notify();
	}

	public void setPrice(float price) {
		this.price = price;
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
			actualObserver.update("The price of a product has changed: '"
					+ name + "' code: " + code + "--- new price: $" + price);
		}
	}
}
