package com.globant.app.Services;

import com.globant.app.DataAccess.Repositories.INotificationsRepo;
import com.globant.app.DataAccess.Repositories.Implementations.NotificationsRepo;
import com.globant.app.Domain.Entities.User;
import com.globant.app.Domain.Events.IEventLogger;
import com.globant.app.Domain.Events.NotificationLogger;
import com.globant.app.Domain.Utilities.IUserManager;
import com.globant.app.Domain.Utilities.UserManager;
import com.globant.app.Services.Implementations.NotificationService;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class TestNotificationService {

	private INotificationService notificationService;
	private INotificationsRepo notificationsRepo;
	private IUserManager userManager;
	private IEventLogger eventLogger;
	private User user;

	@Before
	public void setUp() throws Exception {
		user = new User("nico", "messi2015");

		userManager = mock(UserManager.class);
		when(userManager.getCurrentUser()).thenReturn(user);

		eventLogger = mock(NotificationLogger.class);

		notificationsRepo = mock(NotificationsRepo.class);

		notificationService = new NotificationService(notificationsRepo, userManager);
	}

	@Test
	public void GetNotifications_Gets_Notifications_From_Repo_Returns_Ok()
	{
		notificationService.getNotifications();

		verify(notificationsRepo).getNotifications(user);
	}
}
