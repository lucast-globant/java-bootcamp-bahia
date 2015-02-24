package Topic_1.ShoppingCart.Domain.Utilities;

import Topic_1.ShoppingCart.Domain.Entities.User;

public class UserManager {

	private static User loggedInUser;
	private static User businessManagerUser = new User("admin", "admin");

	public static boolean login(User user) {
		// TODO: Dummy login, not validating user
		boolean valid = true;
		loggedInUser = user;
		return valid;
	}

	public static User getCurrentUser() {
		return loggedInUser;
	}

	public static User getBusinessManagerUser() {
		return businessManagerUser;
	}
}