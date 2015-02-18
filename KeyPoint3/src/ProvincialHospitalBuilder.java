public class ProvincialHospitalBuilder implements HospitalBuilder {

	private Hospital hospital;

	public ProvincialHospitalBuilder() {
		hospital = new Hospital();
	}

	@Override
	public void buildName() {
		hospital.setName("Penna Provincial Hospital");
	}

	@Override
	public void buildAddress() {
		hospital.setAddress("Lainez 2401");
	}

	@Override
	public void buildBeds() {
		hospital.setBeds(300);
	}

	@Override
	public void buildEmergencyRooms() {
		hospital.setEmergencyRooms(5);
	}

	@Override
	public void buildPrepaidSocialWork() {
		hospital.setPrepaidSocialWork(true);
	}

	@Override
	public Hospital getHospital() {
		return hospital;
	}
}
