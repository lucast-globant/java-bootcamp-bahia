package key_two;

import static org.junit.Assert.*;

import org.junit.Test;

public class TddTesting {

	@Test
	public void createShoppingApi() {
		ShoppingService service = ShoppingServiceFactory.getLocalService();
	}

	@Test
	public void addItemToShopping() {
		ShoppingService service = ShoppingServiceFactory.getLocalService();
		service.addItemToStock(new Mouse());
	}

	@Test
	public void deleteItemFromShopping() {
		ShoppingService service = ShoppingServiceFactory.getLocalService();
		ItemElement item = new Mouse();
		service.addItemToStock(item);
		service.deleteItemFromStock(item);
	}

	@Test
	public void isDeletedItemFromShopping() {
		ShoppingService service = ShoppingServiceFactory.getLocalService();
		ItemElement item = new Mouse();
		service.addItemToStock(item);
		service.deleteItemFromStock(item);
		assertEquals("", service.getStockAsString());
	}

	@Test
	public void isnDeletedItemFromShopping() {
		ShoppingService service = ShoppingServiceFactory.getLocalService();
		ItemElement item = new Mouse();
		service.addItemToStock(item);
		assertEquals("ITEM: mouse b3 $100.0\n", service.getStockAsString());
		ShoppingCart cart = service.createBuyingCart();
		cart.addItem(item);
		cart.getCantItems();
	}
	
	@Test
	public void testCantItemsInCart() {
		ShoppingService service = ShoppingServiceFactory.getLocalService();
		ItemElement item = new Mouse();
		service.addItemToStock(item);
		ShoppingCart cart = service.createBuyingCart();
		cart.addItem(item);
		assertEquals(1, cart.getCantItems());
	}
	
	@Test
	public void testPayItems() {
		ShoppingService service = ShoppingServiceFactory.getLocalService();
		ItemElement item = new Mouse();
		ItemElement item2 = new Mouse();
		service.addItemToStock(item);
		ShoppingCart cart = service.createBuyingCart();
		cart.addItem(item);
		cart.addItem(item2);
		assertEquals(2, cart.getCantItems());
		cart.pay(new PayPalStrategy("asd", "asd"));
	}
}
