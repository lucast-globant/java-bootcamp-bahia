package exercise1to6;

import java.util.ArrayList;

import exercise1to6.payments.CreditCard;

public class Main {

	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		MarketManager market= new MarketManager(cart);
		cart.addItem(new Product("Vayne", 1000));
		cart.addItem(new Product("Graves", 1500));
		cart.addItem(new Product("Ezreal", 1250));
		cart.addItem(new Product("Corki", 2500));
		cart.setPayment(new CreditCard(4444	, "Francisco Cuenca"));
		System.out.println(cart.toString());
		Transaction t= cart.checkOut();
		////Offers ////
		
		Product p1 = new Product("Sneaky", 1000);
		Product p2 = new Product("Doublelift", 1000);
		Product p3 = new Product("Imp", 1000);
		ArrayList<Item> items = new ArrayList<Item>();
		items.add(p1);
		items.add(p2);
		items.add(p3);
		Offer o= new Offer("ADCS",300000,items);
		cart.addItem(o);
		System.out.println(cart.toString());
		
		 t= cart.checkOut();
		System.out.println(t.toString());
		
		
		System.out.println(market.toString());


	}

}
