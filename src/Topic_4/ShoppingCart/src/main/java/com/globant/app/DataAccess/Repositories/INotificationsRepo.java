package com.globant.app.DataAccess.Repositories;

import com.globant.app.Domain.Entities.Notification;
import com.globant.app.Domain.Entities.User;

import java.util.Collection;

public interface INotificationsRepo extends IRepository<Notification> {

	public Collection<Notification> getNotifications(User user);
}
