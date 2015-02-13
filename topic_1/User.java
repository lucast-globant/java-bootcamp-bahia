package topic_1;

public class User {
	private String name;
	private String email;
	private String password;
	private int creditNumber;
	
	public User (String name, String email, String password, int creditNumber) {
		this.name = name;
		this.email = email;
		this.password = password;
		this.creditNumber = creditNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getCreditNumber() {
		return creditNumber;
	}

	public void setCreditNumber(int creditNumber) {
		this.creditNumber = creditNumber;
	}

}