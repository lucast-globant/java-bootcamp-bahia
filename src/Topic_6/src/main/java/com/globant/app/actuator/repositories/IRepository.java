package com.globant.app.actuator.repositories;

import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public interface IRepository<T> {

	T get(int id);

	T save(T element);

	boolean update(T element);

	boolean delete(int id);

	Collection<T> all();
}
