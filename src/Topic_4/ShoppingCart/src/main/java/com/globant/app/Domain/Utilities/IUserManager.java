package com.globant.app.Domain.Utilities;

import com.globant.app.Domain.Entities.User;

public interface IUserManager {
	boolean login(User user);

	User getCurrentUser();

	User getBusinessManagerUser();
}
