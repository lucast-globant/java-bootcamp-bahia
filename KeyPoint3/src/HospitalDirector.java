public class HospitalDirector {

	private HospitalBuilder hospitalBuilder = null;

	public HospitalDirector(HospitalBuilder h) {
		hospitalBuilder = h;
	}

	public void constructHospital() {
		hospitalBuilder.buildName();
		hospitalBuilder.buildAddress();
		hospitalBuilder.buildBeds();
		hospitalBuilder.buildEmergencyRooms();
		hospitalBuilder.buildPrepaidSocialWork();
	}

	public Hospital getHospital() {
		return hospitalBuilder.getHospital();
	}
}
