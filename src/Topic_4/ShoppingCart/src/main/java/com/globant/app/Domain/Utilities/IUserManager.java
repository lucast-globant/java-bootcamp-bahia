package com.globant.app.Domain.Utilities;

import com.globant.app.Domain.Entities.User;

public interface IUserManager {
	boolean login(String user, String password);

	User getCurrentUser();

	User getBusinessManagerUser();

	void logout();
}
