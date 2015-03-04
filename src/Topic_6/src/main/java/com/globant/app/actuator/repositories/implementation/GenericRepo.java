package com.globant.app.actuator.repositories.implementation;

import com.globant.app.actuator.domain.entities.Identifiable;
import com.globant.app.actuator.repositories.IRepository;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@Component
public abstract class GenericRepo<T extends Identifiable> implements IRepository<T> {

	AtomicInteger nextId = new AtomicInteger(-1);

	Map<Integer, T> elements = new HashMap<Integer, T>();

	@Override public T get(int id) {
		return elements.get(id);
	}

	@Override public T save(T element) {
		int id = nextId.incrementAndGet();

		element.setId(id);

		elements.put(id, element);

		return element;
	}

	@Override public boolean update(T element) {
		if(elements.get(element.getId()) == null)
			return false;

		elements.put(element.getId(), element);
		return true;
	}

	@Override public Collection<T> all() {
		return elements.values();
	}

	@Override public boolean delete(int id) {
		T result = elements.remove(id);
		return result != null;
	}
}
