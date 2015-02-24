package Topic_1.ShoppingCart.DataAccess.Repositories;

import Topic_1.ShoppingCart.Domain.Entities.Notification;
import Topic_1.ShoppingCart.Domain.Events.IEventLogger;

public class NotificationsRepo extends GenericRepository<Notification> {

	public NotificationsRepo(IEventLogger eventLogger) {
		super(eventLogger);
	}

	@Override public void add(Notification element) {
		// TODO: To be done
	}

	@Override public void save(Notification element) {
		// TODO: To be done
	}
}
