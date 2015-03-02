package com.globant.app.DataAccess.Repositories;

import com.globant.app.Domain.Entities.Item;

import java.util.Collection;

public interface IItemsRepo extends IRepository<Item> {

	public void add(Collection<Item> items);

}
