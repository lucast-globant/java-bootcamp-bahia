package com.globant.app.Services;

import com.globant.app.DataAccess.Repositories.IItemsRepo;
import com.globant.app.Services.Implementations.ItemService;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class TestItemsService {

	private IItemService itemService;
	private IItemsRepo itemsRepo;

	@Before
	public void Setup() {
		itemsRepo = mock(IItemsRepo.class);

		itemService = new ItemService(itemsRepo);
	}

	@Test
	public void GetItems_Returns_Ok() {
		itemService.getItems();

		verify(itemsRepo).all();
	}
}
