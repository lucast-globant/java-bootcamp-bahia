package key_three;

public class PrivateHospital implements Hospital {

	@Override
	public boolean acceptsMedicalInsurance() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public int getAmountOfOperatingRooms() {
		// TODO Auto-generated method stub
		return 15;
	}

	@Override
	public int getAmountOfEmergencyRooms() {
		// TODO Auto-generated method stub
		return 5;
	}

}