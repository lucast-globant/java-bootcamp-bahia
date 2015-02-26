package classes;

public class User {

	private String mail;
	private String password;
	private String name;
	private String lastName;

	public User(String mail, String password, String name, String lastName) {
		this.mail = mail;
		this.password = password;
		this.name = name;
		this.lastName = lastName;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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
}
