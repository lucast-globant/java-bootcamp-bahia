package topic6.actuator.entities;

public class Atendee {
	private String name;
	private int id;

	public void setId(int id) {
		this.id = id;
	}

	public Atendee(String name) {
		this.setName(name);

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {

		return id;
	}

}
