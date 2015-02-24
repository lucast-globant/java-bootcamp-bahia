package Topic_1.ShoppingCart.Domain.Utilities;

import Topic_1.ShoppingCart.Domain.Entities.Notification;
import Topic_1.ShoppingCart.Domain.Entities.User;

import java.util.*;

public class NotificationCenter {

	static Map<User, List<Notification>> usersNotifications = new HashMap<User, List<Notification>>();

	public static List<Notification> getNotifications(User user) {
		List<Notification> list = usersNotifications.get(user);

		if (list == null)
			return new LinkedList<Notification>();

		return list;
	}

	public static void addNotification(Notification notification) {
		if (usersNotifications.get(notification.getUser()) == null) {
			usersNotifications.put(notification.getUser(), new LinkedList());
		}

		usersNotifications.get(notification.getUser()).add(notification);
	}
}
