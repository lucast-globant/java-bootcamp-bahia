package notifications;

import java.util.ArrayList;
import java.util.List;

public class MailingServer implements Observer {
	private List<String> mailingList;

	public MailingServer() {
		mailingList = new ArrayList<String>();
	}

	@Override
	public void update(String message) {
		for (String receiver : mailingList) {
			System.out.println("Sending to " + receiver + "| message: "
					+ message);
		}
	}
	
	public void addReceiver(String receiver){
		mailingList.add(receiver);
	}

	public void removeReceiver(String receiver){
		int id = mailingList.indexOf(receiver);
		mailingList.remove(id);
	}

}
