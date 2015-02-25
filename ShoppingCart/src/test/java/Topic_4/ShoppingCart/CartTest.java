package Topic_4.ShoppingCart;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

import Topic_4.Services.CartService;
import Topic_4.Services.CartServiceFactory;
import Topic_4.ShoppingCart.Items.Item;
import Topic_4.ShoppingCart.Items.Offer;
import Topic_4.ShoppingCart.Items.Product;
import Topic_4.ShoppingCart.Mailist.Mailist;
import Topic_4.ShoppingCart.PaymentMethod.Cash;
import Topic_4.ShoppingCart.PaymentMethod.CreditCard;
import Topic_4.ShoppingCart.PaymentMethod.Paypal;
import Topic_4.ShoppingCart.Transactions.Transaction;

public class CartTest {
	ByteArrayOutputStream out = new ByteArrayOutputStream();

	@Test
	public void addProductCartTest() {
		CartService cart = CartServiceFactory.getLocalService(null);
		Item product = new Product("product", 100.00f);
		cart.addItem(product);
		assertEquals(1, cart.getItems().size());
		assertEquals(100.00f, cart.getSubtotal(), 0);
	}

	@Test
	public void addOfferCartTest() {
		CartService cart = CartServiceFactory.getLocalService(null);
		Item product = new Product("product", 100.00f);
		List<Item> items = new ArrayList<Item>();
		items.add(product);
		Item offer = new Offer("offer", 100.00f, items);
		cart.addItem(offer);
		assertEquals(1, cart.getItems().size());
		assertEquals(100.00f, cart.getSubtotal(), 0);
	}

	@Test
	public void removeItemCartTest() {
		CartService cart = CartServiceFactory.getLocalService(null);
		Item item = new Product("name", 100.00f);
		cart.addItem(item);
		assertEquals(1, cart.getItems().size());
		assertEquals(100.00f, cart.getSubtotal(), 0);
		cart.removeItem(item);
		assertEquals(0, cart.getItems().size());
		assertEquals(0, cart.getSubtotal(), 0);
	}

	@Test
	public void buyCartWithCashTest() {
		CartService cart = CartServiceFactory.getLocalService(null);
		// Item 1
		Item item = new Product("item1", 100.00f);
		cart.addItem(item);
		assertEquals(1, cart.getItems().size());
		assertEquals(100.00f, cart.getSubtotal(), 0);
		// Item 2
		Item item2 = new Product("item2", 50.00f);
		cart.addItem(item2);
		assertEquals(2, cart.getItems().size());
		assertEquals(150.00f, cart.getSubtotal(), 0);
		// Transaction
		Transaction transaction = cart.buy(new Cash());
		assertEquals(60.00f, transaction.getTotal(), 0);
	}

	@Test
	public void buyCartWithPaypalTest() {
		CartService cart = CartServiceFactory.getLocalService(null);
		// Item 1
		Item item = new Product("item1", 100.00f);
		cart.addItem(item);
		assertEquals(1, cart.getItems().size());
		assertEquals(100.00f, cart.getSubtotal(), 0);
		// Item 2
		Item item2 = new Product("item2", 50.00f);
		cart.addItem(item2);
		assertEquals(2, cart.getItems().size());
		assertEquals(150.00f, cart.getSubtotal(), 0);
		// Transaction
		Transaction transaction = cart.buy(new Paypal("email", "pass"));
		assertEquals(100.00f, transaction.getTotal(), 0);
	}

	@Test
	public void buyCartWithCreditCardTest() {
		CartService cart = CartServiceFactory.getLocalService(null);
		// Item 1
		Item item = new Product("item1", 100.00f);
		cart.addItem(item);
		assertEquals(1, cart.getItems().size());
		assertEquals(100.00f, cart.getSubtotal(), 0);
		// Item 2
		Item item2 = new Product("item2", 50.00f);
		cart.addItem(item2);
		assertEquals(2, cart.getItems().size());
		assertEquals(150.00f, cart.getSubtotal(), 0);
		// Transaction
		Transaction transaction = cart.buy(new CreditCard(0, "name"));
		assertEquals(135.00f, transaction.getTotal(), 0);
	}

	@Test
	public void observerCartTest() {
		PrintStream old_out = System.out;
		System.setOut(new PrintStream(out));
		List<String> emails = new ArrayList<String>();
		emails.add("marketManager@mail.com");
		Mailist mailist = new Mailist(emails);
		CartService cart = CartServiceFactory.getLocalService(mailist);
		// Item 1
		Item item = new Product("item1", 100.00f);
		cart.addItem(item);
		assertEquals(1, cart.getItems().size());
		assertEquals(100.00f, cart.getSubtotal(), 0);
		// Item 2
		Item item2 = new Product("item2", 50.00f);
		cart.addItem(item2);
		assertEquals(2, cart.getItems().size());
		assertEquals(150.00f, cart.getSubtotal(), 0);
		// Transaction
		cart.buy(new CreditCard(0, "name"));
		assertEquals("marketManager@mail.com: New transaction.", out.toString());
		System.setOut(old_out);
	}

}
