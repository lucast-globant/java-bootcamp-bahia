package com.globant.app.Services.Implementations;

import com.globant.app.DataAccess.Repositories.INotificationsRepo;
import com.globant.app.Domain.Entities.Notification;
import com.globant.app.Domain.Entities.User;
import com.globant.app.Domain.Utilities.IUserManager;
import com.globant.app.Services.INotificationService;

import java.util.ArrayList;
import java.util.List;

public class NotificationService implements INotificationService {

	private INotificationsRepo notificationRepo;
	private IUserManager userManager;

	public NotificationService(INotificationsRepo notificationRepo, IUserManager userManager) {
		this.notificationRepo = notificationRepo;
		this.userManager = userManager;
	}

	@Override public List<Notification> getNotifications() {
		User user = userManager.getCurrentUser();

		return new ArrayList<Notification>(notificationRepo.getNotifications(user));
	}
}
