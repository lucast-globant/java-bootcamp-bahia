package key_six;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SingletonNotificationManager implements NotificationSubject {

	private static SingletonNotificationManager notificationManager = null;
	// this set is the mail list.
	Set<NotificationObserver> mailList = new HashSet<NotificationObserver>();
	private String message = "";

	private SingletonNotificationManager() {

	}

	public static SingletonNotificationManager getInstance() {
		if (notificationManager == null) {
			notificationManager = new SingletonNotificationManager();
		}
		return notificationManager;
	}

	@Override
	public void addObserver(NotificationObserver notificationObserver) {
		mailList.add(notificationObserver);
	}

	@Override
	public void removeObserver(NotificationObserver notificationObserver) {
		mailList.remove(notificationObserver);
	}

	@Override
	public void doNotify() {
		Iterator<NotificationObserver> it = mailList.iterator();
		while (it.hasNext()) {
			NotificationObserver notificationObserver = it.next();
			notificationObserver.mail(message);
		}
	}

	public void newNotification(String message) {
		this.message = message;
		doNotify();
	}
}
