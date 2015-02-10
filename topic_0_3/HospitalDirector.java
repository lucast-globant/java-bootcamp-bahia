package topic_0_3;

public class HospitalDirector {
	private HospitalBuilder hospitalBuilder = null;

	public HospitalDirector (HospitalBuilder hospitalBuilder) {
		this.hospitalBuilder = hospitalBuilder;
	}

	public void constructHospital() {
		hospitalBuilder.buildHospital();
		hospitalBuilder.buildDoctors();
		hospitalBuilder.buildNurses();
		hospitalBuilder.buildAreas();
	}

	public Hospital getHospital() {
		return hospitalBuilder.getHospital();
	}
}
