package shoppingCart;

public class Demo {

	public static void main(String[] args) {
		// Some examples

		// Products
		Store wallMart = new Store();
		Product product = new Product("Coca Cola 1.5lt", 20.5f, true); // 1
		wallMart.addProduct(product, 100);
		product = new Product("Ham", 150f, false); // 2
		wallMart.addProduct(product, 100);
		product = new Product("Cheese", 90f, false); // 3
		wallMart.addProduct(product, 100);
		product = new Product("Orange", 8f, false); // 4
		wallMart.addProduct(product, 100);
		product = new Product("Yerba Amanda 1Kg", 38f, true); // 5
		wallMart.addProduct(product, 100);
		product = new Product("Salt Celusal 500gr", 12.3f, true); // 6
		wallMart.addProduct(product, 100);
		product = new Product("Chips Pringles", 24.5f, true); // 7
		wallMart.addProduct(product, 100);
		product = new Product("Jam BC Strawberry", 22f, true); // 8
		wallMart.addProduct(product, 100);
		product = new Product("Rice 500gr", 18.6f, true); // 9
		wallMart.addProduct(product, 100);
		product = new Product("Beer Heineken 1lt", 26.4f, true); // 10
		wallMart.addProduct(product, 100);
		product = new Product("Canned tuna 320gr", 32.4f, true); // 11
		wallMart.addProduct(product, 100);
		product = new Product("Hamburger x4", 55f, true); // 12
		wallMart.addProduct(product, 100);

		// Offers
		Offer offer = new Offer("Snack Attack", 80f); // 13
		offer.addItem(wallMart.getProduct(1), 1f);
		offer.addItem(wallMart.getProduct(7), 2f);
		offer.addItem(wallMart.getProduct(10), 1f);
		wallMart.addProduct(offer, 10);
		offer = new Offer("FastFood", 35f); // 14
		offer.addItem(wallMart.getProduct(9), 1f);
		offer.addItem(wallMart.getProduct(11), 1f);
		wallMart.addProduct(offer, 100);
		offer = new Offer("Friday&Friends", 99f); // 15
		offer.addItem(wallMart.getProduct(13), 1f);
		offer.addItem(wallMart.getProduct(12), 1f);
		wallMart.addProduct(offer, 100);

		// Products with Warranty
		ProductWithWarranty productW = new ProductWithWarranty(
				"Air conditioning LG", 6000f, true); // 16
		productW.setDaysOfWarranty(90);
		wallMart.addProduct(productW, 100);
		productW = new ProductWithWarranty("Mp3 Sanyo", 245f, true); // 17
		productW.setDaysOfWarranty(90);
		wallMart.addProduct(productW, 100);
		productW = new ProductWithWarranty("Headphones", 95f, true); // 18
		productW.setDaysOfWarranty(90);
		wallMart.addProduct(productW, 100);

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
