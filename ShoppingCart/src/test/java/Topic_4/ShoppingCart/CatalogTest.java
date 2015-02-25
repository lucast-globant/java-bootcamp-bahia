package Topic_4.ShoppingCart;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import Topic_4.ShoppingCart.Items.Item;
import Topic_4.ShoppingCart.Mailist.Mailist;
import Topic_4.ShoppingCart.ShopingCart.Catalog;

public class CatalogTest {
	ByteArrayOutputStream out = new ByteArrayOutputStream();

	@Test
	public void catalogTest() {
		PrintStream old_out = System.out;
		System.setOut(new PrintStream(out));
		List<String> emails = new ArrayList<String>();
		emails.add("marketManager@mail.com");
		Mailist mailist = new Mailist(emails);
		Catalog catalog = new Catalog(mailist);
		// Item 1
		catalog.createProduct("item1", 100.00f);
		assertEquals(1, catalog.getItems().size());
		assertEquals("marketManager@mail.com: New product.", out.toString());
		// Item 2
		List<Item> items = new ArrayList<Item>();
		items.add(catalog.getItems().get(0));
		catalog.createOffer("item2", 100.00f, items);
		assertEquals(2, catalog.getItems().size());
		// Set price item 1
		assertEquals(100.00f, catalog.getItems().get(0).getPrice(), 0);
		catalog.setPrice(catalog.getItems().get(0), 50.00f);
		assertEquals(50.00f, catalog.getItems().get(0).getPrice(), 0);
		System.setOut(old_out);
	}

}
