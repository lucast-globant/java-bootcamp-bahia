package cartServices;

import static org.junit.Assert.*;
import items.Item;
import items.Product;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import payments.PayPalPayment;
import payments.Payment;

public class ShoppingCartImpTest {

	private Cart cart;
	private Payment paymentMethod;
	private List<Item> items;
	private ShoppingCartService shoppingCartService;
	private Container container;

	@Before
	public void setUp() {
		cart = new Cart();
		paymentMethod = new PayPalPayment("matihaure@gmail.com", "****");
		container = new Container();
		shoppingCartService = new ShoppingCartImp(cart, container);

		items = new ArrayList<Item>();

		Item i1 = new Product(20, " Plate ", 1);
		Item i2 = new Product(10, " Fork ", 2);
		Item i3 = new Product(8, " Spoon ", 3);
		Item i4 = new Product(12, " Glass ", 4);
		Item i5 = new Product(400, " TV ", 5);
		Item i6 = new Product(200, " Radio ", 6);

		items.add(i1);
		items.add(i2);
		items.add(i3);
		items.add(i4);
		items.add(i5);
		items.add(i6);

		cart.addItems(items);
	}

	@Test
	public void purchaseCartTest() {

		double totalCost = shoppingCartService.purchaseCart(cart, paymentMethod);
		System.out.println(" total " + totalCost);
		assertTrue(Double.compare(642.0, totalCost) == 0);

	}

	public void findItemTest() {

	}

}
