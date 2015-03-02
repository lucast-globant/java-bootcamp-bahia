package com.globant.app.Services;

import com.globant.app.DataAccess.Repositories.IUsersRepo;
import com.globant.app.DataAccess.Repositories.Implementations.UsersRepo;
import com.globant.app.Domain.Discounts.DiscountManager;
import com.globant.app.Domain.Entities.Cart;
import com.globant.app.Domain.Entities.User;
import com.globant.app.Domain.Events.IEventLogger;
import com.globant.app.Domain.Events.NotificationLogger;
import com.globant.app.Domain.Utilities.IUserManager;
import com.globant.app.Domain.Utilities.UserManager;
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

		usersRepo = mock(UsersRepo.class);
		when(usersRepo.get(anyInt())).thenReturn(user);

		userManager = mock(UserManager.class);
		when(userManager.getCurrentUser()).thenReturn(user);

		eventLogger = mock(NotificationLogger.class);

		cartService = new CartService(usersRepo, userManager, new DiscountManager(), eventLogger);
	}

	@Test
	public void SaveCart_Returns_Ok() {
		cartService.saveCart(new Cart());

		verify(usersRepo).save(userManager.getCurrentUser());

	}

}
