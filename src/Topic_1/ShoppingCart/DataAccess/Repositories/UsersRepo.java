package Topic_1.ShoppingCart.DataAccess.Repositories;

import Topic_1.ShoppingCart.Domain.Entities.User;
import Topic_1.ShoppingCart.Domain.Events.IEventLogger;

public class UsersRepo extends GenericRepository<User> implements IRepository<User> {

	public UsersRepo(IEventLogger eventLogger) {
		super(eventLogger);
	}

	@Override public void add(User element) {
		// TODO: To be done
	}

	@Override public void save(User element) {
		// TODO: To be done
	}
}
