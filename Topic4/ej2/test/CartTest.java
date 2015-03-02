package test;

import static org.junit.Assert.*;

import org.junit.Test;

import ShoppingCart.Cart;
import ShoppingCart.Item;
import ShoppingCart.Offer;
import ShoppingCart.PaymentMethod;
import ShoppingCart.PaymentMethods.Cash;
import ShoppingCart.PaymentMethods.Paypal;


public class CartTest {

	@Test
	public void testAddItem() {
		Cart cart = new Cart(); 
		Item item = new Item("123", "Keyboard", 330);
		cart.addItem(item);
		assertEquals(cart.getItem(0), item);
	}

	@Test
	public void testTotal() {
		Cart cart = new Cart();
		Item item = new Item("123", "Keyboard", 330);
		cart.addItem(item);
		assertEquals(Float.toString(cart.calculateTotal()), Float.toString(330));
	}
	
	@Test
	public void testRemoveItem(){
		Cart cart = new Cart(); 
		Item item = new Item("123", "Keyboard", 330);
		cart.addItem(item);
		cart.removeItem(0);
		assertEquals(cart.getItem(0), null);
	}
	
	@Test
	public void testList() {
		Cart cart = new Cart(); 
		Item item1 = new Item("123", "Keyboard", 330);
		Item item2 = new Item("122", "Mouse", 150);
		Item item3 = new Item("133", "Monitor", 1500);
		cart.addItem(item1);
		cart.addItem(item2);
		cart.addItem(item3);
		assertEquals(cart.getItemsList().size(), 3);
	}
	
	@Test
	public void testGetItem() {
		Cart cart = new Cart(); 
		Item item = new Item("123", "Keyboard", 330);
		cart.addItem(item);
		Item itemg = cart.getItem(0);
		assertEquals(cart.getItem(0), itemg);
	}
	
	@Test
	public void testOfferPrice() {
		Item itemo1 = new Item("4321","Pepsi",5);
		Item itemo2 = new Item("4790","Wine",15);
		Item itemo3 = new Item("7337","Vodka" ,80);
		Offer offer = new Offer(1,"Offer1",(float) 0.3);
		offer.addItem(itemo1);
		offer.addItem(itemo2);
		offer.addItem(itemo3);
		assertEquals(Float.toString(offer.getOfferPrice()), "70.0");
		
	}
	

	
	

}
