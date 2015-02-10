package Exercise_3;

public abstract class Personal {
	protected int id;
	protected String name, lastname;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String toString() {
		String s = "";
		s += id + " " + name + " " + lastname + "\n";
		return s;
	}

}
