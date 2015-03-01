package topic1.offer;

import java.util.ArrayList;
import java.util.List;

import topic1.notifications.Mail;
import topic1.notifications.Observable;
import topic1.notifications.Observer;

public class MultiOffer extends Offer {

	private List<SingleOffer> offers;
	
	public MultiOffer (String name) {
		super (name);
		offers = new ArrayList<SingleOffer> ();
	}
	
	public void addOffer(SingleOffer o) {
		offers.add(o);
		doNotify(new Mail ("manager@mail.com","New Offer",this.toString()));
	}

	public void removeOffer(SingleOffer o) {
		offers.remove(o);
	}

	public List<SingleOffer> items() {
		return offers;
	}
	
	public String toString () {
		String str = name+"\n";
		for (SingleOffer o: offers) {
			str+= o.toString();
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
