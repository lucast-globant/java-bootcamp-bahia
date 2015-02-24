package Topic_1.ShoppingCart.DataAccess.Repositories;

import Topic_1.ShoppingCart.Domain.Events.IEventLogger;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public abstract class GenericRepository<T> implements IRepository<T> {

	protected Map<Integer, T> elements;
	protected IEventLogger eventLogger;

	public GenericRepository(IEventLogger eventLogger) {
		this.elements = new HashMap<Integer, T>();
		this.eventLogger = eventLogger;
	}

	@Override public Collection<T> all() {
		return elements.values();
	}

	@Override public T get(int id) {
		return elements.get(id);
	}

}
