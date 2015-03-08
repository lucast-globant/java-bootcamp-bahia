package com.globant.app.DataAccess.Repositories;

import java.util.Collection;

public interface IRepository<T> {

	Collection<T> all();

	void add(T element);

	void save(T element);

	T get(int id);

	void delete(int id);

}
