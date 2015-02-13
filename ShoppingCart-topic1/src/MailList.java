import java.util.ArrayList;

public class MailList implements List {

	private ArrayList<String> notifications;
	private static List instance = null;
	private ArrayList<Manager> managers;

	private MailList() {
		notifications = new ArrayList<String>();
		managers = new ArrayList<Manager>();
	}

	public static List getInstance() {
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
