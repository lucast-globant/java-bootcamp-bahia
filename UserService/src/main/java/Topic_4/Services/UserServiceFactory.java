package Topic_4.Services;

public class UserServiceFactory {

	private UserServiceFactory() {

	}

	public static UserService getLocalService() {
		return new UserServiceImp();
	}
}
