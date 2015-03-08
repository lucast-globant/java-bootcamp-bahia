package com.globant.app.Services;

import com.globant.app.DataAccess.Repositories.IUsersRepo;
import com.globant.app.Domain.Discounts.DiscountManager;
import com.globant.app.Domain.Entities.Cart;
import com.globant.app.Domain.Entities.User;
import com.globant.app.Domain.Events.IEvent;
import com.globant.app.Domain.Events.IEventLogger;
import com.globant.app.Domain.Utilities.IUserManager;
import com.globant.app.Services.Implementations.CartService;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class TestCartService {

	private CartService cartService;
	private IUsersRepo usersRepo;
	private IUserManager userManager;
	private IEventLogger eventLogger;
	private User user;

	@Before
	public void TearUp() {
		user = new User("nico", "messi2015");

		usersRepo = mock(IUsersRepo.class);
		when(usersRepo.get(anyInt())).thenReturn(user);

		userManager = mock(IUserManager.class);
		when(userManager.getCurrentUser()).thenReturn(user);

		eventLogger = mock(IEventLogger.class);
		doNothing().when(eventLogger).log(any(IEvent.class));

		cartService = new CartService(usersRepo, userManager, new DiscountManager(), eventLogger);
	}

	@Test
	public void SaveCart_Returns_Ok() {
		cartService.saveCart(new Cart());

		verify(usersRepo).save(userManager.getCurrentUser());

	}

}
