package shoppingCart;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	private List<Item> listOfItems;
	private float total;

	public ShoppingCart() {
		listOfItems = new ArrayList<Item>();
		total = 0;
	}

	public void addItem(Item item) {
		listOfItems.add(item);
		total += item.getQuantity() * item.getProduct().getPrice();
	}

	public void addItem(Product product, float quantity) {
		listOfItems.add(new Item(product, quantity));
		total += quantity * product.getPrice();
	}

	public void removeItem(int productID) {
		int i;
		for (i = 0; i < listOfItems.size(); i++) {
			if (listOfItems.get(i).getProduct().getCode() == productID) {
				listOfItems.remove(i);
			}
		}
	}

	public Item getItem(int index) {
		if (index < listOfItems.size()) {
			return listOfItems.get(index);
		} else {
			return null;
		}
	}

	public float getTotal() {
		return total;
	}

	public Item getCheapestItem() {
		Product auxProduct;
		Item cheapestItem = null;
		float finalPrice;
		float cheapestPrice = Float.MAX_VALUE;

		for (Item actualItem : listOfItems) {
			auxProduct = actualItem.getProduct();
			if (auxProduct.isUnit()) {
				finalPrice = auxProduct.getPrice();
			} else {
				finalPrice = auxProduct.getPrice() * actualItem.getQuantity();
			}
			if (finalPrice < cheapestPrice) {
				cheapestPrice = actualItem.getProduct().getPrice();
				cheapestItem = actualItem;
			}
		}
		return cheapestItem;
	}

	public Item getMostExpensiveItem() {
		Product auxProduct;
		Item mostExpensiveItem = null;
		float finalPrice;
		float mostExpensivePrice = Float.MIN_VALUE;

		for (Item actualItem : listOfItems) {
			auxProduct = actualItem.getProduct();
			if (auxProduct.isUnit()) {
				finalPrice = auxProduct.getPrice();
			} else {
				finalPrice = auxProduct.getPrice() * actualItem.getQuantity();
			}
			if (finalPrice > mostExpensivePrice) {
				mostExpensivePrice = actualItem.getProduct().getPrice();
				mostExpensiveItem = actualItem;
			}
		}
		return mostExpensiveItem;
	}

	public String toString() {
		String output = "";
		for (Item actualItem : listOfItems) {
			output = output.concat(actualItem.toString());
		}
		return output;
	}
}
