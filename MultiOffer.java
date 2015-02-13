package topic1.offer;

import java.util.ArrayList;
import java.util.List;
import topic1.mailist.Notification;

public class MultiOffer extends Offer {

	private List<SingleOffer> offers;
	
	public MultiOffer (String name) {
		super (name);
		offers = new ArrayList<SingleOffer> ();
	}
	
	public Notification addOffer(SingleOffer o) {
		String offerInfo = this.toString();
		offers.add(o);
		return new Notification ("New offer is added",offerInfo);
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


}
