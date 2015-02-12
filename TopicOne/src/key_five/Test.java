package key_five;

import java.util.LinkedList;

public class Test {

	public static void main(String[] args) {
		SingletonShopping s = SingletonShopping.getInstance();
		Computer c = new Computer();
		Mouse m = new Mouse();
		OfferItems o = new OfferItems("Free");
		o.addItem(c);
		o.addItem(m);
		s.addItem(new Computer());
		s.addItem(new Computer());
		s.addItem(new Computer());
		s.addItem(new Mouse());
		s.addItem(new Mouse());
		s.addItem(new Mouse());
		s.addItem(o);
		s.addItem(new Mouse());
		System.out.println("---STOCK---");
		System.out.println(s.getStockAsString());

		ShoppingCart cart = new ShoppingCart();
		cart.addItem(o);
		cart.pay(new CashStrategy());
		System.out.println("---STOCK---");
		System.out.println(s.getStockAsString());
	}

}
