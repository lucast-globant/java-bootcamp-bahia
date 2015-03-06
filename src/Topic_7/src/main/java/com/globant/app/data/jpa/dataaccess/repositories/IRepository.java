package com.globant.app.data.jpa.dataaccess.repositories;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.Repository;

import java.util.List;

@NoRepositoryBean
public interface IRepository<T> extends Repository<T, Long> {

	List<T> findAll();

	T findById(Long id);

	T save(T entity);
}
