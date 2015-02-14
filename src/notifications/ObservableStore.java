package notifications;

import java.util.List;

import shoppingCart.Item;
import shoppingCart.Product;
import shoppingCart.SparseArrayList;

/*
 * This class is a copy of the 'Store' class in package 'shoppingCart' that implements the Subject interface 
 * */
public class ObservableStore implements Subject {
	List<Observer> observers;
	private List<Item> stockOfProducts;

	public ObservableStore() {
		stockOfProducts = new SparseArrayList<>();
		// The first position -zero-, is not a valid one, so it keeps a null
		// value:
		stockOfProducts.add(null);
	}

	public boolean addProduct(Product product, float quantity) {
		int position = product.getCode();
		if (position < stockOfProducts.size()) {
			if (stockOfProducts.get(position).equals(null)) {
				stockOfProducts.add(position, new Item(product, quantity));
				notifyChange();
				return true;
			} else {
				return false;
			}
		} else {
			stockOfProducts.add(position, new Item(product, quantity));
			notifyChange();
			return true;
		}
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
			actualObserver.update("A new product/offer has been added");
		}
	}
}
