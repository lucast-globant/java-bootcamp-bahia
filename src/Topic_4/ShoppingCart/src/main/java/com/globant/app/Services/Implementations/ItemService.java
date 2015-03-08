package com.globant.app.Services.Implementations;

import com.globant.app.DataAccess.Repositories.IItemsRepo;
import com.globant.app.Domain.Entities.Item;
import com.globant.app.Services.IItemService;

import java.util.ArrayList;
import java.util.List;

public class ItemService implements IItemService {

	private IItemsRepo itemsRepo;

	public ItemService(IItemsRepo itemsRepo) {
		this.itemsRepo = itemsRepo;
	}

	@Override public List<Item> getItems() {
		return new ArrayList<Item>(itemsRepo.all());
	}
}
