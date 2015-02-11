package topic0.ex3;

public class Public implements Hospital {
	
	
	public String getName() {
		return "Hospital Español";
	}

	public int getRooms() {
		return 50;
	}

	public int getMedicalOffices() {
		return 10;
	}

	public boolean isSocialWorkAllowed() {
		return false;
	}
	
}
