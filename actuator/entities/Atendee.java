package topic6.actuator.entities;

public class Atendee {
	private String name;
	private static int uniqueID = 1;
	private int id;

	public Atendee(String name) {
		this.setName(name);
		id = getNewID();
	}

	private int getNewID() {
		// TODO Auto-generated method stub
		return uniqueID++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAtendeeID() {
		// TODO Auto-generated method stub
		return id;
	}

}
