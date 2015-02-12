package ShopingCart;

import java.util.ArrayList;
import java.util.List;
import Items.Item;
import Mailist.MarketManager;
import Observer.Observer;
import PaymentMethod.Paypal;
import Transactions.Transaction;

public class MainSC {

	public static void main(String[] args) {
		// Items
		Item i1 = new Item("1", 1);
		Item i2 = new Item("2", 2);
		// Observers
		Observer m = new MarketManager("manager");
		List<Observer> observers = new ArrayList<Observer>();
		observers.add(m);
		// Cart
		Cart cart = new Cart();
		cart.addItem(i1);
		cart.addItem(i2);
		// Transaction
		Transaction t = cart.buy(new Paypal("email@gmail.com", "pass"));
		// System.out.println("###############################");
		// System.out.println(t.toString());

		Commerce commerce = new Commerce();
		commerce.createItem("product1", 1);
		Item item1 = commerce.getItemForName("product1");
		List<Item> items = new ArrayList<Item>();
		items.add(item1);
		commerce.createOffer("offer1", 2, items);
		commerce.displayItems();
	}

}
