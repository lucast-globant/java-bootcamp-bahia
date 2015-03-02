package com.globant.app.DataAccess.Repositories;

import java.util.Collection;

public interface IRepository<T> {

	public Collection<T> all();

	public void add(T element);

	public void save(T element);

	public T get(int id);

}
