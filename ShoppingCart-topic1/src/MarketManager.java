public class MarketManager implements Manager {

	private String name;
	private String lastName;

	public MarketManager(String n, String ln) {
		name = n;
		lastName = ln;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void update(String notification) {
		System.out.println(name + " " + lastName + " has received a new message: " + notification);
	}
}
