package exercise1to6.cart;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class MarketManager implements Observer {
	Observable obs;
	List<String> messages;

	public MarketManager(Observable observable) {
		this.obs = observable;
		obs.addObserver(this);
		this.messages = new ArrayList<String>();
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		messages.add((String) arg1);
	}

	public String toString() {
		String ret = "Messagges from Market Manager: \n \n";
		for (String string : messages) {
			ret += string;

		}
		return ret;
	}
}
