package ShoppingCart;

import java.util.List;

import Manager.ItemObserver;
import Manager.*;
import ShoppingCart.PaymentMethods.*;

class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Cart and Payment methods test
		Cart cart = new Cart();
		Item item1 = new Item("1234","Coca-cola",30);
		Item item2 = new Item("5678","Vino",50);
		Item item3 = new Item("7477","Champagne" ,120);
		cart.addItem(item1);
		cart.addItem(item2);
		cart.addItem(item3);
		
		//header
		System.out.println("ID |  PRICE  |  Payment Method");
		//pay by paypal
		cart.pay(new Paypal("myemail@mail.com", "mypwd"));
		//pay by credit card
		cart.pay(new CreditCard("Santiago Lirio", "3579516483216548", "786", "12/16"));
		//pay by cash
		cart.pay(new Cash());
		
		System.out.println();
		
		System.out.println("Items list:");
		//Cart item list test
		cart.showItems();
		//--
		System.out.println();
		//--
		//Offers test
		Item itemo1 = new Item("4321","Pepsi",5);
		Item itemo2 = new Item("4790","Wine",15);
		Item itemo3 = new Item("7337","Vodka" ,80);
		Offer offer = new Offer(1,"Offer1",(float) 0.3);
		offer.addItem(itemo1);
		offer.addItem(itemo2);
		offer.addItem(itemo3);
		offer.showOffer();
		//--
		System.out.println();
		//--
		//Market Manager test
		ItemObserver io = new MarketManager();
		ObserversList.getItemObservers().add(io);
		
		// Here we test the notify methods
		item1.setPrice(13);
		item3.setPrice(54);
		offer.setDiscountPercentage((float)0.7);
		

				MarketManager mm = (MarketManager) ObserversList.getItemObservers().get(0);

				// All these messages are stored in the mail list of the observer
				System.out.println("Here we show all the notifications that our manager has received:");
				System.out.println();
				for (String message : mm.getEmails()) {
					System.out.println(message);
				}
		
	}

}
