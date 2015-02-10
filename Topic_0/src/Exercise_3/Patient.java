package Exercise_3;

public class Patient {
	private String name, lastname, description;

	public Patient(String n, String l, String d) {
		name = n;
		lastname = l;
		description = d;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String toString() {
		String s = "";
		s += name + " " + lastname + "\n" + description;
		return s;
	}

}
