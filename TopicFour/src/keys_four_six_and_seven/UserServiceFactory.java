package keys_four_six_and_seven;

public class UserServiceFactory {

	private UserServiceFactory() {
	}

	public static UserService getLocalService() {
		return new UserServiceImplementation();
	}

	public static UserService getRemoteServiceUsingJms() {
		return new UserServiceProxy(new UserServiceJmsClient());
	}

	public static UserService getRemoteServiceUsingWebService() {
		return new UserServiceProxy(new UserServiceWebServiceClient());
	}
}
