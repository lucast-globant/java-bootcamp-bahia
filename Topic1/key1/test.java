package Topic1.key1;



public class test {

	public static void main(String[] args) {
		
		EcommerceService web=new EcommerceService(DataConnection.retrieveOffers());
		
		web.listItems();
		web.listOffers();
		
		CustomerAccount newCustomer1=new CustomerAccount("jordan", new CreditCard("jordan", 12, "100.00"),
				new PaypalAccount("jordan", "123", "", "100.00"), new Cash("100.00"));
		

		web.addProductToCart(web.searchProduct("Oferta del Bootcamp"), 1, newCustomer1.getMyShoppingCart());
		web.checkout(newCustomer1.getMoney(), newCustomer1);
		
		web.checkout(newCustomer1.getMoney(), newCustomer1);
		
		
	}
	
	

}
