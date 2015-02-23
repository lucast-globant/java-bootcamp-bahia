package shoppingCart;

public class Demo {

	public static void main(String[] args) {

		Store wallMart = new Store();
		wallMart.createExampleProducts();

		// Shopping Carts
		ShoppingCart cart1, cart2, cart3;
		cart1 = new ShoppingCart();
		cart2 = new ShoppingCart();
		cart3 = new ShoppingCart();
		
		cart1.addItem(wallMart.getProduct(5), 2f);
		cart1.addItem(wallMart.getProduct(2), 0.3f);
		cart1.addItem(wallMart.getProduct(3), 0.3f);
		cart1.addItem(wallMart.getProduct(14), 1f);
		
		cart2.addItem(wallMart.getProduct(4), 2.5f);
		cart2.addItem(wallMart.getProduct(10), 3f);
		cart2.addItem(wallMart.getProduct(17), 1f);
		cart2.addItem(wallMart.getProduct(11), 1f);
		
		cart3.addItem(wallMart.getProduct(15), 2f);
		cart3.addItem(wallMart.getProduct(2), 0.5f);
		cart3.addItem(wallMart.getProduct(3), 0.5f);
		cart3.addItem(wallMart.getProduct(18), 1f);
		
		// Payments
		Payment pay1, pay2, pay3;
		pay1 = new CreditCardPayment("John Connor", "0215 1587 1493 1100", cart1, "012");
		System.out.println(pay1.toString());
		System.out.println("=======================================================");
		
		pay2 = new CashPayment(cart2, "456");
		System.out.println(pay2.toString());
		System.out.println("=======================================================");
		
		pay3 = new PayPalPayment("user@gmail.com", "1234", cart3, "487");	
		System.out.println(pay3.toString());
		
	}

}
