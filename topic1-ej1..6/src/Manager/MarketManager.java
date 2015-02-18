package Manager;

import java.util.ArrayList;
//This class represents at Market Manager
public class MarketManager implements ItemObserver {
	
	private ArrayList<String> emails = new ArrayList<String>();

	@Override
	public void getNotify(String message) {
		emails.add(message);
	}

	public ArrayList<String> getEmails() {
		return emails;
	}

}