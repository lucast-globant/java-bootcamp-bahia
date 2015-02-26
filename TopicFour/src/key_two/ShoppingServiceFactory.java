package key_two;

public class ShoppingServiceFactory {

	private ShoppingServiceFactory() {
	}

	public static ShoppingService getLocalService() {
		return new ShoppingServiceImplementation();
	}

	public static ShoppingService getRemoteServiceUsingJms() {
		return new ShoppingServiceProxy(new ShoppingServiceJmsClient());
	}

	public static ShoppingService getRemoteServiceUsingWebService() {
		return new ShoppingServiceProxy(new ShoppingServiceWebServiceClient());
	}
}
