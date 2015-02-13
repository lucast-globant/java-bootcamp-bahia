package topic1;

import topic1.mailist.Mailist;
import topic1.offer.MultiOffer;
import topic1.offer.Offer;
import topic1.offer.SingleOffer;
import topic1.payment.CashPayment;
import topic1.payment.CreditCardPayment;
import topic1.payment.PaypalPayment;

public class TestShoppingCart {

	public static void main(String[] args) {
		
		String emailManager = "managermarket@mail.com";
		Mailist managerNotifications = new Mailist (emailManager);
		Counter paymentsCounter = new Counter();
		ShoppingCart cart = new Cart (paymentsCounter);
		Offer offer1 = new SingleOffer ("Single offer");
		Offer offer2 = new MultiOffer ("Multi offer");
		Offer offer3 = new SingleOffer ("More offer");

		
		Item p1 = new Item (1,"Pen",10.4);
		Item p2 = new Item (2,"Pencil",4.6);
		Item p3 = new Item (3,"Rubber",3.5);
		Item p4 = new Item (4,"Block A4",22.5);
				
		managerNotifications.addNotification(cart.addItem(p1));
		managerNotifications.addNotification(cart.addItem(p2));
		managerNotifications.addNotification(cart.addItem(p3));
		managerNotifications.addNotification(cart.addItem(p4));
		
		System.out.println (cart.showItems());
		System.out.println ("");
		System.out.println ("Paying with credit card");
		cart.pay(new CreditCardPayment ("Victoria","1234123412341234"));
		System.out.println ("");
		System.out.println ("Paying with paypal");
		cart.pay(new PaypalPayment ("vicky","12345678"));
		System.out.println ("");
		System.out.println ("Paying in cash");
		cart.pay(new CashPayment ());
		System.out.println ("");
		
		managerNotifications.addNotification(p1.setPrice(9.40));
		managerNotifications.addNotification(p2.setPrice(2));
		managerNotifications.addNotification(p3.setPrice(1));
		managerNotifications.addNotification(p4.setPrice(12));
		
		managerNotifications.addNotification(((SingleOffer)offer1).addItem(p1));
		managerNotifications.addNotification(((SingleOffer)offer1).addItem(p2));
		managerNotifications.addNotification(((MultiOffer)offer2).addOffer((SingleOffer)offer1));
		managerNotifications.addNotification(((SingleOffer)offer3).addItem(p3));
		managerNotifications.addNotification(((SingleOffer)offer3).addItem(p4));
		managerNotifications.addNotification(((MultiOffer)offer2).addOffer((SingleOffer)offer3));
		
		System.out.println ("Ofertas: ");
		System.out.println (offer1.toString());
		System.out.println (offer2.toString());
		System.out.println ("");
		
		System.out.println ("Mailist content: ");
		System.out.println (managerNotifications.toString());
	}

}
