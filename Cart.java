package topic1;

import java.util.ArrayList;
import java.util.List;

import topic1.mailist.Notification;
import topic1.payment.PaymentStrategy;

public class Cart implements ShoppingCart {
	
	private List<Item> items;
	Counter paymentCode;
	
	public Cart (Counter paymentCode) {
		items = new ArrayList<Item>();
		this.paymentCode = paymentCode;
	}

	public Notification addItem(Item p) {
		String itemInfo = this.toString();
		items.add(p);
		return new Notification ("Price changed",itemInfo);		
	}

	public void removeItem(Item p) {
		items.remove(p);
	}

	public List<Item> items() {
		return items;
	}

	public Item mostExpensiveItem() {
		Item expensive; 
		if (!items.isEmpty()) {
			expensive = items.get(0); 
			for (Item p: items) {
				if (p.getPrice() > expensive.getPrice()) {
					expensive = p; 
				}
			}
		}
		else {
			expensive = null; 
		}
		return expensive;
	}

	public Item cheapestItem() {
		Item cheapest; 
		if (!items.isEmpty()) {
			cheapest = items.get(0); 
			for (Item p: items) {
				if (p.getPrice() < cheapest.getPrice()) {
					cheapest = p; 
				}
			}
		}
		else {
			cheapest = null; 
		}
		return cheapest;
	}

	public double totalPrice() {
		double total = 0;
		for (Item p: items) {
			total+= p.getPrice();
		}
		return total;
	}

	public Notification pay (PaymentStrategy paymentMethod) {
		String paymentInfo;
		paymentMethod.pay(paymentCode.next(),this);
		paymentInfo =  "Payment code: "+paymentCode.get();
		return new Notification ("New transaction was made",paymentInfo);		
    }

	public String showItems () {
		String str = "";
		if (items.isEmpty()) {
			str ="no elements added."; 
		}
		else { 
			for (Item p: items) {
				str+= p.itemString()+"\n";
			}
		}
		
		return str;
	}
	
	
	public String toString () {
		String str = "Content cart: \n"; 
		if (items.isEmpty()) {
			str+="no elements added."; 
		}
		else { 
			for (Item p: items) {
				str+= "Cod "+p.getCod()+"Item "+p.getDescription()+" - Price "+p.getPrice()+"\n";
			}
		}
		
		return str;
	}
}
