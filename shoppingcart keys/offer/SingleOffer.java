package topic1.offer;

import java.util.ArrayList;
import java.util.List;

import topic1.Item;
import topic1.notifications.Mail;
import topic1.notifications.Observable;
import topic1.notifications.Observer;

public class SingleOffer extends Offer {
	
	private List<Item> offerItems;
	
	public SingleOffer (String name) {
		super (name);
		offerItems = new ArrayList<Item> ();
	}
	
	public void addItem(Item i) {
		offerItems.add(i);
		doNotify(new Mail ("manager@mail.com","New Offer",this.toString()));
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
	
	public void addObserver(Observer o) {
		Observable.getItemObservers().add(o);
	}

	public void removeObserver(Observer o) {
		Observable.getItemObservers().remove(o);		
	}

	public void doNotify(Mail mail) {
		for (Observer o: Observable.getItemObservers()) {
			if (o != null) {
				o.update(mail);
			}
		}
	}

}
