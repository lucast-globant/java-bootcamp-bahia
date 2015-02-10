package key_three;

public class PublicHospital implements Hospital {

	@Override
	public boolean acceptsMedicalInsurance() {
		return false;
	}

	@Override
	public int getAmountOfOperatingRooms() {
		return 5;
	}

	@Override
	public int getAmountOfEmergencyRooms() {
		return 2;
	}

}
