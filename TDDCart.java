package topic4;

import java.util.ArrayList;
import java.util.List;

import topic1.Counter;
import topic1.Item;
import topic1.ShoppingCart;
import topic1.mailist.Notification;
import topic1.payment.PaymentStrategy;

public class TDDCart implements ShoppingCart, ShoppingCartAPI {
	
	private List<Item> items;
	Counter paymentCode;
	
	
	public TDDCart (Counter paymentCode) {
		items = new ArrayList<Item>();
		this.paymentCode = paymentCode;
	}
	
	@Override
	public Notification addItem(Item p) {
		String itemInfo; 
		items.add(p);
		itemInfo = this.toString();
		return new Notification ("Price changed",itemInfo);		
	}

	@Override
	public void removeItem(Item p) {
		items.remove(p);
	}

	@Override
	public List<Item> items() {
		return items;
	}

	@Override
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

	@Override
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

	@Override
	public double totalPrice() {
		double total = 0;
		for (Item p: items) {
			total+= p.getPrice();
		}
		return total;
	}

	@Override
	public Notification pay (PaymentStrategy paymentMethod) {
		String paymentInfo;
		paymentMethod.pay(paymentCode.next(),this);
		paymentInfo =  "Payment code: "+paymentCode.get();
		return new Notification ("New transaction was made",paymentInfo);		
    }

	@Override
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
	
	
	@Override
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
