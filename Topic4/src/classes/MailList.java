package classes;

import java.util.ArrayList;
import java.util.List;
import interfaces.Manager;
import interfaces.NotificationList;

public class MailList implements NotificationList {

	private List<String> notifications;
	private static NotificationList instance = null;
	private List<Manager> managers;

	private MailList() {
		notifications = new ArrayList<String>();
		managers = new ArrayList<Manager>();
	}

	public static NotificationList getInstance() {
		if (instance == null) {
			instance = new MailList();
		}
		return instance;
	}

	public void addManager(Manager m) {
		managers.add(m);
	}

	public void removeManager(Manager m) {
		managers.remove(m);
	}

	public void notify(String not) {
		notifications.add(not);
		for (Manager m : managers) {
			m.update(not);
		}
	}
}
