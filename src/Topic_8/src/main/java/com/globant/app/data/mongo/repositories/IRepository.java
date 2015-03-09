package com.globant.app.data.mongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface IRepository<T> extends MongoRepository<T, Long> {

	T findById(String id);
}
