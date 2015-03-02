package com.globant.app.Services;

import com.globant.app.Domain.Entities.Notification;

import java.util.List;

public interface INotificationService {

	public List<Notification> getNotifications();
}
