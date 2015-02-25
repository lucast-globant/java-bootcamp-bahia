package tests;

import static org.junit.Assert.*;
import java.util.List;
import interfaces.Item;
import interfaces.PaymentStrategy;
import interfaces.ShoppingCart;
import org.junit.Test;
import classes.CashStrategy;
import classes.CreditCardStrategy;
import classes.FunctionalShoppingCart;
import classes.Offer;
import classes.PaypalStrategy;
import classes.Product;

public class ShoppingCartTest {

	@Test
	public void createShoppingCart() {
		ShoppingCart shopcart = new FunctionalShoppingCart();
		assertFalse("The shopping cart doesn't should be null.", shopcart == null);
	}

	@Test
	public void addingProducts() {
		ShoppingCart shopcart = new FunctionalShoppingCart();

		// product1
		Item item1 = new Product("Smart TV LG 40 inches", "TV100", 700.00);
		shopcart.addItem(item1);
		assertEquals(shopcart.getItems().size(), 1);
		List<Item> items = shopcart.getItems();
		assertEquals(item1, items.get(0));

		// product2
		Item item2 = new Product("Smart TV Samsung 42 inches", "TV101", 800.00);
		shopcart.addItem(item2);
		assertEquals(shopcart.getItems().size(), 2);
		items = shopcart.getItems();
		assertEquals(item1, items.get(0));
		assertEquals(item2, items.get(1));

		// product3
		Item item3 = new Product("TV 3D LG 42 inches", "TV105", 950.00);
		shopcart.addItem(item3);
		assertEquals(shopcart.getItems().size(), 3);

		items = shopcart.getItems();
		assertEquals(item1, items.get(0));
		assertEquals(item2, items.get(1));
		assertEquals(item3, items.get(2));

		double total = 0;
		for (Item item : items) {
			total += item.getValue();
		}
		assertTrue(total == 2450.00);
	}

	@Test
	public void addingOffers() {
		ShoppingCart shopcart = new FunctionalShoppingCart();

		// offer1
		Item item1 = new Product("Smart TV LG 40 inches", "TV100", 700.00);
		Item item2 = new Product("Home Theatre Sony Muteki 5.1", "HT200", 600.00);
		Offer offer1 = new Offer("Cinema in your living", "OF001", 1150.00);
		offer1.addItem(item1);
		offer1.addItem(item2);
		shopcart.addItem(offer1);
		assertEquals(shopcart.getItems().size(), 1);
		List<Item> items = shopcart.getItems();
		assertEquals(offer1, items.get(0));

		// offer2
		Item item3 = new Product("TV 3D LG 42 inches", "TV105", 950.00);
		Item item4 = new Product("Home Theatre Philips", "HM201", 750.00);
		Offer offer2 = new Offer("Enjoy your movies", "OF001", 1500.00);
		offer2.addItem(item3);
		offer2.addItem(item4);
		shopcart.addItem(offer2);
		assertEquals(shopcart.getItems().size(), 2);

		items = shopcart.getItems();
		assertEquals(offer1, items.get(0));
		assertEquals(offer2, items.get(1));

		double total = 0;
		for (Item item : items) {
			total += item.getValue();
		}
		assertTrue(total == 2650.00);
	}

	@Test
	public void addingProductsAndOffers() {
		ShoppingCart shopcart = new FunctionalShoppingCart();

		// offer1
		Item item1 = new Product("Smart TV LG 40 inches", "TV100", 700.00);
		Item item2 = new Product("Home Theatre Sony Muteki 5.1", "HT200", 600.00);
		Offer offer1 = new Offer("Cinema in your living", "OF001", 1150.00);
		offer1.addItem(item1);
		offer1.addItem(item2);
		shopcart.addItem(offer1);
		assertEquals(shopcart.getItems().size(), 1);
		List<Item> items = shopcart.getItems();
		assertEquals(offer1, items.get(0));

		// product1
		Item item3 = new Product("Table TV O", "TT001", 100.00);
		shopcart.addItem(item3);
		assertEquals(shopcart.getItems().size(), 2);

		items = shopcart.getItems();
		assertEquals(offer1, items.get(0));
		assertEquals(item3, items.get(1));
		double total = 0;
		for (Item item : items) {
			total += item.getValue();
		}
		assertTrue(total == 1250.00);
	}

	@Test
	public void removingItems() {

		ShoppingCart shopcart = new FunctionalShoppingCart();

		// offer1
		Item item1 = new Product("Smart TV LG 40 inches", "TV100", 700.00);
		Item item2 = new Product("Home Theatre Sony Muteki 5.1", "HT200", 600.00);
		Offer offer1 = new Offer("Cinema in your living", "OF001", 1150.00);
		offer1.addItem(item1);
		offer1.addItem(item2);
		shopcart.addItem(offer1);

		// product1
		Item item3 = new Product("Table TV O", "TT001", 100.00);
		shopcart.addItem(item3);

		assertEquals(shopcart.getItems().size(), 2);
		List<Item> items = shopcart.getItems();
		assertEquals(offer1, items.get(0));
		assertEquals(item3, items.get(1));

		double total = 0;
		for (Item item : items) {
			total += item.getValue();
		}
		assertTrue(total == 1250.00);

		shopcart.removeItem(offer1);
		assertEquals(shopcart.getItems().size(), 1);
		items = shopcart.getItems();
		assertEquals(item3, items.get(0));

		total = 0;
		for (Item item : items) {
			total += item.getValue();
		}
		assertTrue(total == 100.00);

		shopcart.removeItem(item3);
		assertEquals(shopcart.getItems().size(), 0);

		total = 0;
		for (Item item : items) {
			total += item.getValue();
		}
		assertTrue(total == 0.00);
	}

	@Test
	public void addingPayment() {
		PaymentStrategy payment1 = new CashStrategy();
		ShoppingCart shopcart = new FunctionalShoppingCart();
		shopcart.addPayment(payment1);
		assertEquals(shopcart.getPayment(), payment1);

		PaymentStrategy payment2 = new PaypalStrategy("luciano@gmail.com", "bootcamp");
		shopcart.addPayment(payment2);
		assertEquals(shopcart.getPayment(), payment2);
	}

	@Test
	public void removingPayment() {
		PaymentStrategy payment1 = new CashStrategy();
		ShoppingCart shopcart = new FunctionalShoppingCart();
		shopcart.addPayment(payment1);
		assertEquals(shopcart.getPayment(), payment1);
		shopcart.removePayment();
		assertEquals(shopcart.getPayment(), null);

		PaymentStrategy payment2 = new CreditCardStrategy("Luciano", 11501);
		shopcart.addPayment(payment2);
		assertEquals(shopcart.getPayment(), payment2);
		shopcart.removePayment();
		assertEquals(shopcart.getPayment(), null);
	}
}
