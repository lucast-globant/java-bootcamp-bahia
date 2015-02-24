package Topic_1.ShoppingCart.Domain.Events;

import Topic_1.ShoppingCart.Domain.Entities.Notification;
import Topic_1.ShoppingCart.Domain.Utilities.NotificationCenter;
import Topic_1.ShoppingCart.Domain.Utilities.UserManager;

/**
 * Logs notifications of the events to the NotificationCenter
 */
public class NotificationLogger implements IEventLogger {

	@Override public void log(IEvent event) {

		// Create the notification
		Notification notification = new Notification(UserManager.getBusinessManagerUser(), event);

		// Add it to the notification center
		NotificationCenter.addNotification(notification);
	}
}
