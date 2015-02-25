package classes;

import interfaces.Manager;

public class MarketManager implements Manager {

	private String name;
	private String lastName;

	public MarketManager(String name, String lastName) {
		this.name = name;
		this.lastName = lastName;
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
