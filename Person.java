package topic0.excercise2;

public class Person {
	
	private String name;
	private String lastName;
	private String dateBird;
	private String email; 
	private long mobile;
	
	public Person(String name, String lastName, String dateBird,
			String email, long mobile) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.dateBird = dateBird;
		this.email = email;
		this.mobile = mobile;
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
	
	public String getDateBird() {
		return dateBird;
	}
	
	public void setDateBird(String dateBird) {
		this.dateBird = dateBird;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public long getMobile() {
		return mobile;
	}
	
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", lastName=" + lastName + ", gender="
				+ ", dateBird=" + dateBird + ", email=" + email
				+ ", mobile=" + mobile + "]";
	} 
	
}

