public class MunicipalHospitalBuilder implements HospitalBuilder {

	private Hospital hospital;

	public MunicipalHospitalBuilder() {
		hospital = new Hospital();
	}

	@Override
	public void buildName() {
		hospital.setName("Municipal Hospital");
	}

	@Override
	public void buildAddress() {
		hospital.setAddress("Estomba 968");
	}

	@Override
	public void buildBeds() {
		hospital.setBeds(160);
	}

	@Override
	public void buildEmergencyRooms() {
		hospital.setEmergencyRooms(3);
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
