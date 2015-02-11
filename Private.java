package topic0.ex3;

public class Private implements Hospital {
	
	public String getName() {
		return "Privado del Sur";
	}

	public int getRooms() {
		return 25;
	}

	public int getMedicalOffices() {
		return 4;
	}

	public boolean isSocialWorkAllowed() {
		return true;
	}

}
