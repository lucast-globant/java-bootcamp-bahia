package Topic1.key1;



import Topic1.key1.EcommerceService.payMethod;


public class test {

	public static void main(String[] args) {
		
		EcommerceService web=new EcommerceService(DataConnection.retrieveOffers());
		
		web.listItems();
		web.listOffers();
		
		CustomerAccount newCustomer1=new CustomerAccount("jordan", new CreditCard("jordan", 12, "100.00"),
				new PaypalAccount("jordan", "123", "", "100.00"), "100.00");
		

		
		newCustomer1.getMyShoppingCart().addToCart(web.searchProduct("Oferta del Bootcamp"), 1);
		web.checkout(payMethod.CASH, newCustomer1);
		
		
		web.checkout(payMethod.CASH, newCustomer1);
		
		
	}
	
	

}
