package com.globant.app.Services;

import com.globant.app.DataAccess.Repositories.INotificationsRepo;
import com.globant.app.Domain.Entities.User;
import com.globant.app.Domain.Events.IEvent;
import com.globant.app.Domain.Events.IEventLogger;
import com.globant.app.Domain.Utilities.IUserManager;
import com.globant.app.Services.Implementations.NotificationService;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class TestNotificationService {

	private INotificationService notificationService;
	private INotificationsRepo notificationsRepo;
	private IUserManager userManager;
	private IEventLogger eventLogger;
	private User user;

	@Before
	public void setUp() throws Exception {
		user = new User("nico", "messi2015");

		userManager = mock(IUserManager.class);
		when(userManager.getCurrentUser()).thenReturn(user);

		eventLogger = mock(IEventLogger.class);
		doNothing().when(eventLogger).log(any(IEvent.class));

		notificationsRepo = mock(INotificationsRepo.class);

		notificationService = new NotificationService(notificationsRepo, userManager);
	}

	@Test
	public void GetNotifications_Gets_Notifications_From_Repo_Returns_Ok()
	{
		notificationService.getNotifications();

		verify(notificationsRepo).getNotifications(user);
	}
}
