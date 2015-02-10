package topic_0_3;

public class WaitingRoom extends Area {
	
	private int patients;
	private String name;
	private int capacity;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public void setPatients(int patients) {
		this.patients = patients;
	}

	@Override
	public int getPatients() {
		return patients;
	}

	@Override
	public boolean avaibable() {
		return patients < capacity;
	}

}
