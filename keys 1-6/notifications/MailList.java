package topic1.notifications;

import java.util.ArrayList;
import java.util.List;

public class MailList implements Observer {
	
	private List<Mail> list;

	public MailList () {
		list = new ArrayList<Mail>();
	}
	
	@Override
	public void update (Mail mail) {
		list.add(mail);
	}

	public List<Mail> getEmails() {
		return list;
	}

}
