package key_six;

import java.util.LinkedList;

public class Test {

	public static void main(String[] args) {

		SingletonShopping s = SingletonShopping.getInstance();
		Manager ma = new Manager("Roman");
		SingletonNotificationManager.getInstance().addObserver(ma);

		Computer c = new Computer();
		Mouse m = new Mouse();
		OfferItems o = new OfferItems("Free");

		o.addItem(c);
		o.addItem(m);

		Computer p = new Computer();
		s.addItem(p);
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
		cart.addItem(p);
		cart.pay(new CashStrategy());
		System.out.println("---STOCK---");
		System.out.println(s.getStockAsString());

		m.changePrice(30);
		c.changePrice(5500);
	}

}
