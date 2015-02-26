package key_six;

public class Manager implements NotificationObserver {

	private String name;

	public Manager(String name) {
		this.name = name;
	}

	@Override
	public void mail(String message) {
		System.out.println(name + ": i received an email: " + message);
	}

}
