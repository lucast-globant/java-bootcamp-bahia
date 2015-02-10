package Exercise_3;

public class HospitalDirector {
	private HospitalBuilder hb;

	public HospitalDirector(HospitalBuilder h) {
		hb = h;
	}

	public void constructHospital() {
		hb.buildName();
		hb.buildDoctors();
		hb.buildNurses();
		hb.buildPatientsBedroom();
		hb.buildIntensiveCare();
	}

	public Hospital getHospital() {
		return hb.getHospital();
	}
}
