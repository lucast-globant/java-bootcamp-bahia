package topic1.offer;

import java.util.ArrayList;
import java.util.List;

import topic1.Item;
import topic1.mailist.Notification;

public class SingleOffer extends Offer {
	
	private List<Item> offerItems;
	
	public SingleOffer (String name) {
		super (name);
		offerItems = new ArrayList<Item> ();
	}
	
	public Notification addItem(Item i) {
		String offerInfo; 
		offerItems.add(i);
		offerInfo = this.toString();
		return new Notification ("New offer is added",offerInfo);
	}

	public void removeItem(Item i) {
		offerItems.remove(i);
	}

	public List<Item> items() {
		return offerItems;
	}
	
	public String toString () {
		String str = name+"\n";
		for (Item i: offerItems) {
			str+= "Item "+i.getDescription()+".... Price "+i.getPrice()+"\n";
		}
		return str;
	}

}
