package topic1;

import topic1.offer.MultiOffer;
import topic1.offer.Offer;
import topic1.offer.SingleOffer;
import topic1.payment.CashPayment;
import topic1.payment.CreditCardPayment;
import topic1.payment.PaymentContext;
import topic1.payment.PaypalPayment;

public class TestShoppingCart {

	public static void main(String[] args) {
		
		ShoppingCart cart = new Cart ();
		PaymentContext payContext; 

		Offer offer1 = new SingleOffer ("Single offer");
		Offer offer2 = new MultiOffer ("Multi offer");
		Offer offer3 = new SingleOffer ("More offer");

		
		Item p1 = new Item (1,"Pen",10.4);
		Item p2 = new Item (2,"Pencil",4.6);
		Item p3 = new Item (3,"Rubber",3.5);
		Item p4 = new Item (4,"Block A4",22.5);
				
		cart.addItem(p1);
		cart.addItem(p2);
		cart.addItem(p3);
		cart.addItem(p4);
		
		System.out.println (cart.showItems());
		System.out.println ("");
		System.out.println ("Paying with credit card");
		payContext = new PaymentContext (new CreditCardPayment ("Victoria","1234123412341234"));
		payContext.executeStrategy(cart);
		System.out.println ("");
		System.out.println ("Paying with paypal");
		payContext = new PaymentContext (new PaypalPayment ("vicky","12345678"));
		payContext.executeStrategy(cart);
		System.out.println ("");
		System.out.println ("Paying in cash");
		payContext = new PaymentContext (new CashPayment ());
		payContext.executeStrategy(cart);
		System.out.println ("");
		
		p1.setPrice(9.40);
		p2.setPrice(2);
		p3.setPrice(1);
		p4.setPrice(12);
		
		((SingleOffer)offer1).addItem(p1);
		((SingleOffer)offer1).addItem(p2);
		((MultiOffer)offer2).addOffer((SingleOffer)offer1);
		((SingleOffer)offer3).addItem(p3);
		((SingleOffer)offer3).addItem(p4);
		((MultiOffer)offer2).addOffer((SingleOffer)offer3);
		
		System.out.println ("Ofertas: ");
		System.out.println (offer1.toString());
		System.out.println (offer2.toString());
		System.out.println ("");
		
	}

}
