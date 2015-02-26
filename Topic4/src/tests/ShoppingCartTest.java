package tests;

import static org.junit.Assert.*;

import java.util.List;

import interfaces.Item;
import interfaces.PaymentStrategy;
import interfaces.ShoppingCart;
import interfaces.Transaction;
import org.junit.Test;
import classes.CashStrategy;
import classes.CreditCardStrategy;
import classes.FunctionalShoppingCart;
import classes.Offer;
import classes.PaypalStrategy;
import classes.Product;
import classes.WebTransaction;

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

		// offer2
		Item item3 = new Product("TV 3D LG 42 inches", "TV105", 950.00);
		Item item4 = new Product("Home Theatre Philips", "HM201", 750.00);
		Offer offer2 = new Offer("Enjoy your movies", "OF001", 1500.00);
		offer2.addItem(item3);
		offer2.addItem(item4);
		shopcart.addItem(offer2);
		
		//offer3 containing two offers
		Offer offer3 = new Offer("The big offer","OF010",2500.00);
		offer3.addItem(offer1);
		offer3.addItem(offer2);
		shopcart.addItem(offer3);

		List<Item> items = shopcart.getItems();
		assertEquals(items.size(),3);
		assertEquals(offer1, items.get(0));
		assertEquals(offer2, items.get(1));
		assertEquals(offer3, items.get(2));

		double total = 0;
		for (Item item : items) {
			total += item.getValue();
		}
		assertTrue(total == 5150.00);
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
	public void addingRemovingPayment() {
		//adding
		PaymentStrategy payment1 = new CashStrategy();
		ShoppingCart shopcart = new FunctionalShoppingCart();
		shopcart.addPayment(payment1);
		assertEquals(shopcart.getPayment(), payment1);

		PaymentStrategy payment2 = new PaypalStrategy("luciano@gmail.com", "bootcamp");
		shopcart.addPayment(payment2);
		assertEquals(shopcart.getPayment(), payment2);
		
		//removing
		shopcart.removePayment();
		assertEquals(shopcart.getPayment(), null);
	}
	
	@Test
	public void payingByCreditCard() {
		ShoppingCart shopcart = new FunctionalShoppingCart();
		// offer
		Item item1 = new Product("Smart TV LG 40 inches", "TV100", 700.00);
		Item item2 = new Product("TV 3D LG 42 inches", "TV105", 950.00);
		Offer offer1 = new Offer("Combo TV","OF136",1400.00);
		offer1.addItem(item1);
		offer1.addItem(item2);
		shopcart.addItem(offer1);
		
		PaymentStrategy payment = new CreditCardStrategy("Luciano",12345);
		shopcart.addPayment(payment);
		
		Transaction transaction = new WebTransaction(shopcart.getItems(),payment);
		transaction.execute();
		
		//paying by credit card you have a discount of 10%, the total should be 1260.00
		assertTrue(transaction.getValue() == 1260.00);
		
		//the transaction has to be the number 1
		assertEquals(1,transaction.getID());	
	}
	
	@Test
	public void payingByPaypal() {
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
		
		PaymentStrategy payment = new PaypalStrategy("aguirre.luciano@hotmail.com","bootcamp");
		shopcart.addPayment(payment);
		
		Transaction transaction = new WebTransaction(shopcart.getItems(),payment);
		transaction.execute();
		
		//paying by paypal the cheapest item is free, the total should be 1150.00
		assertTrue(transaction.getValue() == 1150.00);
		
		//the transaction has to be the number 2
		assertEquals(2,transaction.getID());	
	}
	
	@Test
	public void payingByCash() {
		ShoppingCart shopcart = new FunctionalShoppingCart();
		// product1
		Item item1 = new Product("Smart TV LG 40 inches", "TV100", 700.00);
		shopcart.addItem(item1);
		// product2
		Item item2 = new Product("Smart TV Samsung 42 inches", "TV101", 800.00);
		shopcart.addItem(item2);
		
		PaymentStrategy payment = new CashStrategy();
		shopcart.addPayment(payment);
		
		Transaction transaction = new WebTransaction(shopcart.getItems(),payment);
		transaction.execute();
		
		//paying by cash you have a 90% of discount in the most expensive item, the total should be 780.00
		assertTrue(transaction.getValue() == 780.00);
		
		//the transaction has to be the number 3
		assertEquals(3,transaction.getID());	
	}
}
